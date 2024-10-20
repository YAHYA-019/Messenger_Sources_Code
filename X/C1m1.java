package X;

import android.content.Intent;
import java.util.Locale;

/* renamed from: X.1m1, reason: invalid class name */
/* loaded from: 1m1.class */
public final class C1m1 {
    public long A00;
    public long A01;
    public long A02;
    public final C00i A05 = new 1BQ(16804);
    public final C00i A06 = new 1BQ(16803);
    public final C00i A07 = new 1BQ(84488);
    public C08t A03 = C08t.DISCONNECTED;
    public boolean A04 = false;

    public C1m1() {
        long j = -1;
        this.A00 = j;
        this.A01 = j;
    }

    public long A00() {
        long j;
        synchronized (this) {
            j = this.A00;
        }
        return j;
    }

    public C08t A01() {
        C08t c08t;
        synchronized (this) {
            c08t = this.A03;
        }
        return c08t;
    }

    public void A02(C1ns c1ns) {
        C1og c1og;
        C08t c08t = c1ns.A03;
        0fH.A0g(c08t, "ChannelConnectivityTracker", "onChannelStateChanged; %s");
        ((C1nu) this.A06.get()).A00(new C1ny("Received channel state changed: %s", new Object[]{c1ns.toString()}, ((C0dr) this.A07.get()).now()));
        synchronized (this) {
            long j = c1ns.A02;
            if (j >= this.A02) {
                this.A02 = j;
                long j2 = c1ns.A00;
                long j3 = c1ns.A01;
                if (c08t == C08t.CONNECT_SENT) {
                    this.A04 = true;
                    c08t = C08t.CONNECTED;
                } else {
                    this.A04 = false;
                }
                C08t c08t2 = this.A03;
                0fH.A0d(c08t2, c08t, "ChannelConnectivityTracker", "doUpdateChannelState, oldConnectionState=%s, new state=%s");
                this.A03 = c08t;
                this.A00 = j2;
                this.A01 = j3;
                if (c08t != c08t2) {
                    int ordinal = c08t.ordinal();
                    if (ordinal == 0) {
                        c1og = C1og.CHANNEL_CONNECTING;
                    } else if (ordinal == 2) {
                        c1og = C1og.CHANNEL_CONNECTED;
                    } else {
                        if (ordinal != 3) {
                            throw AnonymousClass001.A0N(String.format(Locale.getDefault(), "Received a state I did not expect %s", c08t));
                        }
                        c1og = C1og.CHANNEL_DISCONNECTED;
                    }
                    C1o0 c1o0 = (C1o0) this.A05.get();
                    0fH.A09(C1o0.class, c1og, "Broadcasting channel state change event for %s");
                    Intent intent = new Intent("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
                    intent.putExtra("event", c1og.value);
                    c1o0.A01.CkS(intent);
                }
            }
        }
    }

    public boolean A03() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A03 == C08t.CONNECTED) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r301.A03 == X.C08t.CONNECTING) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            boolean r0 = r0.A03()     // Catch: java.lang.Throwable -> L24
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1e
            r0 = r301
            X.08t r0 = r0.A03     // Catch: java.lang.Throwable -> L24
            r303 = r0
            X.08t r0 = X.C08t.CONNECTING     // Catch: java.lang.Throwable -> L24
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L20
        L1e:
            r0 = 1
            r302 = r0
        L20:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L24:
            r305 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1m1.A04():boolean");
    }
}
