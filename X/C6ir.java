package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.messenger.platform_logger.MPLTracker;
import com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger;

/* renamed from: X.6ir, reason: invalid class name */
/* loaded from: 6ir.class */
public final class C6ir implements C6is {
    @Override // X.C6is
    public void BiR(ThreadPRETltvLogger threadPRETltvLogger) {
    }

    @Override // X.C6is
    public void BiS(ThreadPRETltvLogger threadPRETltvLogger, long j) {
        MPLTracker.trackInteraction(threadPRETltvLogger.getQplIdentifier(), threadPRETltvLogger.instanceKey, AwakeTimeSinceBootClock.INSTANCE.now(), null, false, false);
    }
}
