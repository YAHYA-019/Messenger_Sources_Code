package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.8hf, reason: invalid class name */
/* loaded from: 8hf.class */
public final class C8hf extends 1LH {
    public static final 5Rm A01;
    public static final CallerContext A02 = CallerContext.A0B("InstantGameArcadeFbIconAnimatedComponent");
    public final Handler A00;

    static {
        5Rn r0 = C3s9.A04;
        A01 = new C5X0(300);
    }

    public C8hf() {
        this(null, null, 1);
    }

    public /* synthetic */ C8hf(Handler handler, DefaultConstructorMarker defaultConstructorMarker, int i) {
        this.A00 = AnonymousClass001.A07();
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [X.Dg1, X.Dfk] */
    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1GU A0Q = 7zQ.A0Q();
        1Iw r0 = c2k5.A05;
        Context context = r0.A0D;
        MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(context, 16980);
        1Br A00 = 1Bq.A00(49965);
        FFo fFo = (FFo) 1Bn.A0E(context, (1BY) null, 67677);
        C2lh A002 = C2lc.A00(c2k5, AOp.A00);
        Object obj = A002.A02;
        boolean A1W = AnonymousClass001.A1W(obj, 95P.A03);
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = 7zN.A03(c2k5, 7zP.A0A());
            i++;
        } while (i < 8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(migColorScheme.BKg());
        shapeDrawable.getPaint().setAlpha(178);
        long j = fFo.A05 * 1000;
        long j2 = fFo.A04 * 1000;
        long j3 = 1000 * fFo.A03;
        A0Q.Ciz(new AFK(c2k5, this));
        4FL.A00(c2k5, new AKc(4, j, this, A002), 7zL.A1Y());
        4FL.A00(c2k5, new AKZ(A002, this, j2, j3), new Object[]{obj});
        2lQ r02 = 2lO.A02;
        2lO A0R = 7zR.A0R((2lO) null, C83d.A00(A00, this, c2k5, 12), 1);
        long A0H = 7zP.A0H();
        Integer num = 0S2.A01;
        2lO A0L = 7zT.A0L(4YV.A0K(A0R, num, A0H), 8.0d);
        C1ro c1ro = C1ro.CENTER;
        C2sn A0U = 7zQ.A0U(r0);
        if (A1W) {
            Integer num2 = 0S2.A00;
            7zN.A1N(A0U, 7zR.A0P(A0U.A00, C82m.A05(7zS.A0S(4YV.A0L((2lO) null, num2, shapeDrawable, 1), 0), num2, num, 100.0f, 0), 5Rn.A01, "transtion_key_arcade_fb_icon_background"));
        }
        1Iw r03 = A0U.A00;
        1Xo r04 = EZq.A00;
        ?? abstractC2156Dfk = new AbstractC2156Dfk(r03);
        abstractC2156Dfk.A0h(3Eh.A0e);
        abstractC2156Dfk.A03 = ERE.A01;
        abstractC2156Dfk.A02 = A1W ? ERC.A07 : ERC.A06;
        C2173Dg1 A0g = abstractC2156Dfk.A0g(A1W ? 2MR.A1g : 2MR.A06);
        C26z c26z = C26z.START;
        float f = 0.0f;
        if (A1W) {
            f = 2.0f;
        }
        A0g.A0X(c26z, f);
        A0U.A00(A0g.A0O(A02));
        if (A1W) {
            2KD A012 = 2K3.A01(r03, 0);
            A012.A24(c26z, 8.0f);
            A012.A15(14.0f);
            A012.A1y(c1ro);
            A012.A2x(migColorScheme);
            C1qo c1qo = A0U.AeS().A0E;
            11T.A0A(c1qo);
            A012.A2z(c1qo.A0C(2131964091));
            A012.A2w(C1u7.A03);
            A012.A2k();
            A012.A2L("transition_key_arcade_fb_icon_text");
            A012.A0d();
            7zN.A1Q(A0U, A012);
        }
        return C2so.A0P(A0U, c2k5, A0L);
    }
}
