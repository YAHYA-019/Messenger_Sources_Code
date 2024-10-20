package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.FKc;
import X.RR5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationOverlayFeedRemixStickerInfo.class */
public final class InspirationOverlayFeedRemixStickerInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A04;
    public static final Parcelable.Creator CREATOR = FKc.A00(25);
    public final InspirationOverlayPosition A00;
    public final Double A01;
    public final String A02;
    public final Set A03;

    public InspirationOverlayFeedRemixStickerInfo(RR5 rr5) {
        this.A01 = rr5.A01;
        this.A00 = rr5.A00;
        this.A02 = rr5.A02;
        this.A03 = Collections.unmodifiableSet(rr5.A03);
    }

    public InspirationOverlayFeedRemixStickerInfo(Parcel parcel) {
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = DKG.A0x(parcel);
        }
        this.A00 = parcel.readInt() != 0 ? DKG.A0W(parcel) : inspirationOverlayPosition;
        this.A02 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlayPosition A00() {
        if (DKF.A1b(this.A03)) {
            return this.A00;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = DKG.A0V();
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayFeedRemixStickerInfo)) {
                return false;
            }
            InspirationOverlayFeedRemixStickerInfo inspirationOverlayFeedRemixStickerInfo = (InspirationOverlayFeedRemixStickerInfo) obj;
            if (!11T.A0O(this.A01, inspirationOverlayFeedRemixStickerInfo.A01) || !11T.A0O(A00(), inspirationOverlayFeedRemixStickerInfo.A00()) || !11T.A0O(this.A02, inspirationOverlayFeedRemixStickerInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(A00(), C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A13(parcel, this.A01);
        DKH.A0z(parcel, this.A00, i);
        1BL.A13(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
