package X;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.common.InboxAdsMediaInfo;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Dyq.class */
public final class Dyq extends C1rj {
    public static final C2ke A07;
    public FbUserSession A00;
    public InboxAdsData A01;
    public Ezq A02;
    public Evu A03;
    public InboxAdsPostclickRenderState A04;
    public MigColorScheme A05;
    public boolean A06;

    static {
        2kW r0 = new 2kW();
        r0.A01 = 0;
        r0.A02 = (-1) >>> 1;
        2kY r02 = new 2kY();
        2XM r03 = new 2XM(2XL.A0E);
        r03.A0D = true;
        r02.A00 = r03.A00();
        r0.A07 = r02.A00();
        A07 = r0.A00();
    }

    public Dyq() {
        super("InboxAdsContentComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A05, this.A01, this.A00, this.A04, this.A03, Boolean.valueOf(this.A06)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2dD dsd;
        DsX dsX;
        DsR dsS;
        FbUserSession fbUserSession = this.A00;
        InboxAdsData inboxAdsData = this.A01;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = this.A04;
        MigColorScheme migColorScheme = this.A05;
        Ezq ezq = this.A02;
        boolean z = this.A06;
        Evu evu = this.A03;
        C5bW c5bW = (C5bW) 1Bn.A0A(68128);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        if (c5bW.A01(inboxAdsData)) {
            dsd = C2dB.A00(r302);
            dsd.A2X(7zL.A0Y());
        } else {
            dsd = new Dsd(r302, new 8mZ());
            8mZ r0 = dsd.A01;
            r0.A00 = inboxAdsData;
            BitSet bitSet = dsd.A02;
            bitSet.set(2);
            r0.A03 = migColorScheme;
            bitSet.set(1);
            r0.A04 = z;
            r0.A01 = ezq;
            bitSet.set(0);
            r0.A02 = evu;
            dsd.A18(12.0f);
        }
        dsd.A0j(0.0f);
        A01.A2d(dsd);
        if (TextUtils.isEmpty(inboxAdsData.A0G)) {
            dsX = null;
        } else {
            dsX = new DsX(r302, new Dy0());
            Dy0 dy0 = dsX.A01;
            dy0.A00 = inboxAdsData;
            BitSet bitSet2 = dsX.A02;
            bitSet2.set(2);
            dy0.A02 = migColorScheme;
            bitSet2.set(1);
            dsX.A2K("inbox_ad_postclick_description");
            dy0.A01 = ezq;
            bitSet2.set(0);
            DKE.A1R(dsX, r302, Dyq.class, "InboxAdsContentComponent", new Object[]{C5ba.A0N});
            dsX.A0W();
            dsX.A18(12.0f);
            dsX.A0N();
        }
        A01.A2d(dsX);
        InboxAdsMediaInfo A00 = 4oD.A00(inboxAdsData);
        int i = inboxAdsPostclickRenderState.A01;
        if (i == 1) {
            dsS = new DsS(r302, new Dwu());
            Dwu dwu = ((DsS) dsS).A01;
            dwu.A00 = inboxAdsData;
            BitSet bitSet3 = ((DsS) dsS).A02;
            bitSet3.set(2);
            dwu.A04 = migColorScheme;
            bitSet3.set(1);
            dwu.A01 = ezq;
            bitSet3.set(0);
            dwu.A03 = inboxAdsPostclickRenderState;
            bitSet3.set(3);
            dwu.A05 = z;
            dwu.A02 = evu;
        } else if (i == 2) {
            dsS = new DsU(r302, new Dys());
            Dys dys = ((DsU) dsS).A01;
            dys.A01 = A00;
            BitSet bitSet4 = ((DsU) dsS).A02;
            bitSet4.set(2);
            dys.A05 = migColorScheme;
            bitSet4.set(1);
            dys.A03 = ezq;
            bitSet4.set(0);
            dsS.A0W();
            dys.A06 = z;
            dys.A04 = evu;
        } else if (i != 3) {
            if (i != 4) {
                dsS = new DsR(r302, new DzS());
                DzS dzS = dsS.A01;
                dzS.A01 = A00;
                BitSet bitSet5 = dsS.A02;
                bitSet5.set(2);
                dzS.A06 = migColorScheme;
                bitSet5.set(1);
                dzS.A03 = ezq;
                bitSet5.set(0);
                dzS.A05 = inboxAdsPostclickRenderState;
                bitSet5.set(3);
                dsS.A0W();
                dzS.A07 = z;
                dzS.A04 = evu;
            } else {
                dsS = new DsV(r302, new Dz3());
                Dz3 dz3 = ((DsV) dsS).A01;
                dz3.A00 = fbUserSession;
                BitSet bitSet6 = ((DsV) dsS).A02;
                bitSet6.set(3);
                dz3.A06 = migColorScheme;
                bitSet6.set(1);
                dz3.A01 = inboxAdsData;
                bitSet6.set(2);
                dz3.A03 = ezq;
                bitSet6.set(0);
                dz3.A05 = inboxAdsPostclickRenderState;
                bitSet6.set(4);
                dsS.A0W();
                dz3.A07 = z;
                dz3.A04 = evu;
            }
        } else if (inboxAdsPostclickRenderState.A06) {
            dsS = C2dB.A00(r302);
            dsS.A2X(7zL.A0Y());
        } else {
            dsS = new DsT(r302, new DxL());
            DxL dxL = ((DsT) dsS).A01;
            dxL.A01 = inboxAdsData;
            BitSet bitSet7 = ((DsT) dsS).A02;
            bitSet7.set(2);
            dxL.A00 = A07;
            bitSet7.set(3);
            dxL.A04 = migColorScheme;
            bitSet7.set(1);
            dxL.A02 = ezq;
            bitSet7.set(0);
            dxL.A05 = z;
            dxL.A03 = evu;
        }
        DKE.A1R(dsS, r302, Dyq.class, "InboxAdsContentComponent", new Object[]{C5ba.A0H});
        A01.A2d(dsS);
        7zM.A1N(A01, r302, Dyq.class, "InboxAdsContentComponent", new Object[]{C5ba.A0P});
        A01.A1r(1LI.A03(r302, Dyq.class, "InboxAdsContentComponent"));
        A01.A2b();
        7zM.A1O(A01, migColorScheme);
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1823397085:
                1Is r0 = r302.A00.A01;
                Object obj2 = r302.A03[0];
                float f = ((2lD) obj).A00;
                Dyq dyq = (Dyq) r0;
                boolean z = dyq.A06;
                Evu evu = dyq.A03;
                if (f < 100.0f || evu == null) {
                    return null;
                }
                DKH.A1N(evu, obj2, z ? 1 : 0);
                evu.A01(obj2.toString());
                return null;
            case -1351902487:
                1Is r02 = r302.A00.A01;
                ((Dyq) r02).A02.A03((C5ba) r302.A03[0], 0);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 466811311:
                F5R f5r = (F5R) obj;
                View view = f5r.A00;
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
                f5r.A01.A0a(view, accessibilityNodeInfoCompat);
                DKG.A1K(accessibilityNodeInfoCompat);
                return null;
            default:
                return null;
        }
    }
}
