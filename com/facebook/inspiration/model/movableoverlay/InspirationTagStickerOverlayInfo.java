package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
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
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationTagStickerOverlayInfo.class */
public final class InspirationTagStickerOverlayInfo implements Parcelable {
    public static volatile EPI A07;
    public static volatile InspirationOverlayPosition A08;
    public static volatile String A09;
    public static final Parcelable.Creator CREATOR = FKc.A00(51);
    public final InspirationTimedElementParams A00;
    public final String A01;
    public final String A02;
    public final EPI A03;
    public final InspirationOverlayPosition A04;
    public final String A05;
    public final Set A06;

    public InspirationTagStickerOverlayInfo(EPI epi, InspirationOverlayPosition inspirationOverlayPosition, InspirationTimedElementParams inspirationTimedElementParams, String str, String str2, String str3, Set set) {
        this.A00 = inspirationTimedElementParams;
        this.A04 = inspirationOverlayPosition;
        this.A03 = epi;
        this.A05 = str;
        C1pq.A08("tagFBID", str2);
        this.A01 = str2;
        C1pq.A08("tagType", str3);
        this.A02 = str3;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public InspirationTagStickerOverlayInfo(Parcel parcel) {
        EPI epi = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationTimedElementParams) InspirationTimedElementParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0W(parcel);
        }
        this.A03 = parcel.readInt() != 0 ? EPI.values()[parcel.readInt()] : epi;
        this.A05 = C3o5.A0O(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
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
            return this.A03;
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
            return this.A04;
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

    public String A02() {
        if (this.A06.contains("tagCreationSource")) {
            return this.A05;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = "STICKER_TAG";
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationTagStickerOverlayInfo)) {
                return false;
            }
            InspirationTagStickerOverlayInfo inspirationTagStickerOverlayInfo = (InspirationTagStickerOverlayInfo) obj;
            if (!11T.A0O(this.A00, inspirationTagStickerOverlayInfo.A00) || !11T.A0O(A01(), inspirationTagStickerOverlayInfo.A01()) || A00() != inspirationTagStickerOverlayInfo.A00() || !11T.A0O(A02(), inspirationTagStickerOverlayInfo.A02()) || !11T.A0O(this.A01, inspirationTagStickerOverlayInfo.A01) || !11T.A0O(this.A02, inspirationTagStickerOverlayInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(A01(), C1pq.A03(this.A00));
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(A02(), (A04 * 31) + C3o5.A03(A00()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        InspirationTimedElementParams inspirationTimedElementParams = this.A00;
        if (inspirationTimedElementParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationTimedElementParams.writeToParcel(parcel, i);
        }
        DKH.A0z(parcel, this.A04, i);
        C3o5.A0e(parcel, this.A03);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
