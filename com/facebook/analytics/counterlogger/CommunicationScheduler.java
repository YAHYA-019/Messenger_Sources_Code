package com.facebook.analytics.counterlogger;

import X.1Du;
import X.2DM;
import X.2Iq;
import X.2Is;
import X.2It;
import X.AbstractC01593ro;
import X.C05654ei;
import X.C0dr;
import X.C1kw;
import X.C26T;
import X.C2J3;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: CommunicationScheduler.class */
public final class CommunicationScheduler {
    public long A01;
    public long A02;
    public final C1kw A03;
    public final C0dr A04;
    public final C0dr A05;
    public final Object A06 = new Object();
    public final Map A07 = new HashMap();
    public int A00 = 0;

    public CommunicationScheduler(C1kw c1kw, C0dr c0dr, C0dr c0dr2) {
        this.A03 = c1kw;
        this.A04 = c0dr;
        this.A05 = c0dr2;
        this.A02 = c0dr2.now();
        this.A01 = c0dr.now();
    }

    /* JADX WARN: Type inference failed for: r0v204, types: [X.2J3, X.4ei] */
    public static void A00(CommunicationScheduler communicationScheduler, boolean z) {
        synchronized (communicationScheduler.A06) {
            long now = communicationScheduler.A05.now();
            long j = communicationScheduler.A02;
            communicationScheduler.A02 = now;
            long now2 = communicationScheduler.A04.now();
            long j2 = communicationScheduler.A01;
            communicationScheduler.A01 = now2;
            int i = communicationScheduler.A00;
            communicationScheduler.A00 = i + 1;
            for (Map.Entry entry : communicationScheduler.A07.entrySet()) {
                String str = (String) entry.getKey();
                Map map = (Map) entry.getValue();
                C1kw c1kw = communicationScheduler.A03;
                if (C05654ei.A00 == null) {
                    synchronized (C05654ei.class) {
                        try {
                            if (C05654ei.A00 == null) {
                                C05654ei.A00 = new C2J3(c1kw);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                AbstractC01593ro A3u = C05654ei.A00.A00.A3u(str, false);
                boolean z2 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    if (A3u.A0B()) {
                        2Is r0 = (2Is) entry2.getValue();
                        2Iq r02 = r0.A00;
                        String str2 = r0.A01;
                        Map map2 = r02.A01;
                        synchronized (map2) {
                            try {
                                Map map3 = (Map) map2.get(str2);
                                if (map3 != null) {
                                    ImmutableMap copyOf = ImmutableMap.copyOf(map3);
                                    map3.clear();
                                    if (!copyOf.isEmpty()) {
                                        C26T c26t = C26T.A00;
                                        2DM r03 = new 2DM(c26t);
                                        1Du it = copyOf.entrySet().iterator();
                                        while (it.hasNext()) {
                                            Map.Entry entry3 = (Map.Entry) it.next();
                                            String str3 = (String) entry3.getKey();
                                            2It r04 = (2It) entry3.getValue();
                                            2DM r05 = new 2DM(c26t);
                                            r05.A0i("count", r04.A00);
                                            r05.A0j("sum", r04.A02);
                                            r05.A0j("s_sum", r04.A01);
                                            r03.A0e(r05, str3);
                                        }
                                        A3u.A01(r03, (String) entry2.getKey());
                                        z2 = true;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } else {
                        2Is r06 = (2Is) entry2.getValue();
                        2Iq r07 = r06.A00;
                        String str4 = r06.A01;
                        Map map4 = r07.A01;
                        synchronized (map4) {
                            try {
                                if (map4.containsKey(str4)) {
                                    ((Map) map4.get(str4)).clear();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                    }
                }
                if (z2) {
                    A3u.A05("period_start", j2);
                    A3u.A05("period_end", now2);
                    A3u.A05("real_start", j);
                    A3u.A05("real_end", now);
                    A3u.A07("is_background", z);
                    A3u.A04("session_count", i);
                    A3u.A04(ErrorReportingConstants.SOFT_ERROR_OCCURRENCE_COUNT, A3u.A00());
                    A3u.A0A();
                }
            }
        }
    }
}
