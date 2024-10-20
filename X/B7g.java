package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.rsys.call.gen.CallModel;

/* loaded from: B7g.class */
public final class B7g extends GS2 {
    public boolean A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final Context A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7g(FbUserSession fbUserSession, Context context) {
        super("SafetyWarningInterstitialPresenter");
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A0A = context;
        this.A06 = 1Lm.A00(context, fbUserSession, 99977);
        this.A04 = 1BK.A0C();
        this.A09 = 1Lm.A00(context, fbUserSession, 83620);
        this.A08 = 1Lm.A00(context, fbUserSession, 85073);
        this.A03 = 1Lm.A00(context, fbUserSession, 99979);
        this.A02 = 1Bu.A01(context, 83913);
        this.A07 = 1Lm.A00(context, fbUserSession, 83902);
        this.A05 = 1Bu.A01(context, 82679);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ac  */
    /* JADX WARN: Type inference failed for: r306v4, types: [X.Bxe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A0c(X.JFq r302) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7g.A0c(X.JFq):void");
    }

    public final void A0d() {
        this.A00 = true;
        C00i c00i = this.A06.A00;
        ThreadKey threadKey = AbJ.A0j(c00i).A05;
        if (((CJ5) 1Br.A0B(this.A09)).A01 != 0S2.A01 || threadKey == null) {
            ((JOJ) 1Br.A0B(this.A07)).BZn(AbJ.A0j(c00i).A0X ? "SAFETY_WARNING_INTERSTITIAL_OUTGOING_REJECT" : "SAFETY_WARNING_INTERSTITIAL_INCOMING_REJECT");
        } else {
            CQS cqs = (CQS) 1Br.A0B(this.A05);
            CQS.A04(AbJ.A0j(c00i).A0X ? BOp.A0T : BOp.A0U, this.A01, threadKey, cqs);
        }
        CallModel A0V = AbL.A0V(1Lm.A05(this.A0A, this.A01, 33088));
        if (A0V == null || !IFr.A0E(A0V)) {
            C00i c00i2 = this.A03.A00;
            ((IRF) c00i2.get()).A0h(1, GOm.A00(ActionId.MESSENGER_QUEUE_CREATION));
            if (1Br.A07(this.A04).AZk(36320803255762648L)) {
                return;
            }
            IRF.A0J((IRF) c00i2.get());
        }
    }
}
