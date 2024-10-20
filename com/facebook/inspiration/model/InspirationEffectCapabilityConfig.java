package com.facebook.inspiration.model;

import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.EQN;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationEffectCapabilityConfig.class */
public final class InspirationEffectCapabilityConfig implements Parcelable {
    public static volatile EQN A03;
    public static final Parcelable.Creator CREATOR = FKf.A01(48);
    public final boolean A00;
    public final EQN A01;
    public final Set A02;

    public InspirationEffectCapabilityConfig(EQN eqn, Set set, boolean z) {
        this.A01 = eqn;
        this.A00 = z;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public InspirationEffectCapabilityConfig(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) == 0 ? null : EQN.values()[parcel.readInt()];
        int i = 0;
        this.A00 = 4YV.A1U(parcel.readInt());
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public EQN A00() {
        if (this.A02.contains("capabilityControlState")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = EQN.A03;
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
            if (!(obj instanceof InspirationEffectCapabilityConfig)) {
                return false;
            }
            InspirationEffectCapabilityConfig inspirationEffectCapabilityConfig = (InspirationEffectCapabilityConfig) obj;
            if (A00() != inspirationEffectCapabilityConfig.A00() || this.A00 != inspirationEffectCapabilityConfig.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C3o5.A03(A00()) + 31, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(DKH.A05(parcel, this.A01));
        parcel.writeInt(this.A00 ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
