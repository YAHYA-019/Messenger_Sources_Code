package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.util.launchtimeline.LaunchTimelineHelper$ProfileParam;

/* loaded from: Ch4.class */
public final class Ch4 implements 67O {
    public static final String __redex_internal_original_name = "LaunchTimelineHelper$2";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ CHY A01;

    public Ch4(FbUserSession fbUserSession, CHY chy) {
        this.A01 = chy;
        this.A00 = fbUserSession;
    }

    public void Bml(Object obj) {
    }

    public void BqY(Object obj) {
        CHY chy = this.A01;
        FbUserSession fbUserSession = this.A00;
        LaunchTimelineHelper$ProfileParam launchTimelineHelper$ProfileParam = (LaunchTimelineHelper$ProfileParam) obj;
        C00i c00i = chy.A07;
        2yD A0N = 1BK.A0N(((COV) c00i.get()).A04);
        1GD r0 = 1GD.A07;
        boolean AZr = A0N.AZr(r0, 36313059429979686L);
        long Av9 = 1BK.A0N(((COV) c00i.get()).A04).Av9(r0, 36594534406621287L);
        if (!AZr) {
            CHY.A00(fbUserSession, launchTimelineHelper$ProfileParam, chy, Av9);
            return;
        }
        C67Q c67q = (C67Q) chy.A02.get();
        1Kd.A0F(new D4C(fbUserSession, launchTimelineHelper$ProfileParam, chy, Av9), C67Q.A00(new Clq(chy.A00, fbUserSession, c67q, launchTimelineHelper$ProfileParam.A02, Av9, launchTimelineHelper$ProfileParam.A03), c67q, ((CG7) c67q.A05.get()).A00.AZk(36319261362239334L)), ((CG7) chy.A04.get()).A01() ? 1BK.A1E(chy.A01) : 1JU.A01);
    }
}
