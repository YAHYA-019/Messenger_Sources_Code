package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.fido.zza;
import com.google.android.gms.internal.fido.zzs;

/* loaded from: K2y.class */
public final class K2y extends 2AC {
    public final Bundle A02() {
        Bundle A05 = 1BK.A05();
        A05.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return A05;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
            if (!(queryLocalInterface instanceof zzs)) {
                zza zzaVar = new zza(iBinder);
                0FI.A09(1495950521, 0FI.A03(730207251));
                return zzaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    public final String A06() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    public final boolean A09() {
        return true;
    }

    public final Feature[] A0A() {
        return new Feature[]{KdU.A0A, KdU.A09};
    }

    public final int Axj() {
        return 13000000;
    }
}
