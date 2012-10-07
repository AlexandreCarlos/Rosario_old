package pt.carlos.alex.rosario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import android.util.Log;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.googlecode.androidannotations.annotations.AfterInject;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.OptionsMenu;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.activity_main)
public class MainActivity extends SherlockFragmentActivity {

	final static String TAG = "Rosário";
	final static boolean DEBUG = true;

	final static String[] DIA_SEMANA = { "Que dia é este?", "Domingo",
			"2ª Feira", "3ª Feira", "4ª Feira", "5ª Feira", "6ª Feira",
			"Sábado" };

	@ViewById(R.id.dia_semana)
	TextView dia_semana;

	Date dia;
	GregorianCalendar calendario;
	String d_semana;
	int index_dia_semana;

	@AfterInject
	void obterDiaSemana() {
		calendario = (GregorianCalendar) GregorianCalendar.getInstance();

		index_dia_semana = calendario.get(Calendar.DAY_OF_WEEK);
		
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

}
