package androidx.fragment.app;

import X.0qE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: FragmentManagerState.class */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qE(1);
    public int A00;
    public ArrayList A02;
    public ArrayList A03;
    public ArrayList A06;
    public BackStackRecordState[] A07;
    public String A01 = null;
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A07, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A04);
        parcel.writeTypedList(this.A05);
        parcel.writeTypedList(this.A06);
    }
}
