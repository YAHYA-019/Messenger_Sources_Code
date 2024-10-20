package X;

import android.graphics.Typeface;
import com.facebook.stickers.model.Sticker;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8i4, reason: invalid class name */
/* loaded from: 8i4.class */
public final class C8i4 extends 1LH {
    public static final long A0E = 7zP.A0A();
    public final int A00;
    public final int A01;
    public final C2l1 A02;
    public final 9cG A03;
    public final 6tM A04;
    public final 79Q A05;
    public final 9MH A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final C00m A0A;
    public final Function2 A0B;
    public final boolean A0C;
    public final boolean A0D;

    public /* synthetic */ C8i4(C2l1 c2l1, 9cG r303, 6tM r304, 79Q r305, 9MH r306, List list, List list2, C00m c00m, Function2 function2, boolean z, boolean z2) {
        7zR.A1N(r305, c2l1);
        1BL.A1G(r304, r306);
        7zR.A1P(c00m, function2);
        7zP.A1Q(list, 12, r303);
        this.A05 = r305;
        this.A0C = z;
        this.A02 = c2l1;
        this.A07 = "generated_suggested_sticker_search_fragment_loader_key";
        this.A04 = r304;
        this.A06 = r306;
        this.A0A = c00m;
        this.A0B = function2;
        this.A00 = -7829368;
        this.A01 = -16776961;
        this.A0D = z2;
        this.A09 = list;
        this.A08 = list2;
        this.A03 = r303;
    }

    public static final C2hl A01(C2k5 c2k5, Sticker sticker, C8i4 c8i4, int i) {
        double d;
        C2hj A0m = 7zL.A0m();
        1Iw r0 = c2k5.A05;
        8Tc r02 = new 8Tc(r0, new C8o4());
        r02.A2X(i);
        r02.A01.A07 = sticker;
        r02.A02.set(1);
        r02.A0E(sticker);
        C8o4 c8o4 = r02.A01;
        c8o4.A0C = true;
        2lQ r03 = 2lO.A02;
        if (c8i4.A0D) {
            C1qo c1qo = c2k5.AeS().A0E;
            11T.A0A(c1qo);
            d = c1qo.A00(9Ea.A00(r0, 20, 16, 2, 2));
        } else {
            d = 140.0d;
        }
        7zS.A1L(r02, 4YV.A0L(7zR.A0R(7zS.A0g(0S2.A01, Double.doubleToRawLongBits(d)), AV5.A00(c8i4, sticker, 20), 1), 0S2.A03, new ARC(i, 11, c8i4, sticker), 1), 0S2.A0Y, new ARC(i, 12, c8i4, sticker));
        r02.A1C(0.0f);
        r02.A1B(0.0f);
        c8o4.A09 = 96J.A0E;
        return 7zM.A0t(r02.A2W(), A0m);
    }

    public 1LI A0s(C2k5 c2k5) {
        C8ej c8ej;
        int i;
        2lO A0b;
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0k(0S2.A01, 1.0f));
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        if (this.A0D) {
            9cG r0 = this.A03;
            C2lu A0w = 7zL.A0w(7zP.A0A());
            long A08 = 7zP.A08();
            2NI r02 = C8nc.A0O;
            1Iw r03 = A0U.A00;
            C02A c02a = r03.A03.A01;
            C1J8 c1j8 = c02a.A02;
            boolean z = c02a.A0X;
            C9sm c9sm = new C9sm(r03);
            C9sm.A01(c9sm, 0QD.A0i(this.A09), AUM.A00, null, new AW6(c2k5, this, 34));
            c8ej = new C8ej(r02, null, null, null, null, new C8qt(r03, c1j8, (-1) << (-1), 7zN.A03(A0U, A08), 2, z), c9sm.A01, r0, null, A0w, null, null, null, null, null, null, null, null, null, null, null, null, null, true);
        } else {
            long A0A = 7zP.A0A();
            2lO A0K = 4YV.A0K(4YV.A0K(7zT.A0R((2lO) null, 7zO.A0A(), 7zQ.A08()), 0S2.A02, A0A), 0S2.A03, A0A);
            1Iw r04 = A0U.A00;
            C2sn A0U2 = 7zQ.A0U(r04);
            String A09 = 3yH.A09(A0U2, 2131957242);
            long A0G = 7zP.A0G();
            if (this.A0C) {
                i = this.A00;
                A0b = null;
            } else {
                i = this.A01;
                A0b = 7zS.A0b((2lO) null, 0S2.A1G, AV0.A00(this, 23));
            }
            Typeface typeface = Typeface.DEFAULT;
            long A082 = 7zP.A08();
            3yF A0W = 7zP.A0W(A0U2, A09, A1W ? 1 : 0);
            7zS.A1Q(A0U2, A0W, i, A0G);
            A0W.A33(1);
            A0W.A34(typeface);
            7zU.A1H(A0U2, A0W, A1W ? 1 : 0, A082);
            7zU.A1L(A0W, A1W);
            A0W.A2i(0.0f);
            7zO.A1R(A0W, true, A1W);
            A0W.A1w(null);
            7zS.A1B((2K8) null, A0U2, A0b, A0W);
            A0U.A00(C2so.A0L(A0U2, A0U, A0K));
            8TW r05 = new 8TW(r04, new 8nY());
            79P r06 = this.A05;
            r05.A2Z(r06);
            r05.A2a((Object) null);
            r05.A2b(this.A07);
            r05.A2X(2132279531);
            8nY r07 = r05.A01;
            r07.A01 = 2132279325;
            r07.A0B = 7zL.A0a(7zL.A19(this, 34));
            r07.A0A = 7zL.A0a(7zL.A19(this, 35));
            r05.A2Y(7zL.A0a(AV5.A00(this, c2k5, 19)));
            6tM r08 = this.A04;
            int A00 = r08.A00(0S2.A0C);
            int A002 = r08.A00(0S2.A0P);
            11T.A0I(r06, "null cannot be cast to non-null type com.facebook.xapp.messaging.sticker.search.msys.MsysStickerSearchLoader");
            r07.A08 = new 8bV(A00, A002, 2, 2, r06.A05.size() / 2).A0l();
            r07.A07 = new QFb(r08).A0l();
            r07.A06 = new QFb(r08).A0l();
            3wU r09 = new 3wU();
            r09.A01 = 2;
            r09.A02 = 1;
            r09.A0A = A1W;
            r07.A0G = r09.A00();
            r07.A04 = new Q2l();
            r05.A1C(0.0f);
            r07.A0O = true;
            r07.A0M = true;
            r07.A0P = true;
            r07.A0F = this.A02;
            c8ej = r05.A2W();
        }
        return 7zM.A0l(c8ej, A0U, c2k5, A0g);
    }
}
