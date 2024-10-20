package com.google.android.gms.auth.api.signin.internal;

import X.AbstractC01153q8;
import X.JQx;
import X.LGn;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: GoogleSignInOptionsExtensionParcelable.class */
public final class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(69);
    public int A00;
    public Bundle A01;
    public final int A02;

    public GoogleSignInOptionsExtensionParcelable(Bundle bundle, int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A02);
        AbstractC01153q8.A04(parcel, 2, this.A00);
        AbstractC01153q8.A02(this.A01, parcel, 3);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
