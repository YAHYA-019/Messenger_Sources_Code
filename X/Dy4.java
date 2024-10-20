package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Dy4.class */
public final class Dy4 extends C1rj {
    public InboxAdsData A00;
    public Ezq A01;
    public Evu A02;
    public InboxAdsPostclickRenderState A03;
    public MigColorScheme A04;

    public Dy4() {
        super("InboxAdsPostclickVerticalView");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A04, this.A00, this.A03, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Dzt dzt = (Dzt) 4YU.A0P(r302);
        InboxAdsData inboxAdsData = this.A00;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = this.A03;
        MigColorScheme migColorScheme = this.A04;
        Ezq ezq = this.A01;
        Evu evu = this.A02;
        boolean z = dzt.A00;
        FbUserSession A0C = 4YV.A0C(r302.A0D);
        if (inboxAdsPostclickRenderState.A06) {
            C2ki A00 = C2kV.A00(new C1qb(r302));
            7zL.A1K(r302);
            E0n e0n = new E0n();
            e0n.A00 = A0C;
            e0n.A01 = inboxAdsData;
            e0n.A04 = inboxAdsPostclickRenderState;
            e0n.A06 = z;
            e0n.A02 = ezq;
            e0n.A03 = evu;
            e0n.A05 = migColorScheme;
            C2kV c2kV = A00.A01;
            c2kV.A0L = e0n;
            A00.A02.set(0);
            A00.A2Z(new DSy(r302, evu, z));
            c2kV.A0d = false;
            7zM.A1O(A00, migColorScheme);
            A00.A2j(true);
            return A00.A2W();
        }
        boolean A1W = 4YV.A1W(inboxAdsPostclickRenderState.A01, 1);
        Dud A01 = Dzc.A01(r302);
        A01.A2g(true);
        A01.A2X();
        A01.A2h(true);
        A01.A2Y(3.0f);
        A01.A2f(false);
        A01.A01.A06 = A1W;
        A01.A2e(true);
        A01.A1H(migColorScheme.Atp());
        2cM A0f = AbH.A0f(r302, 0);
        DsY dsY = new DsY(r302, new Dyq());
        Dyq dyq = dsY.A01;
        dyq.A00 = A0C;
        BitSet bitSet = dsY.A02;
        bitSet.set(3);
        dyq.A01 = inboxAdsData;
        bitSet.set(2);
        dyq.A04 = inboxAdsPostclickRenderState;
        bitSet.set(4);
        dyq.A02 = ezq;
        bitSet.set(0);
        dyq.A05 = migColorScheme;
        bitSet.set(1);
        dyq.A06 = z;
        dyq.A03 = evu;
        dsY.A2K("inbox_ad_postclick_content");
        7zM.A1N(dsY, r302, Dy4.class, "InboxAdsPostclickVerticalView", new Object[]{C5ba.A0P});
        dsY.A1r(1LI.A03(r302, Dy4.class, "InboxAdsPostclickVerticalView"));
        dsY.A1A(16.0f);
        A0f.A2d(dsY);
        A0f.A0R();
        7zM.A1O(A0f, migColorScheme);
        A01.A2b(A0f);
        return A01.A2V();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1351902487) {
            1Is r0 = r302.A00.A01;
            ((Dy4) r0).A01.A03((C5ba) r302.A03[0], 0);
            return null;
        }
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 466811311) {
            return null;
        }
        F5R f5r = (F5R) obj;
        View view = f5r.A00;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
        f5r.A01.A0a(view, accessibilityNodeInfoCompat);
        DKG.A1K(accessibilityNodeInfoCompat);
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((Dzt) r303).A00 = false;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
