package com.facebook.payments.checkout.configuration.model;

import X.09K;
import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.form.model.AmountFormData;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: PriceSelectorConfig.class */
public final class PriceSelectorConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(86);
    public final CurrencyAmount A00;
    public final AmountFormData A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public PriceSelectorConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (AmountFormData) AmountFormData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = AbI.A0z(parcel);
        }
        int readInt = parcel.readInt();
        PriceSelectorFixedAmountModel[] priceSelectorFixedAmountModelArr = new PriceSelectorFixedAmountModel[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, priceSelectorFixedAmountModelArr, i);
        }
        this.A02 = ImmutableList.copyOf(priceSelectorFixedAmountModelArr);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        int readInt2 = parcel.readInt();
        PriceSelectorPercentageAmountModel[] priceSelectorPercentageAmountModelArr = new PriceSelectorPercentageAmountModel[readInt2];
        int i2 = 0;
        while (i2 < readInt2) {
            i2 = AbI.A01(parcel, A0e, priceSelectorPercentageAmountModelArr, i2);
        }
        this.A03 = ImmutableList.copyOf(priceSelectorPercentageAmountModelArr);
        this.A07 = parcel.readString();
        this.A09 = DKH.A1W(parcel);
        this.A08 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
    }

    public PriceSelectorConfig(CurrencyAmount currencyAmount, AmountFormData amountFormData, ImmutableList immutableList, ImmutableList immutableList2, Integer num, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = currencyAmount;
        this.A01 = amountFormData;
        this.A04 = num;
        C1pq.A08("fixedAmounts", immutableList);
        this.A02 = immutableList;
        this.A06 = str;
        C1pq.A08("percentageAmounts", immutableList2);
        this.A03 = immutableList2;
        this.A07 = str2;
        this.A09 = z;
        this.A08 = str3;
        this.A05 = str4;
        Integer num2 = this.A04;
        boolean z2 = false;
        if (num2 != null) {
            Preconditions.checkArgument(AbJ.A1U(num2.intValue(), -1));
        }
        ImmutableList immutableList3 = this.A02;
        if (09K.A01(immutableList3)) {
            CurrencyAmount currencyAmount2 = this.A00;
            Preconditions.checkArgument(AnonymousClass001.A1T(currencyAmount2));
            ImmutableList immutableList4 = this.A03;
            Preconditions.checkArgument(!09K.A01(immutableList4));
            if (num2 != null) {
                Preconditions.checkArgument(immutableList4.size() > num2.intValue() ? true : z2);
            }
            AmountFormData amountFormData2 = this.A01;
            if (amountFormData2 != null) {
                DKF.A1X(amountFormData2.A03, currencyAmount2.A00);
                return;
            }
            return;
        }
        if (num2 != null) {
            Preconditions.checkArgument(immutableList3.size() > num2.intValue() ? true : z2);
            String str5 = null;
            AmountFormData amountFormData3 = this.A01;
            str5 = amountFormData3 != null ? amountFormData3.A03 : str5;
            1Du it = immutableList3.iterator();
            while (it.hasNext()) {
                CurrencyAmount currencyAmount3 = ((PriceSelectorFixedAmountModel) it.next()).A00;
                if (currencyAmount3 != null) {
                    str5 = str5 == null ? currencyAmount3.A00 : str5;
                    DKF.A1X(currencyAmount3.A00, str5);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PriceSelectorConfig)) {
                return false;
            }
            PriceSelectorConfig priceSelectorConfig = (PriceSelectorConfig) obj;
            if (!11T.A0O(this.A00, priceSelectorConfig.A00) || !11T.A0O(this.A01, priceSelectorConfig.A01) || !11T.A0O(this.A04, priceSelectorConfig.A04) || !11T.A0O(this.A02, priceSelectorConfig.A02) || !11T.A0O(this.A06, priceSelectorConfig.A06) || !11T.A0O(this.A03, priceSelectorConfig.A03) || !11T.A0O(this.A07, priceSelectorConfig.A07) || this.A09 != priceSelectorConfig.A09 || !11T.A0O(this.A08, priceSelectorConfig.A08) || !11T.A0O(this.A05, priceSelectorConfig.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A08, C1pq.A02(C1pq.A04(this.A07, C1pq.A04(this.A03, C1pq.A04(this.A06, C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A03(this.A00))))))), this.A09)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        AmountFormData amountFormData = this.A01;
        if (amountFormData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amountFormData.writeToParcel(parcel, i);
        }
        C3o5.A0f(parcel, this.A04);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((PriceSelectorFixedAmountModel) A0b.next(), i);
        }
        1BL.A13(parcel, this.A06);
        1Du A0b2 = 1BL.A0b(parcel, this.A03);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((PriceSelectorPercentageAmountModel) A0b2.next(), i);
        }
        parcel.writeString(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A05);
    }
}
