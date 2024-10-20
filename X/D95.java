package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Set;

/* loaded from: D95.class */
public final class D95 implements Runnable {
    public static final String __redex_internal_original_name = "MontageAudienceHelper$2";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ DH9 A01;
    public final /* synthetic */ CbS A02;

    public D95(FbUserSession fbUserSession, DH9 dh9, CbS cbS) {
        this.A02 = cbS;
        this.A00 = fbUserSession;
        this.A01 = dh9;
    }

    @Override // java.lang.Runnable
    public void run() {
        CbS cbS = this.A02;
        Set set = cbS.A09;
        if (set.isEmpty()) {
            return;
        }
        CbS.A00(this.A00, new CmR(this, 1), BLE.A03, cbS, set);
    }
}
