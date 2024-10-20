package X;

import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.groups.plugins.leavegroup.threadsettingsclick.ThreadSettingsLeaveGroupClickHandler;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cio.class */
public final class Cio implements DGg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cio(ThreadSettingsLeaveGroupClickHandler threadSettingsLeaveGroupClickHandler, ThreadSummary threadSummary, int i) {
        this.A00 = i;
        this.A02 = threadSettingsLeaveGroupClickHandler;
        this.A01 = threadSummary;
    }

    @Override // X.DGg
    public void C3U() {
        ThreadSettingsLeaveGroupClickHandler threadSettingsLeaveGroupClickHandler = (ThreadSettingsLeaveGroupClickHandler) this.A02;
        ThreadSummary threadSummary = (ThreadSummary) this.A01;
        C1296Ad8.A02(AbJ.A0O(threadSettingsLeaveGroupClickHandler.A02), new CommunityMessagingLoggerModel(null, null, String.valueOf(AbL.A0b(threadSummary.A0l)), AbF.A17(threadSummary), AbK.A17(threadSummary), null, "leave_chat_button", "thread_settings", "thread_leave_failed", null, null, null), null);
    }

    @Override // X.DGg
    public void C3W() {
        ((ThreadSettingsLeaveGroupClickHandler) this.A02).A0A.C3T();
    }
}
