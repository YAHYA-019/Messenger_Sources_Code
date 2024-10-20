package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.service.zai;
import com.google.android.gms.internal.base.zaa;

/* loaded from: K32.class */
public final class K32 extends 2AC {
    public final 3dG A00;

    public K32(Context context, Looper looper, 2A5 r304, 2A7 r305, 2A9 r306, 3dG r307) {
        super(context, looper, r304, r305, r306, 270);
        this.A00 = r307;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        IInterface queryLocalInterface;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            if (!(queryLocalInterface instanceof zai)) {
                zaa zaaVar = new zaa("com.google.android.gms.common.internal.service.IClientTelemetryService", iBinder);
                0FI.A09(-459638206, 0FI.A03(-1403828755));
                return zaaVar;
            }
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String A06() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean A08() {
        return true;
    }

    public final Feature[] A0A() {
        return Kc6.A01;
    }

    public final int Axj() {
        return 203400000;
    }
}
