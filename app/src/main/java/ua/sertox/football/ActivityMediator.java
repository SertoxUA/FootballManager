package ua.sertox.football;

import android.content.Context;
import android.content.Intent;

public class ActivityMediator {

    public void startTeamSelectionActivity(Context context){
        Intent intent = new Intent(context, OldActivity.class);
        context.startActivity(intent);
    }
}
