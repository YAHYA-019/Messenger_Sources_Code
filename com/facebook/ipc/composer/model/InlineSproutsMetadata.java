package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.3Eh;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InlineSproutsMetadata.class */
public final class InlineSproutsMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(91);
    public final 3Eh A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public InlineSproutsMetadata(3Eh r302, Integer num, Integer num2, Integer num3, String str, String str2) {
        this.A04 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A05 = str2;
        this.A03 = num3;
        this.A00 = r302;
    }

    public InlineSproutsMetadata(Parcel parcel) {
        3Eh r304 = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = AbI.A0z(parcel);
        }
        this.A00 = parcel.readInt() != 0 ? 3Eh.values()[parcel.readInt()] : r304;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InlineSproutsMetadata)) {
                return false;
            }
            InlineSproutsMetadata inlineSproutsMetadata = (InlineSproutsMetadata) obj;
            if (!11T.A0O(this.A04, inlineSproutsMetadata.A04) || !11T.A0O(this.A01, inlineSproutsMetadata.A01) || !11T.A0O(this.A02, inlineSproutsMetadata.A02) || !11T.A0O(this.A05, inlineSproutsMetadata.A05) || !11T.A0O(this.A03, inlineSproutsMetadata.A03) || this.A00 != inlineSproutsMetadata.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A04(this.A05, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A04)))));
        return (A04 * 31) + C3o5.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        C3o5.A0f(parcel, this.A01);
        C3o5.A0f(parcel, this.A02);
        1BL.A13(parcel, this.A05);
        C3o5.A0f(parcel, this.A03);
        C3o5.A0e(parcel, this.A00);
    }
}
