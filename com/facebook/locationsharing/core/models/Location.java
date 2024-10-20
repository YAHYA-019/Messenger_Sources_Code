package com.facebook.locationsharing.core.models;

import X.0S2;
import X.7zU;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Location.class */
public final class Location implements Parcelable {
    public static volatile Integer A07;
    public static final Parcelable.Creator CREATOR = CSR.A00(68);
    public final double A00;
    public final double A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Integer A05;
    public final Set A06;

    public Location(Parcel parcel) {
        this.A02 = C3o5.A01(parcel, this);
        this.A03 = parcel.readInt();
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A05 = parcel.readInt() == 0 ? null : 7zU.A0e(parcel, 4);
        this.A04 = parcel.readLong();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public Location(Set set, double d, double d2, int i, long j) {
        this.A02 = i;
        this.A03 = (-1) << (-1);
        this.A00 = d;
        this.A01 = d2;
        this.A05 = null;
        this.A04 = j;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public Integer A00() {
        if (this.A06.contains("status")) {
            return this.A05;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = 0S2.A00;
                }
            }
        }
        return A07;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            if (this.A02 != location.A02 || this.A03 != location.A03 || this.A00 != location.A00 || this.A01 != location.A01 || A00() != location.A00() || this.A04 != location.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A00 = C1pq.A00(this.A01, C1pq.A00(this.A00, ((this.A02 + 31) * 31) + this.A03));
        return C1pq.A01((A00 * 31) + C3o5.A04(A00()), this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(AbN.A01(parcel, this.A05));
        parcel.writeLong(this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
