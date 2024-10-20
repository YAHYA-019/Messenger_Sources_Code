package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;

/* renamed from: X.4Tu, reason: invalid class name */
/* loaded from: 4Tu.class */
public final class C4Tu {
    public MSGNotificationEngineValueProvider A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1De A06;
    public MSGNotificationEngineIntegrator integrator;

    public C4Tu(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        1BY r0 = r303.A00;
        this.A05 = 1Bu.A03(r0, 83772);
        this.A03 = 1Lm.A03(fbUserSession, r0, 84672);
        this.A04 = 1Bu.A03(r0, 83782);
        this.A01 = 1Bu.A03(r0, 83771);
        this.A02 = 1Lm.A03(fbUserSession, r0, 83781);
    }
}
