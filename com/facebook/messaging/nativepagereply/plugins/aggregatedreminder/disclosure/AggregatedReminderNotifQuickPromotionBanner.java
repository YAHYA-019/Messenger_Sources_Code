package com.facebook.messaging.nativepagereply.plugins.aggregatedreminder.disclosure;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1G2;
import X.1NK;
import X.2Ws;
import android.content.Context;

/* loaded from: AggregatedReminderNotifQuickPromotionBanner.class */
public final class AggregatedReminderNotifQuickPromotionBanner {
    public static final 1G2 A03;
    public static final 1G2 A04;
    public final Context A00;
    public final 1Br A01;
    public final 2Ws A02;

    static {
        1G2 r0 = 1NK.A20;
        1G2 A0D = r0.A0D("should_show_aggregated_reminder_notifi_qp");
        11T.A0A(A0D);
        A04 = A0D;
        1G2 A0D2 = r0.A0D("already_showed_aggregated_reminder_notifi_qp");
        11T.A0A(A0D2);
        A03 = A0D2;
    }

    public AggregatedReminderNotifQuickPromotionBanner(Context context, 2Ws r303) {
        11T.A0F(context, 1);
        11T.A0F(r303, 2);
        this.A00 = context;
        this.A02 = r303;
        this.A01 = 1Bq.A00(33013);
    }
}
