package X;

import com.facebook.messaging.business.plugins.usercontrols.p2busercontrols.P2bUserControlsImplementation;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Cjr.class */
public final class Cjr implements AnonymousClass477 {
    public final int A00;
    public final Object A01;

    public Cjr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AnonymousClass477
    public void COj(User user) {
        switch (this.A00) {
            case 0:
                11T.A0F(user, 0);
                ((CIR) this.A01).A02 = AnonymousClass001.A1W(user.A0p, 1Ks.A02);
                return;
            case 1:
                CQb cQb = (CQb) this.A01;
                boolean A1W = AnonymousClass001.A1W(user.A0p, 1Ks.A02);
                ImmutableList immutableList = CQb.A0Z;
                cQb.A0L = A1W;
                return;
            case 2:
                11T.A0F(user, 0);
                P2bUserControlsImplementation p2bUserControlsImplementation = (P2bUserControlsImplementation) this.A01;
                ((CQX) 1Bu.A06(p2bUserControlsImplementation.A00, 82655)).A08(46, AbF.A1A(user), p2bUserControlsImplementation.A03.A0r());
                BWp.A00(p2bUserControlsImplementation.A01, (ThreadSummary) null, user);
                return;
            case 3:
                C1557Alb c1557Alb = (C1557Alb) this.A01;
                NavigationTrigger navigationTrigger = C1557Alb.A1B;
                c1557Alb.A0O = user;
                return;
            case 4:
                11T.A0F(user, 0);
                if (user.A02() != C1z1.NOT_BLOCKED) {
                    ((0Je) this.A01).element = true;
                    return;
                }
                return;
            default:
                11T.A0F(user, 0);
                AbF.A1W(this.A01, user);
                return;
        }
    }

    @Override // X.AnonymousClass477
    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 4:
                11T.A0F(th, 0);
                4zI.A03.A09("SafetyWarningControllerImpl", "Failed to fetch user", new Object[]{th});
                return;
            case 5:
                11T.A0F(th, 0);
                0fH.A0r("StoryBoostingRanker", "OpFetchUserByKey onFailure", th);
                return;
            default:
                return;
        }
    }
}
