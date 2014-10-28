package app.radiobuttoncode.about.me.radiobutton;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends ActionBarActivity {
//declaring local variables
    public RadioGroup radioGroup;
    public RadioButton radioButtonAction;
    public RadioButton radioButtonAnimation;
    public RadioButton radioButtonHorror;
    public RadioButton radioButtonComedy;
    public RadioButton radioButtonSciFi;
    public TextView textViewChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        //initializing variables
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioButtonAction=(RadioButton)findViewById(R.id.radioButtonActionMovies);
        radioButtonAnimation=(RadioButton)findViewById(R.id.radioButtonAnimationMovies);
        radioButtonHorror=(RadioButton)findViewById(R.id.radioButtonHorrorMovies);
        radioButtonComedy=(RadioButton)findViewById(R.id.radioButtonComedyMovies);
        radioButtonSciFi=(RadioButton)findViewById(R.id.radioButtonSciFiMovies);
        textViewChoice=(TextView)findViewById(R.id.textViewChoice);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb=(RadioButton)findViewById(checkedId);
                textViewChoice.setText("You Selected "+rb.getText());
                //Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}



