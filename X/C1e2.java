package X;

import android.content.Context;
import com.facebook.realtime.common.appstate.AppStateSyncer;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1e2, reason: invalid class name */
/* loaded from: 1e2.class */
public final class C1e2 {
    public final Context A00;
    public final AppStateSyncer A01;
    public final ScheduledExecutorService A02;
    public final C1e0 A03;

    public C1e2(Context context, C1e0 c1e0, AppStateSyncer appStateSyncer, ScheduledExecutorService scheduledExecutorService) {
        this.A00 = context.getApplicationContext();
        this.A02 = scheduledExecutorService;
        this.A03 = c1e0;
        this.A01 = appStateSyncer;
    }
}
