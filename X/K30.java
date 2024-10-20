package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzj;

/* loaded from: K30.class */
public final class K30 extends 2AC {
    public final Context A00;

    public K30(Context context, Looper looper, 2A4 r304, 2A6 r305, 2A9 r306) {
        super(context, looper, r304, r305, r306, 45);
        this.A00 = context;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
            if (!(queryLocalInterface instanceof zzi)) {
                return new zzj(iBinder);
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    public final String A06() {
        return "com.google.android.gms.safetynet.service.START";
    }

    public final int Axj() {
        return 12200000;
    }
}
