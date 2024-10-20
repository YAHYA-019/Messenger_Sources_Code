package com.google.android.gms.auth.api.signin.internal;

import X.0FI;
import X.0Pz;
import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.p001authapi.zbb;

/* loaded from: zbt.class */
public final class zbt extends zbb implements IInterface {
    public final Context A00;

    public zbt() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        0FI.A09(-808983721, 0FI.A03(144710946));
    }

    public zbt(Context context) {
        this();
        int A03 = 0FI.A03(-1740762173);
        this.A00 = context;
        0FI.A09(1516754252, A03);
    }

    public static final void A00(zbt zbtVar) {
        int A03 = 0FI.A03(-618800924);
        if (UidVerifier.A00(zbtVar.A00, Binder.getCallingUid())) {
            0FI.A09(1404781098, A03);
        } else {
            SecurityException securityException = new SecurityException(0Pz.A0d("Calling UID ", " is not Google Play services.", Binder.getCallingUid()));
            0FI.A09(-1834771666, A03);
            throw securityException;
        }
    }
}
