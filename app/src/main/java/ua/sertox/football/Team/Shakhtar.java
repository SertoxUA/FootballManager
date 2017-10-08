package ua.sertox.football.Team;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import ua.sertox.football.R;

public class Shakhtar extends AppCompatActivity {

    TextView shakhtarName,skillTeam,skillTeamScore;
    Button player12,player13,player14,player15,player16,player17,player18,player19,player20,player21,player22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shakhtar);

        shakhtarName = (TextView) findViewById(R.id.shakhtarName);
        skillTeam = (TextView) findViewById(R.id.skillTeam);
        skillTeamScore = (TextView) findViewById(R.id.skillTeamScore);
        player12 = (Button) findViewById(R.id.btnplayer12);
        player13 = (Button) findViewById(R.id.btnplayer13);
        player14 = (Button) findViewById(R.id.btnplayer14);
        player15 = (Button) findViewById(R.id.btnplayer15);
        player16 = (Button) findViewById(R.id.btnplayer16);
        player17 = (Button) findViewById(R.id.btnplayer17);
        player18 = (Button) findViewById(R.id.btnplayer18);
        player19 = (Button) findViewById(R.id.btnplayer19);
        player20 = (Button) findViewById(R.id.btnplayer20);
        player21 = (Button) findViewById(R.id.btnplayer21);
        player22 = (Button) findViewById(R.id.btnplayer22);

        shakhtarName.setText(R.string.shakhtar);
        skillTeam.setText(R.string.skillTeam);
        player12.setText(R.string.btnplayer12);
        player13.setText(R.string.btnplayer13);
        player14.setText(R.string.btnplayer14);
        player15.setText(R.string.btnplayer15);
        player16.setText(R.string.btnplayer16);
        player17.setText(R.string.btnplayer17);
        player18.setText(R.string.btnplayer18);
        player19.setText(R.string.btnplayer19);
        player20.setText(R.string.btnplayer20);
        player21.setText(R.string.btnplayer21);
        player22.setText(R.string.btnplayer22);

    }
}
