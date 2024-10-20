package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Ayk, reason: case insensitive filesystem */
/* loaded from: Ayk.class */
public final class C1991Ayk extends C1rj {
    public View.OnClickListener A00;
    public FbUserSession A01;
    public C9fj A02;
    public C5ww A03;
    public MigColorScheme A04;
    public List A05;
    public boolean A06;

    public C1991Ayk() {
        super("M4ActiveStatusLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A03, this.A04, this.A01, Boolean.valueOf(this.A06), this.A05};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        FbUserSession fbUserSession = this.A01;
        MigColorScheme migColorScheme = this.A04;
        boolean z = this.A06;
        View.OnClickListener onClickListener = this.A00;
        C5ww c5ww = this.A03;
        List list = this.A05;
        C9fj c9fj = this.A02;
        boolean A1W = 1BL.A1W(r302, fbUserSession);
        7zT.A11(2, migColorScheme, onClickListener, c5ww, list);
        C1i A0T = 7zU.A0T();
        BgT bgT = (BgT) 1Bn.A0A(83295);
        9XN r0 = (9XN) 1Bn.A0A(68172);
        C90 c90 = (C90) 1Bn.A0A(83582);
        1X6 r02 = (1X6) 1Bi.A03(67984);
        2eV r03 = (2eV) 1Bn.A0A(65819);
        CQY cqy = new CQY(r302, A0T, migColorScheme);
        String A0D = r302.A0D(2131952289);
        long Av1 = 1X6.A00(r02).Av1(1X6.A01(r02).A04, 0L);
        CQY.A03(cqy, c5ww, (r02.A07() || Av1 == 0) ? "" : c90.A02(7zL.A0A(r302), 2131952298, 2131952299, 2131952297, Av1), A0D, z);
        if (!z && 2eV.A00(r03).AZk(36319553420146845L) && !list.isEmpty()) {
            List list2 = 2eV.A00(r03).AZk(36319553420081308L) ? list : C0ty.A00;
            String quantityString = 4YU.A0E(r302).getQuantityString(2131820725, list.size(), 0yN.A00(new String[]{String.valueOf(list.size())}[0]));
            if (quantityString == null) {
                quantityString = "";
            }
            Spanned fromHtml = Html.fromHtml(quantityString);
            11T.A0A(fromHtml);
            cqy.A0L(new 56Q(migColorScheme, fromHtml, list2));
            cqy.A09();
        }
        int i = 9GF.A00;
        int i2 = 9GF.A01;
        LightColorScheme.A00();
        Context A0A = 7zL.A0A(r302);
        C00i A0R = AbF.A0R(bgT.A00);
        int i3 = 2131952290;
        if (z) {
            i3 = 2131952292;
        }
        String A13 = AbK.A13(A0A, A0A.getString(2131959933), i3);
        1Bn.A0A(67680);
        String A0u = 1BK.A0u(A0A, 2131958579);
        EC2 A00 = CFx.A00(A0A, onClickListener, migColorScheme, A0u, "Link");
        0Dc A0F = 7zS.A0F(A0A, A13);
        String A002 = 7zK.A00(77);
        SpannableString A0B = 7zS.A0B(A0F, A00, A002, A0u);
        2KE r04 = 2KE.A04;
        C1u7 c1u7 = C1u7.A0A;
        long j = -1;
        cqy.A0L(new C55g(c1u7, migColorScheme, r04, A0B, i, i2, i2, j, A1W));
        LightColorScheme.A00();
        A0R.get();
        int i4 = 2131952291;
        if (z) {
            i4 = 2131952293;
        }
        String A132 = AbK.A13(A0A, A0A.getString(2131959933), i4);
        1Bn.A0A(67680);
        String A0u2 = 1BK.A0u(A0A, 2131958579);
        cqy.A0L(new C55g(c1u7, migColorScheme, r04, 7zS.A0B(7zS.A0F(A0A, A132), CFx.A00(A0A, onClickListener, migColorScheme, A0u2, "Link"), A002, A0u2), i, i2, i2, j, A1W));
        if (z && c9fj != null) {
            ImmutableList immutableList = c9fj.A00;
            if (!immutableList.isEmpty() && 2eV.A00(r03).AZk(36319553420343454L)) {
                cqy.A0P(r302.A0D(2131952280));
                cqy.A09();
                cqy.A0M(r0.A00(A0A, fbUserSession, c9fj, migColorScheme, 10, A1W));
                int size = immutableList.size() - 10;
                if (size > 0) {
                    cqy.A0N(4YV.A0o(A0A.getResources(), size, 2131820724));
                }
            }
        }
        return CQY.A00(cqy);
    }
}
