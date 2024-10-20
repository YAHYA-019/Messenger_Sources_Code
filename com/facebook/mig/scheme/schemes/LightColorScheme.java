package com.facebook.mig.scheme.schemes;

import X.2qR;
import X.C1p7;
import X.C1p8;
import X.C2xc;
import X.C98U;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LightColorScheme.class */
public final class LightColorScheme extends BaseMigColorScheme {
    public static LightColorScheme A00;
    public static final Parcelable.Creator CREATOR = new C2xc(48);

    /* JADX WARN: Type inference failed for: r301v2, types: [java.lang.Object, com.facebook.mig.scheme.schemes.LightColorScheme] */
    public static LightColorScheme A00() {
        LightColorScheme lightColorScheme = A00;
        LightColorScheme lightColorScheme2 = lightColorScheme;
        if (lightColorScheme == null) {
            ?? obj = new Object();
            A00 = obj;
            lightColorScheme2 = obj;
        }
        return lightColorScheme2;
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZw() {
        return 2132607587;
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Aho() {
        return 2132607585;
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AjA(Integer num) {
        return Chx(C1p7.A0F);
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4j() {
        return C98U.PRIMARY.colorResId;
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Chx(C1p8 c1p8) {
        return c1p8.Ato();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public Object Ci4(2qR r302) {
        return r302.A01;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
