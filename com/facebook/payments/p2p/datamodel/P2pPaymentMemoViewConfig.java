package com.facebook.payments.p2p.datamodel;

import X.AbI;
import X.AnonymousClass001;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: P2pPaymentMemoViewConfig.class */
public final class P2pPaymentMemoViewConfig implements Parcelable {
    public static volatile Integer A05;
    public static volatile Integer A06;
    public static final Parcelable.Creator CREATOR = FKZ.A00(77);
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final Set A04;

    public P2pPaymentMemoViewConfig(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        this.A03 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public P2pPaymentMemoViewConfig(Integer num, Integer num2, Set set, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = num;
        this.A03 = num2;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public int A00() {
        Integer num;
        if (this.A04.contains("mediaButtonIconRes")) {
            num = this.A02;
        } else {
            if (A05 == null) {
                synchronized (this) {
                    if (A05 == null) {
                        A05 = 2132410700;
                    }
                }
            }
            num = A05;
        }
        return num.intValue();
    }

    public int A01() {
        Integer num;
        if (this.A04.contains("memoHintRes")) {
            num = this.A03;
        } else {
            if (A06 == null) {
                synchronized (this) {
                    if (A06 == null) {
                        A06 = 2131962863;
                    }
                }
            }
            num = A06;
        }
        return num.intValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof P2pPaymentMemoViewConfig)) {
                return false;
            }
            P2pPaymentMemoViewConfig p2pPaymentMemoViewConfig = (P2pPaymentMemoViewConfig) obj;
            if (this.A00 != p2pPaymentMemoViewConfig.A00 || this.A01 != p2pPaymentMemoViewConfig.A01 || A00() != p2pPaymentMemoViewConfig.A00() || A01() != p2pPaymentMemoViewConfig.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.A00 + 31) * 31) + this.A01) * 31) + A00()) * 31) + A01();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        C3o5.A0f(parcel, this.A02);
        C3o5.A0f(parcel, this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
