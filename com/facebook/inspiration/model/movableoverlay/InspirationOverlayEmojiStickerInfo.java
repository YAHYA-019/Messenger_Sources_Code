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

/* loaded from: InspirationOverlayEmojiStickerInfo.class */
public final class InspirationOverlayEmojiStickerInfo implements Parcelable {
    public static volatile EPI A04;
    public static volatile InspirationOverlayPosition A05;
    public static final Parcelable.Creator CREATOR = FKc.A00(23);
    public final String A00;
    public final EPI A01;
    public final InspirationOverlayPosition A02;
    public final Set A03;

    public InspirationOverlayEmojiStickerInfo(EPI epi, InspirationOverlayPosition inspirationOverlayPosition, String str, Set set) {
        C1pq.A08("emoji", str);
        this.A00 = str;
        this.A02 = inspirationOverlayPosition;
        this.A01 = epi;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayEmojiStickerInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readInt() != 0 ? DKG.A0W(parcel) : null;
        this.A01 = DKH.A0Q(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public EPI A00() {
        if (this.A03.contains("stickerType")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = EPI.A13;
                }
            }
        }
        return A04;
    }

    public InspirationOverlayPosition A01() {
        if (DKF.A1b(this.A03)) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = DKG.A0V();
                }
            }
        }
        return A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayEmojiStickerInfo)) {
                return false;
            }
            InspirationOverlayEmojiStickerInfo inspirationOverlayEmojiStickerInfo = (InspirationOverlayEmojiStickerInfo) obj;
            if (!11T.A0O(this.A00, inspirationOverlayEmojiStickerInfo.A00) || !11T.A0O(A01(), inspirationOverlayEmojiStickerInfo.A01()) || A00() != inspirationOverlayEmojiStickerInfo.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A042 = C1pq.A04(A01(), C1pq.A03(this.A00));
        return (A042 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        DKH.A0z(parcel, this.A02, i);
        C3o5.A0e(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
