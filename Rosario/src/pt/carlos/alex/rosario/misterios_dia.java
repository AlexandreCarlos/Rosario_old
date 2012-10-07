/**
 * 
 */
package pt.carlos.alex.rosario;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockListFragment;
import com.googlecode.androidannotations.annotations.AfterInject;
import com.googlecode.androidannotations.annotations.EFragment;

import de.greenrobot.event.EventBus;

/**
 * @author alexandre
 * 
 */
@EFragment
public class misterios_dia extends SherlockListFragment {
	final static String TAG = "Rosário";
	final static boolean DEBUG = true;
	
	int index_dia_semana;
	private EventBus eventBus;
	
	@AfterInject
	void obterDiaSemana() {
		
		eventBus = EventBus.getDefault();
		
		MainActivity ma = (MainActivity)getActivity();
		index_dia_semana = ma.index_dia_semana;
		
		if (DEBUG) {
			Log.d(TAG, "index_dia_semana: " + index_dia_semana);
		}

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, android.R.id.text1, Misterios.Design__Misterios(index_dia_semana)));
			
	}
	
	@Override
    public void onListItemClick(ListView l, View v, int position, long id) {
		if (DEBUG) {
			Log.d(TAG, "List Item Click: " + position);
		}
		
		eventBus.post(Integer.valueOf(position));
		
    }
	
	
}
