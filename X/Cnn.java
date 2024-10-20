package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification;
import com.facebook.messaging.rtc.groupcall.plugins.notify.callupdate.GroupCallUpdateNotificationHandler;

/* loaded from: Cnn.class */
public final class Cnn implements C5pz {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ ThreadSummary A02;
    public final /* synthetic */ GroupCallUpdateNotification A03;
    public final /* synthetic */ GroupCallUpdateNotificationHandler A04;

    public Cnn(Context context, ThreadKey threadKey, ThreadSummary threadSummary, GroupCallUpdateNotification groupCallUpdateNotification, GroupCallUpdateNotificationHandler groupCallUpdateNotificationHandler) {
        this.A04 = groupCallUpdateNotificationHandler;
        this.A00 = context;
        this.A03 = groupCallUpdateNotification;
        this.A01 = threadKey;
        this.A02 = threadSummary;
    }

    @Override // X.C5pz
    public void Blg() {
        GroupCallUpdateNotificationHandler groupCallUpdateNotificationHandler = this.A04;
        GroupCallUpdateNotificationHandler.A05(this.A00, null, this.A01, this.A02, this.A03, groupCallUpdateNotificationHandler);
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        11T.A0F(r302, 0);
        try {
            2EY r0 = (2Ea) r302.A09();
            if (r0 instanceof 2EY) {
                Bitmap bitmap = r0.A04;
                11T.A0A(bitmap);
                Bitmap.Config config = bitmap.getConfig();
                11T.A0D(config);
                Bitmap copy = bitmap.copy(config, bitmap.isMutable());
                GroupCallUpdateNotificationHandler groupCallUpdateNotificationHandler = this.A04;
                GroupCallUpdateNotificationHandler.A05(this.A00, copy, this.A01, this.A02, this.A03, groupCallUpdateNotificationHandler);
            }
        } finally {
            r302.close();
        }
    }
}
