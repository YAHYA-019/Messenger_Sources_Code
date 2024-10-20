package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.5sc, reason: invalid class name */
/* loaded from: 5sc.class */
public final class C5sc {
    public final 1De A00;
    public final C15h A01;

    public C5sc(1De r302) {
        this.A00 = r302;
        this.A01 = new AHe(1Bn.A0E((Context) null, r302.A00, 83719), 13);
    }

    public final String A00(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        String A01;
        11T.A0F(fbUserSession, 0);
        if (2Gt.A08(threadSummary)) {
            A01 = threadSummary.A20;
            if (A01 == null) {
                throw AnonymousClass001.A0N("Thread name cannot be null at this point");
            }
        } else {
            5Xv A02 = ((5Xu) 4YU.A0o(fbUserSession, this.A00, 49772)).A02(threadSummary);
            if (A02 == null) {
                throw AnonymousClass001.A0N("ThreadNameViewData should not be null when ThreadSummary is not null.");
            }
            A01 = ((5Ws) this.A01.get()).A01(A02.A02);
            11T.A0A(A01);
        }
        return A01;
    }
}
