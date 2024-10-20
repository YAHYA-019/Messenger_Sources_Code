package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zU;
import X.AbH;
import X.AbM;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationBloksStickerInfo.class */
public final class InspirationBloksStickerInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A0B;
    public static volatile InspirationOverlayPosition A0C;
    public static final Parcelable.Creator CREATOR = FKc.A00(4);
    public final float A00;
    public final InspirationOverlayPosition A01;
    public final InspirationOverlayPosition A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final boolean A0A;

    public InspirationBloksStickerInfo(Parcel parcel) {
        this.A04 = 7zU.A0l(parcel, this);
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A03 = ImmutableList.copyOf(strArr);
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = DKG.A0W(parcel);
        }
        this.A07 = parcel.readString();
        this.A0A = AbN.A1U(parcel);
        this.A00 = parcel.readFloat();
        this.A08 = parcel.readString();
        this.A02 = parcel.readInt() != 0 ? DKG.A0W(parcel) : inspirationOverlayPosition;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public InspirationBloksStickerInfo(InspirationOverlayPosition inspirationOverlayPosition, InspirationOverlayPosition inspirationOverlayPosition2, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, Set set, float f, boolean z) {
        C1pq.A08("bloksStickerStyleString", str);
        this.A04 = str;
        C1pq.A08("bloksVersion", str2);
        this.A05 = str2;
        C1pq.A08("brandName", str3);
        this.A06 = str3;
        C1pq.A08("imageAssetIds", immutableList);
        this.A03 = immutableList;
        this.A01 = inspirationOverlayPosition;
        C1pq.A08("parentCommentId", str4);
        this.A07 = str4;
        this.A0A = z;
        this.A00 = f;
        C1pq.A08("stickerAssetId", str5);
        this.A08 = str5;
        this.A02 = inspirationOverlayPosition2;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (DKF.A1b(this.A09)) {
            return this.A01;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = DKG.A0V();
                }
            }
        }
        return A0B;
    }

    public InspirationOverlayPosition A01() {
        if (this.A09.contains("stickerAssetPosition")) {
            return this.A02;
        }
        if (A0C == null) {
            synchronized (this) {
                if (A0C == null) {
                    A0C = DKG.A0V();
                }
            }
        }
        return A0C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationBloksStickerInfo)) {
                return false;
            }
            InspirationBloksStickerInfo inspirationBloksStickerInfo = (InspirationBloksStickerInfo) obj;
            if (!11T.A0O(this.A04, inspirationBloksStickerInfo.A04) || !11T.A0O(this.A05, inspirationBloksStickerInfo.A05) || !11T.A0O(this.A06, inspirationBloksStickerInfo.A06) || !11T.A0O(this.A03, inspirationBloksStickerInfo.A03) || !11T.A0O(A00(), inspirationBloksStickerInfo.A00()) || !11T.A0O(this.A07, inspirationBloksStickerInfo.A07) || this.A0A != inspirationBloksStickerInfo.A0A || this.A00 != inspirationBloksStickerInfo.A00 || !11T.A0O(this.A08, inspirationBloksStickerInfo.A08) || !11T.A0O(A01(), inspirationBloksStickerInfo.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A01(), C1pq.A04(this.A08, AbM.A00(C1pq.A02(C1pq.A04(this.A07, C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A03(this.A04)))))), this.A0A), this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        1Du A0b = 1BL.A0b(parcel, this.A03);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        DKH.A0z(parcel, this.A01, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A08);
        DKH.A0z(parcel, this.A02, i);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
