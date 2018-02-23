package ua.sertox.football;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import ua.sertox.football.expand.ExpandActivity;
import ua.sertox.football.multicheck.MultiCheckActivity;
import ua.sertox.football.multitype.MultiTypeActivity;
import ua.sertox.football.multitypeandcheck.MultiTypeCheckGenreActivity;
import ua.sertox.football.singlecheck.SingleCheckActivity;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button expand = (Button) findViewById(R.id.expand_button);
    expand.setOnClickListener(navigateTo(ExpandActivity.class));

    Button multiSelect = (Button) findViewById(R.id.multi_check_button);
    multiSelect.setOnClickListener(navigateTo(MultiCheckActivity.class));

    Button singleSelect = (Button) findViewById(R.id.single_check_button);
    singleSelect.setOnClickListener(navigateTo(SingleCheckActivity.class));

    Button mixedSelect = (Button) findViewById(R.id.mixedtype_button);
    mixedSelect.setOnClickListener(navigateTo(MultiTypeActivity.class));

    Button mixedTypeAndCheck = (Button) findViewById(R.id.mixedtype_check_button);
    mixedTypeAndCheck.setOnClickListener(navigateTo(MultiTypeCheckGenreActivity.class));
  }

  public OnClickListener navigateTo(final Class<?> clazz) {
    return new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
      }
    };
  }
}
