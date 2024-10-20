package X;

import android.content.Context;
import android.os.Handler;

/* loaded from: Led.class */
public final class Led implements GGx {
    public final Context A00;
    public final Handler A01 = AnonymousClass001.A07();
    public final Kji A02;
    public final L0P A03;

    public Led(Context context, Kji kji, L0P l0p) {
        this.A03 = l0p;
        this.A02 = kji;
        this.A00 = context;
    }

    @Override // X.GGx
    public final C4Ez AXH() {
        L0P l0p = this.A03;
        String packageName = this.A00.getPackageName();
        L8R l8r = l0p.A00;
        if (l8r != null) {
            L0P.A04.A01("requestUpdateInfo(%s)", new Object[]{packageName});
            4FE r0 = new 4FE();
            K8g k8g = new K8g(r0, r0, l0p, packageName);
            l8r.A01().post(new K8f(((LrQ) k8g).A00, r0, k8g, l8r));
            return r0.A00;
        }
        L1U l1u = L0P.A04;
        Object[] A1a = AnonymousClass001.A1a(-9);
        String A00 = 1BJ.A00(506);
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", L1U.A00(l1u.A00, A00, A1a));
        }
        return JQx.A0h(new K2C(-9));
    }
}
