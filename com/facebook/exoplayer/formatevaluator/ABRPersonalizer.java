package com.facebook.exoplayer.formatevaluator;

import X.0S2;
import X.5Kd;
import X.5LQ;
import X.C7ta;
import android.os.SystemClock;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Deque;

/* loaded from: ABRPersonalizer.class */
public final class ABRPersonalizer {
    public static Integer A00(AbrContextAwareConfiguration abrContextAwareConfiguration) {
        Integer num;
        boolean z;
        long j;
        long j2;
        synchronized (ABRPersonalizer.class) {
            5LQ r0 = 5LQ.A02;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            num = 0S2.A0C;
            5Kd r02 = abrContextAwareConfiguration.abrSetting;
            long j3 = r02.personalizedAggressiveStallDuration;
            long j4 = r02.personalizedVeryAggressiveStallDuration;
            long j5 = r02.personalizedConservativeStallDuration;
            synchronized (r0) {
                try {
                    z = 5LQ.A01;
                } catch (Throwable th) {
                    th = th;
                }
            }
            if (z) {
                synchronized (r0) {
                    j = -1;
                    if (5LQ.A01) {
                        Deque deque = 5LQ.A04;
                        if (!deque.isEmpty()) {
                            Long l = (Long) deque.peekLast();
                            if (l != null) {
                                j = l.longValue();
                            }
                        }
                    }
                }
                synchronized (C7ta.class) {
                    try {
                        j2 = C7ta.A00;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (j2 >= j3) {
                    if (j < elapsedRealtime - j3) {
                        num = 0S2.A0N;
                        if (j2 >= j4) {
                            if (j < elapsedRealtime - j4) {
                                num = 0S2.A0Y;
                            }
                        }
                    }
                }
                if (j >= elapsedRealtime - j5) {
                    num = 0S2.A01;
                    if (r0.A00((int) j5) > 1) {
                        num = 0S2.A00;
                    }
                }
            }
        }
        return num;
    }
}
