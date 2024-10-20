package com.facebook.payments.currency;

import X.0Pz;
import X.0S2;
import X.4YU;
import X.AbF;
import X.AbM;
import X.AnonymousClass001;
import X.FKZ;
import X.N1y;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* loaded from: CurrencyAmount.class */
public final class CurrencyAmount implements Comparable, Parcelable {
    public static final BigDecimal A02 = new BigDecimal(100);
    public static final ImmutableSet A03 = ImmutableSet.A02(new Locale("ar", "AR"), new Locale("he", "IL"));
    public static final Parcelable.Creator CREATOR = FKZ.A00(45);
    public final String A00;
    public final BigDecimal A01;

    public CurrencyAmount(String str, long j) {
        this(str, new BigDecimal(j).divide(A02));
    }

    public CurrencyAmount(String str, BigDecimal bigDecimal) {
        A02(str);
        this.A00 = str;
        bigDecimal.getClass();
        this.A01 = bigDecimal;
    }

    public static CurrencyAmount A00(String str, Currency currency, Locale locale) {
        return new CurrencyAmount(currency.getCurrencyCode(), new BigDecimal(NumberFormat.getNumberInstance(locale).parse(str.replaceAll("[^0-9.,-]", "")).toString()));
    }

    public static void A01(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2) {
        currencyAmount2.getClass();
        String str = currencyAmount.A00;
        String str2 = currencyAmount2.A00;
        Preconditions.checkArgument(str.equals(str2), "%s != $s", str, str2);
    }

    public static void A02(String str) {
        str.getClass();
        int length = str.length();
        if (!AnonymousClass001.A1Q(length, 3)) {
            throw AnonymousClass001.A0L(Strings.lenientFormat("Invalid currency length: %d for currencyCode: %s", Integer.valueOf(length), str));
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public int compareTo(CurrencyAmount currencyAmount) {
        A01(this, currencyAmount);
        return this.A01.compareTo(currencyAmount.A01);
    }

    public CurrencyAmount A04(CurrencyAmount currencyAmount) {
        A01(this, currencyAmount);
        return new CurrencyAmount(this.A00, this.A01.add(currencyAmount.A01));
    }

    public CurrencyAmount A05(String str) {
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal divide = this.A01.multiply(new BigDecimal(str)).divide(A02);
        return new CurrencyAmount(this.A00, divide.setScale((int) Math.log10(Integer.parseInt(AbF.A1C((ImmutableMap) N1y.A00.get(r0), "offset"))), roundingMode));
    }

    public String A06(Integer num, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(this.A00));
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
            case 2:
                break;
            default:
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol("");
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                break;
        }
        switch (intValue) {
            case 0:
            case 1:
                break;
            default:
                BigDecimal bigDecimal = this.A01;
                if (bigDecimal.signum() == 0 || bigDecimal.scale() <= 0 || bigDecimal.stripTrailingZeros().scale() <= 0) {
                    currencyInstance.setMaximumFractionDigits(0);
                    currencyInstance.setMinimumFractionDigits(0);
                    break;
                }
                break;
        }
        char minusSign = decimalFormat.getDecimalFormatSymbols().getMinusSign();
        String trim = currencyInstance.format(this.A01).trim();
        if (trim.startsWith("(") && trim.endsWith(")")) {
            trim = 0Pz.A0K(trim.replace("(", "").replace(")", ""), minusSign);
        }
        return trim;
    }

    public String A07(Locale locale, String str) {
        return StringFormatUtil.formatStrLocaleSafe("%s - %s", A08() ? StringFormatUtil.formatStrLocaleSafe("%s%d", N1y.A00(this.A00), 4YU.A0k()) : A06(0S2.A0C, locale), str);
    }

    public boolean A08() {
        return AnonymousClass001.A1O(BigDecimal.ZERO.compareTo(this.A01.setScale(2, 6)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CurrencyAmount currencyAmount = (CurrencyAmount) obj;
            if (!Objects.equal(this.A00, currencyAmount.A00) || !Objects.equal(this.A01, currencyAmount.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    public String toString() {
        String str = this.A00;
        return StringFormatUtil.formatStrLocaleSafe(0Pz.A0d("%s%.", "f", Currency.getInstance(str).getDefaultFractionDigits()), N1y.A00(str), Double.valueOf(this.A01.doubleValue()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeSerializable(this.A01);
    }
}
