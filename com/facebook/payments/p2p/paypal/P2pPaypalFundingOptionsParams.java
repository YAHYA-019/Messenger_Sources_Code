package com.facebook.payments.p2p.paypal;

import X.11T;
import X.4YV;
import X.4YW;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: P2pPaypalFundingOptionsParams.class */
public final class P2pPaypalFundingOptionsParams implements Parcelable {
    public static volatile PaymentsDecoratorParams A04;
    public static final Parcelable.Creator CREATOR = FKd.A00(0);
    public final CurrencyAmount A00;
    public final String A01;
    public final PaymentsDecoratorParams A02;
    public final Set A03;

    public P2pPaypalFundingOptionsParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = (CurrencyAmount) parcel.readParcelable(A0e);
        this.A02 = parcel.readInt() == 0 ? null : (PaymentsDecoratorParams) parcel.readParcelable(A0e);
        this.A01 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public P2pPaypalFundingOptionsParams(CurrencyAmount currencyAmount, PaymentsDecoratorParams paymentsDecoratorParams, String str, Set set) {
        C1pq.A08("currencyAmount", currencyAmount);
        this.A00 = currencyAmount;
        this.A02 = paymentsDecoratorParams;
        C1pq.A08("paypalBaId", str);
        this.A01 = str;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public PaymentsDecoratorParams A00() {
        if (this.A03.contains("paymentsDecoratorParams")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = PaymentsDecoratorParams.A00();
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof P2pPaypalFundingOptionsParams)) {
                return false;
            }
            P2pPaypalFundingOptionsParams p2pPaypalFundingOptionsParams = (P2pPaypalFundingOptionsParams) obj;
            if (!11T.A0O(this.A00, p2pPaypalFundingOptionsParams.A00) || !11T.A0O(A00(), p2pPaypalFundingOptionsParams.A00()) || !11T.A0O(this.A01, p2pPaypalFundingOptionsParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(A00(), C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        4YW.A0D(parcel, this.A02, i);
        parcel.writeString(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
