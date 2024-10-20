package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzbh;

/* loaded from: K33.class */
public final class K33 extends 2AC {
    public final Bundle A00;

    public K33(Context context, Looper looper, LcA lcA, 2A5 r305, 2A7 r306, 2A9 r307) {
        super(context, looper, r305, r306, r307, 16);
        this.A00 = lcA == null ? 1BK.A05() : new Bundle(lcA.A00);
    }

    public final Bundle A02() {
        return this.A00;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            if (!(queryLocalInterface instanceof zzbh)) {
                zza zzaVar = new zza("com.google.android.gms.auth.api.internal.IAuthService", iBinder);
                0FI.A09(-422750648, 0FI.A03(-400505182));
                return zzaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean A09() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r0.A05.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ChO() {
        /*
            r301 = this;
            r0 = r301
            X.2A9 r0 = r0.A00
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L35
            X.286 r0 = X.Kcq.A02
            r305 = r0
            r0 = r302
            java.util.Map r0 = r0.A04
            r1 = r305
            java.lang.Object r0 = r0.get(r1)
            r0 = r302
            java.util.Set r0 = r0.A05
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r306 = r0
            r0 = 1
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L39
        L35:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L39:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K33.ChO():boolean");
    }
}
