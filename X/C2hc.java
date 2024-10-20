package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import java.util.ArrayList;

/* renamed from: X.2hc, reason: invalid class name */
/* loaded from: 2hc.class */
public final class C2hc extends 1LH {
    public final FbUserSession A00;
    public final C2hb A01;

    public C2hc(FbUserSession fbUserSession, C2hb c2hb) {
        this.A01 = c2hb;
        this.A00 = fbUserSession;
    }

    public static final void A01(C2hc c2hc, long j) {
        C2hb c2hb = c2hc.A01;
        C6el c6el = new C6el();
        c6el.A00(ThreadKey.A0F(j, Long.parseLong(c2hc.A00.A02)));
        c6el.A02(5SW.A1b);
        final ThreadViewParams threadViewParams = new ThreadViewParams(c6el);
        if (c2hb.A03 || c2hb.A00.A00()) {
            return;
        }
        83Z A0F = 1BK.A0F();
        if (A0F != null) {
            Context context = c2hb.A01.A0D;
            11T.A0A(context);
            A0F.A05(context, c2hb.A02.A00, threadViewParams.A0C.toString());
        } else {
            final 2Rz r0 = c2hb.A02.A01.A00;
            CallerContext callerContext = 2Rz.A1U;
            ((1GU) 1Br.A0B(r0.A0k)).CY3(new Runnable() { // from class: X.3gp
                public static final String __redex_internal_original_name = "InboxFragment$searchBarFactory$2$1$launchThreadView$1";

                @Override // java.lang.Runnable
                public final void run() {
                    2Rz r02 = r0;
                    CallerContext callerContext2 = 2Rz.A1U;
                    r02.A0J.CWL(threadViewParams);
                }
            });
        }
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1qI r0 = (1qI) 1Bi.A03(66409);
        1Br A00 = 1Bu.A00(68258);
        if ((!r0.A0A() || !1qI.A02(r0).AZk(36322796123866982L) || 1qI.A02(r0).AZk(36322796124915574L) || 1qI.A02(r0).AZk(36322796124456815L) || r0.A07()) && !r0.A07()) {
            return new 1LI();
        }
        1Br A002 = 1Lm.A00(3vP.A00(c2k5), this.A00, 67627);
        2lQ r02 = 2lO.A02;
        2lO r03 = new 2lO(new 2lO((2lO) null, new C2xi(0S2.A1G, new C2xz(1, r0, A002, this, A00), 1)), new 3vR(0S2.A00, new 3vQ(A002, A00, r0)));
        C2sn c2sn = new C2sn(c2k5.A05, new ArrayList());
        1Iw r04 = c2sn.A00;
        C2cq A003 = C2cp.A00(r04, 0);
        A003.A2a(AbstractC02503vN.A00.A02(C1u3.A3S, C1u4.SIZE_32));
        Resources resources = r04.A0D.getResources();
        A003.A0C((int) resources.getDimension(2132279320));
        A003.A1L((int) resources.getDimension(2132279320));
        A003.A1J(2131952658);
        c2sn.A00(A003.A2W());
        return C2so.A0A(c2sn, c2k5, r03, null, null, null, null, false);
    }
}
