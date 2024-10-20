package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.concurrent.CancellationException;

/* renamed from: X.7Q4, reason: invalid class name */
/* loaded from: 7Q4.class */
public final class C7Q4 {
    public 7Xw A00;
    public 7Xv A01;
    public final FbUserSession A02;

    public C7Q4(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A02 = fbUserSession;
    }

    public final void A00(Throwable th, int i, boolean z) {
        7Xv r0 = this.A01;
        if (r0 != null) {
            if (z && i == 0) {
                r0.A00();
            }
            if (r0.A00 != 0) {
                ((UserFlowLogger) r0.A03.A00.get()).flowAnnotate(r0.A00, "context_lines_fetch_succeed", z);
            }
            if (r0.A00 != 0) {
                ((UserFlowLogger) r0.A03.A00.get()).flowAnnotate(r0.A00, "context_lines_count", i);
            }
            if (!z && !(th instanceof CancellationException)) {
                String valueOf = String.valueOf(th);
                if (r0.A00 != 0) {
                    ((UserFlowLogger) r0.A03.A00.get()).flowEndFail(r0.A00, "fail_to_fetch", valueOf);
                    r0.A00 = 0L;
                }
            }
        }
        7Xw r02 = this.A00;
        if (r02 != null) {
            if (z) {
                if (i == 0) {
                    r02.A01();
                } else if (7Xw.A00(r02)) {
                    ((QuickPerformanceLogger) 1Br.A0B(r02.A01)).markerPoint(431691035, "context_lines_fetch_succeed");
                }
            }
            if (7Xw.A00(r02)) {
                ((QuickPerformanceLogger) r02.A01.A00.get()).markerAnnotate(431691035, "context_lines_fetch_succeed", z);
            }
            if (7Xw.A00(r02)) {
                ((QuickPerformanceLogger) 1Br.A0B(r02.A01)).markerAnnotate(431691035, "context_lines_count", i);
            }
        }
    }
}
