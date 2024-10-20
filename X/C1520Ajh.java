package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.push.init.PushInitializer;

/* renamed from: X.Ajh, reason: case insensitive filesystem */
/* loaded from: Ajh.class */
public final class C1520Ajh extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$29";
    public final /* synthetic */ AuthenticationResult A00;
    public final /* synthetic */ Ezc A01;
    public final /* synthetic */ EnC A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1520Ajh(com.facebook.auth.component.listener.interfaces.AuthenticationResult r302, X.Ezc r303, X.EnC r304, java.lang.Class r305) {
        /*
            r301 = this;
            r0 = 42
            java.lang.String r0 = X.DKB.A00(r0)
            r306 = r0
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r305
            java.lang.String r2 = "PushInitializer"
            r3 = r306
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1520Ajh.<init>(com.facebook.auth.component.listener.interfaces.AuthenticationResult, X.Ezc, X.EnC, java.lang.Class):void");
    }

    public void A02() {
        PushInitializer pushInitializer = (PushInitializer) this.A01.A0q.get();
        if (pushInitializer.A01 != C0et.A0U) {
            C00j.A05("PushInitializer.authComplete", 505503887);
            try {
                0fH.A0A(PushInitializer.class, "onLogin");
                pushInitializer.A03("PushInitializer.onLogin");
                PushInitializer.A00(pushInitializer);
                C00j.A01(501281572);
            } catch (Throwable th) {
                C00j.A01(-110917973);
                throw th;
            }
        }
    }
}
