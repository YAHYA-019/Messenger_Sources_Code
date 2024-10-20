package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.1BK;
import X.AbM;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.JR0;
import X.LGm;
import X.Lj7;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzh.class */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(16);
    public final Lj7 A00;
    public final boolean A01;

    public zzh(Lj7 lj7, boolean z) {
        this.A01 = z;
        this.A00 = lj7;
    }

    public final JSONObject A00() {
        try {
            JSONObject A12 = AnonymousClass001.A12();
            if (this.A01) {
                A12.put("enabled", true);
            }
            Lj7 lj7 = this.A00;
            byte[] A04 = lj7 == null ? null : lj7.A04();
            if (A04 != null) {
                JSONObject A122 = AnonymousClass001.A12();
                A122.put("first", Base64.encodeToString(Arrays.copyOf(A04, 32), 11));
                if (A04.length == 64) {
                    A122.put("second", Base64.encodeToString(Arrays.copyOfRange(A04, 32, 64), 11));
                }
                A12.put("results", A122);
            }
            return A12;
        } catch (JSONException e) {
            throw 1BK.A0s("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof zzh) {
            zzh zzhVar = (zzh) obj;
            if (this.A01 == zzhVar.A01) {
                z = JR0.A1X(this.A00, zzhVar.A00);
            }
        }
        return z;
    }

    public final int hashCode() {
        return AbM.A05(Boolean.valueOf(this.A01), this.A00);
    }

    public final String toString() {
        return 0Pz.A0j("AuthenticationExtensionsPrfOutputs{", A00().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.A01;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A06(parcel, 1, z);
        AbstractC01153q8.A0B(parcel, JR0.A1Y(this.A00), 2);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
