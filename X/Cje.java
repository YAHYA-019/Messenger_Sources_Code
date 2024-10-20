package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification;
import com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate.GroupCallUpdateNotificationHandler;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Cje.class */
public final class Cje implements 7Vh {
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ GroupCallUpdateNotification A01;
    public final /* synthetic */ GroupCallUpdateNotificationHandler A02;
    public final /* synthetic */ SettableFuture A03;

    public Cje(ThreadKey threadKey, GroupCallUpdateNotification groupCallUpdateNotification, GroupCallUpdateNotificationHandler groupCallUpdateNotificationHandler, SettableFuture settableFuture) {
        this.A03 = settableFuture;
        this.A00 = threadKey;
        this.A02 = groupCallUpdateNotificationHandler;
        this.A01 = groupCallUpdateNotification;
    }

    public void COa(ThreadSummary threadSummary) {
        this.A03.set(threadSummary);
    }

    public void onFailure(Throwable th) {
        this.A03.set((Object) null);
        if (this.A00.A0z()) {
            return;
        }
        GroupCallUpdateNotificationHandler.A06(this.A01, this.A02, "OpFetchThreadSummary: Failed to get Thread Summary", 0Pz.A1B("fetchThreadSummary: ", th));
    }
}
