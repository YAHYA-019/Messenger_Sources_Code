package com.facebook.messaging.montage.forked.viewer.model;

import X.11T;
import X.1BL;
import X.AbF;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.CSV;
import X.ROg;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AudienceControlData.class */
public final class AudienceControlData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(89);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public AudienceControlData(ROg rOg) {
        this.A00 = rOg.A00;
        String str = rOg.A01;
        AbF.A1T(str);
        this.A01 = str;
        this.A07 = rOg.A07;
        this.A02 = rOg.A02;
        this.A03 = rOg.A03;
        this.A04 = rOg.A04;
        this.A05 = rOg.A05;
        this.A06 = rOg.A06;
    }

    public AudienceControlData(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readString();
        this.A07 = AbN.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A06 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AudienceControlData)) {
                return false;
            }
            AudienceControlData audienceControlData = (AudienceControlData) obj;
            if (!11T.A0O(this.A00, audienceControlData.A00) || !11T.A0O(this.A01, audienceControlData.A01) || this.A07 != audienceControlData.A07 || !11T.A0O(this.A02, audienceControlData.A02) || !11T.A0O(this.A03, audienceControlData.A03) || !11T.A0O(this.A04, audienceControlData.A04) || !11T.A0O(this.A05, audienceControlData.A05) || !11T.A0O(this.A06, audienceControlData.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A07))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
    }
}
