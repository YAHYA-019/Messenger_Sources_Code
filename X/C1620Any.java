package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.Any, reason: case insensitive filesystem */
/* loaded from: Any.class */
public final class C1620Any extends 2UV {
    public final C00i A00;
    public final CHc A01;

    public C1620Any(FbUserSession fbUserSession) {
        super(AbJ.A1D());
        this.A00 = AbH.A0a();
        this.A01 = (CHc) 1Lo.A06(fbUserSession, 84215);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if ((r0 - r0) > 14400000) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.2UW A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620Any.A02(java.lang.Object):X.2UW");
    }

    public /* bridge */ /* synthetic */ ListenableFuture A03(2UW r302, Object obj) {
        ListenableFuture D3C;
        Bpx bpx = (Bpx) obj;
        CHc cHc = this.A01;
        Integer num = bpx.A02;
        int i = bpx.A00;
        int i2 = bpx.A01;
        synchronized (cHc) {
            Blg blg = cHc.A03;
            if (blg == null || (0S2.A00.equals(num) && 0S2.A01.equals(blg.A01))) {
                1EK.A09("MessengerSettingsKidsDataStore", 335144434347286L);
                try {
                    if (cHc.A03 != null) {
                        cHc.A03 = null;
                    }
                    D3C = cHc.A06.D3C(C0jy.A03("MessengerSettingsKidsDataStore", new DAx(cHc, i, i2), 0));
                    cHc.A03 = new Blg(D3C, num);
                    1EK.A03();
                } catch (Throwable th) {
                    1EK.A03();
                    throw th;
                }
            } else {
                D3C = 1Kd.A08(blg.A00);
            }
        }
        return D3C;
    }
}
