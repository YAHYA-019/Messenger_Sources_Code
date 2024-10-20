package com.facebook.payments.checkout.errors.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.FKY;
import X.Qug;
import X.RRA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.model.PaymentItemType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PaymentsError.class */
public final class PaymentsError implements Parcelable {
    public static volatile CallToAction A0A;
    public static volatile PaymentItemType A0B;
    public static final Parcelable.Creator CREATOR = FKY.A00(98);
    public final int A00;
    public final CallToAction A01;
    public final CallToAction A02;
    public final Qug A03;
    public final PaymentItemType A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;

    public PaymentsError(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        CallToAction callToAction = null;
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A08 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Qug.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0l(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (CallToAction) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readInt() != 0 ? (CallToAction) parcel.readParcelable(A0e) : callToAction;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public PaymentsError(CallToAction callToAction, CallToAction callToAction2, Qug qug, PaymentItemType paymentItemType, String str, String str2, String str3, String str4, Set set, int i) {
        this.A00 = i;
        C1pq.A08("errorDescription", str);
        this.A05 = str;
        C1pq.A08("errorTitle", str2);
        this.A06 = str2;
        this.A07 = str3;
        C1pq.A08("flowStep", str4);
        this.A08 = str4;
        this.A03 = qug;
        this.A04 = paymentItemType;
        this.A01 = callToAction;
        this.A02 = callToAction2;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public CallToAction A00() {
        if (this.A09.contains("primaryCta")) {
            return this.A01;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = new CallToAction(new RRA());
                }
            }
        }
        return A0A;
    }

    public PaymentItemType A01() {
        if (this.A09.contains("paymentItemType")) {
            return this.A04;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = PaymentItemType.A0H;
                }
            }
        }
        return A0B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsError)) {
                return false;
            }
            PaymentsError paymentsError = (PaymentsError) obj;
            if (this.A00 != paymentsError.A00 || !11T.A0O(this.A05, paymentsError.A05) || !11T.A0O(this.A06, paymentsError.A06) || !11T.A0O(this.A07, paymentsError.A07) || !11T.A0O(this.A08, paymentsError.A08) || this.A03 != paymentsError.A03 || A01() != paymentsError.A01() || !11T.A0O(A00(), paymentsError.A00()) || !11T.A0O(this.A02, paymentsError.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, this.A00 + 31))));
        int A03 = (A04 * 31) + C3o5.A03(this.A03);
        return C1pq.A04(this.A02, C1pq.A04(A00(), (A03 * 31) + DKF.A04(A01())));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeString(this.A08);
        C3o5.A0e(parcel, this.A03);
        C3o5.A0e(parcel, this.A04);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A02, i);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
