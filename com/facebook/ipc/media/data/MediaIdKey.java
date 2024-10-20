package com.facebook.ipc.media.data;

import X.0Pz;
import X.AbM;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import java.util.Locale;

/* loaded from: MediaIdKey.class */
public final class MediaIdKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(48);
    public final long A00;
    public final String A01;

    public MediaIdKey(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readLong();
    }

    public MediaIdKey(String str, long j) {
        this.A01 = str == null ? "" : str;
        this.A00 = j <= 0 ? 0L : j;
    }

    public static MediaIdKey A00(String str) {
        str.getClass();
        int indexOf = str.indexOf(ActionId.VIEW_DID_LOAD_BEGIN);
        if (indexOf >= 0) {
            return new MediaIdKey(str.substring(indexOf + 1), Long.parseLong(str.substring(0, indexOf)));
        }
        throw 0Pz.A05("MediaIdKey.valueOf: ", str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaIdKey mediaIdKey = (MediaIdKey) obj;
        long j = this.A00;
        if (j == 0 || j != mediaIdKey.A00) {
            return this.A01.equals(mediaIdKey.A01);
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(Long.valueOf(this.A00), this.A01);
    }

    public String toString() {
        long j = this.A00;
        return String.format(Locale.US, "%d%c%s", Long.valueOf(j), '|', this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }
}
