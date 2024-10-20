package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerMarketplaceListingData.class */
public final class ComposerMarketplaceListingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(43);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Double A0C;
    public final Double A0D;
    public final Double A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;

    public ComposerMarketplaceListingData(Parcel parcel) {
        ImmutableList immutableList = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbH.A00(parcel, strArr2, i3);
            }
            this.A01 = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt3 = parcel.readInt();
            String[] strArr3 = new String[readInt3];
            int i4 = 0;
            while (i4 < readInt3) {
                i4 = AbH.A00(parcel, strArr3, i4);
            }
            this.A02 = ImmutableList.copyOf(strArr3);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = DKG.A0x(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt4 = parcel.readInt();
            String[] strArr4 = new String[readInt4];
            int i5 = 0;
            while (i5 < readInt4) {
                i5 = AbH.A00(parcel, strArr4, i5);
            }
            this.A03 = ImmutableList.copyOf(strArr4);
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            int readInt5 = parcel.readInt();
            String[] strArr5 = new String[readInt5];
            int i6 = 0;
            while (i6 < readInt5) {
                i6 = AbH.A00(parcel, strArr5, i6);
            }
            this.A04 = ImmutableList.copyOf(strArr5);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            int readInt6 = parcel.readInt();
            String[] strArr6 = new String[readInt6];
            int i7 = 0;
            while (i7 < readInt6) {
                i7 = AbH.A00(parcel, strArr6, i7);
            }
            this.A05 = ImmutableList.copyOf(strArr6);
        }
        this.A0b = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0c = null;
        } else {
            this.A0c = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = Boolean.valueOf(AbJ.A1V(parcel));
        }
        if (parcel.readInt() != 0) {
            int readInt7 = parcel.readInt();
            String[] strArr7 = new String[readInt7];
            while (i < readInt7) {
                i = AbH.A00(parcel, strArr7, i);
            }
            immutableList = ImmutableList.copyOf(strArr7);
        }
        this.A06 = immutableList;
        this.A0d = C3o5.A0O(parcel);
    }

    public ComposerMarketplaceListingData(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, ImmutableList immutableList6, ImmutableList immutableList7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Double d, Double d2, Double d3, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        this.A0I = str;
        this.A0F = num;
        this.A0G = num2;
        this.A0J = str2;
        this.A0K = str3;
        this.A0L = str4;
        this.A00 = immutableList;
        this.A0M = str5;
        this.A0N = str6;
        this.A0O = str7;
        this.A0P = str8;
        this.A0C = d;
        this.A0Q = str9;
        this.A0D = d2;
        this.A07 = bool;
        this.A0R = str10;
        this.A01 = immutableList2;
        this.A02 = immutableList3;
        this.A0E = d3;
        this.A0S = str11;
        this.A03 = immutableList4;
        this.A0H = num3;
        this.A0T = str12;
        this.A0U = str13;
        this.A0V = str14;
        this.A0W = str15;
        this.A0X = str16;
        this.A08 = bool2;
        this.A0Y = str17;
        this.A04 = immutableList5;
        this.A09 = bool3;
        this.A0Z = str18;
        this.A0a = str19;
        this.A05 = immutableList6;
        C1pq.A08("surface", str20);
        this.A0b = str20;
        this.A0A = bool4;
        this.A0c = str21;
        this.A0B = bool5;
        this.A06 = immutableList7;
        this.A0d = str22;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMarketplaceListingData)) {
                return false;
            }
            ComposerMarketplaceListingData composerMarketplaceListingData = (ComposerMarketplaceListingData) obj;
            if (!11T.A0O(this.A0I, composerMarketplaceListingData.A0I) || !11T.A0O(this.A0F, composerMarketplaceListingData.A0F) || !11T.A0O(this.A0G, composerMarketplaceListingData.A0G) || !11T.A0O(this.A0J, composerMarketplaceListingData.A0J) || !11T.A0O(this.A0K, composerMarketplaceListingData.A0K) || !11T.A0O(this.A0L, composerMarketplaceListingData.A0L) || !11T.A0O(this.A00, composerMarketplaceListingData.A00) || !11T.A0O(this.A0M, composerMarketplaceListingData.A0M) || !11T.A0O(this.A0N, composerMarketplaceListingData.A0N) || !11T.A0O(this.A0O, composerMarketplaceListingData.A0O) || !11T.A0O(this.A0P, composerMarketplaceListingData.A0P) || !11T.A0O(this.A0C, composerMarketplaceListingData.A0C) || !11T.A0O(this.A0Q, composerMarketplaceListingData.A0Q) || !11T.A0O(this.A0D, composerMarketplaceListingData.A0D) || !11T.A0O(this.A07, composerMarketplaceListingData.A07) || !11T.A0O(this.A0R, composerMarketplaceListingData.A0R) || !11T.A0O(this.A01, composerMarketplaceListingData.A01) || !11T.A0O(this.A02, composerMarketplaceListingData.A02) || !11T.A0O(this.A0E, composerMarketplaceListingData.A0E) || !11T.A0O(this.A0S, composerMarketplaceListingData.A0S) || !11T.A0O(this.A03, composerMarketplaceListingData.A03) || !11T.A0O(this.A0H, composerMarketplaceListingData.A0H) || !11T.A0O(this.A0T, composerMarketplaceListingData.A0T) || !11T.A0O(this.A0U, composerMarketplaceListingData.A0U) || !11T.A0O(this.A0V, composerMarketplaceListingData.A0V) || !11T.A0O(this.A0W, composerMarketplaceListingData.A0W) || !11T.A0O(this.A0X, composerMarketplaceListingData.A0X) || !11T.A0O(this.A08, composerMarketplaceListingData.A08) || !11T.A0O(this.A0Y, composerMarketplaceListingData.A0Y) || !11T.A0O(this.A04, composerMarketplaceListingData.A04) || !11T.A0O(this.A09, composerMarketplaceListingData.A09) || !11T.A0O(this.A0Z, composerMarketplaceListingData.A0Z) || !11T.A0O(this.A0a, composerMarketplaceListingData.A0a) || !11T.A0O(this.A05, composerMarketplaceListingData.A05) || !11T.A0O(this.A0b, composerMarketplaceListingData.A0b) || !11T.A0O(this.A0A, composerMarketplaceListingData.A0A) || !11T.A0O(this.A0c, composerMarketplaceListingData.A0c) || !11T.A0O(this.A0B, composerMarketplaceListingData.A0B) || !11T.A0O(this.A06, composerMarketplaceListingData.A06) || !11T.A0O(this.A0d, composerMarketplaceListingData.A0d)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0d, C1pq.A04(this.A06, C1pq.A04(this.A0B, C1pq.A04(this.A0c, C1pq.A04(this.A0A, C1pq.A04(this.A0b, C1pq.A04(this.A05, C1pq.A04(this.A0a, C1pq.A04(this.A0Z, C1pq.A04(this.A09, C1pq.A04(this.A04, C1pq.A04(this.A0Y, C1pq.A04(this.A08, C1pq.A04(this.A0X, C1pq.A04(this.A0W, C1pq.A04(this.A0V, C1pq.A04(this.A0U, C1pq.A04(this.A0T, C1pq.A04(this.A0H, C1pq.A04(this.A03, C1pq.A04(this.A0S, C1pq.A04(this.A0E, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A0R, C1pq.A04(this.A07, C1pq.A04(this.A0D, C1pq.A04(this.A0Q, C1pq.A04(this.A0C, C1pq.A04(this.A0P, C1pq.A04(this.A0O, C1pq.A04(this.A0N, C1pq.A04(this.A0M, C1pq.A04(this.A00, C1pq.A04(this.A0L, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A03(this.A0I))))))))))))))))))))))))))))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0I);
        C3o5.A0f(parcel, this.A0F);
        C3o5.A0f(parcel, this.A0G);
        1BL.A13(parcel, this.A0J);
        1BL.A13(parcel, this.A0K);
        1BL.A13(parcel, this.A0L);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1BL.A13(parcel, this.A0M);
        1BL.A13(parcel, this.A0N);
        1BL.A13(parcel, this.A0O);
        1BL.A13(parcel, this.A0P);
        DKH.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0Q);
        DKH.A13(parcel, this.A0D);
        AbN.A0s(parcel, this.A07);
        1BL.A13(parcel, this.A0R);
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        ImmutableList immutableList3 = this.A02;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                C3o5.A0h(parcel, A0Y3);
            }
        }
        DKH.A13(parcel, this.A0E);
        1BL.A13(parcel, this.A0S);
        ImmutableList immutableList4 = this.A03;
        if (immutableList4 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y4 = AbL.A0Y(parcel, immutableList4);
            while (A0Y4.hasNext()) {
                C3o5.A0h(parcel, A0Y4);
            }
        }
        C3o5.A0f(parcel, this.A0H);
        1BL.A13(parcel, this.A0T);
        1BL.A13(parcel, this.A0U);
        1BL.A13(parcel, this.A0V);
        1BL.A13(parcel, this.A0W);
        1BL.A13(parcel, this.A0X);
        AbN.A0s(parcel, this.A08);
        1BL.A13(parcel, this.A0Y);
        ImmutableList immutableList5 = this.A04;
        if (immutableList5 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y5 = AbL.A0Y(parcel, immutableList5);
            while (A0Y5.hasNext()) {
                C3o5.A0h(parcel, A0Y5);
            }
        }
        AbN.A0s(parcel, this.A09);
        1BL.A13(parcel, this.A0Z);
        1BL.A13(parcel, this.A0a);
        ImmutableList immutableList6 = this.A05;
        if (immutableList6 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y6 = AbL.A0Y(parcel, immutableList6);
            while (A0Y6.hasNext()) {
                C3o5.A0h(parcel, A0Y6);
            }
        }
        parcel.writeString(this.A0b);
        AbN.A0s(parcel, this.A0A);
        1BL.A13(parcel, this.A0c);
        AbN.A0s(parcel, this.A0B);
        ImmutableList immutableList7 = this.A06;
        if (immutableList7 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y7 = AbL.A0Y(parcel, immutableList7);
            while (A0Y7.hasNext()) {
                C3o5.A0h(parcel, A0Y7);
            }
        }
        1BL.A13(parcel, this.A0d);
    }
}
