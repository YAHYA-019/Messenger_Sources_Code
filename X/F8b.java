package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: F8b.class */
public final class F8b {
    public 1BY A00;
    public final 1vL A01;
    public final C00i A02;
    public final C00i A03;
    public final Eux A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C3t8 A0D;

    public F8b(1BO r302) {
        1BV A0Z = DKE.A0Z();
        this.A08 = A0Z;
        this.A02 = AbH.A0L();
        this.A01 = (1vL) 1Bi.A03(99939);
        this.A0C = 1BV.A01((1BY) null, 32811);
        this.A06 = AbH.A0S();
        this.A03 = DKD.A0O();
        this.A09 = 1BQ.A00();
        this.A0B = 1BQ.A02(16964);
        this.A07 = 1BQ.A02(49257);
        this.A05 = 1BQ.A01();
        this.A0A = 1BV.A01((1BY) null, 98457);
        this.A0D = (C3t8) 1Bi.A03(32817);
        this.A00 = 7zL.A0Q(r302);
        this.A04 = (Eux) 1Hv.A02((Context) A0Z.get(), 99540);
    }

    public static C03713yu A00(F8b f8b, Boolean bool, Boolean bool2, String str, String str2, String str3, boolean z) {
        String A3a = 1BK.A0R(f8b.A06).A3a(DKC.A0b(((1Ky) 1Bn.A0E((Context) null, f8b.A00, 98565)).A0M), "unknown");
        C30G A0H = AbF.A0H(ActionId.MESSENGER_THREAD_LIST_LOADED);
        A0H.A08("is_in_free_mode", bool.booleanValue());
        DKC.A1S(f8b.A0D.A00(), A0H, "nt_context");
        A0H.A03("encrypted_subno", str);
        A0H.A03("entry_point", str2);
        C00i c00i = f8b.A0C;
        A0H.A03(TraceFieldType.NetworkType, DKE.A0s(c00i));
        A0H.A03("zbd_state", A3a);
        A0H.A08("is_hping_done", bool2.booleanValue());
        A0H.A03("promo", str3);
        A0H.A08("notification_acked", z);
        C00i c00i2 = f8b.A03;
        if (AbM.A0n(c00i2).A0H() || (DKE.A0s(c00i).equals("wifi") && AbM.A0n(c00i2).A05() > 0 && 1BK.A0N(f8b.A09).AZk(36316413799376848L))) {
            A0H.A06(4YT.A00(923), AbM.A0n(c00i2).A05());
        }
        C3sa A0L = AbK.A0L(A0H);
        A0L.A0B = false;
        1Vd A0J = AbK.A0J(f8b.A08);
        4YU.A1J(A0L, 453586272481763L);
        return A0J.A04(A0L);
    }

    public void A01(Context context, GIs gIs, String str, String str2, boolean z) {
        String str3;
        FbUserSession A0D = 4YV.A0D(context);
        ETV A08 = AbM.A0n(this.A03).A08(A0D, "upsell_carrier_page");
        if (A08 == null) {
            C00i c00i = this.A0B;
            if (4YU.A0d(c00i).A04("enable_logged_in_headers") && 4YU.A0d(c00i).A04("carrier_page_upsell") && 1BK.A0N(((C08554nH) this.A07.get()).A01).AZk(36322572782028448L)) {
                C01s A09 = 1BK.A09(this.A05);
                DMV abstractC2124Ded = new AbstractC2124Ded(context);
                ((EAV) abstractC2124Ded).A02 = 7zL.A14((Object) null);
                ((EAV) abstractC2124Ded).A01 = null;
                ((EAV) abstractC2124Ded).A00 = A09;
                abstractC2124Ded.setCancelable(false);
                abstractC2124Ded.show();
                ((ExH) this.A0A.get()).A00(A0D, new FuX(context, A0D, abstractC2124Ded, gIs, this, str, str2, z), 4YT.A00(924));
                return;
            }
        }
        str3 = "";
        String str4 = A08 != null ? A08.A02 : str3;
        1Kd.A0D(this.A02, new Fw5(1, context, gIs, this, z), A00(this, Boolean.valueOf(this.A01.A0S()), 1BK.A0d(), str4 != null ? str4 : "", str, str2, z));
        gIs.C4G();
    }
}
