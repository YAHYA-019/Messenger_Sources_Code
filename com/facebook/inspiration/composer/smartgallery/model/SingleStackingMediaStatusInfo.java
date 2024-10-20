package com.facebook.inspiration.composer.smartgallery.model;

import X.C3o5;
import X.FKf;
import X.RIM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SingleStackingMediaStatusInfo.class */
public final class SingleStackingMediaStatusInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(25);
    public final int A00;
    public final int A01;

    public SingleStackingMediaStatusInfo(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public SingleStackingMediaStatusInfo(RIM rim) {
        this.A00 = rim.A00;
        this.A01 = rim.A01;
    }

    public SingleStackingMediaStatusInfo(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, X.RIM] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, X.RIM] */
    public static RIM A00(SingleStackingMediaStatusInfo singleStackingMediaStatusInfo) {
        if (singleStackingMediaStatusInfo == null) {
            return new RIM();
        }
        new Object();
        ?? r0 = singleStackingMediaStatusInfo.A00;
        ((RIM) r0).A00 = r0;
        ?? r02 = singleStackingMediaStatusInfo.A01;
        ((RIM) r02).A01 = r02;
        return r02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SingleStackingMediaStatusInfo)) {
                return false;
            }
            SingleStackingMediaStatusInfo singleStackingMediaStatusInfo = (SingleStackingMediaStatusInfo) obj;
            if (this.A00 != singleStackingMediaStatusInfo.A00 || this.A01 != singleStackingMediaStatusInfo.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
