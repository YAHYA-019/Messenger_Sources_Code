package com.facebook.payments.receipt.model;

import X.11T;
import X.1He;
import X.1JF;
import X.2JX;
import X.7zN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKH;
import X.ELR;
import X.ER6;
import X.FJ8;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ReceiptComponentControllerParams.class */
public final class ReceiptComponentControllerParams implements Parcelable {
    public static volatile 1He A07;
    public static volatile ELR A08;
    public static final Parcelable.Creator CREATOR = FKd.A00(83);
    public final long A00;
    public final 2JX A01;
    public final ER6 A02;
    public final String A03;
    public final 1He A04;
    public final ELR A05;
    public final Set A06;

    public ReceiptComponentControllerParams(ER6 er6, ELR elr, String str, Set set) {
        this.A04 = null;
        this.A00 = 0L;
        C1pq.A08("paymentModulesClient", er6);
        this.A02 = er6;
        C1pq.A08("productId", str);
        this.A03 = str;
        this.A05 = elr;
        this.A01 = null;
        this.A06 = Collections.unmodifiableSet(set);
        boolean z = true;
        Preconditions.checkArgument(!1JF.A0A(this.A03));
        Preconditions.checkArgument(this.A00 < 0 ? false : z);
    }

    public ReceiptComponentControllerParams(Parcel parcel) {
        2JX r304 = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = 1He.values()[parcel.readInt()];
        }
        this.A00 = parcel.readLong();
        this.A02 = ER6.values()[parcel.readInt()];
        this.A03 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = ELR.values()[parcel.readInt()];
        }
        this.A01 = parcel.readInt() != 0 ? (2JX) FJ8.A01(parcel) : r304;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public 1He A00() {
        if (this.A06.contains("dataFreshnessParam")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = 1He.A02;
                }
            }
        }
        return A07;
    }

    public ELR A01() {
        if (this.A06.contains("receiptStyle")) {
            return this.A05;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = ELR.A03;
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReceiptComponentControllerParams)) {
                return false;
            }
            ReceiptComponentControllerParams receiptComponentControllerParams = (ReceiptComponentControllerParams) obj;
            if (A00() != receiptComponentControllerParams.A00() || this.A00 != receiptComponentControllerParams.A00 || this.A02 != receiptComponentControllerParams.A02 || !11T.A0O(this.A03, receiptComponentControllerParams.A03) || A01() != receiptComponentControllerParams.A01() || !11T.A0O(this.A01, receiptComponentControllerParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A01 = C1pq.A01(C3o5.A03(A00()) + 31, this.A00);
        int A04 = C1pq.A04(this.A03, (A01 * 31) + C3o5.A03(this.A02));
        return C1pq.A04(this.A01, (A04 * 31) + DKF.A04(A01()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A04);
        parcel.writeLong(this.A00);
        7zN.A0z(parcel, this.A02);
        parcel.writeString(this.A03);
        C3o5.A0e(parcel, this.A05);
        DKH.A0y(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
