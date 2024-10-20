package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.service.zal;
import com.google.android.gms.internal.base.zaa;

/* loaded from: K2w.class */
public final class K2w extends 2AC {
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            if (!(queryLocalInterface instanceof zal)) {
                zaa zaaVar = new zaa("com.google.android.gms.common.internal.service.ICommonService", iBinder);
                0FI.A09(-1997475903, 0FI.A03(-1165776236));
                return zaaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    public final String A06() {
        return "com.google.android.gms.common.service.START";
    }
}
