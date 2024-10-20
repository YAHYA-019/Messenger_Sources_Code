package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.FKc;
import X.Qoa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: SnapbackStrategy.class */
public final class SnapbackStrategy implements Parcelable {
    public static volatile Qoa A06;
    public static volatile Qoa A07;
    public static volatile Qoa A08;
    public static volatile PersistableRect A09;
    public static volatile PersistableRect A0A;
    public static final Parcelable.Creator CREATOR = new FKc(58);
    public final Qoa A00;
    public final Qoa A01;
    public final Qoa A02;
    public final PersistableRect A03;
    public final PersistableRect A04;
    public final Set A05;

    public SnapbackStrategy(Qoa qoa, Qoa qoa2, Qoa qoa3, PersistableRect persistableRect, PersistableRect persistableRect2, Set set) {
        this.A03 = persistableRect;
        this.A04 = persistableRect2;
        this.A00 = qoa;
        this.A01 = qoa2;
        this.A02 = qoa3;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public SnapbackStrategy(Parcel parcel) {
        Qoa qoa = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A03 = null;
        } else {
            this.A03 = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0o(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Qoa.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Qoa.values()[parcel.readInt()];
        }
        this.A02 = parcel.readInt() != 0 ? Qoa.values()[parcel.readInt()] : qoa;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public Qoa A00() {
        if (this.A05.contains("moveStrategy")) {
            return this.A00;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = Qoa.A04;
                }
            }
        }
        return A06;
    }

    public Qoa A01() {
        if (this.A05.contains("rotationStrategy")) {
            return this.A01;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = Qoa.A04;
                }
            }
        }
        return A07;
    }

    public Qoa A02() {
        if (this.A05.contains("scaleStrategy")) {
            return this.A02;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = Qoa.A04;
                }
            }
        }
        return A08;
    }

    public PersistableRect A03() {
        if (this.A05.contains("customMovingBound")) {
            return this.A03;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = new PersistableRect(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A09;
    }

    public PersistableRect A04() {
        if (this.A05.contains("guidelineSideOffset")) {
            return this.A04;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = new PersistableRect(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SnapbackStrategy)) {
                return false;
            }
            SnapbackStrategy snapbackStrategy = (SnapbackStrategy) obj;
            if (!11T.A0O(A03(), snapbackStrategy.A03()) || !11T.A0O(A04(), snapbackStrategy.A04()) || A00() != snapbackStrategy.A00() || A01() != snapbackStrategy.A01() || A02() != snapbackStrategy.A02()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(A04(), C1pq.A03(A03()));
        int A03 = (A04 * 31) + C3o5.A03(A00());
        int A032 = (A03 * 31) + C3o5.A03(A01());
        return (A032 * 31) + DKF.A04(A02());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A11(parcel, this.A03, i);
        DKH.A11(parcel, this.A04, i);
        C3o5.A0e(parcel, this.A00);
        C3o5.A0e(parcel, this.A01);
        C3o5.A0e(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
