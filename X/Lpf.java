package X;

import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Lpf.class */
public final class Lpf implements Runnable {
    public static final String __redex_internal_original_name = "AdmWorkJobLogic$1";
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ C3279Jox A02;

    public Lpf(Intent intent, FbUserSession fbUserSession, C3279Jox c3279Jox) {
        this.A02 = c3279Jox;
        this.A01 = fbUserSession;
        this.A00 = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A02.A05(this.A00, this.A01);
    }
}
