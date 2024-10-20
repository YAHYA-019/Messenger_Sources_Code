package X;

import com.facebook.auth.usersession.FbUserSession;
import java.lang.ref.WeakReference;

/* loaded from: Izv.class */
public final class Izv implements Runnable {
    public static final String __redex_internal_original_name = "LiveStatusPoller$BackgroundScheduleNextPollRunnable";
    public final FbUserSession A00;
    public final C01s A01;
    public final WeakReference A02;

    public Izv(FbUserSession fbUserSession, C01s c01s, IF4 if4) {
        1BK.A1K(c01s, 3, fbUserSession);
        this.A01 = c01s;
        this.A00 = fbUserSession;
        this.A02 = 7zL.A14(if4);
    }

    @Override // java.lang.Runnable
    public void run() {
        IF4 if4 = (IF4) this.A02.get();
        if (if4 != null) {
            IF4.A01(this.A00, if4);
        } else {
            this.A01.D0v(IF4.A0h, "LiveStatusPoller was garbage collected without being stopped.");
        }
    }
}
