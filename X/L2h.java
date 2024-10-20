package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* loaded from: L2h.class */
public final class L2h {
    public View A00;
    public Fik A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final LDF A08;
    public final HAY A09;
    public final HAY A0A;
    public final 1Br A0B;
    public final String A0C;
    public final String A0D;
    public final java.util.Map A0E;
    public final boolean A0F;
    public final Intent A0G;
    public final String A0H;

    public L2h(Context context, Intent intent, LDF ldf, HAY hay, HAY hay2, String str, String str2, int i, boolean z) {
        11T.A0F(context, 1);
        this.A0H = str;
        this.A08 = ldf;
        this.A06 = i;
        this.A0D = str2;
        this.A0A = hay;
        this.A09 = hay2;
        this.A0F = z;
        this.A0G = intent;
        this.A01 = A00(context, hay);
        this.A07 = (int) ((-1.0f) * context.getResources().getDimension(2132279332));
        1Br A00 = 1HG.A00(context, 82045);
        this.A0B = A00;
        1Br.A0C(A00);
        this.A0E = L0h.A00(intent);
        this.A0C = "tabs";
    }

    private final Fik A00(Context context, HAY hay) {
        int i;
        String A0u;
        RbC rbC = new RbC(context);
        rbC.A02();
        rbC.A04(QqV.A02);
        rbC.A06(0S2.A0N);
        switch (hay.ordinal()) {
            case 0:
                i = 2131951995;
                A0u = 1BK.A0u(context, i);
                break;
            case 1:
                i = 2131952000;
                A0u = 1BK.A0u(context, i);
                break;
            case 2:
                i = 2131951999;
                A0u = 1BK.A0u(context, i);
                break;
            case 3:
                i = 2131952001;
                A0u = 1BK.A0u(context, i);
                break;
            case 4:
                i = 2131951997;
                A0u = 1BK.A0u(context, i);
                break;
            case 5:
                i = 2131951998;
                A0u = 1BK.A0u(context, i);
                break;
            default:
                A0u = "";
                break;
        }
        rbC.A05(A0u);
        String string = context.getString(2131951996);
        RP5 rp5 = rbC.A00;
        rp5.A06 = string;
        rp5.A01 = new LuX(this);
        return rbC.A01(CallerContext.A0B(this.A0H));
    }

