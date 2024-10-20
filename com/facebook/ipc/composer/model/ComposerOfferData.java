package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerOfferData.class */
public final class ComposerOfferData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(48);
    public final int A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public ComposerOfferData(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
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
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A01 = ImmutableList.copyOf(strArr);
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        int i2 = 0;
        while (i2 < readInt2) {
            i2 = AbH.A00(parcel, strArr2, i2);
        }
        this.A02 = ImmutableList.copyOf(strArr2);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Boolean.valueOf(1BM.A07(parcel));
        }
        this.A04 = parcel.readInt() != 0 ? Boolean.valueOf(AbJ.A1W(parcel)) : bool;
    }

    public ComposerOfferData(ImmutableList immutableList, ImmutableList immutableList2, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i) {
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        C1pq.A08("displayPlacements", immutableList);
        this.A01 = immutableList;
        this.A00 = i;
        this.A0A = str5;
        this.A05 = num;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A0E = str9;
        this.A0F = str10;
        this.A0G = str11;
        this.A0H = str12;
        this.A0I = str13;
        this.A0J = str14;
        C1pq.A08("redeemMethods", immutableList2);
        this.A02 = immutableList2;
        this.A03 = bool;
        this.A04 = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerOfferData)) {
                return false;
            }
            ComposerOfferData composerOfferData = (ComposerOfferData) obj;
            if (!11T.A0O(this.A06, composerOfferData.A06) || !11T.A0O(this.A07, composerOfferData.A07) || !11T.A0O(this.A08, composerOfferData.A08) || !11T.A0O(this.A09, composerOfferData.A09) || !11T.A0O(this.A01, composerOfferData.A01) || this.A00 != composerOfferData.A00 || !11T.A0O(this.A0A, composerOfferData.A0A) || !11T.A0O(this.A05, composerOfferData.A05) || !11T.A0O(this.A0B, composerOfferData.A0B) || !11T.A0O(this.A0C, composerOfferData.A0C) || !11T.A0O(this.A0D, composerOfferData.A0D) || !11T.A0O(this.A0E, composerOfferData.A0E) || !11T.A0O(this.A0F, composerOfferData.A0F) || !11T.A0O(this.A0G, composerOfferData.A0G) || !11T.A0O(this.A0H, composerOfferData.A0H) || !11T.A0O(this.A0I, composerOfferData.A0I) || !11T.A0O(this.A0J, composerOfferData.A0J) || !11T.A0O(this.A02, composerOfferData.A02) || !11T.A0O(this.A03, composerOfferData.A03) || !11T.A0O(this.A04, composerOfferData.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A05, C1pq.A04(this.A0A, (C1pq.A04(this.A01, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A03(this.A06))))) * 31) + this.A00))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A0A);
        C3o5.A0f(parcel, this.A05);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        1BL.A13(parcel, this.A0F);
        1BL.A13(parcel, this.A0G);
        1BL.A13(parcel, this.A0H);
        1BL.A13(parcel, this.A0I);
        1BL.A13(parcel, this.A0J);
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        AbN.A0s(parcel, this.A03);
        AbN.A0s(parcel, this.A04);
    }
}
