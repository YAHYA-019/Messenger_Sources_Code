package X;

import com.facebook.auth.viewercontext.ViewerContext;
import java.util.LinkedHashMap;

/* renamed from: X.3RD, reason: invalid class name */
/* loaded from: 3RD.class */
public final class C3RD {
    public final 1De A00;
    public final 1Br A01 = 1BK.A0D();
    public final C01i A02 = C01g.A01(new AKO(this, 31));
    public final 1Br A03;

    public C3RD(1De r302) {
        this.A00 = r302;
        this.A03 = 1Bu.A03(r302.A00, 33059);
    }

    public static final ViewerContext A00(C3RD c3rd) {
        return (ViewerContext) 1Br.A0B(c3rd.A03);
    }

    public final void A01(Integer num, Integer num2) {
        1UG A08;
        int i;
        int intValue = num.intValue();
        if (intValue == 1) {
            A08 = 1BK.A08(1Br.A02(this.A01), "biim_ad_creation_qp_cta_click");
            i = 14;
        } else if (intValue == 4) {
            Integer num3 = 0S2.A00;
            04J A02 = 1Br.A02(this.A01);
            if (num2 == num3) {
                A08 = 1BK.A08(A02, "biim_ad_creation_click_submenu_create_ad");
                i = 12;
            } else {
                A08 = 1BK.A08(A02, "biim_ad_creation_click_submenu_manage_ad");
                i = 13;
            }
        } else {
            if (intValue != 2) {
                return;
            }
            A08 = 1BK.A08(1Br.A02(this.A01), "biim_ad_creation_click_interstitial_cta");
            i = 11;
        }
        2R2 r0 = new 2R2(A08, i);
        if (A00(this) == null || !((0D7) r0).A00.isSampled()) {
            return;
        }
        r0.A0D("page_id", 1BK.A0n((String) this.A02.getValue()));
        String str = A00(this).mUserId;
        11T.A0A(str);
        r0.A0D("admin_id", 1BK.A0n(str));
        r0.BZL();
    }

    public final void A02(String str) {
        LinkedHashMap A1C = 1BK.A1C();
        A1C.put("destination", str);
        1UG A08 = 1BK.A08(1Br.A02(this.A01), "biim_ad_creation_click_persistent_entry_point");
        if (A00(this) == null || !A08.isSampled()) {
            return;
        }
        A08.A6H("page_id", 1BK.A0n((String) this.A02.getValue()));
        String str2 = A00(this).mUserId;
        11T.A0A(str2);
        A08.A6H("admin_id", 1BK.A0n(str2));
        A08.A6J("extra_data", A1C);
        A08.BZL();
    }
}
