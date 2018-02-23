package ua.sertox.football.singlecheck;

import android.os.Parcel;
import android.os.Parcelable;

import com.thoughtbot.expandablecheckrecyclerview.models.SingleCheckExpandableGroup;

import java.util.List;

public class SingleCheckGenre extends SingleCheckExpandableGroup {

  private int iconResId;

  public SingleCheckGenre(String title, List items, int iconResId) {
    super(title, items);
    this.iconResId = iconResId;
  }

  protected SingleCheckGenre(Parcel in) {
    super(in);
    iconResId = in.readInt();
  }

  public int getIconResId() {
    return iconResId;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeInt(iconResId);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<SingleCheckGenre> CREATOR = new Parcelable.Creator<SingleCheckGenre>() {
    @Override
    public SingleCheckGenre createFromParcel(Parcel in) {
      return new SingleCheckGenre(in);
    }

    @Override
    public SingleCheckGenre[] newArray(int size) {
      return new SingleCheckGenre[size];
    }
  };
}
