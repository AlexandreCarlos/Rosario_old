/**
 * 
 */
package pt.carlos.alex.rosario;

import android.util.Log;
import android.widget.EditText;

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
public class Oracoes extends SherlockFragment {

	private static final String TAG = "Orações";
	private static final boolean DEBUG = true;
	
	private EventBus eventBus;
	private int misterioClick = -1;
	
	@ViewById
	EditText oracoesText;
	
	
	@AfterInject
	void inicializa () {
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
	 
	@AfterViews
	void escreveOracoes () {
		
		if (misterioClick < 1) {
			oracoesText.setText("Orações do 1º Mistério");
		}
		else {
			oracoesText.setText("Orações do "+ misterioClick + "º Mistério");
		}
		
		
	}
	
	 public void onEvent(Integer event) {
         
		 if (DEBUG) {
			 Log.d(TAG, "Evento recebido:" + event);
		 }
		 
		 misterioClick = event.intValue()+1;
          
		 escreveOracoes();
     }
	
}
