package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.AdsConversionsQPData;
import com.facebook.messaging.nativepagereply.plugins.orders.threadviewbanner.BusinessInboxOrdersUpsellBanner;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: Cuw.class */
public final class Cuw implements AYH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Cuw(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public final void onDismiss() {
        if (3 - this.A00 != 0) {
            FHL fhl = (FHL) this.A01;
            fhl.A07((java.util.Map) null);
            if (BXh.A00(fhl.A0B.dismissAction)) {
                7OX r0 = (7OX) this.A02;
                fhl.A03();
                r0.BNt();
                return;
            }
            return;
        }
        BusinessInboxOrdersUpsellBanner businessInboxOrdersUpsellBanner = (BusinessInboxOrdersUpsellBanner) this.A03;
        BfW bfW = (BfW) 1Br.A0B(businessInboxOrdersUpsellBanner.A01);
        ThreadKey threadKey = (ThreadKey) this.A02;
        long j = threadKey.A05;
        long j2 = threadKey.A02;
        AdsConversionsQPData adsConversionsQPData = (AdsConversionsQPData) this.A01;
        String str = adsConversionsQPData.A09;
        1UG A08 = 1BK.A08(1Br.A02(bfW.A00), "smart_suggestion_dismiss");
        if (A08.isSampled()) {
            A08.A5c(BOI.A01, "suggestion_type");
            A08.A6H("page_or_business_id", Long.valueOf(j));
            AbI.A1K(A08, j2);
            if (str == null) {
                str = "";
            }
            A08.A7R(TraceFieldType.RequestID, str);
            A08.A7R("channel", "MESSENGER");
            A08.BZL();
        }
        BusinessInboxOrdersUpsellBanner.A00(threadKey, adsConversionsQPData, businessInboxOrdersUpsellBanner);
    }
}
