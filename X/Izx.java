package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Izx.class */
public final class Izx implements Runnable {
    public static final String __redex_internal_original_name = "LiveStatusPoller$startPolling$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ IF4 A01;
    public final /* synthetic */ String A02;

    public Izx(FbUserSession fbUserSession, IF4 if4, String str) {
        this.A01 = if4;
        this.A00 = fbUserSession;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IF4.A03(this.A00, this.A01, this.A02);
    }
}
