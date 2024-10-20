package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.messaging.model.messages.Message;

/* loaded from: DA5.class */
public final class DA5 implements Runnable {
    public static final String __redex_internal_original_name = "MessengerLiveLocationSendingRepository$2";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 5fT A01;
    public final /* synthetic */ ChH A02;
    public final /* synthetic */ Message A03;
    public final /* synthetic */ String A04;

    public DA5(5fT r302, ChH chH, Message message, String str, long j) {
        this.A02 = chH;
        this.A01 = r302;
        this.A00 = j;
        this.A04 = str;
        this.A03 = message;
    }

    @Override // java.lang.Runnable
    public void run() {
        5fT r0 = this.A01;
        long j = this.A00;
        String str = this.A04;
        C1pq.A08(4YT.A00(354), str);
        Message message = this.A03;
        11T.A0F(message, 0);
        String A0Y = 0Pz.A0Y(message.A1V, message.A1g, ':');
        C1pq.A08("sessionId", A0Y);
        r0.onSuccess(new LiveLocationSession(str, null, A0Y, "", j, System.currentTimeMillis(), true));
    }
}
