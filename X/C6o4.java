package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.6o4, reason: invalid class name */
/* loaded from: 6o4.class */
public final class C6o4 {
    public long A03 = 0;
    public long A05 = 0;
    public long A02 = 0;
    public long A01 = 0;
    public long A00 = 0;
    public long A04 = 0;
    public final C00i A06 = new 1BQ(16705);

    public static long A00(C6o4 c6o4, String str, int i) {
        C00i c00i = c6o4.A06;
        long generateNewFlowId = ((UserFlowLogger) c00i.get()).generateNewFlowId(i);
        ((UserFlowLogger) c00i.get()).flowStart(generateNewFlowId, new UserFlowConfig("thread_item_content_listener", true));
        ((UserFlowLogger) c00i.get()).flowAnnotate(generateNewFlowId, "thread_type", str);
        return generateNewFlowId;
    }

    public void A01() {
        if (this.A03 != 0) {
            ((UserFlowLogger) this.A06.get()).flowEndSuccess(this.A03);
            this.A03 = 0L;
        }
        if (this.A05 != 0) {
            ((UserFlowLogger) this.A06.get()).flowEndSuccess(this.A05);
            this.A05 = 0L;
        }
        if (this.A02 != 0) {
            ((UserFlowLogger) this.A06.get()).flowEndSuccess(this.A02);
            this.A02 = 0L;
        }
        if (this.A01 != 0) {
            ((UserFlowLogger) this.A06.get()).flowEndSuccess(this.A01);
            this.A01 = 0L;
        }
        if (this.A00 != 0) {
            ((UserFlowLogger) this.A06.get()).flowEndSuccess(this.A00);
            this.A00 = 0L;
        }
        if (this.A04 != 0) {
            ((UserFlowLogger) this.A06.get()).flowEndSuccess(this.A04);
            this.A04 = 0L;
        }
    }
}
