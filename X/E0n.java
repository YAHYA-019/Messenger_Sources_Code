package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: E0n.class */
public final class E0n extends 2Yf {
    public FbUserSession A00;
    public InboxAdsData A01;
    public Ezq A02;
    public Evu A03;
    public InboxAdsPostclickRenderState A04;
    public MigColorScheme A05;
    public boolean A06;

    public E0n() {
        super("InboxAdsContentSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        DsT dsT;
        FbUserSession fbUserSession = this.A00;
        InboxAdsData inboxAdsData = this.A01;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = this.A04;
        MigColorScheme migColorScheme = this.A05;
        boolean z = this.A06;
        Ezq ezq = this.A02;
        Evu evu = this.A03;
        2Yr r0 = new 2Yr();
        2hP A0I = 2hO.A0I(c1qb);
        Dsc dsc = new Dsc(c1qb, new 8kL());
        8kL r02 = dsc.A01;
        r02.A00 = inboxAdsData;
        BitSet bitSet = dsc.A02;
        bitSet.set(2);
        r02.A02 = migColorScheme;
        bitSet.set(1);
        r02.A01 = ezq;
        bitSet.set(0);
        A0I.A04(dsc);
        r0.A00(A0I);
        2hP A0I2 = 2hO.A0I(c1qb);
        DsY dsY = new DsY(c1qb, new Dyq());
        Dyq dyq = dsY.A01;
        dyq.A00 = fbUserSession;
        BitSet bitSet2 = dsY.A02;
        bitSet2.set(3);
        dyq.A01 = inboxAdsData;
        bitSet2.set(2);
        dyq.A04 = inboxAdsPostclickRenderState;
        bitSet2.set(4);
        dyq.A06 = z;
        dyq.A02 = ezq;
        bitSet2.set(0);
        dyq.A03 = evu;
        dyq.A05 = migColorScheme;
        bitSet2.set(1);
        dsY.A2K("inbox_ad_postclick_content");
        dsY.A2T(2Yg.A0B(c1qb, E0n.class, "InboxAdsContentSection", new Object[]{C5ba.A0P}, -1351902487));
        dsY.A1r(2Yg.A09(c1qb, E0n.class, "InboxAdsContentSection", 466811311));
        A0I2.A04(dsY);
        r0.A00(A0I2);
        2hP A0I3 = 2hO.A0I(c1qb);
        if (inboxAdsPostclickRenderState.A01 != 3) {
            dsT = null;
        } else {
            dsT = new DsT(c1qb, new DxL());
            DxL dxL = dsT.A01;
            dxL.A01 = inboxAdsData;
            BitSet bitSet3 = dsT.A02;
            bitSet3.set(2);
            2kW r03 = new 2kW();
            r03.A01 = 0;
            r03.A02 = (-1) >>> 1;
            dxL.A00 = r03.A00();
            bitSet3.set(3);
            dxL.A04 = migColorScheme;
            bitSet3.set(1);
            dsT.A1u(2Yg.A0B(c1qb, E0n.class, "InboxAdsContentSection", new Object[]{C5ba.A0H}, -1823397085));
            dxL.A02 = ezq;
            bitSet3.set(0);
        }
        A0I3.A04(dsT);
        r0.A00(A0I3);
        2hP A0I4 = 2hO.A0I(c1qb);
        DsN dsN = new DsN(c1qb, new DxK());
        DxK dxK = dsN.A01;
        dxK.A00 = inboxAdsData;
        BitSet bitSet4 = dsN.A02;
        bitSet4.set(2);
        dxK.A04 = migColorScheme;
        bitSet4.set(1);
        dxK.A03 = inboxAdsPostclickRenderState;
        bitSet4.set(3);
        dxK.A05 = z;
        dxK.A01 = ezq;
        bitSet4.set(0);
        dxK.A02 = evu;
        7zM.A1O(dsN, migColorScheme);
        DKE.A1Q(dsN);
        dsN.A1r(2Yg.A09(c1qb, E0n.class, "InboxAdsContentSection", 466811311));
        A0I4.A04(dsN);
        r0.A00(A0I4);
        return r0.A00;
    }

    public Object A0e(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1823397085) {
            E0n e0n = r302.A00.A01;
            Object obj2 = r302.A03[0];
            float f = ((2lD) obj).A00;
            E0n e0n2 = e0n;
            boolean z = e0n2.A06;
            Evu evu = e0n2.A03;
            if (f < 100.0f || evu == null) {
                return null;
            }
            DKH.A1N(evu, obj2, z ? 1 : 0);
            evu.A01(obj2.toString());
            return null;
        }
        if (i == -1351902487) {
            E0n e0n3 = r302.A00.A01;
            e0n3.A02.A03((C5ba) r302.A03[0], 0);
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

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            E0n e0n = (E0n) r302;
            Ezq ezq = this.A02;
            Ezq ezq2 = e0n.A02;
            if (ezq != null) {
                if (!ezq.equals(ezq2)) {
                    return false;
                }
            } else if (ezq2 != null) {
                return false;
            }
            MigColorScheme migColorScheme = this.A05;
            MigColorScheme migColorScheme2 = e0n.A05;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            InboxAdsData inboxAdsData = this.A01;
            InboxAdsData inboxAdsData2 = e0n.A01;
            if (inboxAdsData != null) {
                if (!inboxAdsData.equals(inboxAdsData2)) {
                    return false;
                }
            } else if (inboxAdsData2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A00;
            FbUserSession fbUserSession2 = e0n.A00;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            InboxAdsPostclickRenderState inboxAdsPostclickRenderState = this.A04;
            InboxAdsPostclickRenderState inboxAdsPostclickRenderState2 = e0n.A04;
            if (inboxAdsPostclickRenderState != null) {
                if (!inboxAdsPostclickRenderState.equals(inboxAdsPostclickRenderState2)) {
                    return false;
                }
            } else if (inboxAdsPostclickRenderState2 != null) {
                return false;
            }
            Evu evu = this.A03;
            Evu evu2 = e0n.A03;
            if (evu != null) {
                if (!evu.equals(evu2)) {
                    return false;
                }
            } else if (evu2 != null) {
                return false;
            }
            if (this.A06 != e0n.A06) {
                return false;
            }
        }
        return true;
    }
}
