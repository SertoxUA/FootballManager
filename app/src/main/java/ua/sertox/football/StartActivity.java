package ua.sertox.football;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

public class StartActivity extends AppCompatActivity implements View.OnClickListener{

    TextView appName;
    TextView vName;
    EditText editText;
    Button nextOnStart;
    Button exampleTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        appName = (TextView) findViewById(R.id.appName);
        vName = (TextView) findViewById(R.id.vName);
        editText = (EditText) findViewById(R.id.editName);
        nextOnStart = (Button) findViewById(R.id.nextOnStart);
        exampleTeam = (Button) findViewById(R.id.exampleTeam);

        appName.setText(R.string.app_name);
        vName.setText(R.string.vName);
        nextOnStart.setText(R.string.next);
        exampleTeam.setText(R.string.example_team);

        nextOnStart.setOnClickListener(this);
        exampleTeam.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.nextOnStart:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.exampleTeam:
                intent = new Intent(this, TemplateTeamActivity.class);
                startActivity(intent);
                break;
        }

    }
}
