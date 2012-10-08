/**
 * Fragment que mostra as orações associadas a um mistério
 */
package pt.carlos.alex.rosario;

import android.util.Log;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.googlecode.androidannotations.annotations.AfterInject;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EFragment;
import com.googlecode.androidannotations.annotations.ViewById;

import de.greenrobot.event.EventBus;

/**
 * @author alexandre
 * 
 */
@EFragment(R.layout.oracoes_layout)
public class Mostra_Oracoes extends SherlockFragment {

	private static final String TAG = "Mostra Orações";
	private static final boolean DEBUG = true;

	private EventBus eventBus;
	private int misterioClick = -1;
	private int dia_semana = -1;

	@ViewById
	TextView oracoesText;

	@AfterInject
	void inicializa() {
		eventBus = EventBus.getDefault();
	
		if (DEBUG) {
			Log.d(TAG, "inicializa");
		}
	}

	@Override
	public void onResume() {
		super.onResume();
		eventBus.register(this);
	}

	@Override
	public void onPause() {
		eventBus.unregister(this);
		super.onPause();
	}


	void escreveOracoes() {

//		if (misterioClick < 1) {
//			oracoesText.setText("Orações do 1º Mistério" + Orações.PaiNosso());
//		} else {
//			oracoesText.setText("Orações do " + misterioClick + "º Mistério" + Orações.SalveRainha());
//		}
		
		if (misterioClick < 0) {
			return;
		}

		oracoesText.setText(Misterios.Obter_Misterio_do_Dia(dia_semana, misterioClick));
		
	}

	public void onEvent(Rezar event) {

		if (DEBUG) {
			Log.d(TAG, "Evento recebido:" + event);
		}

		misterioClick = event.misterio;
		dia_semana = event.dia_semana;
		
		escreveOracoes();
	}

}
