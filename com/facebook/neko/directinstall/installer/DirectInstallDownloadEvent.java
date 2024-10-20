package com.facebook.neko.directinstall.installer;

import X.2Go;
import X.4YU;
import X.4YV;
import X.AbM;
import X.DKF;
import X.FKY;
import X.Qom;
import X.QpZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: DirectInstallDownloadEvent.class */
public final class DirectInstallDownloadEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(12);
    public Qom A00;
    public Double A01;
    public final QpZ A02;

    public DirectInstallDownloadEvent(Qom qom, QpZ qpZ) {
        this.A02 = qpZ;
        this.A00 = qom;
    }

    public DirectInstallDownloadEvent(QpZ qpZ) {
        this.A02 = qpZ;
    }

    public DirectInstallDownloadEvent(QpZ qpZ, Double d) {
        this.A02 = qpZ;
        this.A01 = d;
    }

    public DirectInstallDownloadEvent(Parcel parcel) {
        this.A02 = QpZ.valueOf(AbM.A0t(parcel));
        this.A01 = (Double) 4YV.A0l(parcel, Double.class);
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
            DirectInstallDownloadEvent directInstallDownloadEvent = (DirectInstallDownloadEvent) obj;
            if (this.A02 != directInstallDownloadEvent.A02 || this.A00 != directInstallDownloadEvent.A00 || !2Go.A00(this.A01, directInstallDownloadEvent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(this.A02, this.A00, this.A01);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("statusEvent", this.A02);
        stringHelper.add("downloadProgress", this.A01);
        return 4YV.A0s(stringHelper, this.A00, "oemErrorType");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKF.A1E(parcel, this.A02);
        parcel.writeValue(this.A01);
    }
}
