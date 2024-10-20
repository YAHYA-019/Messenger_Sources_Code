package X;

import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.common.InboxAdsMediaInfo;
import com.facebook.messaging.business.inboxads.renderstate.InboxAdsPostclickRenderState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: Dwu.class */
public final class Dwu extends C1rj {
    public InboxAdsData A00;
    public Ezq A01;
    public Evu A02;
    public InboxAdsPostclickRenderState A03;
    public MigColorScheme A04;
    public boolean A05;

    public Dwu() {
        super("InboxAdsImageCarouselComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A04, this.A00, this.A03, this.A02, Boolean.valueOf(this.A05)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        DsP dsR;
        InboxAdsData inboxAdsData = this.A00;
        MigColorScheme migColorScheme = this.A04;
        Ezq ezq = this.A01;
        InboxAdsPostclickRenderState inboxAdsPostclickRenderState = this.A03;
        boolean z = this.A05;
        Evu evu = this.A02;
        DuU A01 = Dzb.A01(r302);
        C1rq A012 = C1rg.A01(r302, null, 0);
        int i = 0;
        while (true) {
            int i2 = i;
            ImmutableList A07 = inboxAdsData.A07();
            if (i2 >= A07.size()) {
                A01.A2X(A012);
                A01.A01.A04 = false;
                return A01.A2W();
            }
            float f = 16.0f;
            if (((InboxAdsMediaInfo) A07.get(i2)).A00().contains(EnumC08714nq.A03)) {
                dsR = new DsP(r302, new DzR());
                InboxAdsMediaInfo inboxAdsMediaInfo = (InboxAdsMediaInfo) A07.get(i2);
                DzR dzR = dsR.A01;
                dzR.A01 = inboxAdsMediaInfo;
                BitSet bitSet = dsR.A02;
                bitSet.set(2);
                dzR.A00 = i2;
                dzR.A02 = C97n.A00(i2, A07.size());
                dzR.A05 = migColorScheme;
                bitSet.set(1);
                dzR.A03 = ezq;
                bitSet.set(0);
                dzR.A06 = z;
                dzR.A04 = evu;
            } else {
                dsR = new DsR(r302, new DzS());
                InboxAdsMediaInfo inboxAdsMediaInfo2 = (InboxAdsMediaInfo) A07.get(i2);
                DzS dzS = ((DsR) dsR).A01;
                dzS.A01 = inboxAdsMediaInfo2;
                BitSet bitSet2 = ((DsR) dsR).A02;
                bitSet2.set(2);
                dzS.A00 = i2;
                dzS.A02 = C97n.A00(i2, A07.size());
                dzS.A06 = migColorScheme;
                bitSet2.set(1);
                dzS.A03 = ezq;
                bitSet2.set(0);
                dzS.A05 = inboxAdsPostclickRenderState;
                bitSet2.set(3);
                dzS.A07 = z;
                dzS.A04 = evu;
            }
            float f2 = 2.0f;
            if (i2 == 0) {
                f2 = 16.0f;
            }
            dsR.A11(f2);
            if (i2 != DKC.A06(A07)) {
                f = 2.0f;
            }
            dsR.A14(f);
            dsR.A0z(252.0f);
            dsR.A0R();
            A012.A2e(dsR);
            i = i2 + 1;
        }
    }
}
