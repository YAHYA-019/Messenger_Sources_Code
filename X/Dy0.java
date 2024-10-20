package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dy0.class */
public final class Dy0 extends C1rj {
    public InboxAdsData A00;
    public Ezq A01;
    public MigColorScheme A02;

    public Dy0() {
        super("InboxAdsPostClickTruncatingDescriptionComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Spannable A00;
        E0e e0e = (E0e) 4YU.A0P(r302);
        InboxAdsData inboxAdsData = this.A00;
        MigColorScheme migColorScheme = this.A02;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = (InboxAdsPostclickRenderState) r302.A09(InboxAdsPostclickRenderState.class);
        boolean z = e0e.A01;
        boolean z2 = e0e.A00;
        7zR.A1N(inboxAdsData, inboxAdsPostclickRenderState);
        9aF r0 = (9aF) 1Bn.A0A(98736);
        Context context = r302.A0D;
        if (!z) {
            String str = inboxAdsData.A0G;
            11T.A0D(migColorScheme);
            A00 = r0.A00(migColorScheme, str);
        } else if (z2) {
            String str2 = inboxAdsData.A0G;
            String string = context.getResources().getString(2131960012);
            11T.A0D(migColorScheme);
            A00 = r0.A01(migColorScheme, str2, string);
        } else {
            String str3 = inboxAdsData.A0G;
            String string2 = context.getResources().getString(2131960013);
            11T.A0D(migColorScheme);
            int i = inboxAdsPostclickRenderState.A02;
            int i2 = inboxAdsPostclickRenderState.A03;
            StyleSpan styleSpan = new StyleSpan(1);
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            if (valueOf == null && valueOf2 == null) {
                throw AnonymousClass001.A0N("at least one truncation type needs to be set");
            }
            CharSequence A01 = F2J.A01(styleSpan, new Ejh(valueOf, valueOf2), str3, string2);
            if (A01 == null) {
                A01 = new SpannableStringBuilder(str3);
            }
            A00 = r0.A00(migColorScheme, A01);
        }
        11T.A0D(A00);
        2KD A002 = 2K3.A00(r302);
        A002.A2x(migColorScheme);
        A002.A2z(A00);
        A002.A2S(A00);
        A002.A2b();
        A002.A2l();
        A002.A2Q(true);
        A002.A32(true);
        A002.A2L("InboxAdsPostClickTruncatingDescriptionComponent");
        A002.A0d();
        7zN.A1C(A002, r302, Dy0.class, "InboxAdsPostClickTruncatingDescriptionComponent");
        A002.A1r(1LI.A0C(r302, Dy0.class, "InboxAdsPostClickTruncatingDescriptionComponent", 4YU.A1b(z), 466811311));
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
        int i = r302.A01;
        if (i != -1351902487) {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != 466811311) {
                return null;
            }
            F5R f5r = (F5R) obj;
            boolean A1Z = 7zO.A1Z(r302.A03, 0);
            View view = f5r.A00;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
            0Cs r0 = f5r.A01;
            7zT.A1U(view, accessibilityNodeInfoCompat, r0);
            r0.A0a(view, accessibilityNodeInfoCompat);
            if (!A1Z) {
                DKG.A1K(accessibilityNodeInfoCompat);
                return null;
            }
            accessibilityNodeInfoCompat.A0C(true);
            accessibilityNodeInfoCompat.A05(0Oe.A08);
            return null;
        }
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        Dy0 dy0 = (Dy0) r03;
        E0e e0e = (E0e) 4YU.A0P(r04);
        Ezq ezq = dy0.A01;
        boolean z = e0e.A01;
        boolean z2 = e0e.A00;
        11T.A0F(ezq, 1);
        if (z) {
            if (r04.A02 != null) {
                r04.A0G(7zR.A0N(), "updateState:InboxAdsPostClickTruncatingDescriptionComponent.updateTruncation");
            }
            if (z2) {
                c5ba = C5ba.A08;
            } else {
                ezq.A01();
                c5ba = C5ba.A06;
            }
        } else {
            c5ba = C5ba.A0N;
        }
        ezq.A03(c5ba, 0);
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0e e0e = (E0e) r303;
        InboxAdsData inboxAdsData = this.A00;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = (InboxAdsPostclickRenderState) r302.A09(InboxAdsPostclickRenderState.class);
        1BK.A1K(inboxAdsData, 3, inboxAdsPostclickRenderState);
        1Bn.A0A(98736);
        String str = inboxAdsData.A0G;
        String string = 4YU.A0E(r302).getString(2131960013);
        int i = inboxAdsPostclickRenderState.A02;
        int i2 = inboxAdsPostclickRenderState.A03;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        if (valueOf == null && valueOf2 == null) {
            throw AnonymousClass001.A0N("at least one truncation type needs to be set");
        }
        boolean z = true;
        if (F2J.A00(new Ejh(valueOf, valueOf2), str, 1JF.A0B(string) ^ true ? 7zQ.A05(string) : 0) == -1) {
            z = false;
        }
        if (Boolean.valueOf(z) != null) {
            e0e.A01 = z;
        }
        e0e.A00 = false;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
