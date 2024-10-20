package com.facebook.smartcapture.capture;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zO;
import X.AbH;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SelfieEvidence.class */
public final class SelfieEvidence implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(22);
    public final ImmutableList A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;

    public SelfieEvidence() {
        this.A06 = null;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        this.A07 = null;
        this.A05 = null;
        this.A04 = null;
    }

    public SelfieEvidence(Parcel parcel) {
        Integer num = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = 7zO.A0j(parcel);
        }
        this.A04 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SelfieEvidence)) {
                return false;
            }
            SelfieEvidence selfieEvidence = (SelfieEvidence) obj;
            if (!11T.A0O(this.A06, selfieEvidence.A06) || !11T.A0O(this.A00, selfieEvidence.A00) || !11T.A0O(this.A02, selfieEvidence.A02) || !11T.A0O(this.A01, selfieEvidence.A01) || !11T.A0O(this.A03, selfieEvidence.A03) || !11T.A0O(this.A07, selfieEvidence.A07) || !11T.A0O(this.A05, selfieEvidence.A05) || !11T.A0O(this.A04, selfieEvidence.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A05, C1pq.A04(this.A07, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A06))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A06);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        C3o5.A0f(parcel, this.A02);
        DKH.A12(parcel, this.A01);
        C3o5.A0f(parcel, this.A03);
        1BL.A13(parcel, this.A07);
        C3o5.A0g(parcel, this.A05);
        C3o5.A0f(parcel, this.A04);
    }
}
