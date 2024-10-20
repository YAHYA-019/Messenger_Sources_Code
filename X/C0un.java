package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0un, reason: invalid class name */
/* loaded from: 0un.class */
public final class C0un implements 0Wr {
    public final ConcurrentHashMap A05;
    public boolean A02 = false;
    public boolean A03 = false;
    public long A00 = 0;
    public Handler A01 = null;
    public final C14f A04 = new C14f();

    public C0un(ConcurrentHashMap concurrentHashMap) {
        this.A05 = concurrentHashMap;
    }

    public void AT4(Message message) {
        try {
            if (this.A02) {
                C14f c14f = this.A04;
                ((0Wp) c14f).A05 = SystemClock.uptimeMillis();
                ((0Wp) c14f).A04 = SystemClock.currentThreadTimeMillis();
                for (0XH r0 : this.A05.values()) {
                    if (!r0.A0C) {
                        long A01 = c14f.A01();
                        if (((0Wp) c14f).A02 == -1) {
                            A01 = ((0Wp) c14f).A05 - r0.A0F;
                        }
                        r0.A00++;
                        r0.A08 += A01;
                        if (((0Wp) c14f).A0A) {
                            r0.A01++;
                            r0.A07 += A01;
                        }
                        if (A01 > 200) {
                            r0.A02++;
                            if (A01 > r0.A03) {
                                r0.A0A = c14f.A06();
                            }
                        }
                        r0.A03 = Math.max(A01, r0.A03);
                        long j = ((0Wp) c14f).A06;
                        long j2 = j > 0 ? ((0Wp) c14f).A02 - j : -1;
                        if (j2 > r0.A05) {
                            r0.A05 = j2;
                            r0.A09 = c14f.A06();
                            r0.A04 = c14f.A01();
                        }
                    }
                }
                c14f.A03();
            }
        } finally {
            this.A04.A03();
        }
    }

    public void AT7() {
        AT4(null);
    }

    public void D1b(Message message) {
        if (this.A02) {
            C14f c14f = this.A04;
            c14f.A09 = null;
            c14f.A05 = -1;
            c14f.A04(message);
            c14f.A02();
            c14f.A01 = 0;
        }
    }

    public void D1n(Looper looper, String str) {
        0fH.A0l("MQD", "MqdStatsCollector: startIntercepting");
    }

    public void D1x() {
        D1b(null);
    }
}
