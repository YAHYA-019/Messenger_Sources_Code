package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: Fcj.class */
public final class Fcj implements CallerContextable {
    public static final String __redex_internal_original_name = "FxBloksAuthUtils";
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1BP A06;
    public final 1De A07;
    public final 1Br A08 = 1Bq.A00(16617);
    public final 1Br A09 = 7zM.A0V();

    public Fcj(1De r302) {
        this.A07 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 83980);
        this.A06 = FbInjector.A00;
        this.A03 = 1Bu.A03(r0, 65568);
        this.A01 = 1Bq.A00(100265);
        this.A00 = 1Bu.A03(r0, 100269);
        this.A05 = 1BK.A0C();
        this.A04 = 7zM.A0S();
    }

    public static final ArrayList A00(Fcj fcj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C67b A01 = ((F8B) 1Br.A0B(fcj.A02)).A01(67T.A01);
        if (A01 != null && A01.A02 != null) {
            A0s.add(A04("Facebook", "active_account", "Facebook", A01));
        }
        return A0s;
    }

    public static final ArrayList A01(Fcj fcj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C67b A01 = ((F8B) 1Br.A0B(fcj.A02)).A01(67T.A06);
        if (A01 != null && A01.A02 != null) {
            A0s.add(A04("Facebook", "active_account", "Messenger", A01));
        }
        return A0s;
    }

    private final ArrayList A02(String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        List A05 = ((FAY) 1Br.A0B(this.A01)).A05(7zL.A09(), str, AbF.A1E(11T.A03(67T.A0C)));
        11T.A0A(A05);
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            C67b A15 = DKD.A15(it);
            11T.A0A(A15);
            if (A15.A02 != null) {
                A0s.add(A04("FRL", "active_account", "Oculus", A15));
            }
        }
        return A0s;
    }

    private final ArrayList A03(String str) {
        ArrayList A0s;
        if (1Br.A07(this.A05).AZk(36324325128818276L)) {
            7zP.A0e(this.A04).markerAnnotate(444800256, "ig_lite_content_provider", "experiment_enabled");
            A0s = AnonymousClass001.A0s();
            try {
                List list = (List) new FGs().A02(7zL.A09(), str, __redex_internal_original_name, 11T.A04(new EoQ((String) null, 1BK.A1D("resolver_type", "lite_content_provider"), C67Z.INSTAGRAM, EMr.A02))).get();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C67b A15 = DKD.A15(it);
                        11T.A0A(A15);
                        if (A15.A02 != null) {
                            A0s.add(A04("Instagram", "inactive_logged_in_accounts", "Instagram", A15));
                        }
                    }
                }
            } catch (Exception e) {
                0fH.A0r(__redex_internal_original_name, "Lite Provider Fetch IG Saved Accounts Failed", e);
            }
        } else {
            A0s = AnonymousClass001.A0s();
            EpB epB = new EpB();
            epB.A02 = ((82O) 1Br.A0B(this.A03)).A0g();
            FIm fIm = (FIm) 1Br.A0B(this.A00);
            11T.A0F(fIm, 0);
            epB.A03 = fIm;
            Iterator it2 = FHr.A01(7zL.A09(), str, 1BK.A17(11T.A03(67T.A04)), new FHr(epB), false).iterator();
            while (it2.hasNext()) {
                C67b A152 = DKD.A15(it2);
                if (A152 != null && A152.A02 != null) {
                    A0s.add(A04("Instagram", "inactive_logged_in_accounts", "Instagram", A152));
                }
            }
        }
        return A0s;
    }

    public static final HashMap A04(String str, String str2, String str3, C67b c67b) {
        HashMap A0u = AnonymousClass001.A0u();
        String str4 = c67b.A02.A02;
        11T.A0A(str4);
        A0u.put("user_id", str4);
        String str5 = c67b.A00;
        11T.A0A(str5);
        A0u.put("auth_token", str5);
        A0u.put("account_type", str);
        A0u.put("account_source", str2);
        A0u.put("app_source", str3);
        return A0u;
    }

    public static final List A05(Fcj fcj, String str, String str2) {
        if (str.equals("active_account")) {
            return fcj.A07(str2);
        }
        if (str.equals("inactive_logged_in_accounts")) {
            return fcj.A03(str2);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.addAll(fcj.A07(str2));
        A0s.addAll(fcj.A03(str2));
        return A0s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.List] */
    public final Object A06(FHh fHh, DKc dKc, String str) {
        String str2;
        ArrayList A02;
        11T.A0F(str, 2);
        List list = dKc.A00;
        String A0x = DKD.A0x(list, 0);
        str2 = "";
        if (A0x == null) {
            A0x = str2;
        }
        String A0x2 = DKD.A0x(list, 1);
        str2 = A0x2 != null ? A0x2 : "";
        GJj A00 = FGb.A00(dKc, 2);
        ArrayList A0s = AnonymousClass001.A0s();
        int hashCode = A0x.hashCode();
        if (hashCode == 69888) {
            if (A0x.equals("FRL")) {
                A02 = A02(str);
            }
            A0s.addAll(A00(this));
            A0s.addAll(A05(this, str2, str));
            A0s.addAll(A01(this));
            A02 = A02(str);
        } else if (hashCode != 561774310) {
            if (hashCode == 2032871314 && A0x.equals("Instagram")) {
                A02 = A05(this, str2, str);
            }
            A0s.addAll(A00(this));
            A0s.addAll(A05(this, str2, str));
            A0s.addAll(A01(this));
            A02 = A02(str);
        } else {
            if (A0x.equals("Facebook")) {
                A0s.addAll(A00(this));
                A02 = A01(this);
            }
            A0s.addAll(A00(this));
            A0s.addAll(A05(this, str2, str));
            A0s.addAll(A01(this));
            A02 = A02(str);
        }
        A0s.addAll(A02);
        DKM.A0F(fHh, DKM.A00(), A00, A0s, 0);
        return null;
    }

    public final ArrayList A07(String str) {
        ArrayList A0s;
        if (1Br.A07(this.A05).AZk(36324325128818276L)) {
            7zP.A0e(this.A04).markerAnnotate(444800256, "ig_lite_content_provider", "experiment_enabled");
            A0s = AnonymousClass001.A0s();
            try {
                List list = (List) new FGs().A02(7zL.A09(), str, __redex_internal_original_name, 11T.A04(new EoQ((String) null, 1BK.A1D("resolver_type", "lite_content_provider"), C67Z.INSTAGRAM, EMr.A01))).get();
                11T.A0D(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C67b A15 = DKD.A15(it);
                    11T.A0A(A15);
                    if (A15.A02 != null) {
                        A0s.add(A04("Instagram", "active_account", "Instagram", A15));
                    }
                }
            } catch (Exception e) {
                0fH.A0r(__redex_internal_original_name, "Lite Provider Fetch IG Active Accounts Failed", e);
            }
        } else {
            A0s = AnonymousClass001.A0s();
            List A05 = ((FAY) 1Br.A0B(this.A01)).A05(7zL.A09(), str, AbF.A1E(11T.A03(67T.A04)));
            11T.A0A(A05);
            Iterator it2 = A05.iterator();
            while (it2.hasNext()) {
                C67b A152 = DKD.A15(it2);
                11T.A0A(A152);
                if (A152.A02 != null) {
                    A0s.add(A04("Instagram", "active_account", "Instagram", A152));
                }
            }
        }
        return A0s;
    }
}
