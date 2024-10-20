package com.facebook.inspiration.model;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.EQh;
import X.FKf;
import X.Rb1;
import X.RbK;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationEffectWithSource.class */
public final class InspirationEffectWithSource implements Parcelable {
    public static volatile EQh A05;
    public static volatile InspirationEffect A06;
    public static final Parcelable.Creator CREATOR = FKf.A01(50);
    public final EQh A00;
    public final InspirationEffect A01;
    public final String A02;
    public final Set A03;
    public final boolean A04;

    public InspirationEffectWithSource(Rb1 rb1) {
        String str = rb1.A02;
        C1pq.A08("category", str);
        this.A02 = str;
        this.A00 = rb1.A00;
        this.A01 = rb1.A01;
        this.A04 = rb1.A04;
        this.A03 = Collections.unmodifiableSet(rb1.A03);
    }

    public InspirationEffectWithSource(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = parcel.readString();
        InspirationEffect inspirationEffect = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = EQh.values()[parcel.readInt()];
        }
        this.A01 = parcel.readInt() != 0 ? (InspirationEffect) parcel.readParcelable(A0e) : inspirationEffect;
        int i = 0;
        this.A04 = 4YV.A1U(parcel.readInt());
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public EQh A00() {
        if (this.A03.contains("effectSurface")) {
            return this.A00;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = EQh.A0A;
                }
            }
        }
        return A05;
    }

    public InspirationEffect A01() {
        if (this.A03.contains("inspirationEffect")) {
            return this.A01;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = new InspirationEffect(RbK.A00("1752514608329267"));
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
            if (!(obj instanceof InspirationEffectWithSource)) {
                return false;
            }
            InspirationEffectWithSource inspirationEffectWithSource = (InspirationEffectWithSource) obj;
            if (!11T.A0O(this.A02, inspirationEffectWithSource.A02) || A00() != inspirationEffectWithSource.A00() || !11T.A0O(A01(), inspirationEffectWithSource.A01()) || this.A04 != inspirationEffectWithSource.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A02);
        return C1pq.A02(C1pq.A04(A01(), (A03 * 31) + C3o5.A03(A00())), this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        C3o5.A0e(parcel, this.A00);
        C3o5.A0d(parcel, this.A01, i);
        parcel.writeInt(this.A04 ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
