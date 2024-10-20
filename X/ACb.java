package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import java.io.Closeable;

/* loaded from: ACb.class */
public final class ACb implements Closeable {
    public final C9af A00;

    public ACb(C9af c9af) {
        this.A00 = c9af;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C9af c9af = this.A00;
        UserFlowLogger userFlowLogger = c9af.A01;
        long j = c9af.A00;
        if (userFlowLogger.isOngoingFlow(j)) {
            userFlowLogger.flowEndFail(j, "unexpected_termination", null);
        }
    }
}
