package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzp;

/* loaded from: K2z.class */
public final class K2z extends 2AC {
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
            if (!(queryLocalInterface instanceof zzp)) {
                zza zzaVar = new zza("com.google.android.gms.auth.account.data.IGoogleAuthService", iBinder);
                0FI.A09(-1007404123, 0FI.A03(-715125604));
                return zzaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    public final boolean A08() {
        return true;
    }

    public final boolean A09() {
        return true;
    }

    public final Feature[] A0A() {
        return new Feature[]{KdQ.A0C, KdQ.A0B, KdQ.A00};
    }

    public final void ANY(String str) {
        android.util.Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super/*X.2AD*/.ANY(str);
    }

    public final int Axj() {
        return 17895000;
    }
}
