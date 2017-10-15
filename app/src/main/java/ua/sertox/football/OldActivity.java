package ua.sertox.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

public class OldActivity extends AppCompatActivity {

    TextView chooseTeam;
    TextView selectTeam;
    Button templateTeam;
    Button next1;

    @Inject
    public ActivityMediator activityMediator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old);

        chooseTeam = (TextView) findViewById(R.id.chooseTeam);
        selectTeam = (TextView) findViewById(R.id.selectTeam);
        templateTeam = (Button) findViewById(R.id.dynamo);
        next1 = (Button) findViewById(R.id.next1);

        selectTeam.setText(R.string.chooseTeam);
        templateTeam.setText(R.string.templateTeam);
        next1.setText(R.string.next);

//        findViewById(R.id.buttonzar).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                activityMediator.startNewActivity(OldActivity.this, Color.BLUE);
//            }
//        });

    }
}
