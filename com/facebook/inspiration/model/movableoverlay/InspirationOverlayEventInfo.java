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
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationOverlayEventInfo.class */
public final class InspirationOverlayEventInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A04;
    public static final Parcelable.Creator CREATOR = FKc.A00(24);
    public final String A00;
    public final String A01;
    public final InspirationOverlayPosition A02;
    public final Set A03;

    public InspirationOverlayEventInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? DKG.A0W(parcel) : inspirationOverlayPosition;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlayEventInfo(InspirationOverlayPosition inspirationOverlayPosition, String str, String str2, Set set) {
        C1pq.A08("eventId", str);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = inspirationOverlayPosition;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayPosition A00() {
        if (DKF.A1b(this.A03)) {
            return this.A02;
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
            if (!(obj instanceof InspirationOverlayEventInfo)) {
                return false;
            }
            InspirationOverlayEventInfo inspirationOverlayEventInfo = (InspirationOverlayEventInfo) obj;
            if (!11T.A0O(this.A00, inspirationOverlayEventInfo.A00) || !11T.A0O(this.A01, inspirationOverlayEventInfo.A01) || !11T.A0O(A00(), inspirationOverlayEventInfo.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        1BL.A13(parcel, this.A01);
        DKH.A0z(parcel, this.A02, i);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
