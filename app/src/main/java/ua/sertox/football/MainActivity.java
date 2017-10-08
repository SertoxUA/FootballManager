package ua.sertox.football;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ua.sertox.football.Team.Demnia;
import ua.sertox.football.Team.Kuala;
import ua.sertox.football.Team.Odder;
import ua.sertox.football.Team.Dynamo;
import ua.sertox.football.Team.Yong;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView chooseTeam;
    TextView selectTeam;
    Button demnia;
    Button yong;
    Button dynamo;
    Button odder;
    Button kuala;
    Button sinergi;
    Button next1;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        chooseTeam = (TextView) findViewById(R.id.chooseTeam);
        selectTeam = (TextView) findViewById(R.id.selectTeam);
        demnia = (Button) findViewById(R.id.demnia);
        yong = (Button) findViewById(R.id.yong);
        dynamo = (Button) findViewById(R.id.dynamo);
        odder = (Button) findViewById(R.id.odder);
        kuala = (Button) findViewById(R.id.kuala);
        sinergi = (Button) findViewById(R.id.sinergi);
        next1 = (Button) findViewById(R.id.next1);

        selectTeam.setText(R.string.selectTeam);
        demnia.setText(R.string.demnia);
        yong.setText(R.string.yong);
        dynamo.setText(R.string.dynamo);
        odder.setText(R.string.odder);
        kuala.setText(R.string.kuala);
        sinergi.setText(R.string.sinergi);
        next1.setText(R.string.next);

        final View.OnClickListener onClickChooseTeam = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.demnia:
                        chooseTeam.setText(R.string.demnia);
                        a=1;
                        break;
                    case R.id.yong:
                        chooseTeam.setText(R.string.yong);
                        a=2;
                        break;
                    case R.id.dynamo:
                        chooseTeam.setText(R.string.dynamo);
                        a=3;
                        break;
                    case R.id.odder:
                        chooseTeam.setText(R.string.odder);
                        a=4;
                        break;
                    case R.id.kuala:
                        chooseTeam.setText(R.string.kuala);
                        a=5;
                        break;
                    case R.id.sinergi:
                        chooseTeam.setText(R.string.sinergi);
                        a=6;
                        break;
                }
            }
        };

        demnia.setOnClickListener(onClickChooseTeam);
        yong.setOnClickListener(onClickChooseTeam);
        dynamo.setOnClickListener(onClickChooseTeam);
        odder.setOnClickListener(onClickChooseTeam);
        kuala.setOnClickListener(onClickChooseTeam);
        sinergi.setOnClickListener(onClickChooseTeam);
        next1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (a){
            case 1:
                Intent denmiaInt = new Intent(this, Demnia.class);
                startActivity(denmiaInt);
                break;
            case 2:
                Intent yongInt = new Intent(this, Yong.class);
                startActivity(yongInt);
                break;
            case 3:
                Intent sentPirreInt = new Intent(this, Dynamo.class);
                startActivity(sentPirreInt);
                break;
            case 4:
                Intent odderInt = new Intent(this, Odder.class);
                startActivity(odderInt);
                break;
            case 5:
                Intent kualaInt = new Intent(this, Kuala.class);
                startActivity(kualaInt);
                break;
            default:
                break;
        }
    }
}
