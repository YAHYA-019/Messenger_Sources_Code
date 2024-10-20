package com.facebook.messaging.model.attachment;

import X.0Pz;
import X.C4Ny;
import X.He9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: ImageUrl.class */
public final class ImageUrl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(14);
    public int A00;
    public int A01;
    public String A02;

    public ImageUrl(int i, String str, int i2) {
        this.A01 = i2;
        this.A00 = i;
        this.A02 = str;
    }

    public ImageUrl(He9 he9) {
        this.A01 = he9.A01;
        this.A00 = he9.A00;
        this.A02 = he9.A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ImageUrl imageUrl = (ImageUrl) obj;
            if (this.A01 != imageUrl.A01 || this.A00 != imageUrl.A00 || !Objects.equal(this.A02, imageUrl.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A02});
    }

    public String toString() {
        return 0Pz.A0B(this.A01, this.A00, "x");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }
}
