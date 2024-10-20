package X;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;

/* renamed from: X.05q, reason: invalid class name */
/* loaded from: 05q.class */
public final class C05q implements IBinder.DeathRecipient {
    public static C05q A01;
    public final 0jH A00;

    public C05q(0jH r302) {
        this.A00 = r302;
        A00("activity");
        A00("SurfaceFlinger");
    }

    private void A00(String str) {
        IBinder service = ServiceManager.getService(str);
        if (service != null) {
            try {
                service.linkToDeath(this, 0);
            } catch (RemoteException e) {
                0fH.A0r("SystemBinderDiedDetector", "linkToDeath failed", e);
                C0iy.A00().Bwu("SysBinderLinkToDeath", e, null);
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        C0pu c0pu = this.A00.A03;
        0RZ.A02(c0pu);
        synchronized (c0pu.A02) {
            c0pu.A01.A00.put(206, (byte) 49);
            C0pu.A02(c0pu);
        }
    }
}
