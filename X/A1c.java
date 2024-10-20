package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.model.messages.Message;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: A1c.class */
public final class A1c implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public A1c(Message message, C5fm c5fm, int i) {
        this.A00 = i;
        switch (i) {
            case 11:
            case 12:
            case 13:
            case 14:
                this.A01 = c5fm;
                this.A02 = message;
                return;
            default:
                this.A01 = c5fm;
                this.A02 = message;
                return;
        }
    }

    public A1c(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(Message message, C5fm c5fm) {
        ((MessagingPerformanceLogger) c5fm.A0M.get()).A0l(message.A1W, "send_api_end");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r312v2 */
    /* JADX WARN: Type inference failed for: r312v3 */
    /* JADX WARN: Type inference failed for: r312v4, types: [java.util.AbstractCollection] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1c.onCompletion(java.lang.Object):void");
    }
}
