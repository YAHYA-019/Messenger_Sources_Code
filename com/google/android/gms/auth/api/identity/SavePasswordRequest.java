package com.google.android.gms.auth.api.identity;

import X.AbM;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: SavePasswordRequest.class */
public final class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(65);
    public final int A00;
    public final SignInPassword A01;
    public final String A02;

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        AbstractC00481b7.A02(signInPassword);
        this.A01 = signInPassword;
        this.A02 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof SavePasswordRequest) {
            SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
            if (AbstractC09524qc.A00(this.A01, savePasswordRequest.A01) && AbstractC09524qc.A00(this.A02, savePasswordRequest.A02) && this.A00 == savePasswordRequest.A00) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A01, this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A01, 1, i);
        AbstractC01153q8.A08(parcel, this.A02, 2);
        AbstractC01153q8.A04(parcel, 3, this.A00);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
