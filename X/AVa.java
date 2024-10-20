package X;

import android.content.Context;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AVa.class */
public final class AVa extends C00q implements Function2 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVa(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2);
        this.A00 = i2;
        this.A05 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        5vV r314;
        switch (this.A00) {
            case 0:
                7zL.A1P(obj2);
                ((AHs) this.A05).A05((MLv) obj, this.A02, this.A03, this.A04, Kv9.A01(this.A01) | 1);
                return 04S.A00;
            case 1:
                C9sl c9sl = (C9sl) obj;
                AnonymousClass971 anonymousClass971 = (AnonymousClass971) obj2;
                boolean A1X = 1BL.A1X(c9sl, anonymousClass971);
                2lQ r0 = 2lO.A02;
                C2k5 c2k5 = (C2k5) this.A04;
                8ZR r02 = (8ZR) this.A05;
                Function1 A01 = 4FN.A01(c2k5, AV8.A00(c9sl, r02, anonymousClass971, 36));
                Integer num = 0S2.A1G;
                2lO A0h = 7zS.A0h(num, A01, A1X ? 1 : 0);
                boolean z = !r02.A03;
                Integer num2 = 0S2.A0F;
                Boolean valueOf = Boolean.valueOf(z);
                2lO A0L = 4YV.A0L(A0h, num2, valueOf, A1X ? 1 : 0);
                Integer num3 = 0S2.A01;
                2lO A0L2 = 4YV.A0L(A0L, num3, valueOf, A1X ? 1 : 0);
                MigColorScheme migColorScheme = r02.A01;
                int BL8 = migColorScheme.BL8();
                long A0A = 7zO.A0A();
                long A08 = 7zP.A08();
                C1u2 c1u2 = (C1u2) this.A02;
                int i = this.A01;
                C1u7 c1u7 = (C1u7) this.A03;
                1Iw r03 = c9sl.A00;
                8Tk A00 = C8mn.A00(r03);
                A00.A2f(A1X);
                C8mn c8mn = A00.A01;
                c8mn.A03 = BL8;
                c8mn.A00 = 7zN.A03(c9sl, A0A);
                c8mn.A01 = 7zN.A03(c9sl, A08);
                8Tk.A06(A00, c8mn, (-1) << (-1));
                long A0F = 7zP.A0F();
                2lO A0V = 7zS.A0V(4YV.A0K((2lO) null, 0S2.A05, A0F), 7zL.A0i(0S2.A0u, A0F), num, 7zQ.A08());
                C2sn A0U = 7zQ.A0U(r03);
                1Iw r04 = A0U.A00;
                C2cm A002 = C2cl.A00(r04);
                7zS.A1K(A002, 7zT.A0k((2lO) null, 0S2.A00, num3, 7zQ.A0B()), 0S2.A09, 7zQ.A0A());
                7zN.A18(A002, anonymousClass971.iconName, c1u2);
                A002.A2X(i);
                7zO.A19(A002, A0U);
                2KD A0X = 7zN.A0X(r04, migColorScheme, 0);
                7zM.A1X(A0X, A0U, anonymousClass971.stringRes);
                A0X.A2i();
                A0X.A2w(c1u7);
                7zN.A1Q(A0U, A0X);
                A00.A2e(C2so.A0P(A0U, c9sl, A0V));
                C5z7.A00(A00, A0L2);
                return A00.A2W();
            default:
                View view = (View) obj;
                int A03 = AnonymousClass001.A03(obj2);
                11T.A0F(view, 0);
                ImmutableList immutableList = ((7Hd) this.A03).A00;
                int size = (immutableList.size() - A03) - 1;
                if (size >= 0 && size < immutableList.size()) {
                    74E r05 = ((AAf) this.A05).A07;
                    Context A06 = 7zN.A06(this.A02);
                    if (immutableList.size() >= this.A01) {
                        r314 = (5vW) this.A04;
                    } else {
                        Object obj3 = immutableList.get(size);
                        11T.A0A(obj3);
                        r314 = new 5vV((C5fu) obj3, ((5vW) this.A04).A01);
                    }
                    r05.BoE(A06, view, r314);
                }
                return 04S.A00;
        }
    }
}
