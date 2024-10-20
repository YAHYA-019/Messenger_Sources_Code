package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.DKH;
import X.Dn4;
import X.FJ8;
import X.FKf;
import X.GKE;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationVideoTemplate.class */
public final class InspirationVideoTemplate implements GKE, Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(75);
    public final Dn4 A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public InspirationVideoTemplate(Dn4 dn4, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A01 = immutableList;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        C1pq.A08("templateId", str5);
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A0A = str8;
        this.A00 = dn4;
        this.A02 = immutableList2;
    }

    public InspirationVideoTemplate(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            InspirationVideoTemplateAudioTrack[] inspirationVideoTemplateAudioTrackArr = new InspirationVideoTemplateAudioTrack[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, inspirationVideoTemplateAudioTrackArr, i2);
            }
            this.A01 = ImmutableList.copyOf(inspirationVideoTemplateAudioTrackArr);
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
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
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
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Dn4) FJ8.A01(parcel);
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            InspirationVideoTemplateVideoTrack[] inspirationVideoTemplateVideoTrackArr = new InspirationVideoTemplateVideoTrack[readInt2];
            while (i < readInt2) {
                i = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoTrackArr, i);
            }
            immutableList = ImmutableList.copyOf(inspirationVideoTemplateVideoTrackArr);
        }
        this.A02 = immutableList;
    }

    public /* synthetic */ String Ai3() {
        String str = this.A06;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public /* synthetic */ int Ai4() {
        return -1;
    }

    public /* synthetic */ String B4J() {
        String str = this.A05;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public /* synthetic */ int B4K() {
        return -1;
    }

    public String BEa() {
        return this.A07;
    }

    public /* synthetic */ String BEb() {
        String str = this.A06;
        if (str == null) {
            str = "";
        }
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplate)) {
                return false;
            }
            InspirationVideoTemplate inspirationVideoTemplate = (InspirationVideoTemplate) obj;
            if (!11T.A0O(this.A01, inspirationVideoTemplate.A01) || !11T.A0O(this.A03, inspirationVideoTemplate.A03) || !11T.A0O(this.A04, inspirationVideoTemplate.A04) || !11T.A0O(this.A05, inspirationVideoTemplate.A05) || !11T.A0O(this.A06, inspirationVideoTemplate.A06) || !11T.A0O(this.A07, inspirationVideoTemplate.A07) || !11T.A0O(this.A08, inspirationVideoTemplate.A08) || !11T.A0O(this.A09, inspirationVideoTemplate.A09) || !11T.A0O(this.A0A, inspirationVideoTemplate.A0A) || !11T.A0O(this.A00, inspirationVideoTemplate.A00) || !11T.A0O(this.A02, inspirationVideoTemplate.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A03(this.A01)))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((InspirationVideoTemplateAudioTrack) A0Y.next(), i);
            }
        }
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeString(this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        DKH.A0y(parcel, this.A00);
        ImmutableList immutableList2 = this.A02;
        if (immutableList2 == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
        while (A0Y2.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoTrack) A0Y2.next(), i);
        }
    }
}
