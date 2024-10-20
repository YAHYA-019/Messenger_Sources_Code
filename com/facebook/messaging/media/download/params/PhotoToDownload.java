package com.facebook.messaging.media.download.params;

import X.11T;
import X.1BL;
import X.4YU;
import X.AnonymousClass001;
import X.C04v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PhotoToDownload.class */
public final class PhotoToDownload extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(14);
    public final ThreadKey A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;

    public PhotoToDownload(ThreadKey threadKey, Boolean bool, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = threadKey;
        this.A01 = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PhotoToDownload)) {
                return false;
            }
            PhotoToDownload photoToDownload = (PhotoToDownload) obj;
            if (!11T.A0O(this.A03, photoToDownload.A03) || !11T.A0O(this.A02, photoToDownload.A02) || !11T.A0O(this.A00, photoToDownload.A00) || !11T.A0O(this.A01, photoToDownload.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((1BL.A05(this.A03) * 31) + 1BL.A05(this.A02)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 4YU.A03(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        Boolean bool = this.A01;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue() ? 1 : 0;
        }
        parcel.writeInt(i2);
    }
}
