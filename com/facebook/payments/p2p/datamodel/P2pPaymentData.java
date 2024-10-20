package com.facebook.payments.p2p.datamodel;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pages.app.message.p2p.markaspaid.model.PagesMarkAsPaidP2pPaymentData;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.invoice.creation.v2.model.InvoiceData;
import com.facebook.payments.p2p.model.P2pThemeOrGiftWrap;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: P2pPaymentData.class */
public final class P2pPaymentData implements Parcelable {
    public static volatile CurrencyAmount A0G;
    public static final Parcelable.Creator CREATOR = FKZ.A00(76);
    public final PagesMarkAsPaidP2pPaymentData A00;
    public final CurrencyAmount A01;
    public final InvoiceData A02;
    public final P2pThemeOrGiftWrap A03;
    public final PaymentMethod A04;
    public final MediaResource A05;
    public final ImmutableList A06;
    public final Long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final Set A0F;

    public P2pPaymentData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        P2pThemeOrGiftWrap p2pThemeOrGiftWrap = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (CurrencyAmount) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (PaymentMethod) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (InvoiceData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (MediaResource) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (PagesMarkAsPaidP2pPaymentData) PagesMarkAsPaidP2pPaymentData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        int readInt = parcel.readInt();
        User[] userArr = new User[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, userArr, i2);
        }
        this.A06 = ImmutableList.copyOf(userArr);
        this.A03 = parcel.readInt() != 0 ? (P2pThemeOrGiftWrap) P2pThemeOrGiftWrap.CREATOR.createFromParcel(parcel) : p2pThemeOrGiftWrap;
        this.A07 = AbN.A0h(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0F = Collections.unmodifiableSet(A0v);
    }

    public P2pPaymentData(PagesMarkAsPaidP2pPaymentData pagesMarkAsPaidP2pPaymentData, CurrencyAmount currencyAmount, InvoiceData invoiceData, P2pThemeOrGiftWrap p2pThemeOrGiftWrap, PaymentMethod paymentMethod, MediaResource mediaResource, ImmutableList immutableList, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Set set) {
        this.A01 = currencyAmount;
        this.A08 = str;
        this.A09 = str2;
        this.A04 = paymentMethod;
        this.A02 = invoiceData;
        this.A0A = str3;
        this.A05 = mediaResource;
        this.A0B = str4;
        this.A00 = pagesMarkAsPaidP2pPaymentData;
        this.A0C = str5;
        this.A0D = str6;
        this.A0E = str7;
        C1pq.A08("targetUsers", immutableList);
        this.A06 = immutableList;
        this.A03 = p2pThemeOrGiftWrap;
        this.A07 = l;
        this.A0F = Collections.unmodifiableSet(set);
    }

    public CurrencyAmount A00() {
        if (this.A0F.contains("amount")) {
            return this.A01;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = new CurrencyAmount("USD", 0L);
                }
            }
        }
        return A0G;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof P2pPaymentData)) {
                return false;
            }
            P2pPaymentData p2pPaymentData = (P2pPaymentData) obj;
            if (!11T.A0O(A00(), p2pPaymentData.A00()) || !11T.A0O(this.A08, p2pPaymentData.A08) || !11T.A0O(this.A09, p2pPaymentData.A09) || !11T.A0O(this.A04, p2pPaymentData.A04) || !11T.A0O(this.A02, p2pPaymentData.A02) || !11T.A0O(this.A0A, p2pPaymentData.A0A) || !11T.A0O(this.A05, p2pPaymentData.A05) || !11T.A0O(this.A0B, p2pPaymentData.A0B) || !11T.A0O(this.A00, p2pPaymentData.A00) || !11T.A0O(this.A0C, p2pPaymentData.A0C) || !11T.A0O(this.A0D, p2pPaymentData.A0D) || !11T.A0O(this.A0E, p2pPaymentData.A0E) || !11T.A0O(this.A06, p2pPaymentData.A06) || !11T.A0O(this.A03, p2pPaymentData.A03) || !11T.A0O(this.A07, p2pPaymentData.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A04(this.A03, C1pq.A04(this.A06, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A00, C1pq.A04(this.A0B, C1pq.A04(this.A05, C1pq.A04(this.A0A, C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A03(A00())))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A01, i);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        C3o5.A0d(parcel, this.A04, i);
        C3o5.A0d(parcel, this.A02, i);
        1BL.A13(parcel, this.A0A);
        C3o5.A0d(parcel, this.A05, i);
        1BL.A13(parcel, this.A0B);
        PagesMarkAsPaidP2pPaymentData pagesMarkAsPaidP2pPaymentData = this.A00;
        if (pagesMarkAsPaidP2pPaymentData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pagesMarkAsPaidP2pPaymentData.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        1Du A0b = 1BL.A0b(parcel, this.A06);
        while (A0b.hasNext()) {
            parcel.writeParcelable((User) A0b.next(), i);
        }
        P2pThemeOrGiftWrap p2pThemeOrGiftWrap = this.A03;
        if (p2pThemeOrGiftWrap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p2pThemeOrGiftWrap.writeToParcel(parcel, i);
        }
        C3o5.A0g(parcel, this.A07);
        Iterator A0S = C3o5.A0S(parcel, this.A0F);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
