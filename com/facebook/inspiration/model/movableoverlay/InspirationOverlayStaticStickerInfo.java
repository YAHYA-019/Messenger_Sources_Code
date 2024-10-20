package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
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

/* loaded from: InspirationOverlayStaticStickerInfo.class */
public final class InspirationOverlayStaticStickerInfo implements Parcelable {
    public static volatile EPI A05;
    public static volatile InspirationOverlayPosition A06;
    public static final Parcelable.Creator CREATOR = new FKc(34);
    public final String A00;
    public final String A01;
    public final EPI A02;
    public final InspirationOverlayPosition A03;
    public final Set A04;

    public InspirationOverlayStaticStickerInfo(EPI epi, InspirationOverlayPosition inspirationOverlayPosition, String str, String str2, Set set) {
        this.A03 = inspirationOverlayPosition;
        C1pq.A08("stickerAssetImageId", str);
        this.A00 = str;
        C1pq.A08("stickerName", str2);
        this.A01 = str2;
        this.A02 = epi;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayStaticStickerInfo(Parcel parcel) {
        this.A03 = C3o5.A01(parcel, this) != 0 ? (InspirationOverlayPosition) InspirationOverlayPosition.CREATOR.createFromParcel(parcel) : null;
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = DKH.A0Q(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public EPI A00() {
        if (this.A04.contains("stickerType")) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = EPI.A13;
                }
            }
        }
        return A05;
    }

    public InspirationOverlayPosition A01() {
        if (this.A04.contains("overlayPosition")) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = new InspirationOverlayPosition(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayStaticStickerInfo)) {
                return false;
            }
            InspirationOverlayStaticStickerInfo inspirationOverlayStaticStickerInfo = (InspirationOverlayStaticStickerInfo) obj;
            if (!11T.A0O(A01(), inspirationOverlayStaticStickerInfo.A01()) || !11T.A0O(this.A00, inspirationOverlayStaticStickerInfo.A00) || !11T.A0O(this.A01, inspirationOverlayStaticStickerInfo.A01) || A00() != inspirationOverlayStaticStickerInfo.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(A01())));
        return (A04 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A0z(parcel, this.A03, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        C3o5.A0e(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
