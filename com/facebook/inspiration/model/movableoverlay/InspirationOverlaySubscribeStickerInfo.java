package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DKI;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationOverlaySubscribeStickerInfo.class */
public final class InspirationOverlaySubscribeStickerInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A02;
    public static final Parcelable.Creator CREATOR = FKc.A00(35);
    public final InspirationOverlayPosition A00;
    public final Set A01;

    public InspirationOverlaySubscribeStickerInfo(Parcel parcel) {
        this.A00 = DKH.A0R(parcel, C3o5.A01(parcel, this));
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A01 = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlaySubscribeStickerInfo(InspirationOverlayPosition inspirationOverlayPosition, Set set) {
        this.A00 = inspirationOverlayPosition;
        this.A01 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (DKF.A1b(this.A01)) {
            return this.A00;
        }
        if (A02 == null) {
            synchronized (this) {
                if (A02 == null) {
                    A02 = DKG.A0V();
                }
            }
        }
        return A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InspirationOverlaySubscribeStickerInfo) && 11T.A0O(A00(), ((InspirationOverlaySubscribeStickerInfo) obj).A00()));
    }

    public int hashCode() {
        return C1pq.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKI.A0P(parcel, this.A00, i);
        Iterator A0S = C3o5.A0S(parcel, this.A01);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
