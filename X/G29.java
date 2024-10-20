package X;

import android.content.Intent;

/* loaded from: G29.class */
public final class G29 implements Runnable {
    public static final String __redex_internal_original_name = "AppCoordinator$1";
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ 4fI A01;

    public G29(Intent intent, 4fI r303) {
        this.A01 = r303;
        this.A00 = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        09X.A00().A07().A0H(this.A01.A00, this.A00);
    }
}
