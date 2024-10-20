package android.support.v4.media;

import X.0Pz;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RatingCompat.class */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(3);
    public final float A00;
    public final int A01;

    public RatingCompat(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.A01;
    }

    public String toString() {
        int i = this.A01;
        float f = this.A00;
        return 0Pz.A0E(i, "Rating:style=", " rating=", f < 0.0f ? "unrated" : String.valueOf(f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
