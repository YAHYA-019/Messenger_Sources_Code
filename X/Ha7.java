package X;

import com.facebook.graphql.rtgql.sdk.RealtimeGraphQLSDKProvider;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Ha7.class */
public final class Ha7 {
    public final RealtimeGraphQLSDKProvider A00;
    public final ScheduledExecutorService A01;

    public Ha7() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bn.A0A(16452);
        this.A01 = scheduledExecutorService;
        this.A00 = new RealtimeGraphQLSDKProvider(scheduledExecutorService, null);
    }
}
