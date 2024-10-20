package X;

import com.facebook.messaging.screentime.M4AScreenTimeSyncAppJob;
import com.facebook.rsys.call.gen.CallModel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4g0, reason: invalid class name */
/* loaded from: 4g0.class */
public final class C4g0 implements Function1 {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final /* synthetic */ M4AScreenTimeSyncAppJob A01;

    public C4g0(M4AScreenTimeSyncAppJob m4AScreenTimeSyncAppJob) {
        this.A01 = m4AScreenTimeSyncAppJob;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        8LW r0 = (8LW) obj;
        11T.A0F(r0, 0);
        try {
            CallModel callModel = (CallModel) r0.A00(CallModel.class);
            boolean z = false;
            if (callModel == null) {
                0fH.A0l("M4AScreenTimeSyncAppJob", "Call model is null");
            } else if (callModel.inCallState == 7) {
                z = true;
            }
            if (this.A00.getAndSet(z) != z) {
                M4AScreenTimeSyncAppJob m4AScreenTimeSyncAppJob = this.A01;
                0fH.A0l("M4AScreenTimeSyncAppJob", "onVoipCallStateChanged");
                ((ScheduledExecutorService) 1Br.A0B(m4AScreenTimeSyncAppJob.A00)).execute(new 3gK(m4AScreenTimeSyncAppJob, z));
            }
        } catch (Exception e) {
            0fH.A0r("M4AScreenTimeSyncAppJob", "rpStoreSubscriber error", e);
        }
        return 04S.A00;
    }
}
