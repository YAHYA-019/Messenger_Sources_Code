package X;

import android.content.Context;
import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.LinkedList;

/* renamed from: X.Azo, reason: case insensitive filesystem */
/* loaded from: Azo.class */
public final class C2027Azo extends C1rj {
    public C55e A00;

    public C2027Azo() {
        super("MigSmallListItemLayout");
    }

    public static 8Sv A00(1Iw r301) {
        return new 8Sv(r301, new C2027Azo());
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C55e c55e = this.A00;
        55N A00 = 55M.A00(r302);
        ImmutableList.Builder builder = ImmutableList.builder();
        58B r0 = 58B.A0A;
        LinkedList A1F = AbF.A1F();
        long j = c55e.A00;
        55A r02 = c55e.A01;
        55B r03 = c55e.A02;
        55E r04 = c55e.A03;
        Context context = r302.A0D;
        47Q r05 = 47Q.A02;
        int A03 = 7zL.A03();
        int A01 = r03 == null ? 0 : 7zM.A01();
        MigColorScheme migColorScheme = c55e.A06;
        C2qg c2qg = C2qg.A0C;
        C2qh c2qh = new C2qh();
        c2qh.A02(58F.A00);
        c2qh.A00 = migColorScheme.BDl();
        47Q r06 = new 47Q(new C2qg(c2qh), 32);
        boolean z = c55e.A09;
        Integer num = c55e.A08;
        int i = 2KV.A04.textSizeSp;
        int AkX = z ? num == 0S2.A01 ? migColorScheme.AkX() : migColorScheme.B9Q() : migColorScheme.Ahv();
        2KQ r304 = 2KQ.A04;
        58D r07 = new 58D(r304.A00(context), i, AkX, true, false);
        EL0 el0 = c55e.A05;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int AkX2 = z ? el0 == EL0.A01 ? migColorScheme.AkX() : migColorScheme.B4i() : migColorScheme.Ahv();
        int i2 = 2KV.A07.textSizeSp;
        if (el0 != EL0.A03 && el0 != EL0.A01) {
            r304 = 2KQ.A03;
        }
        58B r08 = new 58B(new 58C(r304.A00(context), alignment, i2, AkX2, 1, true), r07, r06, 56, A03, A03, A01, A01, 16, 0);
        AnonymousClass555 anonymousClass555 = c55e.A04;
        if (anonymousClass555 != null) {
            builder.m11011add((Object) anonymousClass555);
        }
        AnonymousClass544 A002 = 55L.A00(new 55U(r02, r03, r04, r08, 1Fj.A01(builder), (CharSequence) null, j, false), A1F);
        11T.A0A(A002);
        return 7zM.A10(A002, A00);
    }
}
