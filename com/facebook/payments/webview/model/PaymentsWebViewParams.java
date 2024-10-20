package com.facebook.payments.webview.model;

import X.11T;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.F5s;
import X.FKW;
import X.RO8;
import X.Rb2;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.logging.PaymentsFlowName;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PaymentsWebViewParams.class */
public final class PaymentsWebViewParams implements Parcelable {
    public static volatile PaymentsLoggingSessionData A08;
    public static volatile PaymentItemType A09;
    public static volatile PaymentsWebViewOnlinePaymentParams A0A;
    public static final Parcelable.Creator CREATOR = FKW.A00(8);
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final boolean A03;
    public final PaymentsLoggingSessionData A04;
    public final PaymentItemType A05;
    public final PaymentsWebViewOnlinePaymentParams A06;
    public final Set A07;

    public PaymentsWebViewParams(Rb2 rb2) {
        this.A03 = rb2.A07;
        this.A05 = rb2.A01;
        this.A04 = rb2.A00;
        this.A06 = rb2.A02;
        Boolean bool = rb2.A03;
        C1pq.A08("showTitleBar", bool);
        this.A00 = bool;
        String str = rb2.A05;
        C1pq.A08("titleBarTitle", str);
        this.A02 = str;
        Boolean bool2 = rb2.A04;
        C1pq.A08("useIndeterminateSpinner", bool2);
        this.A01 = bool2;
        this.A07 = Collections.unmodifiableSet(rb2.A06);
    }

    public PaymentsWebViewParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        PaymentsWebViewOnlinePaymentParams paymentsWebViewOnlinePaymentParams = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = DKG.A0l(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (PaymentsLoggingSessionData) parcel.readParcelable(A0e);
        }
        this.A06 = parcel.readInt() != 0 ? (PaymentsWebViewOnlinePaymentParams) parcel.readParcelable(A0e) : paymentsWebViewOnlinePaymentParams;
        this.A00 = Boolean.valueOf(1BM.A07(parcel));
        this.A02 = parcel.readString();
        this.A01 = Boolean.valueOf(AbJ.A1V(parcel));
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A07 = Collections.unmodifiableSet(A0v);
    }

    public PaymentsWebViewParams(PaymentsWebViewOnlinePaymentParams paymentsWebViewOnlinePaymentParams, Boolean bool, Boolean bool2, Set set) {
        this.A03 = false;
        this.A05 = null;
        this.A04 = null;
        this.A06 = paymentsWebViewOnlinePaymentParams;
        this.A00 = bool;
        this.A02 = "";
        this.A01 = bool2;
        this.A07 = Collections.unmodifiableSet(set);
    }

    public PaymentsLoggingSessionData A00() {
        if (this.A07.contains("paymentsLoggingSessionData")) {
            return this.A04;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = F5s.A00(PaymentsFlowName.CHECKOUT);
                }
            }
        }
        return A08;
    }

    public PaymentItemType A01() {
        if (this.A07.contains("paymentItemType")) {
            return this.A05;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = PaymentItemType.A0W;
                }
            }
        }
        return A09;
    }

    public PaymentsWebViewOnlinePaymentParams A02() {
        if (this.A07.contains("paymentsWebViewOnlinePaymentParams")) {
            return this.A06;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    RO8 ro8 = new RO8();
                    ro8.A03 = "";
                    ro8.A05 = "";
                    ro8.A01 = "";
                    ro8.A02 = "";
                    A0A = new PaymentsWebViewOnlinePaymentParams(ro8);
                }
            }
        }
        return A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsWebViewParams)) {
                return false;
            }
            PaymentsWebViewParams paymentsWebViewParams = (PaymentsWebViewParams) obj;
            if (this.A03 != paymentsWebViewParams.A03 || A01() != paymentsWebViewParams.A01() || !11T.A0O(A00(), paymentsWebViewParams.A00()) || !11T.A0O(A02(), paymentsWebViewParams.A02()) || !11T.A0O(this.A00, paymentsWebViewParams.A00) || !11T.A0O(this.A02, paymentsWebViewParams.A02) || !11T.A0O(this.A01, paymentsWebViewParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = C1pq.A05(this.A03);
        return C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(A02(), C1pq.A04(A00(), (A05 * 31) + C3o5.A03(A01()))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        C3o5.A0e(parcel, this.A05);
        C3o5.A0d(parcel, this.A04, i);
        C3o5.A0d(parcel, this.A06, i);
        DKF.A1C(parcel, this.A00);
        parcel.writeString(this.A02);
        DKF.A1C(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
