package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.common.calltoaction.model.CTACustomerFeedback;
import com.facebook.messaging.business.customerfeedback.model.CustomerFeedbackPageData;
import com.facebook.messaging.business.customerfeedback.view.CustomerFeedbackActivity;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.BitSet;

/* renamed from: X.Db2, reason: case insensitive filesystem */
/* loaded from: Db2.class */
public final class C2077Db2 extends 1RM {
    public final /* synthetic */ EAX A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ LithoView A02;
    public final /* synthetic */ CTACustomerFeedback A03;
    public final /* synthetic */ CustomerFeedbackActivity A04;
    public final /* synthetic */ DLP A05;

    public C2077Db2(EAX eax, 1Iw r303, LithoView lithoView, CTACustomerFeedback cTACustomerFeedback, CustomerFeedbackActivity customerFeedbackActivity, DLP dlp) {
        this.A04 = customerFeedbackActivity;
        this.A03 = cTACustomerFeedback;
        this.A01 = r303;
        this.A00 = eax;
        this.A05 = dlp;
        this.A02 = lithoView;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        QuickPerformanceLogger A0U;
        short s;
        Object obj2;
        TreeJNI A0L;
        BML bml;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        if (abstractC08294mh != null && (obj2 = abstractC08294mh.A03) != null && (A0L = ((2JY) obj2).A0L(1246365476, 2JX.class, 911235172)) != null) {
            CustomerFeedbackActivity customerFeedbackActivity = this.A04;
            CTACustomerFeedback cTACustomerFeedback = this.A03;
            BML bml2 = BML.A07;
            CustomerFeedbackPageData customerFeedbackPageData = cTACustomerFeedback.A01;
            if (customerFeedbackPageData != null && (bml = customerFeedbackPageData.A02) != null && (!bml.equals(bml2)) && (!bml.equals(BML.A08))) {
                1Iw r0 = this.A01;
                DsM dsM = new DsM(r0, new Dz2());
                FbUserSession fbUserSession = customerFeedbackActivity.A00;
                fbUserSession.getClass();
                Dz2 dz2 = dsM.A01;
                dz2.A01 = fbUserSession;
                BitSet bitSet = dsM.A02;
                bitSet.set(1);
                EAX eax = this.A00;
                dz2.A00 = FXs.A00(eax, this, 15);
                bitSet.set(4);
                dz2.A03 = cTACustomerFeedback;
                bitSet.set(0);
                dz2.A02 = eax;
                boolean booleanValue = A0L.getBooleanValue(-958911557);
                dz2.A06 = booleanValue;
                bitSet.set(2);
                dz2.A05 = this.A05;
                bitSet.set(5);
                dz2.A04 = AbF.A0p(customerFeedbackActivity.A03);
                bitSet.set(3);
                7zP.A15(dsM, bitSet, dsM.A03);
                LithoView lithoView = this.A02;
                ComponentTree componentTree = lithoView.A00;
                if (componentTree == null) {
                    C1s0 A01 = ComponentTree.A01(dz2, r0, null);
                    A01.A01(false);
                    7zQ.A1I(A01, lithoView);
                } else {
                    componentTree.A0P(dz2);
                }
                eax.setOnShowListener(new FKH(0, this, cTACustomerFeedback, booleanValue));
                eax.setOnDismissListener(new FKC(lithoView, cTACustomerFeedback, this, booleanValue));
                eax.A0G(true, false);
                A0U = 1BK.A0U(customerFeedbackActivity.A04);
                s = 2;
                A0U.markerEnd(508638616, s);
            }
        }
        A0U = 1BK.A0U(this.A04.A04);
        s = 433;
        A0U.markerEnd(508638616, s);
    }

    public void A03(Throwable th) {
        1BK.A0U(this.A04.A04).markerEnd(508638616, (short) 3);
    }
}
