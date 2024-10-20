package com.facebook.inspiration.contextualmetadata.model;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.ELt;
import X.ENI;
import X.FKf;
import X.Raz;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationContextualFeatureInfo.class */
public final class InspirationContextualFeatureInfo implements Parcelable {
    public static volatile ENI A04;
    public static volatile ELt A05;
    public static volatile InspirationContextualFeatureData A06;
    public static final Parcelable.Creator CREATOR = FKf.A01(27);
    public final ENI A00;
    public final ELt A01;
    public final InspirationContextualFeatureData A02;
    public final Set A03;

    public InspirationContextualFeatureInfo(Raz raz) {
        this.A02 = raz.A02;
        this.A00 = raz.A00;
        this.A01 = raz.A01;
        this.A03 = Collections.unmodifiableSet(raz.A03);
    }

    public InspirationContextualFeatureInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ELt eLt = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (InspirationContextualFeatureData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = ENI.values()[parcel.readInt()];
        }
        this.A01 = parcel.readInt() != 0 ? ELt.values()[parcel.readInt()] : eLt;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public ENI A00() {
        if (this.A03.contains("featureName")) {
            return this.A00;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = ENI.A03;
                }
            }
        }
        return A04;
    }

    public ELt A01() {
        if (this.A03.contains("featureType")) {
            return this.A01;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = ELt.A03;
                }
            }
        }
        return A05;
    }

    public InspirationContextualFeatureData A02() {
        if (this.A03.contains("featureData")) {
            return this.A02;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = new InspirationContextualFeatureData();
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
            if (!(obj instanceof InspirationContextualFeatureInfo)) {
                return false;
            }
            InspirationContextualFeatureInfo inspirationContextualFeatureInfo = (InspirationContextualFeatureInfo) obj;
            if (!11T.A0O(A02(), inspirationContextualFeatureInfo.A02()) || A00() != inspirationContextualFeatureInfo.A00() || A01() != inspirationContextualFeatureInfo.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(A02());
        int A032 = (A03 * 31) + C3o5.A03(A00());
        return (A032 * 31) + DKF.A04(A01());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0e(parcel, this.A00);
        C3o5.A0e(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
