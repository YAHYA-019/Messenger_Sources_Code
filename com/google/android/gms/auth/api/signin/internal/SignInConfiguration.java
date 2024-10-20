package com.google.android.gms.auth.api.signin.internal;

import X.1BL;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: SignInConfiguration.class */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(70);
    public final GoogleSignInOptions A00;
    public final String A01;

    public SignInConfiguration(GoogleSignInOptions googleSignInOptions, String str) {
        AbstractC00481b7.A04(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.google.android.gms.auth.api.signin.internal.SignInConfiguration
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L40
            r0 = r302
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r0 = (com.google.android.gms.auth.api.signin.internal.SignInConfiguration) r0
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.A01
            r305 = r0
            r0 = r302
            java.lang.String r0 = r0.A01
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L40
            r0 = r301
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.A00
            r305 = r0
            r0 = r302
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.A00
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L42
            r0 = r306
            if (r0 != 0) goto L40
        L3e:
            r0 = 1
            r304 = r0
        L40:
            r0 = r304
            return r0
        L42:
            r0 = r305
            r1 = r306
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3e
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInConfiguration.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((1BL.A05(this.A01) + 31) * 31) + AnonymousClass001.A02(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, str, 2);
        AbstractC01153q8.A07(parcel, this.A00, 5, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
