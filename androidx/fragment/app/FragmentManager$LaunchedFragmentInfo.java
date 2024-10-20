package androidx.fragment.app;

import X.0qB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FragmentManager$LaunchedFragmentInfo.class */
public final class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qB(2);
    public int A00;
    public String A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
