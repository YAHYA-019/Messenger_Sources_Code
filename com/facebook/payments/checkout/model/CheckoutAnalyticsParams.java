package com.facebook.payments.checkout.model;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CheckoutAnalyticsParams.class */
public final class CheckoutAnalyticsParams implements Parcelable {
    public static volatile PaymentsFlowStep A04;
    public static volatile PaymentsFlowStep A05;
    public static final Parcelable.Creator CREATOR = FKZ.A00(2);
    public final PaymentsLoggingSessionData A00;
    public final PaymentsFlowStep A01;
    public final PaymentsFlowStep A02;
    public final Set A03;

    public CheckoutAnalyticsParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        PaymentsFlowStep paymentsFlowStep = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = PaymentsFlowStep.values()[parcel.readInt()];
        }
        this.A02 = parcel.readInt() != 0 ? PaymentsFlowStep.values()[parcel.readInt()] : paymentsFlowStep;
        this.A00 = (PaymentsLoggingSessionData) parcel.readParcelable(A0e);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public CheckoutAnalyticsParams(PaymentsLoggingSessionData paymentsLoggingSessionData, Set set) {
        this.A01 = null;
        this.A02 = null;
        this.A00 = paymentsLoggingSessionData;
        this.A03 = Collections.unmodifiableSet(set);
    }

    private PaymentsFlowStep A00() {
        if (this.A03.contains("checkoutScreenFlowStep")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = PaymentsFlowStep.A0I;
                }
            }
        }
        return A04;
    }

    public PaymentsFlowStep A01() {
        if (this.A03.contains("ctaButtonPaymentsFlowStep")) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = PaymentsFlowStep.A1W;
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
            if (!(obj instanceof CheckoutAnalyticsParams)) {
                return false;
            }
            CheckoutAnalyticsParams checkoutAnalyticsParams = (CheckoutAnalyticsParams) obj;
            if (A00() != checkoutAnalyticsParams.A00() || A01() != checkoutAnalyticsParams.A01() || !11T.A0O(this.A00, checkoutAnalyticsParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C3o5.A03(A00()) + 31;
        return C1pq.A04(this.A00, (A03 * 31) + DKF.A04(A01()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A01);
        C3o5.A0e(parcel, this.A02);
        parcel.writeParcelable(this.A00, i);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
