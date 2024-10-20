package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
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

/* loaded from: InspirationOverlayAvatarStickerInfo.class */
public final class InspirationOverlayAvatarStickerInfo implements Parcelable {
    public static volatile EPI A05;
    public static volatile InspirationOverlayPosition A06;
    public static final Parcelable.Creator CREATOR = FKc.A00(20);
    public final String A00;
    public final String A01;
    public final EPI A02;
    public final InspirationOverlayPosition A03;
    public final Set A04;

    public InspirationOverlayAvatarStickerInfo(EPI epi, InspirationOverlayPosition inspirationOverlayPosition, String str, String str2, Set set) {
        C1pq.A08("avatarStickerTemplateId", str);
        this.A00 = str;
        this.A03 = inspirationOverlayPosition;
        this.A02 = epi;
        this.A01 = str2;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayAvatarStickerInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        EPI epi = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0W(parcel);
        }
        this.A02 = parcel.readInt() != 0 ? EPI.values()[parcel.readInt()] : epi;
        this.A01 = C3o5.A0O(parcel);
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
        if (DKF.A1b(this.A04)) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = DKG.A0V();
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
            if (!(obj instanceof InspirationOverlayAvatarStickerInfo)) {
                return false;
            }
            InspirationOverlayAvatarStickerInfo inspirationOverlayAvatarStickerInfo = (InspirationOverlayAvatarStickerInfo) obj;
            if (!11T.A0O(this.A00, inspirationOverlayAvatarStickerInfo.A00) || !11T.A0O(A01(), inspirationOverlayAvatarStickerInfo.A01()) || A00() != inspirationOverlayAvatarStickerInfo.A00() || !11T.A0O(this.A01, inspirationOverlayAvatarStickerInfo.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(A01(), C1pq.A03(this.A00));
        return C1pq.A04(this.A01, (A04 * 31) + C3o5.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        DKH.A0z(parcel, this.A03, i);
        C3o5.A0e(parcel, this.A02);
        1BL.A13(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
