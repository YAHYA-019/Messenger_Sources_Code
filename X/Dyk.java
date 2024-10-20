package X;

import android.app.Dialog;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: Dyk.class */
public final class Dyk extends C1rj {
    public GGn A00;
    public GDa A01;
    public static final CallerContext A02 = CallerContext.A0B("AutoFlexReconsiderDialogComponentSpec");
    public static final C00i A06 = DKF.A0M();
    public static final C00i A04 = 1BQ.A00();
    public static final C00i A05 = AbH.A0M();
    public static final C00i A03 = AbH.A0S();

    public Dyk() {
        super("AutoFlexReconsiderDialogComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // X.C1rj
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dyk.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i;
        QuickPerformanceLogger A0U;
        String str;
        switch (r302.A01) {
            case -1243387526:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                Object obj2 = ((Dyk) r02).A01;
                int i2 = 238948877;
                if (ED7.A02(r03.A0D, A03)) {
                    i2 = 238951439;
                }
                C00i c00i = A05;
                1BK.A0U(c00i).markerPoint(i2, "back_button_clicked");
                ((Dialog) obj2).dismiss();
                1BK.A0U(c00i).markerPoint(i2, "recosinder_dialog_dismissed");
                1BK.A0U(c00i).markerEnd(i2, (short) 4);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -1047175806:
                1Iv r04 = r302.A00;
                1Is r05 = r04.A01;
                1Iw r06 = r04.A00;
                Dyk dyk = (Dyk) r05;
                GGn gGn = dyk.A00;
                Object obj3 = dyk.A01;
                Ex4 ex4 = (Ex4) 1Bn.A0A(98479);
                Context context = r06.A0D;
                ED7 A00 = ED7.A00(context, A03);
                EyW eyW = (EyW) 1Bi.A03(98467);
                i = 238948877;
                if ("ZeroOlympusOptin".equals(A00.A0C)) {
                    i = 238951439;
                }
                eyW.A02("optout_clicked");
                C00i c00i2 = A05;
                1BK.A0U(c00i2).markerPoint(i, "continue_button_clicked");
                ex4.A01(context);
                ((Dialog) obj3).dismiss();
                1BK.A0U(c00i2).markerPoint(i, "reconsider_dialog_dismissed");
                gGn.onDismiss();
                A0U = 1BK.A0U(c00i2);
                str = "optin_screen_dismissed";
                A0U.markerPoint(i, str);
                return null;
            case 1611659444:
                i = 238948877;
                if (ED7.A02(r302.A00.A00.A0D, A03)) {
                    i = 238951439;
                }
                A0U = 1BK.A0U(A05);
                str = "reconsider_dialog_interactable";
                A0U.markerPoint(i, str);
                return null;
            default:
                return null;
        }
    }
}