    public final boolean A01(View view) {
        C00i c00i;
        Object obj;
        String str;
        this.A00 = view;
        if (!this.A03) {
            c00i = this.A0B.A00;
            c00i.get();
            11T.A0F(this.A0C, 1);
            if (this.A0A != HAY.A03) {
                L7U A02 = LEJ.A02(LEJ.A00());
                long Av1 = 1Br.A09(A02.A00).Av1(L7U.A01(A02, "last_time_tooltip_was_shown_in_millis"), 0L);
                L7U A022 = LEJ.A02(LEJ.A00());
                long Av12 = 1Br.A09(A022.A00).Av1(L7U.A01(A022, "last_time_filter_tooltip_was_shown_in_millis"), 0L);
                L7U A023 = LEJ.A02(LEJ.A00());
                int ArU = 1Br.A09(A023.A00).ArU(L7U.A01(A023, "times_tooltip_has_been_shown"), 0);
                L7U A024 = LEJ.A02(LEJ.A00());
                boolean AZn = 1Br.A09(A024.A00).AZn(L7U.A01(A024, GOm.A00(255)), false);
                int i = this.A06;
                boolean z = this.A0F;
                long currentTimeMillis = System.currentTimeMillis();
                if (!z || Qyf.A00(2yD.A02(L7u.A00(), 36885638700336721L)) != 0S2.A01) {
                    boolean z2 = !AZn;
                    long j = currentTimeMillis - Av12;
                    long Auy = L7u.A00().Auy(36604163725138430L);
                    if (Auy <= 0) {
                        Auy = 259200000;
                    }
                    boolean A1P = AnonymousClass001.A1P((j > Auy ? 1 : (j == Auy ? 0 : -1)));
                    long j2 = currentTimeMillis - Av1;
                    long Auy2 = L7u.A00().Auy(36604163723827709L);
                    if (Auy2 <= 0) {
                        Auy2 = 1209600000;
                    }
                    boolean A1P2 = AnonymousClass001.A1P((j2 > Auy2 ? 1 : (j2 == Auy2 ? 0 : -1)));
                    long j3 = ArU;
                    long Auy3 = L7u.A00().Auy(36604163723696635L);
                    if (Auy3 <= 0) {
                        Auy3 = 3;
                    }
                    boolean A1U = DKD.A1U((j3 > Auy3 ? 1 : (j3 == Auy3 ? 0 : -1)));
                    long j4 = i;
                    long Auy4 = L7u.A00().Auy(36604163723762172L);
                    if (Auy4 <= 0) {
                        Auy4 = 2;
                    }
                    boolean A1S = 1BL.A1S((j4 > Auy4 ? 1 : (j4 == Auy4 ? 0 : -1)));
                    if (z2 && A1P && A1P2 && A1U && A1S) {
                        this.A01.A02(view, 0, this.A07);
                        this.A03 = true;
                        L7U A025 = LEJ.A02(LEJ.A00());
                        1Br r0 = A025.A00;
                        1Ql edit = 1Br.A09(r0).edit();
                        edit.CaE(L7U.A01(A025, "times_tooltip_has_been_shown"), 1Br.A09(r0).ArU(L7U.A01(A025, "times_tooltip_has_been_shown"), 0) + 1);
                        edit.commit();
                        1Ql edit2 = 1Br.A09(r0).edit();
                        edit2.CaH(L7U.A01(A025, "last_time_tooltip_was_shown_in_millis"), System.currentTimeMillis());
                        edit2.commit();
                        obj = "ACTION_TABS_TOOLTIP_SHOWN";
                        str = "CALL_EXTENSION_TAB_TOOLTIP_SHOWN";
                        this.A08.A0A(1BK.A05(), ZonePolicy.A03, str, 4YW.A0A("iaw_session_id", this.A0D, 1BK.A1G("action", obj)));
                        c00i.get();
                        return true;
                    }
                }
            }
        }
        if (this.A02) {
            if (this.A05 && !this.A04) {
                return false;
            }
            this.A01.A02(view, 0, this.A07);
            this.A04 = false;
            this.A05 = false;
            return true;
        }
        c00i = this.A0B.A00;
        c00i.get();
        11T.A0F(this.A0C, 1);
        L7U A026 = LEJ.A02(LEJ.A00());
        long Av13 = 1Br.A09(A026.A00).Av1(L7U.A01(A026, "last_time_tooltip_was_shown_in_millis"), 0L);
        L7U A027 = LEJ.A02(LEJ.A00());
        long Av14 = 1Br.A09(A027.A00).Av1(L7U.A01(A027, "last_time_filter_tooltip_was_shown_in_millis"), 0L);
        int A0B = LEJ.A00().A0B();
        HAY hay = this.A09;
        if (!HGT.A00(hay, A0B, Av13, Av14, System.currentTimeMillis(), this.A0F)) {
            return false;
        }
        Fik A00 = A00(4YU.A08(view), hay);
        this.A01 = A00;
        A00.A02(view, 0, this.A07);
        this.A02 = true;
        LEJ.A00().A0F();
        obj = "ACTION_TABS_ICON_SHOPPING_TOOLTIP_SHOWN";
        str = "CALL_EXTENSION_TABS_ICON_SHOPPING_TOOLTIP_SHOWN";
        this.A08.A0A(1BK.A05(), ZonePolicy.A03, str, 4YW.A0A("iaw_session_id", this.A0D, 1BK.A1G("action", obj)));
        c00i.get();
        return true;
    }
}
