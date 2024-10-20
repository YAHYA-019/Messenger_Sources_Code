package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.7zO;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerBizData.class */
public final class ComposerBizData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(1);
    public final long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public ComposerBizData(Parcel parcel) {
        Long l = null;
        if (C3o5.A01(parcel, this) == 0) {
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
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A00 = parcel.readLong();
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? 7zO.A0j(parcel) : l;
        this.A09 = C3o5.A0O(parcel);
    }

    public ComposerBizData(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A00 = j;
        C1pq.A08("pageName", str6);
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = l;
        this.A09 = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerBizData)) {
                return false;
            }
            ComposerBizData composerBizData = (ComposerBizData) obj;
            if (!11T.A0O(this.A02, composerBizData.A02) || !11T.A0O(this.A03, composerBizData.A03) || !11T.A0O(this.A04, composerBizData.A04) || !11T.A0O(this.A05, composerBizData.A05) || !11T.A0O(this.A06, composerBizData.A06) || this.A00 != composerBizData.A00 || !11T.A0O(this.A07, composerBizData.A07) || !11T.A0O(this.A08, composerBizData.A08) || !11T.A0O(this.A01, composerBizData.A01) || !11T.A0O(this.A09, composerBizData.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A09, C1pq.A04(this.A01, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A01(C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A03(this.A02))))), this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A07);
        1BL.A13(parcel, this.A08);
        C3o5.A0g(parcel, this.A01);
        1BL.A13(parcel, this.A09);
    }
}
