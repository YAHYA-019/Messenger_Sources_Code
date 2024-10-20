package X;

import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.common.InboxAdsMediaInfo;

/* renamed from: X.7ti, reason: invalid class name */
/* loaded from: 7ti.class */
public final class C7ti {
    public final 1Br A00 = 1Bu.A00(68128);
    public final 1Br A01 = 1Bu.A00(99696);

    public static final int A00(InboxAdsData inboxAdsData, C7ti c7ti) {
        InboxAdsMediaInfo A00 = 4oD.A00(inboxAdsData);
        11T.A0A(A00);
        int i = 1;
        if (inboxAdsData.A07().size() == 1) {
            if (A00.A06 != null) {
                i = 4;
            } else {
                if (A00.A01().contains(EnumC08694nm.PHOTO)) {
                    return 2;
                }
                1Br.A0C(c7ti.A00);
                i = 0;
                if (C5bW.A00(inboxAdsData)) {
                    return 2;
                }
            }
        } else {
            if (A00.A01().contains(EnumC08694nm.MULTI_PHOTO)) {
                return 3;
            }
            1Br.A0C(c7ti.A00);
            if (C5bW.A00(inboxAdsData)) {
                return 3;
            }
        }
        return i;
    }
}
