package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cmq.class */
public final class Cmq implements JFR {
    public final /* synthetic */ B8B A00;

    public Cmq(B8B b8b) {
        this.A00 = b8b;
    }

    public final void Bq2(long j) {
        B8B b8b = this.A00;
        FbUserSession fbUserSession = b8b.A04;
        ThreadSummary threadSummary = b8b.A05;
        String str = b8b.A09;
        B8C b8c = new B8C(fbUserSession, threadSummary, b8b.A06, b8b.A08, null, Long.valueOf(j), str);
        b8b.A00 = b8c;
        b8c.A02();
    }
}
