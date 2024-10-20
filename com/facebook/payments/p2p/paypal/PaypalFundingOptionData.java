package com.facebook.payments.p2p.paypal;

import X.11T;
import X.4YV;
import X.AbF;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PaypalFundingOptionData.class */
public final class PaypalFundingOptionData implements Parcelable {
    public static volatile CurrencyAmount A05;
    public static volatile CurrencyAmount A06;
    public static final Parcelable.Creator CREATOR = FKd.A00(1);
    public final String A00;
    public final String A01;
    public final CurrencyAmount A02;
    public final CurrencyAmount A03;
    public final Set A04;

    public PaypalFundingOptionData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        CurrencyAmount currencyAmount = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readInt() != 0 ? (CurrencyAmount) parcel.readParcelable(A0e) : currencyAmount;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public PaypalFundingOptionData(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, String str, String str2, Set set) {
        this.A02 = currencyAmount;
        AbF.A1T(str);
        this.A00 = str;
        AbF.A1U(str2);
        this.A01 = str2;
        this.A03 = currencyAmount2;
        this.A04 = Collections.unmodifiableSet(set);
    }

    private CurrencyAmount A00() {
        if (this.A04.contains("totalAmount")) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = new CurrencyAmount("USD", BigDecimal.ZERO);
                }
            }
        }
        return A06;
    }

    public CurrencyAmount A01() {
        if (this.A04.contains("feeAmount")) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = new CurrencyAmount("USD", BigDecimal.ZERO);
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
            if (!(obj instanceof PaypalFundingOptionData)) {
                return false;
            }
            PaypalFundingOptionData paypalFundingOptionData = (PaypalFundingOptionData) obj;
            if (!11T.A0O(A01(), paypalFundingOptionData.A01()) || !11T.A0O(this.A00, paypalFundingOptionData.A00) || !11T.A0O(this.A01, paypalFundingOptionData.A01) || !11T.A0O(A00(), paypalFundingOptionData.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(A01()))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        C3o5.A0d(parcel, this.A03, i);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
