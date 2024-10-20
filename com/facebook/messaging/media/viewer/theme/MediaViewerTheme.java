package com.facebook.messaging.media.viewer.theme;

import X.9Qz;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MediaViewerTheme.class */
public final class MediaViewerTheme implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(33);
    public final int A00;
    public final int A01;
    public final int A02;

    public MediaViewerTheme(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public MediaViewerTheme(9Qz r302) {
        this.A00 = r302.A00;
        this.A01 = r302.A01;
        this.A02 = r302.A02;
    }

    public MediaViewerTheme(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaViewerTheme)) {
                return false;
            }
            MediaViewerTheme mediaViewerTheme = (MediaViewerTheme) obj;
            if (this.A00 != mediaViewerTheme.A00 || this.A01 != mediaViewerTheme.A01 || this.A02 != mediaViewerTheme.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
