package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Dxa.class */
public final class Dxa extends C1rj {
    public InboxAdsData A00;
    public Ezq A01;
    public Evu A02;
    public InboxAdsPostclickRenderState A03;
    public MigColorScheme A04;

    public Dxa() {
        super("InboxAdsPostclickComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A04, this.A00, this.A03, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        InboxAdsData inboxAdsData = this.A00;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = this.A03;
        MigColorScheme migColorScheme = this.A04;
        Ezq ezq = this.A01;
        Evu evu = this.A02;
        11T.A0F(r302, 0);
        7zT.A1W(inboxAdsData, inboxAdsPostclickRenderState, migColorScheme, ezq);
        11T.A0F(evu, 5);
        2cM A0f = AbH.A0f(r302, 0);
        Dsb dsb = new Dsb(r302, new 8kK());
        8kK r0 = dsb.A01;
        r0.A00 = inboxAdsData;
        BitSet bitSet = dsb.A02;
        bitSet.set(2);
        r0.A02 = migColorScheme;
        bitSet.set(1);
        r0.A01 = ezq;
        bitSet.set(0);
        dsb.A0S();
        A0f.A2d(dsb);
        DsZ dsZ = new DsZ(r302, new Dy4());
        Dy4 dy4 = dsZ.A01;
        dy4.A00 = inboxAdsData;
        BitSet bitSet2 = dsZ.A02;
        bitSet2.set(2);
        dy4.A03 = inboxAdsPostclickRenderState;
        bitSet2.set(3);
        dy4.A04 = migColorScheme;
        bitSet2.set(1);
        dy4.A01 = ezq;
        bitSet2.set(0);
        dy4.A02 = evu;
        dsZ.A0R();
        A0f.A2d(dsZ);
        Dsa dsa = new Dsa(r302, new DxG());
        DxG dxG = dsa.A01;
        dxG.A00 = inboxAdsData;
        BitSet bitSet3 = dsa.A02;
        bitSet3.set(2);
        dxG.A03 = inboxAdsPostclickRenderState;
        bitSet3.set(3);
        dxG.A04 = migColorScheme;
        bitSet3.set(1);
        dxG.A01 = ezq;
        bitSet3.set(0);
        dxG.A02 = evu;
        dsa.A0S();
        A0f.A2d(dsa);
        7zM.A1O(A0f, migColorScheme);
        A0f.A2K("inbox_ad_postclick");
        7zM.A1N(A0f, r302, Dxa.class, "InboxAdsPostclickComponent", new Object[]{C5ba.A0P});
        A0f.A1r(1LI.A03(r302, Dxa.class, "InboxAdsPostclickComponent"));
        A0f.A0R();
        return A0f.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = this.A03;
        11T.A0F(inboxAdsPostclickRenderState, 1);
        A00.A03(InboxAdsPostclickRenderState.class, inboxAdsPostclickRenderState);
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1351902487:
                1Is r0 = r302.A00.A01;
                C5ba c5ba = (C5ba) r302.A03[0];
                Ezq ezq = ((Dxa) r0).A01;
                11T.A0F(ezq, 1);
                ezq.A03(c5ba, 0);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 226368390:
                Ezq ezq2 = ((Dxa) r302.A00.A01).A01;
                11T.A0F(ezq2, 1);
                ezq2.A02();
                return null;
            case 466811311:
                F5R f5r = (F5R) obj;
                View view = f5r.A00;
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
                0Cs r02 = f5r.A01;
                1BL.A1H(view, accessibilityNodeInfoCompat, r02);
                r02.A0a(view, accessibilityNodeInfoCompat);
                DKG.A1K(accessibilityNodeInfoCompat);
                return null;
            case 1252938159:
                Ezq ezq3 = ((Dxa) r302.A00.A01).A01;
                11T.A0F(ezq3, 1);
                ezq3.A00();
                return null;
            default:
                return null;
        }
    }
}
