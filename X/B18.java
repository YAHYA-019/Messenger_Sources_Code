package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sharing.broadcastflow.model.BatchOperationState;
import com.facebook.messaging.sharing.broadcastflow.model.SendButtonStates;
import com.facebook.messaging.sharing.broadcastflow.model.SendState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: B18.class */
public final class B18 extends C1rj {
    public static final 5Rm A09;
    public View A00;
    public FbUserSession A01;
    public BzA A02;
    public CtF A03;
    public MigColorScheme A04;
    public ImmutableList A05;
    public String A06;
    public String A07;
    public ScheduledExecutorService A08;

    static {
        5Rn r0 = C3s9.A04;
        A09 = new 5Rl(5000.0d, 200.0d);
    }

    public B18() {
        super("BroadcastFlowBottomViewComponent");
    }

    public static String A00(1Iw r301, BzA bzA, String str) {
        int i;
        if ("edit_mode".equals(str)) {
            i = 2131958473;
            if (bzA.A08.ordinal() != 1) {
                i = 2131958404;
            }
        } else {
            i = 2131966266;
            if (!bzA.A0G.A0G) {
                i = 2131957321;
            }
        }
        return r301.A0D(i);
    }

    public static void A01(View view, 1Iw r302, CPV cpv, BzA bzA, CtF ctF, C1q c1q, MigColorScheme migColorScheme, ImmutableList immutableList, String str, ScheduledExecutorService scheduledExecutorService, int i) {
        if (i != 0) {
            boolean z = bzA.A0G.A0G;
            ctF.A01.A00.BO7();
            SendButtonStates sendButtonStates = ctF.Ay1().A0I;
            boolean equals = "edit_mode".equals(str);
            ListenableFuture A01 = ctF.A01(immutableList);
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                sendButtonStates = SendButtonStates.A00(AbG.A0k(it), sendButtonStates, SendState.SENT);
            }
            if (equals) {
                BatchOperationState batchOperationState = BatchOperationState.IN_PROGRESS;
                DJZ djz = ctF.A00.A00;
                Bz9 Ay4 = djz.Ay4();
                Ay4.A08 = batchOperationState;
                DJZ.A00(Ay4, djz);
                1Kd.A0F(new D4S(10, ctF, view, r302, migColorScheme), A01, scheduledExecutorService);
                return;
            }
            if (!z) {
                BzA Ay1 = ctF.Ay1();
                C5k c5k = new C5k();
                c5k.A00 = BOf.A05;
                c5k.A02 = BOd.A06;
                CNc cNc = Ay1.A0G;
                String str2 = cNc.A08;
                CNc.A00(c5k, cpv, cNc, str2);
                if (!c1q.A00(r302.A0D, Ay1, ctF)) {
                    ctF.AGI();
                }
                str2.getClass();
                cNc.A09.getClass();
                return;
            }
        } else if ("edit_mode".equals(str)) {
            return;
        }
        ctF.A02();
    }

    public static void A0L(View view, 1Iw r302, CtF ctF, MigColorScheme migColorScheme) {
        BatchOperationState batchOperationState = BatchOperationState.NONE;
        DJZ djz = ctF.A00.A00;
        Bz9 Ay4 = djz.Ay4();
        Ay4.A08 = batchOperationState;
        DJZ.A00(Ay4, djz);
        if (view == null || view.getParent() == null) {
            return;
        }
        AbO.A0P(view, migColorScheme, r302.A0D(2131958462));
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A02, this.A04, this.A06, this.A08, this.A01, this.A07, this.A05, this.A00};
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01c6, code lost:
    
        if (X.CCL.A00(r0) != false) goto L18;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B18.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        5X4 r0 = new 7gB();
        5Rm r02 = A09;
        r0.A02 = r02;
        5Rn r03 = C3s9.A04;
        5X4 A00 = C3s9.A00(r03, "bottom_composer");
        A00.A03(C2jm.A01);
        A00.A01(0.0f);
        A00.A02(0.0f);
        A00.A02 = r02;
        5X4 A002 = C3s9.A00(r03, "bottom_composer");
        A002.A03(C2jm.A00);
        A002.A01(0.0f);
        A002.A02(0.0f);
        A002.A02 = r02;
        return new 5XA(new 5X4[]{r0, A00, A002});
    }
}
