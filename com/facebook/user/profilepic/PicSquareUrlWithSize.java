package com.facebook.user.profilepic;

import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: PicSquareUrlWithSize.class */
public class PicSquareUrlWithSize implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(61);
    public final int size;
    public final String url;

    public PicSquareUrlWithSize() {
        this.size = 0;
        this.url = null;
    }

    public PicSquareUrlWithSize(int i, String str) {
        this.size = i;
        str.getClass();
        this.url = str;
    }

    public PicSquareUrlWithSize(Parcel parcel) {
        this.size = parcel.readInt();
        this.url = parcel.readString();
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
            PicSquareUrlWithSize picSquareUrlWithSize = (PicSquareUrlWithSize) obj;
            if (this.size != picSquareUrlWithSize.size || !Objects.equal(this.url, picSquareUrlWithSize.url)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.size), this.url});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("size", this.size);
        stringHelper.add("url", this.url);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.size);
        parcel.writeString(this.url);
    }
}
