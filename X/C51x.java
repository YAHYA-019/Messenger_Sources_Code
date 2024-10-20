package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: X.51x, reason: invalid class name */
/* loaded from: 51x.class */
public final class C51x implements ServiceConnection {
    public final /* synthetic */ C2uj A00;

    public /* synthetic */ C51x(C2uj c2uj) {
        this.A00 = c2uj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2uj c2uj = this.A00;
        c2uj.A06.A03(JQw.A00(190), componentName);
        c2uj.A01().post(new C52A(iBinder, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2uj c2uj = this.A00;
        c2uj.A06.A03(JQw.A00(191), componentName);
        c2uj.A01().post(new 3CC(this));
    }
}
