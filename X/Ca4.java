package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.type.MessagingNotification;

/* loaded from: Ca4.class */
public final class Ca4 implements Observer {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LiveData A01;
    public final /* synthetic */ CommunityMessagingNotification A02;
    public final /* synthetic */ CDE A03;
    public final /* synthetic */ C5t A04;
    public final /* synthetic */ 0Je A05;
    public final /* synthetic */ 0CL A06;

    public Ca4(LiveData liveData, CommunityMessagingNotification communityMessagingNotification, CDE cde, C5t c5t, 0Je r306, 0CL r307, int i) {
        this.A01 = liveData;
        this.A06 = r307;
        this.A05 = r306;
        this.A00 = i;
        this.A02 = communityMessagingNotification;
        this.A03 = cde;
        this.A04 = c5t;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        ThreadSummaryDataModel A0N = 7zU.A0N(obj);
        this.A01.removeObserver(this);
        ThreadSummary threadSummary = A0N.A00;
        if (threadSummary != null) {
            if (!threadSummary.A2i) {
                this.A06.element = "thread_not_joined";
                this.A05.element = true;
            } else if (!threadSummary.AzZ().A02() || threadSummary.AzY() == 4) {
                this.A05.element = true;
                this.A06.element = "thread_muted";
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("CM Notification suppress report -> with notif id = ");
            A0k.append(this.A00);
            A0k.append(" and notif type = ");
            A0k.append(((MessagingNotification) this.A02).A01);
            A0k.append(", reason = ");
            0fH.A0j("CommunityMessagingNotificationSuppress", AnonymousClass001.A0d((String) this.A06.element, A0k));
        }
        CDE.A00(this.A02, this.A03, this.A04, (String) this.A06.element, this.A05.element);
    }
}
