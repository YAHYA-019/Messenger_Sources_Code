package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dwy.class */
public final class Dwy extends C1rj {
    public Dwy() {
        super("EditorLoadingComponent");
    }

    public final Object[] A0k() {
        return 1LI.A0A;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GradientDrawable A00;
        1LI A2W;
        11T.A0F(r302, 0);
        boolean AZk = 1BK.A0L(16387).AZk(72340172821302526L);
        if (AZk) {
            int i = -2236423;
            int i2 = -263425;
            int i3 = -1773058;
            float f = 0.0f / 0.0f;
            if (EVf.A00(7zL.A0A(r302), 2Mg.A00)) {
                i = -14736832;
                i2 = -14468469;
                i3 = -14667956;
            }
            A00 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2, i3});
            A00.setShape(0);
        } else {
            float f2 = 0.0f / 0.0f;
            A00 = EVO.A00(-9058581, -7145784);
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0D(A00);
        A01.A2c();
        A01.A2b();
        A01.A1C(46.0f);
        if (1BK.A0L(16387).AZk(72339111965032537L)) {
            8Sk A002 = 8oJ.A00(r302);
            A002.A2W(2132475940);
            A002.A2X(new Dpu(0));
            A002.A0z(110.0f);
            A002.A0l(110.0f);
            A01.A2d(A002);
        } else {
            if (AZk) {
                CallerContext A0B = CallerContext.A0B("EditorLoadingComponentSpec");
                C1rq A012 = C1rg.A01(r302, null, 0);
                A012.A0l(40.0f);
                A012.A18(9.0f);
                C2155Dfj c2155Dfj = new C2155Dfj(r302);
                c2155Dfj.A03 = false;
                c2155Dfj.A02 = 0S2.A0N;
                c2155Dfj.A01 = 3E4.A04;
                AbstractC2178Dg6.A09(A0B, c2155Dfj, A012);
                A01.A2d(A012);
                C2152Dfg A0f = new C2152Dfg(r302).A0f(2131956764);
                AbstractC2178Dg6.A0C(2MR.A1j, A0f, AbstractC2178Dg6.A05(A0f, EP4.A0F));
                A2W = A0f.A0O(CallerContext.A08);
            } else {
                Context A0A = 7zL.A0A(r302);
                Drawable drawable = A0A.getDrawable(2132410663);
                if (drawable == null) {
                    throw 1BK.A0h();
                }
                2Mg r0 = 2Me.A02;
                drawable.setTint(r0.A01(A0A));
                Drawable drawable2 = A0A.getDrawable(2132410664);
                if (drawable2 == null) {
                    throw 1BK.A0h();
                }
                drawable2.setTint(r0.A01(A0A));
                C1rq A013 = C1rg.A01(r302, null, 0);
                A013.A0l(40.0f);
                A013.A18(9.0f);
                C53p A014 = C53o.A01(r302, 0);
                A014.A01.A01 = drawable;
                A014.A0z(32.0f);
                A014.A0l(32.0f);
                A013.A2e(A014);
                C53p A015 = C53o.A01(r302, 0);
                A015.A01.A01 = drawable2;
                A015.A0z(24.0f);
                A015.A0l(24.0f);
                A015.A17(15.0f);
                A013.A2e(A015);
                A01.A2d(A013);
                3yF A0L = 2KZ.A0L(r302, 0);
                A0L.A30(2131956764);
                A0L.A2s(36.0f);
                A0L.A2y(2130969673);
                A0L.A2f();
                A2W = A0L.A2W();
            }
            A01.A2e(A2W);
        }
        return A01.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 361656628182006L);
        return A00;
    }
}
