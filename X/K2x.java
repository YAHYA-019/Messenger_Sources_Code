package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p002authapiphone.zza;
import com.google.android.gms.internal.p002authapiphone.zzh;

/* loaded from: K2x.class */
public final class K2x extends 2AC {
    public final /* bridge */ /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
            if (!(queryLocalInterface instanceof zzh)) {
                zza zzaVar = new zza(iBinder);
                0FI.A09(1004762225, 0FI.A03(-1029614092));
                return zzaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final boolean A09() {
        return true;
    }

    public final Feature[] A0A() {
        return Kd3.A04;
    }
}
