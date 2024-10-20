package X;

import android.content.Context;

/* loaded from: D7f.class */
public final class D7f implements Runnable {
    public static final String __redex_internal_original_name = "EncryptedBackupsDeveloperOptions$showAlert$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CharSequence A01;

    public D7f(Context context, CharSequence charSequence) {
        this.A00 = context;
        this.A01 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2121Dea c2121Dea = new C2121Dea(this.A00);
        c2121Dea.A0A(this.A01);
        c2121Dea.A0C(true);
        c2121Dea.A0G(CS3.A00, "ok");
        c2121Dea.A04();
    }
}
