package X;

import com.facebook.presence.DefaultPresenceManager;

/* renamed from: X.3dl, reason: invalid class name */
/* loaded from: 3dl.class */
public final class C3dl implements 1K9 {
    public final int A00;
    public final Object A01;

    public C3dl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                throw AnonymousClass001.A0N("should not reached");
            case 2:
                0fH.A0r("DirectShareShortcutManager", "Failure while updating dynamic shortcuts", th);
                return;
            case 4:
                1Ql.A01(1BL.A0V(((3QT) this.A01).A04), 1NK.A2p, false);
                return;
            case 7:
                C21O.A03((C21O) this.A01, 2, false, false);
                return;
            case 10:
                0fH.A0w("OptimisticThreadStartupRetryManager", "Failed to fetch optimistic threads", th);
                return;
            case 11:
                CMZ cmz = (CMZ) this.A01;
                synchronized (cmz) {
                    if (cmz.A00 == 0S2.A0Y) {
                        return;
                    }
                    cmz.A00 = 0S2.A0N;
                    cmz.A05.D0v("StartupRetryManager", "Failed to start send retry during startup.");
                    return;
                }
            case 12:
                11T.A0F(th, 0);
                0fH.A0t("DefaultPresenceManager", "Failed to load facebook users", th);
                DefaultPresenceManager.A0E((DefaultPresenceManager) this.A01);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x037b, code lost:
    
        if (X.21W.A00(r0).AZk(36319377327798254L) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0463, code lost:
    
        if (X.1BK.A0R(r0).AZn(X.1NK.A0B, true) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014b, code lost:
    
        if (r310 == null) goto L38;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v80, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3dl.onSuccess(java.lang.Object):void");
    }
}
