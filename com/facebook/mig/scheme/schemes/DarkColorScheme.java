package com.facebook.mig.scheme.schemes;

import X.2qR;
import X.C1p8;
import X.C2qb;
import X.C2xc;
import X.C98U;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DarkColorScheme.class */
public final class DarkColorScheme extends BaseMigColorScheme {
    public static DarkColorScheme A00;
    public static final Parcelable.Creator CREATOR = new C2xc(47);

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZw() {
        return 2132607586;
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Aho() {
        return 2132607584;
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AjA(Integer num) {
        return C2qb.A00(this, 654311423);
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4j() {
        return C98U.PRIMARY_DARK.colorResId;
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Chx(C1p8 c1p8) {
        return c1p8.AgL();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public Object Ci4(2qR r302) {
        return r302.A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
