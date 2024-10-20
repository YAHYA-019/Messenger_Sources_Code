package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: B0q.class */
public final class B0q extends C1rj {
    public static final CallerContext A02 = CallerContext.A0B("MetaAccountCenterSectionLayoutSpec");
    public static final 2qR A03;
    public C56u A00;
    public MigColorScheme A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2qQ, java.lang.Object] */
    static {
        ?? obj = new Object();
        7zM.A1V((2qQ) obj, 2132346751);
        A03 = 7zQ.A0k((2qQ) obj, 2132346752);
    }

    public B0q() {
        super("MetaAccountCenterSectionLayout");
    }

    public static final C2cl A00(C1u3 c1u3, 1Iw r302, MigColorScheme migColorScheme) {
        C1u2 A0I = 4YV.A0I();
        C2cm A00 = C2cl.A00(r302);
        7zM.A1H(A00, migColorScheme);
        7zN.A18(A00, c1u3, A0I);
        7zO.A1L(A00, 2RH.A04);
        A00.A0l(24.0f);
        A00.A0z(24.0f);
        return 7zL.A0J(A00);
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rq c1rq;
        MigColorScheme migColorScheme = this.A01;
        11T.A0G(r302, 0, migColorScheme);
        String A0D = r302.A0D(2131952251);
        String A0D2 = r302.A0D(2131952246);
        String A0D3 = r302.A0D(2131952250);
        1CO r0 = BYA.A00;
        if (r0.AZk(72340911555612954L)) {
            String A022 = 2yD.A02(r0, 72903861509095653L);
            if (!0CU.A0O(A022)) {
                A0D = A022;
            }
            String A023 = 2yD.A02(r0, 72903861509161190L);
            if (!0CU.A0O(A023)) {
                A0D2 = A023;
            }
            String A024 = 2yD.A02(r0, 72903861509226727L);
            if (!0CU.A0O(A024)) {
                A0D3 = A024;
            }
        }
        2cM A0M = 7zN.A0M(r302, (String) null);
        A0M.A2g(C1ro.FLEX_START);
        A0M.A25(C26z.START, 64.0f);
        C26z c26z = C26z.END;
        2RH r02 = 2RH.A04;
        4YU.A1O(A0M, r02, c26z);
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A2Z(7zS.A02(A03, migColorScheme));
        A00.A19(32.0f);
        7zN.A1B(A0M, A00);
        2KD A13 = 7zM.A13(r302, A0D, 0);
        A13.A2f();
        A13.A2b();
        A13.A2x(migColorScheme);
        7zO.A1G(A13, r02);
        C26z c26z2 = C26z.BOTTOM;
        4YU.A1O(A13, 2RH.A07, c26z2);
        A0M.A2d(A13);
        2KD A002 = 2K3.A00(r302);
        7zQ.A1W(A002, A0D2);
        A002.A2x(migColorScheme);
        4YU.A1K(A0M, A002);
        C1rq A01 = C1rg.A01(r302, null, 0);
        2RH r03 = 2RH.A03;
        7zO.A1G(A01, r03);
        A01.A2f(A00(C1u3.A3C, r302, migColorScheme));
        String A0D4 = r302.A0D(2131952249);
        2KD A003 = 2K3.A00(r302);
        7zQ.A1W(A003, A0D4);
        A003.A2x(migColorScheme);
        7zN.A1T(A01, A003);
        A0M.A2d(A01);
        C1rq A012 = C1rg.A01(r302, null, 0);
        7zO.A1G(A012, r03);
        A012.A2f(A00(C1u3.A5q, r302, migColorScheme));
        String A0D5 = r302.A0D(2131952247);
        2KD A004 = 2K3.A00(r302);
        7zQ.A1W(A004, A0D5);
        A004.A2x(migColorScheme);
        7zN.A1T(A012, A004);
        A0M.A2d(A012);
        if (1Br.A07(BY9.A00).AZk(36317964282441687L)) {
            c1rq = C1rg.A01(r302, null, 0);
            7zO.A1G(c1rq, r03);
            c1rq.A2f(A00(C1u3.A1M, r302, migColorScheme));
            String A0D6 = r302.A0D(2131952248);
            2KD A005 = 2K3.A00(r302);
            7zQ.A1W(A005, A0D6);
            A005.A2x(migColorScheme);
            7zN.A1T(c1rq, A005);
        } else {
            c1rq = null;
        }
        A0M.A2d(c1rq);
        2KD A132 = 7zM.A13(r302, A0D3, 0);
        A132.A2f();
        A132.A2w(C1u7.A06);
        A132.A2x(migColorScheme);
        7zO.A1G(A132, r03);
        A0M.A2d(A132);
        7zO.A1M(A0M, r03, c26z2);
        7zN.A1C(A0M, r302, B0q.class, "MetaAccountCenterSectionLayout");
        return A0M.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        C56u c56u = ((B0q) r302.A00.A01).A00;
        11T.A0F(c56u, 1);
        Bk0 bk0 = c56u.A00;
        Btn btn = bk0.A01;
        CBv cBv = (CBv) 1De.A00(btn.A00, 83706);
        C00i c00i = cBv.A00.A00;
        2yD A0M = 1BK.A0M(c00i);
        1GD r0 = 1GD.A07;
        if (A0M.Av9(r0, 36606783653551654L) > 0 && 1BK.A0M(c00i).AZr(r0, 36325308676919899L)) {
            AtomicBoolean atomicBoolean = btn.A04;
            if (atomicBoolean.get()) {
                return null;
            }
            atomicBoolean.set(true);
        }
        Context context = bk0.A00;
        EU9.A00(context);
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            qPLInstance.markerStart(857808852);
        }
        if (1BK.A0M(c00i).Av9(r0, 36606783653551654L) <= 0) {
            RbJ.A01(context, EUZ.A00(context), "APP_SETTINGS", (String) null);
            return null;
        }
        CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback = btn.A03;
        11T.A0F(cdsOpenScreenCallerDismissCallback, 1);
        EOn eOn = FZt.A0Q;
        FZt A00 = DKY.A00(FZt.A0M, FZt.A0P, eOn, EP2.A06, cdsOpenScreenCallerDismissCallback, 0S2.A0C, false, false);
        LinkedHashMap A1C = 1BK.A1C();
        BitSet A18 = 1BK.A18(0);
        long A002 = CBv.A00(cBv);
        A1C.put("entrypoint", "app_settings");
        A1C.put("caller_name", null);
        if (A18.nextClearBit(0) < 0) {
            throw AnonymousClass001.A0N("Missing required params");
        }
        LinkedHashMap A1C2 = 1BK.A1C();
        Iterator A0x = AnonymousClass001.A0x(A1C);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            if (CaI.A00.contains(A0z.getKey())) {
                1BL.A1O(A1C2, A0z);
            }
        }
        new FZb("com.bloks.www.fxcal.settings.FXAccountsCenterHomeScreenQuery", (String) null, 04R.A0D(A1C), A1C2, 857801770, A002, true).A01(context, A00, EUd.A00(context, true));
        return null;
    }
}
