package pt.carlos.alex.rosario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.OptionsMenu;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.activity_main)
public class MainActivity extends SherlockActivity {

	final static String [] DIA_SEMANA = {
		"Sábado",
		"Domingo",
		"2ª Feira",
		"3ª Feira",
		"4ª Feira",
		"5ª Feira",
		"6ª Feira"
	};
	
	final static int [] MISTERIOS = {
			1,		//		Sábado - Mistérios Gozosos (da Alegria)
			0,		//		Domingo - Mistérios Gloriosos (da Glória)
			1,		//		2ª Feira - Mistérios Gozosos (da Alegria)
			2,		//		3ª Feira - Mistérios Dolorosos (da Dor)
			0,		//		4ª Feira - Mistérios Gloriosos (da Glória)
			3,		//		5ª Feira - Mistérios Luminosos (da Luz)
			2		//		6ª Feira - Mistérios Dolorosos (da Dor)
	};
	
	final static String [] DESC_MISTERIOS = {
		"Mistérios Gloriosos (da Glória)",	// 0
		"Mistérios Gozosos (da Alegria)",	// 1
		"Mistérios Dolorosos (da Dor)",		// 2
		"Mistérios Luminosos (da Luz)"		// 3
	};
	
	@ViewById(R.id.dia_semana)
	TextView dia_semana;

	Date dia;
	GregorianCalendar calendario;
	String d_semana;
	int index_dia_semana;

	@AfterViews
	void updateTextWithDate() {

		calendario = (GregorianCalendar) GregorianCalendar.getInstance();

		index_dia_semana = calendario.get(Calendar.DAY_OF_WEEK);
		
		d_semana = DIA_SEMANA [index_dia_semana] + " " + DESC_MISTERIOS [MISTERIOS[index_dia_semana]];
		
//		switch (calendario.get(Calendar.DAY_OF_WEEK)) {
//		case Calendar.SUNDAY:
//			d_semana = "Domingo - Mistérios Gloriosos (da Glória)";
//			break;
//		case Calendar.MONDAY:
//			d_semana = "2ª Feira - Mistérios Gozosos (da Alegria)";
//			break;
//		case Calendar.TUESDAY:
//			d_semana = "3ª Feira - Mistérios Dolorosos (da Dor)";
//			break;
//		case Calendar.WEDNESDAY:
//			d_semana = "4ª Feira - Mistérios Gloriosos (da Glória)";
//			break;
//		case Calendar.THURSDAY:
//			d_semana = "5ª Feira - Mistérios Luminosos (da Luz)";
//			break;
//		case Calendar.FRIDAY:
//			d_semana = "6ª Feira - Mistérios Dolorosos (da Dor)";
//			break;
//		case Calendar.SATURDAY:
//			d_semana = "Sábado - Mistérios Gozosos (da Alegria)";
//			break;
//		default:
//			d_semana = "Dia da semana errado";
//			break;
//		}

		dia_semana.setText("Dia da semana: " + d_semana);

	}

}
