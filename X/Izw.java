package X;

import com.facebook.auth.usersession.FbUserSession;
import java.lang.ref.WeakReference;

/* loaded from: Izw.class */
public final class Izw implements Runnable {
    public static final String __redex_internal_original_name = "LiveStatusPoller$PollVideoBroadcastStatusRunnable";
    public final FbUserSession A00;
    public final C01s A01;
    public final WeakReference A02;

    public Izw(FbUserSession fbUserSession, C01s c01s, IF4 if4) {
        1BK.A1K(c01s, 3, fbUserSession);
        this.A01 = c01s;
        this.A00 = fbUserSession;
        this.A02 = 7zL.A14(if4);
    }

    @Override // java.lang.Runnable
    public void run() {
        IF4 if4 = (IF4) this.A02.get();
        if (if4 != null) {
            IF4.A00(this.A00, if4);
        } else {
            this.A01.D0v(IF4.A0g, "LiveStatusPoller was garbage collected without being stopped.");
        }
    }
}
