package X;

import com.facebook.msys.mci.ExecutionLogger;
import com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger;

/* renamed from: X.6it, reason: invalid class name */
/* loaded from: 6it.class */
public final class C6it implements C6is {
    @Override // X.C6is
    public void BiR(ThreadPRETltvLogger threadPRETltvLogger) {
        if (threadPRETltvLogger.threadLoggerType == C6ic.A04) {
            ExecutionLogger.activeFlowMarkerEnd(threadPRETltvLogger.getQplIdentifier());
        }
    }

    @Override // X.C6is
    public void BiS(ThreadPRETltvLogger threadPRETltvLogger, long j) {
        if (threadPRETltvLogger.threadLoggerType == C6ic.A04) {
            ExecutionLogger.activeFlowMarkerStart(threadPRETltvLogger.getQplIdentifier());
        }
    }
}
