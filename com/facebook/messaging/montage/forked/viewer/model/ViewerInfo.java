package com.facebook.messaging.montage.forked.viewer.model;

import X.11T;
import X.4YW;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.CSV;
import X.DKH;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ViewerInfo.class */
public final class ViewerInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(94);
    public final String A00;
    public final String A01;

    public ViewerInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = DKH.A0l(parcel);
    }

    public ViewerInfo(String str, String str2) {
        AbF.A1T(str);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ViewerInfo)) {
                return false;
            }
            ViewerInfo viewerInfo = (ViewerInfo) obj;
            if (!11T.A0O(this.A00, viewerInfo.A00) || !11T.A0O(this.A01, viewerInfo.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        4YW.A0E(parcel, this.A01);
    }
}
