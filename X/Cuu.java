package X;

import com.facebook.messaging.events.plugins.qp.communitymessaging.CommunityEventBanner;
import com.facebook.messaging.events.plugins.qp.publicchats.EventBanner;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.List;

/* loaded from: Cuu.class */
public final class Cuu implements AYH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cuu(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onDismiss() {
        List<C1769As3> list;
        ThreadSummary threadSummary;
        ThreadKey threadKey;
        if (this.A00 != 0) {
            EventBanner eventBanner = (EventBanner) this.A02;
            list = (List) this.A01;
            if (2oI.A07(eventBanner.A02)) {
                C1306Adj A0Z = AbM.A0Z(eventBanner.A06);
                ThreadSummary threadSummary2 = eventBanner.A02;
                C1306Adj.A03(A0Z, (threadSummary2 == null || (threadKey = threadSummary2.A0n) == null) ? null : AbF.A14(threadKey), 24, 17);
                for (C1769As3 c1769As3 : list) {
                    1Ql A08 = 1Br.A08(eventBanner.A07);
                    A08.CaE(1G3.A00(1NK.A0z, String.valueOf(c1769As3.A00)), EventBanner.A00(c1769As3, eventBanner));
                    A08.commit();
                }
                return;
            }
            AdH.A03(list);
            threadSummary = eventBanner.A02;
        } else {
            list = (List) this.A01;
            AdH.A03(list);
            threadSummary = ((CommunityEventBanner) this.A02).A02;
        }
        7zR.A0W().A04(AdH.A00(threadSummary, "events_qp_dismiss_click", list));
    }
}
