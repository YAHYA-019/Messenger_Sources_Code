package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.concurrent.Executor;

/* loaded from: Dyj.class */
public final class Dyj extends C1rj {
    public static final CallerContext A02 = CallerContext.A0C("CoplayCustomUpdateConsentDialogLayoutSpec", "CoplayCustomUpdateConsentDialogLayoutSpec");
    public FbUserSession A00;
    public DQM A01;

    public Dyj() {
        super("CoplayCustomUpdateConsentDialogLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008c, code lost:
    
        if (r308 == null) goto L12;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dyj.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        FbUserSession fbUserSession;
        DQM dqm;
        boolean z;
        Context context;
        C6J A022;
        BOh bOh;
        C1706Aqc A23;
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -1013417845:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                Dyj dyj = (Dyj) r02;
                fbUserSession = dyj.A00;
                dqm = dyj.A01;
                11T.A0F(r03, 0);
                z = true;
                11T.A0G(fbUserSession, 1, dqm);
                context = r03.A0D;
                A022 = ((CNQ) 7zN.A0k(context, 85227)).A02(BOk.A01, fbUserSession);
                A022.A01 = BOX.A09;
                bOh = BOh.A0B;
                break;
            case 936280750:
                1Iv r04 = r302.A00;
                1Is r05 = r04.A01;
                1Iw r06 = r04.A00;
                FbUserSession fbUserSession2 = ((Dyj) r05).A00;
                11T.A0H(r06, fbUserSession2);
                C6J A03 = ((CNQ) 7zQ.A12(r06, 85227)).A03(fbUserSession2);
                A03.A01 = BOX.A09;
                A03.A00();
                return null;
            case 974949319:
                1Iv r07 = r302.A00;
                1Is r08 = r07.A01;
                1Iw r09 = r07.A00;
                Dyj dyj2 = (Dyj) r08;
                fbUserSession = dyj2.A00;
                dqm = dyj2.A01;
                z = false;
                11T.A0F(r09, 0);
                1BL.A1F(fbUserSession, dqm);
                context = r09.A0D;
                A022 = ((CNQ) 7zN.A0k(context, 85227)).A02(BOk.A01, fbUserSession);
                A022.A01 = BOX.A09;
                bOh = BOh.A01;
                break;
            default:
                return null;
        }
        A022.A00 = bOh;
        A022.A00();
        1Br A0R = 7zM.A0R();
        2JX r010 = ((ESt) 1Lo.A04(context, fbUserSession, (1BY) null, 85026)).A00;
        if (r010 != null) {
            2JX A1Q = r010.A1Q();
            String A0k = (A1Q == null || (A23 = A1Q.A23()) == null) ? null : A23.A0k();
            String A0k2 = r010.A0k();
            if (A0k2 != null && A0k != null) {
                07S A0J = 4YU.A0J(GraphQlCallInput.A02, A0k2, "context_source_id");
                07S.A00(A0J, false, "store_preference");
                07S.A00(A0J, A0k, "app_id");
                GraphQlQueryParamSet A0N = 4YU.A0N(A0J, Boolean.valueOf(z), "block_messaging");
                4YV.A1A(A0J, A0N, "input");
                1Kd.A0F(FwK.A01(dqm, 33), AbL.A0Z(7zM.A0K(context), 5Dh.A00(A0N, new C01643sd(C2258Die.class, "InstantGameCustomUpdateBlockMessagingMutation", null, "input", "fbandroid", -1612408949, 288, 4099645991L, 4099645991L, false, true)), 184570512895732L), (Executor) A0R.get());
                JZj jZj = dqm.A00;
                if (jZj == null) {
                    return null;
                }
                jZj.dismiss();
                return null;
            }
        }
        JZj jZj2 = dqm.A00;
        if (jZj2 != null) {
            jZj2.dismiss();
        }
        dqm.A00();
        return null;
    }
}
