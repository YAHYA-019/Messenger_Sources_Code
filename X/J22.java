package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.links.join.JoinVideoChatActivity;

/* loaded from: J22.class */
public final class J22 implements Runnable {
    public static final String __redex_internal_original_name = "WakeupInfraDelegate$handleInfraWakeUpFailure$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ I8o A03;

    public J22(FbUserSession fbUserSession, I8o i8o, int i, int i2) {
        this.A03 = i8o;
        this.A02 = fbUserSession;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I8o i8o = this.A03;
        if (((JoinVideoChatActivity) i8o.A0A).A06) {
            return;
        }
        i8o.A03(this.A02, this.A01 + 1, this.A00 * 2);
    }
}
