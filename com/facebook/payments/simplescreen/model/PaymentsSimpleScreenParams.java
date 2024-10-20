package com.facebook.payments.simplescreen.model;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PaymentsSimpleScreenParams.class */
public final class PaymentsSimpleScreenParams implements Parcelable {
    public static volatile PaymentsDecoratorParams A08;
    public static final Parcelable.Creator CREATOR = FKW.A00(4);
    public final PayPalBillingAgreement A00;
    public final boolean A01;
    public final PaymentsDecoratorParams A02;
    public final PaymentsFlowStep A03;
    public final PaymentsLoggingSessionData A04;
    public final PaymentItemType A05;
    public final SimpleScreenExtraData A06;
    public final Set A07;

    public PaymentsSimpleScreenParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A01 = 4YV.A1U(parcel.readInt());
        SimpleScreenExtraData simpleScreenExtraData = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = DKG.A0l(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (PaymentsDecoratorParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = PaymentsFlowStep.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (PaymentsLoggingSessionData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (PayPalBillingAgreement) PayPalBillingAgreement.CREATOR.createFromParcel(parcel);
        }
        this.A06 = parcel.readInt() != 0 ? (SimpleScreenExtraData) parcel.readParcelable(A0e) : simpleScreenExtraData;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A07 = Collections.unmodifiableSet(A0v);
    }

    public PaymentsSimpleScreenParams(PaymentsDecoratorParams paymentsDecoratorParams, PaymentsFlowStep paymentsFlowStep, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, PayPalBillingAgreement payPalBillingAgreement, SimpleScreenExtraData simpleScreenExtraData, Set set, boolean z) {
        this.A01 = z;
        this.A05 = paymentItemType;
        this.A02 = paymentsDecoratorParams;
        this.A03 = paymentsFlowStep;
        this.A04 = paymentsLoggingSessionData;
        this.A00 = payPalBillingAgreement;
        this.A06 = simpleScreenExtraData;
        this.A07 = Collections.unmodifiableSet(set);
    }

    public PaymentsDecoratorParams A00() {
        if (this.A07.contains("paymentsDecoratorParams")) {
            return this.A02;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A01, PaymentsTitleBarStyle.A05, null, null, null, null, true);
                }
            }
        }
        return A08;
    }

    public PaymentsFlowStep A01() {
        if (this.A07.contains("paymentsFlowStep")) {
            return this.A03;
        }
        synchronized (this) {
        }
        return null;
    }

    public PaymentsLoggingSessionData A02() {
        if (this.A07.contains("paymentsLoggingSessionData")) {
            return this.A04;
        }
        synchronized (this) {
        }
        return null;
    }

    public PaymentItemType A03() {
        if (this.A07.contains("paymentItemType")) {
            return this.A05;
        }
        synchronized (this) {
        }
        return null;
    }

    public SimpleScreenExtraData A04() {
        if (this.A07.contains("simpleScreenExtraData")) {
            return this.A06;
        }
        synchronized (this) {
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsSimpleScreenParams)) {
                return false;
            }
            PaymentsSimpleScreenParams paymentsSimpleScreenParams = (PaymentsSimpleScreenParams) obj;
            if (this.A01 != paymentsSimpleScreenParams.A01 || A03() != paymentsSimpleScreenParams.A03() || !11T.A0O(A00(), paymentsSimpleScreenParams.A00()) || A01() != paymentsSimpleScreenParams.A01() || !11T.A0O(A02(), paymentsSimpleScreenParams.A02()) || !11T.A0O(this.A00, paymentsSimpleScreenParams.A00) || !11T.A0O(A04(), paymentsSimpleScreenParams.A04())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = C1pq.A05(this.A01);
        int A04 = C1pq.A04(A00(), (A05 * 31) + C3o5.A03(A03()));
        return C1pq.A04(A04(), C1pq.A04(this.A00, C1pq.A04(A02(), (A04 * 31) + DKF.A04(A01()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        C3o5.A0e(parcel, this.A05);
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0e(parcel, this.A03);
        C3o5.A0d(parcel, this.A04, i);
        PayPalBillingAgreement payPalBillingAgreement = this.A00;
        if (payPalBillingAgreement == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payPalBillingAgreement.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A06, i);
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
