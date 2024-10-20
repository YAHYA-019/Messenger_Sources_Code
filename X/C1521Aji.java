package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;

/* renamed from: X.Aji, reason: case insensitive filesystem */
/* loaded from: Aji.class */
public final class C1521Aji extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$31";
    public final /* synthetic */ AuthenticationResult A00;
    public final /* synthetic */ Ezc A01;
    public final /* synthetic */ EnC A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1521Aji(com.facebook.auth.component.listener.interfaces.AuthenticationResult r302, X.Ezc r303, X.EnC r304, java.lang.Class r305) {
        /*
            r301 = this;
            r0 = 295(0x127, float:4.13E-43)
            java.lang.String r0 = X.1BJ.A00(r0)
            r306 = r0
            r0 = 42
            java.lang.String r0 = X.DKB.A00(r0)
            r307 = r0
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
            r2 = r306
            r3 = r307
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1521Aji.<init>(com.facebook.auth.component.listener.interfaces.AuthenticationResult, X.Ezc, X.EnC, java.lang.Class):void");
    }

    public void A02() {
        final C00171ab c00171ab = (C00171ab) this.A01.A0h.get();
        c00171ab.A0M = false;
        4YU.A0G(c00171ab.A08).post(new Runnable() { // from class: X.D6z
            public static final String __redex_internal_original_name = "MqttPushServiceManager$$ExternalSyntheticLambda3";

            @Override // java.lang.Runnable
            public final void run() {
                C00171ab.A05(C00171ab.this, true);
            }
        });
    }
}
