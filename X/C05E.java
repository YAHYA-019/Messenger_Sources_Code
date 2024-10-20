package X;

/* renamed from: X.05E, reason: invalid class name */
/* loaded from: 05E.class */
public final class C05E extends 1Km {
    public C02S Au6() {
        return new C02S(new int[]{5505032, 5505025, 5505028, 5505026, 5505060}, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    public void C5i(C03b c03b) {
        0OC r306;
        0OC r316;
        11T.A0F(c03b, 0);
        int AiX = c03b.AiX();
        try {
            try {
                switch (c03b.getMarkerId()) {
                    case 5505025:
                        r306 = 0OC.A05;
                        long j = AiX;
                        synchronized (r306) {
                            0fH.A0g(Long.valueOf(j), "MessengerExperienceStats", "recordSendMessage called (latency=%s)");
                            0IG r0 = r306.A03;
                            r0.numLocalMessagesSent++;
                            r0.localSendLatencySum += j;
                            return;
                        }
                    case 5505026:
                        r316 = 0OC.A05;
                        long j2 = AiX;
                        synchronized (r316) {
                            0fH.A0g(Long.valueOf(j2), "MessengerExperienceStats", "recordWarmStart called (latency=%s)");
                            r316.A03.warmStartLatency += j2;
                            return;
                        }
                    case 5505028:
                        r316 = 0OC.A05;
                        long j3 = AiX;
                        synchronized (r316) {
                            0fH.A0g(Long.valueOf(j3), "MessengerExperienceStats", "recordLukeWarmStart called (latency=%s)");
                            r316.A03.lukeWarmStartLatency += j3;
                            return;
                        }
                    case 5505032:
                        r306 = 0OC.A05;
                        long j4 = AiX;
                        synchronized (r306) {
                            0fH.A0g(Long.valueOf(j4), "MessengerExperienceStats", "recordThreadListToThreadView called (latency=%s)");
                            0IG r02 = r306.A03;
                            r02.numThreadViewsSelected++;
                            r02.threadListToThreadViewLatencySum += j4;
                            return;
                        }
                    case 5505060:
                        r306 = 0OC.A05;
                        long j5 = AiX;
                        synchronized (r306) {
                            0fH.A0g(Long.valueOf(j5), "MessengerExperienceStats", "recordUserTypingLatency called (latency=%s)");
                            0IG r03 = r306.A03;
                            r03.numUserTypingEvent++;
                            r03.userTypingLatencySum += j5;
                            return;
                        }
                    default:
                        return;
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String getName() {
        return "Experience Metrics";
    }
}
