package com.facebook.payments.confirmation;

import X.0S2;
import X.11T;
import X.7zU;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: HeroImageParams.class */
public final class HeroImageParams implements Parcelable {
    public static volatile Integer A03;
    public static final Parcelable.Creator CREATOR = FKZ.A00(27);
    public final String A00;
    public final Integer A01;
    public final Set A02;

    public HeroImageParams(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) == 0 ? null : 7zU.A0e(parcel, 3);
        this.A00 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public Integer A00() {
        if (this.A02.contains("heroImageStyle")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = 0S2.A01;
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
            if (!(obj instanceof HeroImageParams)) {
                return false;
            }
            HeroImageParams heroImageParams = (HeroImageParams) obj;
            if (A00() != heroImageParams.A00() || !11T.A0O(this.A00, heroImageParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer A00 = A00();
        return C1pq.A04(this.A00, (A00 == null ? -1 : A00.intValue()) + 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(AbN.A01(parcel, this.A01));
        parcel.writeString(this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
