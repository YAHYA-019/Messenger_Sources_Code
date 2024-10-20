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

/* loaded from: InspirationReactionInfo.class */
public final class InspirationReactionInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A03;
    public static final Parcelable.Creator CREATOR = FKc.A00(39);
    public final String A00;
    public final InspirationOverlayPosition A01;
    public final Set A02;

    public InspirationReactionInfo(Parcel parcel) {
        this.A01 = DKH.A0R(parcel, C3o5.A01(parcel, this));
        this.A00 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public InspirationReactionInfo(InspirationOverlayPosition inspirationOverlayPosition, String str, Set set) {
        this.A01 = inspirationOverlayPosition;
        C1pq.A08("stickerAssetId", str);
        this.A00 = str;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (DKF.A1b(this.A02)) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = DKG.A0V();
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationReactionInfo)) {
                return false;
            }
            InspirationReactionInfo inspirationReactionInfo = (InspirationReactionInfo) obj;
            if (!11T.A0O(A00(), inspirationReactionInfo.A00()) || !11T.A0O(this.A00, inspirationReactionInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKI.A0P(parcel, this.A01, i);
        parcel.writeString(this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
