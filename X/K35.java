package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p001authapi.zba;
import com.google.android.gms.internal.p001authapi.zbj;

/* loaded from: K35.class */
public final class K35 extends 2AC {
    public final Bundle A00;

    public K35(Context context, Looper looper, Lc9 lc9, 2A5 r305, 2A7 r306, 2A9 r307) {
        super(context, looper, r305, r306, r307, 219);
        Bundle A05 = 1BK.A05();
        A05.putString("session_id", lc9.A00);
        this.A00 = A05;
    }

    public final Bundle A02() {
        return this.A00;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
            if (!(queryLocalInterface instanceof zbj)) {
                zba zbaVar = new zba("com.google.android.gms.auth.api.identity.internal.IAuthorizationService", iBinder);
                0FI.A09(-529144886, 0FI.A03(1318832420));
                return zbaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
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
