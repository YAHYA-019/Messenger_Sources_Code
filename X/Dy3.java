package X;

import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dy3.class */
public final class Dy3 extends C1rj {
    public InboxAdsData A00;
    public Ezq A01;
    public Evu A02;
    public MigColorScheme A03;
    public boolean A04;

    public Dy3() {
        super("InboxAdsWelcomeMessageComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A03, this.A00, this.A02, Boolean.valueOf(this.A04)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Spannable A00;
        E0d e0d = (E0d) 4YU.A0P(r302);
        InboxAdsData inboxAdsData = this.A00;
        MigColorScheme migColorScheme = this.A03;
        boolean z = e0d.A01;
        boolean z2 = e0d.A00;
        9aF r0 = (9aF) 1Bn.A0A(98736);
        String str = inboxAdsData.A0J;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            Resources A0E = 4YU.A0E(r302);
            if (z2) {
                A00 = r0.A01(migColorScheme, str, A0E.getString(2131960012));
            } else {
                CharSequence A01 = F2J.A01(new StyleSpan(1), new Ejh(Integer.valueOf(ActionId.MESSENGER_THREAD_LIST_LOADED), 3), str, A0E.getString(2131960013));
                if (A01 == null) {
                    A01 = new SpannableStringBuilder(str);
                }
                A00 = r0.A00(migColorScheme, A01);
            }
        } else {
            A00 = r0.A00(migColorScheme, str);
        }
        2KD A002 = 2K3.A00(r302);
        A002.A2x(migColorScheme);
        A002.A2z(A00);
        A002.A2S(A00);
        A002.A2b();
        A002.A2l();
        A002.A2Q(true);
        A002.A32(true);
        A002.A2L("InboxAdsWelcomeMessageComponent");
        A002.A0d();
        7zN.A1C(A002, r302, Dy3.class, "InboxAdsWelcomeMessageComponent");
        A002.A1u(1LI.A09(r302, Dy3.class, "InboxAdsWelcomeMessageComponent", -1823397085));
        A002.A1r(1LI.A0C(r302, Dy3.class, "InboxAdsWelcomeMessageComponent", 4YU.A1b(z), 466811311));
        A002.A0X();
        A002.A19(12.0f);
        return A002.A2W();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C5ba c5ba;
        switch (r302.A01) {
            case -1823397085:
                1Is r0 = r302.A00.A01;
                float f = ((2lD) obj).A00;
                Dy3 dy3 = (Dy3) r0;
                boolean z = dy3.A04;
                Evu evu = dy3.A02;
                if (f < 100.0f || evu == null) {
                    return null;
                }
                String obj2 = C5ba.A0S.toString();
                if (!z) {
                    evu.A00(obj2);
                }
                evu.A01(obj2);
                return null;
            case -1351902487:
                1Iv r02 = r302.A00;
                1Is r03 = r02.A01;
                1Iw r04 = r02.A00;
                Dy3 dy32 = (Dy3) r03;
                E0d e0d = (E0d) 4YU.A0P(r04);
                Ezq ezq = dy32.A01;
                boolean z2 = e0d.A01;
                boolean z3 = e0d.A00;
                if (z2) {
                    if (r04.A02 != null) {
                        r04.A0G(7zR.A0N(), "updateState:InboxAdsWelcomeMessageComponent.updateTruncation");
                    }
                    if (z3) {
                        c5ba = C5ba.A09;
                    } else {
                        ezq.A01();
                        c5ba = C5ba.A07;
                    }
                } else {
                    c5ba = C5ba.A0S;
                }
                ezq.A03(c5ba, 0);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 466811311:
                F5R f5r = (F5R) obj;
                boolean A1Z = 7zO.A1Z(r302.A03, 0);
                View view = f5r.A00;
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
                f5r.A01.A0a(view, accessibilityNodeInfoCompat);
                if (!A1Z) {
                    DKG.A1K(accessibilityNodeInfoCompat);
                    return null;
                }
                accessibilityNodeInfoCompat.A0C(true);
                accessibilityNodeInfoCompat.A05(0Oe.A08);
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b0, code lost:
    
        if (X.1Br.A07(r0.A00).AZl(36310783111791755L, false) == false) goto L12;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1N(X.1Iw r302, X.2Yv r303) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dy3.A1N(X.1Iw, X.2Yv):void");
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
