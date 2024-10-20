package X;

import com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector;
import java.util.Arrays;

/* renamed from: X.438, reason: invalid class name */
/* loaded from: 438.class */
public final class AnonymousClass438 {
    public int A00;
    public 2DO[] A01;
    public int A02;

    public void A00(2DO r302) {
        2DO[] r308;
        int i = this.A00;
        int i2 = this.A02;
        if (i < i2) {
            2DO[] r0 = this.A01;
            this.A00 = i + 1;
            r0[i] = r302;
            return;
        }
        2DO[] r02 = this.A01;
        if (r02 == null) {
            this.A02 = 10;
            r308 = new 2DO[10];
        } else {
            int min = i2 + Math.min(ProcessErrorMonitorANRDetector.START_DELAY_MS, Math.max(20, i2 >> 1));
            this.A02 = min;
            r308 = (2DO[]) Arrays.copyOf(r02, min);
        }
        this.A01 = r308;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        r308[i3] = r302;
    }
}
