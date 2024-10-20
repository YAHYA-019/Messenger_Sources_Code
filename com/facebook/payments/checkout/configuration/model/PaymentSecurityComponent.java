package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PaymentSecurityComponent.class */
public final class PaymentSecurityComponent implements Parcelable {
    public static volatile String A05;
    public static volatile String A06;
    public static final Parcelable.Creator CREATOR = FKY.A00(83);
    public final boolean A00;
    public final boolean A01;
    public final String A02;
    public final String A03;
    public final Set A04;

    public PaymentSecurityComponent(Parcel parcel) {
        this.A02 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A03 = C3o5.A0O(parcel);
        int i = 0;
        this.A00 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A01 = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public PaymentSecurityComponent(String str, String str2, Set set, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = z;
        this.A01 = z2;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A04.contains("fbpayPinCreationFlowType")) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A05;
    }

    public String A01() {
        if (this.A04.contains("fbpayPinStatus")) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
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
            if (!(obj instanceof PaymentSecurityComponent)) {
                return false;
            }
            PaymentSecurityComponent paymentSecurityComponent = (PaymentSecurityComponent) obj;
            if (!11T.A0O(A00(), paymentSecurityComponent.A00()) || !11T.A0O(A01(), paymentSecurityComponent.A01()) || this.A00 != paymentSecurityComponent.A00 || this.A01 != paymentSecurityComponent.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A04(A01(), C1pq.A03(A00())), this.A00), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
