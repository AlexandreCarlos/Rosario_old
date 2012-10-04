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

	@ViewById(R.id.dia_semana)
	TextView dia_semana;

	Date dia;
	GregorianCalendar calendario;
	String d_semana;

	@AfterViews
	void updateTextWithDate() {
//		this.dia = new Date();

//		calendario = new GregorianCalendar();
//		calendario.setTime(dia);
		calendario = (GregorianCalendar) GregorianCalendar.getInstance();

		switch (calendario.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			d_semana = "Domingo - Mistérios Gloriosos (da Glória)";
			break;
		case Calendar.MONDAY:
			d_semana = "2ª Feira - Mistérios Gozosos (da Alegria)";
			break;
		case Calendar.TUESDAY:
			d_semana = "3ª Feira - Mistérios Dolorosos (da Dor)";
			break;
		case Calendar.WEDNESDAY:
			d_semana = "4ª Feira - Mistérios Gloriosos (da Glória)";
			break;
		case Calendar.THURSDAY:
			d_semana = "5ª Feira - Mistérios Luminosos (da Luz)";
			break;
		case Calendar.FRIDAY:
			d_semana = "6ª Feira - Mistérios Dolorosos (da Dor)";
			break;
		case Calendar.SATURDAY:
			d_semana = "Sábado - Mistérios Gozosos (da Alegria)";
			break;
		default:
			d_semana = "Dia da semana errado";
			break;
		}

		dia_semana.setText("Dia da semana: " + d_semana);

	}

}
