package com.facebook.payments.p2p.datamodel;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.p2p.interfaces.P2pPaymentCustomConfig;
import com.facebook.payments.p2p.model.MarketplaceTransactionDisclaimerScreenDataParcelable;
import com.facebook.payments.p2p.model.P2pPromotionScreenInfoParcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: GeneralP2pPaymentCustomConfig.class */
public final class GeneralP2pPaymentCustomConfig implements Parcelable, P2pPaymentCustomConfig {
    public static final Parcelable.Creator CREATOR = FKZ.A00(74);
    public final Country A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final CurrencyAmount A03;
    public final CurrencyAmount A04;
    public final MarketplaceTransactionDisclaimerScreenDataParcelable A05;
    public final P2pPromotionScreenInfoParcelable A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public GeneralP2pPaymentCustomConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Country) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            this.A01 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (MarketplaceTransactionDisclaimerScreenDataParcelable) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (P2pPromotionScreenInfoParcelable) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            int i2 = 0;
            while (i2 < readInt2) {
                i2 = AbH.A00(parcel, strArr2, i2);
            }
            immutableList = ImmutableList.copyOf(strArr2);
        }
        this.A02 = immutableList;
        this.A09 = DKH.A1W(parcel);
    }

    public GeneralP2pPaymentCustomConfig(Country country, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, MarketplaceTransactionDisclaimerScreenDataParcelable marketplaceTransactionDisclaimerScreenDataParcelable, P2pPromotionScreenInfoParcelable p2pPromotionScreenInfoParcelable, ImmutableList immutableList, ImmutableList immutableList2, String str) {
        this.A00 = country;
        this.A07 = str;
        this.A08 = null;
        this.A01 = immutableList;
        this.A03 = currencyAmount;
        this.A04 = currencyAmount2;
        this.A05 = marketplaceTransactionDisclaimerScreenDataParcelable;
        this.A06 = p2pPromotionScreenInfoParcelable;
        this.A02 = immutableList2;
        this.A09 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GeneralP2pPaymentCustomConfig)) {
                return false;
            }
            GeneralP2pPaymentCustomConfig generalP2pPaymentCustomConfig = (GeneralP2pPaymentCustomConfig) obj;
            if (!11T.A0O(this.A00, generalP2pPaymentCustomConfig.A00) || !11T.A0O(this.A07, generalP2pPaymentCustomConfig.A07) || !11T.A0O(this.A08, generalP2pPaymentCustomConfig.A08) || !11T.A0O(this.A01, generalP2pPaymentCustomConfig.A01) || !11T.A0O(this.A03, generalP2pPaymentCustomConfig.A03) || !11T.A0O(this.A04, generalP2pPaymentCustomConfig.A04) || !11T.A0O(this.A05, generalP2pPaymentCustomConfig.A05) || !11T.A0O(this.A06, generalP2pPaymentCustomConfig.A06) || !11T.A0O(this.A02, generalP2pPaymentCustomConfig.A02) || this.A09 != generalP2pPaymentCustomConfig.A09) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A03(this.A00))))))))), this.A09);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A04, i);
        C3o5.A0d(parcel, this.A05, i);
        C3o5.A0d(parcel, this.A06, i);
        ImmutableList immutableList2 = this.A02;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        parcel.writeInt(this.A09 ? 1 : 0);
    }
}
