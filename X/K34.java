package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p001authapi.zba;
import com.google.android.gms.internal.p001authapi.zbv;

/* loaded from: K34.class */
public final class K34 extends 2AC {
    public final Bundle A00;

    public K34(Context context, Looper looper, 2A5 r304, 2A7 r305, 2A9 r306) {
        super(context, looper, r304, r305, r306, 212);
        this.A00 = 1BK.A05();
    }

    public final Bundle A02() {
        return this.A00;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
            if (!(queryLocalInterface instanceof zbv)) {
                zba zbaVar = new zba("com.google.android.gms.auth.api.identity.internal.ISignInService", iBinder);
                0FI.A09(591269525, 0FI.A03(-913999359));
                return zbaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    public final boolean A08() {
        return true;
    }

    public final boolean A09() {
        return true;
    }

    public final Feature[] A0A() {
        return KdN.A09;
    }

    public final int Axj() {
        return 17895000;
    }
}
