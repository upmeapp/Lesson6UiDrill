package assaf.zfani.lesson6uidrill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //////
        final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String[] names = new String[]{"Syinon","Sdavid","Shalom","Tal","Tudi","amit","Tomer","yosi","chen"};
        ArrayAdapter<String> namesAdapter= new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,names);
        autoCompleteTextView.setAdapter(namesAdapter);
        autoCompleteTextView.setFilters(new InputFilter[]{new FilterSpecificWords()});
        //////

        findViewById(R.id.sumButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView= (TextView)findViewById(R.id.sumInfo);
                Spinner spinner = (Spinner)findViewById(R.id.spinner);
                TextView selected = (TextView)spinner.getSelectedView();
                Switch aSwitch =(Switch)findViewById(R.id.switcher);
                if(aSwitch.isChecked())
                {

                    info = "want to get info";
                }
                else info = "Don't want to get info";


                textView.setText("User Name is "+autoCompleteTextView.getText()+" He lives in "+selected.getText() +" and he "+ info);

            }
        });

    }
}
