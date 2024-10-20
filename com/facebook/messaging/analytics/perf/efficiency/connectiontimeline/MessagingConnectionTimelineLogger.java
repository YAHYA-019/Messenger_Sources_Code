package com.facebook.messaging.analytics.perf.efficiency.connectiontimeline;

import X.1BK;
import X.1BL;
import X.1Br;
import X.7zR;
import X.AnonymousClass001;
import X.C0dp;
import X.C2605Giu;
import X.GOw;
import X.GOy;
import X.GP4;
import com.facebook.rsys.networkinfo.gen.NetworkInfoCallback;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: MessagingConnectionTimelineLogger.class */
public final class MessagingConnectionTimelineLogger {
    public C0dp A00;
    public C2605Giu A01;
    public Queue A02;
    public Queue A03;
    public final long A04;
    public final 1Br A05;
    public final GOw A06;
    public final GOw A07;
    public final GOw A08;
    public final GOw A09;
    public final NetworkInfoCallback A0A;
    public final boolean A0B;
    public final boolean A0C;

    public MessagingConnectionTimelineLogger() {
        1Br A0C = 1BK.A0C();
        this.A05 = A0C;
        this.A0B = 1Br.A07(A0C).AZk(36310624188564014L);
        this.A04 = 1Br.A07(this.A05).Auy(36592099165339948L);
        this.A0C = 1Br.A07(this.A05).AZk(36313609189071656L);
        this.A09 = GOw.A00();
        this.A06 = GOw.A00();
        this.A08 = GOw.A00();
        this.A07 = GOw.A00();
        this.A00 = 7zR.A0G();
        this.A02 = new ConcurrentLinkedQueue();
        this.A03 = new ConcurrentLinkedQueue();
        this.A0A = new GOy(this);
    }

    public final void A00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2) {
        synchronized (this) {
            if (this.A0B) {
                long now = this.A00.now();
                GP4 gp4 = null;
                if (i2 != 1) {
                    new GP4(str, str2, str3, str4, str5, str6, str7, str8, i, i2, now);
                }
                GOw gOw = i != 1 ? i != 2 ? i != 3 ? this.A08 : this.A07 : this.A06 : this.A09;
                if (gOw.A00 != i2) {
                    gOw.A00 = i2;
                    if (gp4 != null) {
                        GP4 gp42 = gOw.A04;
                        if (gp42 == null || !gp4.equals(gp42)) {
                            Queue queue = this.A02;
                            queue.add(gp4);
                            if (queue.size() > this.A04) {
                                queue.poll();
                            }
                            1BL.A1I(gp4, "recordConnectionEvent: ", "MessagingConnectionTimelineLogger", AnonymousClass001.A0k());
                            gOw.A04 = gp4;
                        }
                    }
                    if (i2 == 1) {
                        gOw.A02 = now;
                    } else if (i2 != 2) {
                        gOw.A03 = now;
                    } else {
                        gOw.A01 = now;
                    }
                }
            }
        }
    }
}
