package X;

import android.content.Context;

/* loaded from: D7g.class */
public final class D7g implements Runnable {
    public static final String __redex_internal_original_name = "EncryptedBackupsDeveloperOptions$showResultInDialog$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C8p A01;

    public D7g(Context context, C8p c8p) {
        this.A00 = context;
        this.A01 = c8p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        C2121Dea c2121Dea = new C2121Dea(context);
        C8p c8p = this.A01;
        String str = c8p.A00;
        String str2 = c8p.A01;
        if (str2 == null) {
            str2 = "local";
        }
        c2121Dea.A0A(0Pz.A0v("recovery code:", str, " source:", str2));
        c2121Dea.A0C(true);
        c2121Dea.A0H(new CSF(c8p, context, 15), "copy");
        c2121Dea.A0F(CS4.A00, "ok");
        c2121Dea.A04();
    }
}
