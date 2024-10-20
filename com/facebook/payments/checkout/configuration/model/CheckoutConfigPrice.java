package com.facebook.payments.checkout.configuration.model;

import X.09K;
import X.1BJ;
import X.1BL;
import X.1Du;
import X.AnonymousClass001;
import X.C1my;
import X.C53v;
import X.DKF;
import X.FKY;
import X.FvR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.currency.CurrencyAmount;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;

/* loaded from: CheckoutConfigPrice.class */
public final class CheckoutConfigPrice implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(50);
    public final CheckoutItem A00;
    public final CurrencyAmount A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public CheckoutConfigPrice(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = C53v.A04(parcel, CheckoutConfigPrice.class);
        this.A01 = (CurrencyAmount) 1BL.A0C(parcel, CurrencyAmount.class);
        this.A04 = parcel.readString();
        this.A00 = (CheckoutItem) 1BL.A0C(parcel, CheckoutItem.class);
    }

    public CheckoutConfigPrice(CurrencyAmount currencyAmount, ImmutableList immutableList, String str, String str2) {
        this.A03 = str;
        this.A02 = immutableList;
        this.A01 = currencyAmount;
        this.A04 = str2;
        this.A00 = null;
    }

    public static CurrencyAmount A00(ImmutableList immutableList) {
        1Du it = immutableList.iterator();
        CurrencyAmount currencyAmount = null;
        while (it.hasNext()) {
            CurrencyAmount A02 = ((CheckoutConfigPrice) it.next()).A02();
            if (A02 != null) {
                if (currencyAmount != null) {
                    A02 = currencyAmount.A04(A02);
                }
                currencyAmount = A02;
            }
        }
        return currencyAmount;
    }

    public static ImmutableList A01(ImmutableList immutableList, ImmutableList immutableList2) {
        String str;
        if (!09K.A01(immutableList2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C1my.A02(new FvR(5), immutableList));
            1Du it = immutableList2.iterator();
            while (it.hasNext()) {
                CheckoutConfigPrice checkoutConfigPrice = (CheckoutConfigPrice) it.next();
                String str2 = checkoutConfigPrice.A03;
                CheckoutConfigPrice checkoutConfigPrice2 = (CheckoutConfigPrice) linkedHashMap.get(str2);
                if (checkoutConfigPrice2 != null && checkoutConfigPrice2.A04 == null) {
                    CurrencyAmount currencyAmount = checkoutConfigPrice2.A01;
                    if (currencyAmount == null) {
                        ImmutableList immutableList3 = checkoutConfigPrice2.A02;
                        if (immutableList3 == null) {
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("Unable to merge ");
                            A0k.append(checkoutConfigPrice2);
                            throw 1BL.A0h(checkoutConfigPrice, 1BJ.A00(62), A0k);
                        }
                        if (checkoutConfigPrice.A04 == null) {
                            CurrencyAmount currencyAmount2 = checkoutConfigPrice.A01;
                            if (currencyAmount2 != null) {
                                CurrencyAmount A02 = checkoutConfigPrice2.A02();
                                if (A02 != null) {
                                    checkoutConfigPrice = new CheckoutConfigPrice(currencyAmount2.A04(A02), null, str2, null);
                                }
                            } else {
                                checkoutConfigPrice2 = new CheckoutConfigPrice(null, A01(immutableList3, checkoutConfigPrice.A02), checkoutConfigPrice2.A03, null);
                            }
                        }
                    } else if (checkoutConfigPrice.A04 == null) {
                        CurrencyAmount currencyAmount3 = checkoutConfigPrice.A01;
                        if (currencyAmount3 != null) {
                            str = checkoutConfigPrice2.A03;
                            DKF.A1X(str, str2);
                        } else {
                            currencyAmount3 = checkoutConfigPrice.A02();
                            if (currencyAmount3 != null) {
                                str = checkoutConfigPrice2.A03;
                            }
                        }
                        checkoutConfigPrice2 = new CheckoutConfigPrice(currencyAmount.A04(currencyAmount3), null, str, null);
                    }
                    checkoutConfigPrice = checkoutConfigPrice2;
                }
                linkedHashMap.put(str2, checkoutConfigPrice);
            }
            immutableList = ImmutableList.copyOf(linkedHashMap.values());
        }
        return immutableList;
    }

    public CurrencyAmount A02() {
        CurrencyAmount currencyAmount = this.A01;
        if (currencyAmount == null) {
            if (this.A04 == null) {
                return A00(this.A02);
            }
            currencyAmount = null;
        }
        return currencyAmount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k;
        Object obj = this.A01;
        if (AnonymousClass001.A1T(obj)) {
            A0k = AnonymousClass001.A0k();
            A0k.append(this.A03);
        } else {
            obj = this.A02;
            boolean A1T = AnonymousClass001.A1T(obj);
            A0k = AnonymousClass001.A0k();
            A0k.append(this.A03);
            if (!A1T) {
                A0k.append(":");
                A0k.append(this.A04);
                return A0k.toString();
            }
        }
        A0k.append(":");
        A0k.append(obj);
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeList(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }
}
