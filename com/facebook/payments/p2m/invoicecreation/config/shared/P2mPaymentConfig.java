package com.facebook.payments.p2m.invoicecreation.config.shared;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.interfaces.P2pPaymentCustomConfig;
import com.google.common.collect.ImmutableList;

/* loaded from: P2mPaymentConfig.class */
public final class P2mPaymentConfig implements Parcelable, P2pPaymentCustomConfig {
    public static final Parcelable.Creator CREATOR = FKZ.A00(70);
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final ImmutableList A04;

    public P2mPaymentConfig(Parcel parcel) {
        int i = 0;
        this.A01 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A02 = 1BM.A07(parcel);
        this.A03 = AbJ.A1V(parcel);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            immutableList = ImmutableList.copyOf(strArr);
        }
        this.A04 = immutableList;
    }

    public P2mPaymentConfig(boolean z, String str, boolean z2, boolean z3) {
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A00 = str;
        this.A04 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof P2mPaymentConfig)) {
                return false;
            }
            P2mPaymentConfig p2mPaymentConfig = (P2mPaymentConfig) obj;
            if (this.A01 != p2mPaymentConfig.A01 || this.A02 != p2mPaymentConfig.A02 || this.A03 != p2mPaymentConfig.A03 || !11T.A0O(this.A00, p2mPaymentConfig.A00) || !11T.A0O(this.A04, p2mPaymentConfig.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A02(C1pq.A02(C1pq.A05(this.A01), this.A02), this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        1BL.A13(parcel, this.A00);
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y = AbL.A0Y(parcel, immutableList);
        while (A0Y.hasNext()) {
            C3o5.A0h(parcel, A0Y);
        }
    }
}
