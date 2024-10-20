package com.facebook.advancedcryptotransport;

import X.0C5;
import X.0C7;
import X.0fH;

/* loaded from: ACTEfficiencyMetricsReporter.class */
public class ACTEfficiencyMetricsReporter {
    public static void addBytesReadCount(int i) {
        0C5 r0 = 0C5.A02;
        long j = i;
        synchronized (r0) {
            0C7 r02 = r0.A01;
            r02.receiveBytes += j;
            r02.receiveCount++;
            long now = 0C5.A04.now();
            0C5.A03.A00(now - 5, now);
            0fH.A0g(Long.valueOf(j), "ChatdMetricsStats", "didReceiveMessage called (bytes=%s)");
        }
    }

    public static void addBytesWrittenCount(int i) {
        0C5 r0 = 0C5.A02;
        long j = i;
        synchronized (r0) {
            0C7 r02 = r0.A01;
            r02.sendBytes += j;
            r02.sendCount++;
            long now = 0C5.A04.now();
            0C5.A03.A00(now - 5, now);
            0fH.A0g(Long.valueOf(j), "ChatdMetricsStats", "didSendMessage called (bytes=%s)");
        }
    }
}
