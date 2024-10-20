package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zO;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ProductItemAttachment.class */
public final class ProductItemAttachment implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(4);
    public final double A00;
    public final double A01;
    public final int A02;
    public final int A03;
    public final ProductItemPlace A04;
    public final ProductItemProfileAudience A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final ImmutableList A0B;
    public final Integer A0C;
    public final Long A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
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
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public ProductItemAttachment(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A0E = parcel.readString();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        ImmutableList immutableList = null;
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
        this.A0I = parcel.readString();
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A06 = ImmutableList.copyOf(strArr);
        }
        this.A0J = parcel.readString();
        this.A0K = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        this.A0W = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0U = 1BM.A07(parcel);
        this.A00 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        this.A01 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            int readInt2 = parcel.readInt();
            ProductItemNearbyLocations[] productItemNearbyLocationsArr = new ProductItemNearbyLocations[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbI.A01(parcel, A0e, productItemNearbyLocationsArr, i3);
            }
            this.A07 = ImmutableList.copyOf(productItemNearbyLocationsArr);
        }
        this.A0X = 1BM.A07(parcel);
        this.A0Y = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            int readInt3 = parcel.readInt();
            String[] strArr2 = new String[readInt3];
            int i4 = 0;
            while (i4 < readInt3) {
                i4 = AbH.A00(parcel, strArr2, i4);
            }
            this.A08 = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (ProductItemPlace) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = AbI.A0z(parcel);
        }
        this.A0P = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = parcel.readString();
        }
        this.A0V = AbJ.A1V(parcel);
        this.A0S = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            int readInt4 = parcel.readInt();
            String[] strArr3 = new String[readInt4];
            int i5 = 0;
            while (i5 < readInt4) {
                i5 = AbH.A00(parcel, strArr3, i5);
            }
            this.A09 = ImmutableList.copyOf(strArr3);
        }
        this.A0T = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            int readInt5 = parcel.readInt();
            ProductItemVariant[] productItemVariantArr = new ProductItemVariant[readInt5];
            int i6 = 0;
            while (i6 < readInt5) {
                i6 = AbI.A01(parcel, A0e, productItemVariantArr, i6);
            }
            this.A0A = ImmutableList.copyOf(productItemVariantArr);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ProductItemProfileAudience) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() != 0) {
            int readInt6 = parcel.readInt();
            String[] strArr4 = new String[readInt6];
            while (i < readInt6) {
                i = AbH.A00(parcel, strArr4, i);
            }
            immutableList = ImmutableList.copyOf(strArr4);
        }
        this.A0B = immutableList;
    }

    public ProductItemAttachment(ProductItemPlace productItemPlace, ProductItemProfileAudience productItemProfileAudience, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, ImmutableList immutableList6, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, double d, double d2, int i, int i2, boolean z, boolean z2) {
        C1pq.A08("attributeDataJson", str);
        this.A0E = str;
        this.A02 = i;
        this.A03 = i2;
        this.A0F = str2;
        this.A0G = str3;
        this.A0H = str4;
        C1pq.A08("deliveryType", str5);
        this.A0I = str5;
        this.A06 = immutableList;
        C1pq.A08("description", str6);
        this.A0J = str6;
        C1pq.A08("draftType", str7);
        this.A0K = str7;
        this.A0L = str8;
        this.A0W = false;
        this.A0U = z;
        this.A00 = d;
        this.A0M = str9;
        this.A01 = d2;
        this.A07 = immutableList2;
        this.A0X = false;
        this.A0Y = false;
        this.A0N = str10;
        this.A0D = l;
        this.A0O = str11;
        this.A08 = immutableList3;
        this.A04 = productItemPlace;
        this.A0C = num;
        C1pq.A08("serializedVerticalsData", str12);
        this.A0P = str12;
        this.A0Q = str13;
        this.A0R = str14;
        this.A0V = z2;
        C1pq.A08("sourceStoryIdDuringCreation", str15);
        this.A0S = str15;
        this.A09 = immutableList4;
        AbF.A1V(str16);
        this.A0T = str16;
        this.A0A = immutableList5;
        this.A05 = productItemProfileAudience;
        this.A0B = immutableList6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProductItemAttachment)) {
                return false;
            }
            ProductItemAttachment productItemAttachment = (ProductItemAttachment) obj;
            if (!11T.A0O(this.A0E, productItemAttachment.A0E) || this.A02 != productItemAttachment.A02 || this.A03 != productItemAttachment.A03 || !11T.A0O(this.A0F, productItemAttachment.A0F) || !11T.A0O(this.A0G, productItemAttachment.A0G) || !11T.A0O(this.A0H, productItemAttachment.A0H) || !11T.A0O(this.A0I, productItemAttachment.A0I) || !11T.A0O(this.A06, productItemAttachment.A06) || !11T.A0O(this.A0J, productItemAttachment.A0J) || !11T.A0O(this.A0K, productItemAttachment.A0K) || !11T.A0O(this.A0L, productItemAttachment.A0L) || this.A0W != productItemAttachment.A0W || this.A0U != productItemAttachment.A0U || this.A00 != productItemAttachment.A00 || !11T.A0O(this.A0M, productItemAttachment.A0M) || this.A01 != productItemAttachment.A01 || !11T.A0O(this.A07, productItemAttachment.A07) || this.A0X != productItemAttachment.A0X || this.A0Y != productItemAttachment.A0Y || !11T.A0O(this.A0N, productItemAttachment.A0N) || !11T.A0O(this.A0D, productItemAttachment.A0D) || !11T.A0O(this.A0O, productItemAttachment.A0O) || !11T.A0O(this.A08, productItemAttachment.A08) || !11T.A0O(this.A04, productItemAttachment.A04) || !11T.A0O(this.A0C, productItemAttachment.A0C) || !11T.A0O(this.A0P, productItemAttachment.A0P) || !11T.A0O(this.A0Q, productItemAttachment.A0Q) || !11T.A0O(this.A0R, productItemAttachment.A0R) || this.A0V != productItemAttachment.A0V || !11T.A0O(this.A0S, productItemAttachment.A0S) || !11T.A0O(this.A09, productItemAttachment.A09) || !11T.A0O(this.A0T, productItemAttachment.A0T) || !11T.A0O(this.A0A, productItemAttachment.A0A) || !11T.A0O(this.A05, productItemAttachment.A05) || !11T.A0O(this.A0B, productItemAttachment.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0B, C1pq.A04(this.A05, C1pq.A04(this.A0A, C1pq.A04(this.A0T, C1pq.A04(this.A09, C1pq.A04(this.A0S, C1pq.A02(C1pq.A04(this.A0R, C1pq.A04(this.A0Q, C1pq.A04(this.A0P, C1pq.A04(this.A0C, C1pq.A04(this.A04, C1pq.A04(this.A08, C1pq.A04(this.A0O, C1pq.A04(this.A0D, C1pq.A04(this.A0N, C1pq.A02(C1pq.A02(C1pq.A04(this.A07, C1pq.A00(this.A01, C1pq.A04(this.A0M, C1pq.A00(this.A00, C1pq.A02(C1pq.A02(C1pq.A04(this.A0L, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A06, C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A0F, (((C1pq.A03(this.A0E) * 31) + this.A02) * 31) + this.A03)))))))), this.A0W), this.A0U))))), this.A0X), this.A0Y)))))))))), this.A0V)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        1BL.A13(parcel, this.A0F);
        1BL.A13(parcel, this.A0G);
        1BL.A13(parcel, this.A0H);
        parcel.writeString(this.A0I);
        ImmutableList immutableList = this.A06;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        1BL.A13(parcel, this.A0L);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeDouble(this.A00);
        1BL.A13(parcel, this.A0M);
        parcel.writeDouble(this.A01);
        ImmutableList immutableList2 = this.A07;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                parcel.writeParcelable((ProductItemNearbyLocations) A0Y2.next(), i);
            }
        }
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        1BL.A13(parcel, this.A0N);
        C3o5.A0g(parcel, this.A0D);
        1BL.A13(parcel, this.A0O);
        ImmutableList immutableList3 = this.A08;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y3 = AbL.A0Y(parcel, immutableList3);
            while (A0Y3.hasNext()) {
                C3o5.A0h(parcel, A0Y3);
            }
        }
        C3o5.A0d(parcel, this.A04, i);
        C3o5.A0f(parcel, this.A0C);
        parcel.writeString(this.A0P);
        1BL.A13(parcel, this.A0Q);
        1BL.A13(parcel, this.A0R);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeString(this.A0S);
        ImmutableList immutableList4 = this.A09;
        if (immutableList4 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y4 = AbL.A0Y(parcel, immutableList4);
            while (A0Y4.hasNext()) {
                C3o5.A0h(parcel, A0Y4);
            }
        }
        parcel.writeString(this.A0T);
        ImmutableList immutableList5 = this.A0A;
        if (immutableList5 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y5 = AbL.A0Y(parcel, immutableList5);
            while (A0Y5.hasNext()) {
                parcel.writeParcelable((ProductItemVariant) A0Y5.next(), i);
            }
        }
        C3o5.A0d(parcel, this.A05, i);
        ImmutableList immutableList6 = this.A0B;
        if (immutableList6 == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y6 = AbL.A0Y(parcel, immutableList6);
        while (A0Y6.hasNext()) {
            C3o5.A0h(parcel, A0Y6);
        }
    }
}
