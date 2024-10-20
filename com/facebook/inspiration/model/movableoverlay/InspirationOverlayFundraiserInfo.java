package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EPI;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationOverlayFundraiserInfo.class */
public final class InspirationOverlayFundraiserInfo implements Parcelable {
    public static volatile EPI A07;
    public static volatile InspirationOverlayPosition A08;
    public static final Parcelable.Creator CREATOR = FKc.A00(27);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final EPI A04;
    public final InspirationOverlayPosition A05;
    public final Set A06;

    public InspirationOverlayFundraiserInfo(EPI epi, InspirationOverlayPosition inspirationOverlayPosition, String str, String str2, String str3, Set set, int i) {
        C1pq.A08("creationSource", str);
        this.A01 = str;
        C1pq.A08("fundraiserId", str2);
        this.A02 = str2;
        C1pq.A08("fundraiserStickerStyle", str3);
        this.A03 = str3;
        this.A00 = i;
        this.A05 = inspirationOverlayPosition;
        this.A04 = epi;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayFundraiserInfo(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = parcel.readInt() != 0 ? DKG.A0W(parcel) : null;
        this.A04 = DKH.A0Q(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public EPI A00() {
        if (this.A06.contains("stickerType")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = EPI.A13;
                }
            }
        }
        return A07;
    }

    public InspirationOverlayPosition A01() {
        if (DKF.A1b(this.A06)) {
            return this.A05;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = DKG.A0V();
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayFundraiserInfo)) {
                return false;
            }
            InspirationOverlayFundraiserInfo inspirationOverlayFundraiserInfo = (InspirationOverlayFundraiserInfo) obj;
            if (!11T.A0O(this.A01, inspirationOverlayFundraiserInfo.A01) || !11T.A0O(this.A02, inspirationOverlayFundraiserInfo.A02) || !11T.A0O(this.A03, inspirationOverlayFundraiserInfo.A03) || this.A00 != inspirationOverlayFundraiserInfo.A00 || !11T.A0O(A01(), inspirationOverlayFundraiserInfo.A01()) || A00() != inspirationOverlayFundraiserInfo.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(A01(), (C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))) * 31) + this.A00);
        return (A04 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        DKH.A0z(parcel, this.A05, i);
        C3o5.A0e(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
