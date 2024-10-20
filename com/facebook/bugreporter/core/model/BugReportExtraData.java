package com.facebook.bugreporter.core.model;

import X.1BL;
import X.2Go;
import X.AnonymousClass001;
import X.DKD;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BugReportExtraData.class */
public final class BugReportExtraData implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(67);
    public final BugReportExtraDataInternal A00;

    public BugReportExtraData(Parcel parcel) {
        BugReportExtraDataInternal bugReportExtraDataInternal = (BugReportExtraDataInternal) 1BL.A0C(parcel, BugReportExtraData.class);
        this.A00 = bugReportExtraDataInternal == null ? new BugReportExtraDataInternal(null, null, null, null) : bugReportExtraDataInternal;
    }

    public BugReportExtraData(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.A00 = new BugReportExtraDataInternal(bool3, bool2, bool, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return 2Go.A00(this.A00, ((BugReportExtraData) obj).A00);
    }

    public int hashCode() {
        return DKD.A04(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BugReportExtraData{mExtraDataInternal=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
