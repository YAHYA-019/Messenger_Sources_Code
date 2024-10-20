package androidx.compose.foundation.lazy.layout;

import X.JQz;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DefaultLazyKey.class */
public final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(14);
    public final int A00;

    public DefaultLazyKey(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DefaultLazyKey) && this.A00 == ((DefaultLazyKey) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return JQz.A0p("DefaultLazyKey(index=", this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }
}
