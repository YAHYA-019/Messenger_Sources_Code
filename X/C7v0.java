package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.litho.LithoView;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import java.util.List;

/* renamed from: X.7v0, reason: invalid class name */
/* loaded from: 7v0.class */
public final class C7v0 implements 2Pu {
    public final int A00;
    public final Object A01;

    public C7v0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bku() {
        if (this.A00 != 0) {
            2Pu r0 = ((6IW) this.A01).A01;
            if (r0 != null) {
                r0.Bku();
                return;
            }
            return;
        }
        6F2 r02 = (6F2) this.A01;
        6F2.A0r(r02, true);
        6Hs r03 = r02.A0r.A01;
        if (6Hs.A07(r03)) {
            6Hs.A02(r03);
            6Jk A00 = 6Hs.A00(r03);
            if (A00 == null || !A00.A1V()) {
                return;
            }
            A00.A0H = true;
            if (A00.A0I) {
                6Jk.A03(A00);
            }
        }
    }

    public void Bkv(View view, Class cls) {
        LithoView lithoView;
        QuickPromotionDefinition quickPromotionDefinition;
        List list;
        if (this.A00 == 0) {
            6F2 r0 = (6F2) this.A01;
            6F2.A0r(r0, true);
            6Hs r02 = r0.A0r.A01;
            if (6Hs.A07(r02)) {
                6Hs.A01(r02);
                6Jk A00 = 6Hs.A00(r02);
                if (A00 == null || !A00.A1V()) {
                    return;
                }
                A00.A0H = false;
                if (A00.A0I) {
                    6Jk.A03(A00);
                    return;
                }
                return;
            }
            return;
        }
        if (cls != 6JU.class) {
            6IW r03 = (6IW) this.A01;
            Integer num = 0S2.A0C;
            InterstitialTrigger interstitialTrigger = 2bG.A0F;
            if (((2PP) r03.A0B.get()).A07.A03() != null) {
                6IW.A02(r03);
            } else {
                7KO r04 = (7KO) r03.A0J.get();
                FbUserSession fbUserSession = r03.A09;
                C00i c00i = r03.A0C;
                InterstitialTriggerContext A002 = r04.A00((Context) c00i.get(), fbUserSession, r03.A02, r03.A03, r03.A04, (java.util.Map) null);
                r03.A02 = A002;
                InterstitialTrigger interstitialTrigger2 = new InterstitialTrigger(interstitialTrigger, A002);
                QuickPromotionDefinition A003 = ((6Np) r03.A0G.get()).A00(1BK.A04(c00i), interstitialTrigger2);
                if (A003 != null) {
                    ((1FP) r03.A0A.get()).D3D(3Ds.A02, 0S2.A00, new G58(interstitialTrigger2, r03, A003, num), "maybeShowQuickPromotionBanner");
                    return;
                }
                C00i c00i2 = r03.A0D;
                if (c00i2.get() != null && (lithoView = ((6JN) c00i2.get()).A02) != null && lithoView.getVisibility() == 0 && (quickPromotionDefinition = ((6JN) c00i2.get()).A06) != null && (list = quickPromotionDefinition.triggers) != null && 0QD.A0k(list, interstitialTrigger)) {
                    ((6JN) c00i2.get()).A00();
                }
            }
            2Pu r05 = r03.A01;
            if (r05 != null) {
                r05.Bkv(view, cls);
            }
        }
    }
}
