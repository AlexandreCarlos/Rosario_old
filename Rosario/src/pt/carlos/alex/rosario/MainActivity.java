package pt.carlos.alex.rosario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.googlecode.androidannotations.annotations.AfterInject;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.OptionsMenu;
import com.googlecode.androidannotations.annotations.ViewById;

import de.greenrobot.event.EventBus;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.activity_main)
public class MainActivity extends SherlockFragmentActivity {

	final static String TAG = "Rosário";
	final static boolean DEBUG = true;
	final static String POSICAO = "Posicao";
	final static String DIA = "Dia";
	final static String[] DIA_SEMANA = { "Que dia é este?", "Domingo",
			"2ª Feira", "3ª Feira", "4ª Feira", "5ª Feira", "6ª Feira",
			"Sábado" };

	@ViewById(R.id.dia_semana)
	protected TextView dia_semana;
	
	private EventBus eventBus;
	private GregorianCalendar calendario;
	protected int index_dia_semana = -1;
	protected int misterio_selected = -1;
	

	@AfterInject
	void obterDiaSemana() {
		calendario = (GregorianCalendar) GregorianCalendar.getInstance();

		index_dia_semana = calendario.get(Calendar.DAY_OF_WEEK);

		eventBus = EventBus.getDefault();

		if (DEBUG) {
			Log.d(TAG, "index_dia_semana: " + index_dia_semana);
		}
	}

	@AfterViews
	void updateTextWithDate() {

		try {

			dia_semana.setText(DIA_SEMANA[index_dia_semana] + " - "
					+ Misterios.DESIGN[Misterios.MISTERIOS[index_dia_semana]]);

		} catch (Exception e) {
			Log.e(TAG, "Erro no updateTextWithDate", e);
		}

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		outState.putInt(POSICAO, this.misterio_selected);
		outState.putInt(DIA, this.index_dia_semana);
		if (DEBUG) {
			Log.d(TAG, "onSaveInstanceState [POSICAO]="+misterio_selected+"; [DIA]="+index_dia_semana);	
		}
		
	}

	@Override
	protected void onRestoreInstanceState(Bundle inState) {
		super.onRestoreInstanceState(inState);

		int d = inState.getInt(DIA);
		int p = inState.getInt(POSICAO);
		boolean alterado = false;

		if (DEBUG) {
			Log.d(TAG, "onRestoreInstanceState [POSICAO]="+p+"; [DIA]="+d);
			Log.d(TAG, "MainActivityState [POSICAO]="+misterio_selected+"; [DIA]="+index_dia_semana);
		}
		
		if (d > this.index_dia_semana) {
			this.index_dia_semana = d;
			alterado = true;
		}

		if (p != this.misterio_selected) {
			this.misterio_selected = p;
			alterado = true;
		}

		if (alterado) {
			
			if (DEBUG) {
				Log.d(TAG, "MainActivityState changed [POSICAO]="+misterio_selected+"; [DIA]="+index_dia_semana);
			}
			eventBus.post(new Rezar(index_dia_semana, misterio_selected));
		}

	}
}