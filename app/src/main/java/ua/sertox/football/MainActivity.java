package ua.sertox.football;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ua.sertox.football.Team.Vorskla;
import ua.sertox.football.Team.Zarya;
import ua.sertox.football.Team.Veres;
import ua.sertox.football.Team.Dynamo;
import ua.sertox.football.Team.Shakhtar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView chooseTeam;
    TextView selectTeam;
    Button vorskla;
    Button shakhtar;
    Button dynamo;
    Button veres;
    Button zarya;
    Button karpaty;
    Button next1;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        chooseTeam = (TextView) findViewById(R.id.chooseTeam);
        selectTeam = (TextView) findViewById(R.id.selectTeam);
        vorskla = (Button) findViewById(R.id.vorskla);
        shakhtar = (Button) findViewById(R.id.shakhtar);
        dynamo = (Button) findViewById(R.id.dynamo);
        veres = (Button) findViewById(R.id.veres);
        zarya = (Button) findViewById(R.id.zorya);
        karpaty = (Button) findViewById(R.id.karpaty);
        next1 = (Button) findViewById(R.id.next1);

        selectTeam.setText(R.string.selectTeam);
        vorskla.setText(R.string.vorskla);
        shakhtar.setText(R.string.shakhtar);
        dynamo.setText(R.string.dynamo);
        veres.setText(R.string.veres);
        zarya.setText(R.string.zarya);
        karpaty.setText(R.string.karpaty);
        next1.setText(R.string.next);

        final View.OnClickListener onClickChooseTeam = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.vorskla:
                        chooseTeam.setText(R.string.vorskla);
                        a=1;
                        break;
                    case R.id.shakhtar:
                        chooseTeam.setText(R.string.shakhtar);
                        a=2;
                        break;
                    case R.id.dynamo:
                        chooseTeam.setText(R.string.dynamo);
                        a=3;
                        break;
                    case R.id.veres:
                        chooseTeam.setText(R.string.veres);
                        a=4;
                        break;
                    case R.id.zorya:
                        chooseTeam.setText(R.string.zarya);
                        a=5;
                        break;
                    case R.id.karpaty:
                        chooseTeam.setText(R.string.karpaty);
                        a=6;
                        break;
                }
            }
        };

        vorskla.setOnClickListener(onClickChooseTeam);
        shakhtar.setOnClickListener(onClickChooseTeam);
        dynamo.setOnClickListener(onClickChooseTeam);
        veres.setOnClickListener(onClickChooseTeam);
        zarya.setOnClickListener(onClickChooseTeam);
        karpaty.setOnClickListener(onClickChooseTeam);
        next1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (a){
            case 1:
                Intent denmiaInt = new Intent(this, Vorskla.class);
                startActivity(denmiaInt);
                break;
            case 2:
                Intent yongInt = new Intent(this, Shakhtar.class);
                startActivity(yongInt);
                break;
            case 3:
                Intent sentPirreInt = new Intent(this, Dynamo.class);
                startActivity(sentPirreInt);
                break;
            case 4:
                Intent odderInt = new Intent(this, Veres.class);
                startActivity(odderInt);
                break;
            case 5:
                Intent kualaInt = new Intent(this, Zarya.class);
                startActivity(kualaInt);
                break;
            default:
                break;
        }
    }
}
