package com.google.android.gms.common.internal;

import X.AbstractC01153q8;
import X.JQx;
import X.LGn;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zat.class */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(84);
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public zat(Account account, GoogleSignInAccount googleSignInAccount, int i, int i2) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, i2);
        AbstractC01153q8.A07(parcel, this.A02, 2, i);
        AbstractC01153q8.A04(parcel, 3, this.A01);
        AbstractC01153q8.A07(parcel, this.A03, 4, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
