package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1Du;
import X.7zU;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: PayButtonScreenComponent.class */
public final class PayButtonScreenComponent implements Parcelable {
    public static volatile ImmutableMap A05;
    public static final Parcelable.Creator CREATOR = FKY.A00(79);
    public final String A00;
    public final ImmutableMap A01;
    public final String A02;
    public final Set A03;
    public final boolean A04;

    public PayButtonScreenComponent(Parcel parcel) {
        ImmutableMap copyOf;
        this.A00 = 7zU.A0l(parcel, this);
        int i = 0;
        if (parcel.readInt() == 0) {
            copyOf = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbL.A01(parcel, A0u, i2);
            }
            copyOf = ImmutableMap.copyOf((Map) A0u);
        }
        this.A01 = copyOf;
        this.A04 = AbN.A1U(parcel);
        this.A02 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public PayButtonScreenComponent(ImmutableMap immutableMap, String str, String str2, Set set, boolean z) {
        this.A00 = str;
        this.A01 = immutableMap;
        this.A04 = z;
        this.A02 = str2;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public ImmutableMap A00() {
        if (this.A03.contains("paymentOptionTypeToPayButtonLabelMap")) {
            return this.A01;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = RegularImmutableMap.A03;
                }
            }
        }
        return A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PayButtonScreenComponent)) {
                return false;
            }
            PayButtonScreenComponent payButtonScreenComponent = (PayButtonScreenComponent) obj;
            if (!11T.A0O(this.A00, payButtonScreenComponent.A00) || !11T.A0O(A00(), payButtonScreenComponent.A00()) || this.A04 != payButtonScreenComponent.A04 || !11T.A0O(this.A02, payButtonScreenComponent.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A04(A00(), C1pq.A03(this.A00)), this.A04));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        ImmutableMap immutableMap = this.A01;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                AbL.A0n(parcel, A0g);
            }
        }
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
