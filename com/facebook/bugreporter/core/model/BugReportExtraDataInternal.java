package com.facebook.bugreporter.core.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.AbJ;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BugReportExtraDataInternal.class */
public final class BugReportExtraDataInternal implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(68);
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;

    public BugReportExtraDataInternal(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Boolean.valueOf(1BM.A07(parcel));
        }
        this.A02 = parcel.readInt() != 0 ? Boolean.valueOf(AbJ.A1W(parcel)) : bool;
        this.A03 = C3o5.A0O(parcel);
    }

    public BugReportExtraDataInternal(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BugReportExtraDataInternal)) {
                return false;
            }
            BugReportExtraDataInternal bugReportExtraDataInternal = (BugReportExtraDataInternal) obj;
            if (!11T.A0O(this.A00, bugReportExtraDataInternal.A00) || !11T.A0O(this.A01, bugReportExtraDataInternal.A01) || !11T.A0O(this.A02, bugReportExtraDataInternal.A02) || !11T.A0O(this.A03, bugReportExtraDataInternal.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbN.A0s(parcel, this.A00);
        AbN.A0s(parcel, this.A01);
        AbN.A0s(parcel, this.A02);
        1BL.A13(parcel, this.A03);
    }
}
