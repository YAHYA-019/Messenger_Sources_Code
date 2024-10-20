package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoMediaTextMeta.class */
public final class VideoMediaTextMeta implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(61);
    public final Double A00;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final Double A04;
    public final Double A05;
    public final Double A06;
    public final Double A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public VideoMediaTextMeta(Parcel parcel) {
        Double d = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = DKG.A0x(parcel);
        }
        this.A07 = parcel.readInt() != 0 ? DKG.A0x(parcel) : d;
    }

    public VideoMediaTextMeta(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, String str, String str2, String str3) {
        this.A08 = str;
        this.A09 = str2;
        this.A00 = d;
        this.A0A = str3;
        this.A01 = d2;
        this.A02 = d3;
        this.A03 = d4;
        this.A04 = d5;
        this.A05 = d6;
        this.A06 = d7;
        this.A07 = d8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoMediaTextMeta)) {
                return false;
            }
            VideoMediaTextMeta videoMediaTextMeta = (VideoMediaTextMeta) obj;
            if (!11T.A0O(this.A08, videoMediaTextMeta.A08) || !11T.A0O(this.A09, videoMediaTextMeta.A09) || !11T.A0O(this.A00, videoMediaTextMeta.A00) || !11T.A0O(this.A0A, videoMediaTextMeta.A0A) || !11T.A0O(this.A01, videoMediaTextMeta.A01) || !11T.A0O(this.A02, videoMediaTextMeta.A02) || !11T.A0O(this.A03, videoMediaTextMeta.A03) || !11T.A0O(this.A04, videoMediaTextMeta.A04) || !11T.A0O(this.A05, videoMediaTextMeta.A05) || !11T.A0O(this.A06, videoMediaTextMeta.A06) || !11T.A0O(this.A07, videoMediaTextMeta.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A0A, C1pq.A04(this.A00, C1pq.A04(this.A09, C1pq.A03(this.A08)))))))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoMediaTextMeta{color=");
        A0k.append(this.A08);
        A0k.append(", content=");
        A0k.append(this.A09);
        A0k.append(", endSec=");
        A0k.append(this.A00);
        A0k.append(", font=");
        A0k.append(this.A0A);
        A0k.append(", height=");
        A0k.append(this.A01);
        A0k.append(", rotation=");
        A0k.append(this.A02);
        A0k.append(", scale=");
        A0k.append(this.A03);
        A0k.append(", startSec=");
        A0k.append(this.A04);
        A0k.append(", width=");
        A0k.append(this.A05);
        A0k.append(", x=");
        A0k.append(this.A06);
        A0k.append(", y=");
        A0k.append(this.A07);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        DKH.A13(parcel, this.A00);
        1BL.A13(parcel, this.A0A);
        DKH.A13(parcel, this.A01);
        DKH.A13(parcel, this.A02);
        DKH.A13(parcel, this.A03);
        DKH.A13(parcel, this.A04);
        DKH.A13(parcel, this.A05);
        DKH.A13(parcel, this.A06);
        DKH.A13(parcel, this.A07);
    }
}
