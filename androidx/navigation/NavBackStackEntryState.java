package androidx.navigation;

import X.11T;
import X.1BK;
import X.LGo;
import X.LQw;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NavBackStackEntryState.class */
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(19);
    public final int A00;
    public final Bundle A01;
    public final Bundle A02;
    public final String A03;

    public NavBackStackEntryState(LQw lQw) {
        11T.A0F(lQw, 1);
        this.A03 = lQw.A09;
        this.A00 = lQw.A02.A00;
        this.A01 = lQw.A01();
        Bundle A05 = 1BK.A05();
        this.A02 = A05;
        lQw.A08.A02(A05);
    }

    public NavBackStackEntryState(Parcel parcel) {
        String readString = parcel.readString();
        11T.A0D(readString);
        this.A03 = readString;
        this.A00 = parcel.readInt();
        Class<?> cls = getClass();
        this.A01 = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        11T.A0D(readBundle);
        this.A02 = readBundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeBundle(this.A01);
        parcel.writeBundle(this.A02);
    }
}
