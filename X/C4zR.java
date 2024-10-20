package X;

import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.collect.EvictingQueue;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.4zR, reason: invalid class name */
/* loaded from: 4zR.class */
public abstract class C4zR {
    public String A00;
    public int A01;
    public EvictingQueue A02;
    public final String A05;
    public final SimpleDateFormat A06 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
    public final Object A04 = new Object();
    public final Set A07 = new HashSet();
    public StringBuilder A03 = new StringBuilder();

    public C4zR(String str) {
        this.A05 = str;
    }

    public static final EvictingQueue A00(C4zR c4zR) {
        synchronized (c4zR.A04) {
            if (c4zR.A02 == null) {
                c4zR.A02 = new EvictingQueue(1000);
            }
        }
        return c4zR.A02;
    }

    public static final void A01(C4zR c4zR, String str) {
        synchronized (c4zR.A04) {
            EvictingQueue A00 = A00(c4zR);
            if (A00 != null) {
                A00.add(str);
            }
            C4zV A02 = c4zR.A02();
            if (A02 != null) {
                StringBuilder sb = c4zR.A03;
                sb.append(str);
                sb.append('\n');
                int i = c4zR.A01 + 1;
                c4zR.A01 = i;
                if (i >= 10) {
                    A02.A03.execute(new G33(A02, 11T.A02(sb)));
                    c4zR.A03 = AnonymousClass001.A0k();
                    c4zR.A01 = 0;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.4zU] */
    public C4zV A02() {
        C4zV c4zV;
        4zP r0 = (4zP) this;
        synchronized (r0) {
            1Mi r02 = (1Mi) 1Bi.A03(98404);
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bn.A0A(16450);
            Optional optional = r0.A00;
            if (optional == null) {
                C4zT c4zT = new C4zT();
                c4zT.A00 = 200;
                c4zT.A01 = 180;
                c4zT.A02 = 1;
                optional = ((1CO) r0.A01.get()).AZk(36316168985782073L) ? Optional.of(new C4zV(new Object() { // from class: X.4zU
                }, c4zT, r02, scheduledExecutorService)) : Absent.INSTANCE;
                r0.A00 = optional;
            }
            c4zV = (C4zV) optional.orNull();
        }
        return c4zV;
    }

    public String A03() {
        return "RtcAppBugReportLogger";
    }

    public final void A04(2QP r302) {
        11T.A0F(r302, 0);
        synchronized (this.A04) {
            this.A07.add(r302);
        }
    }

    public final void A05(2QP r302) {
        11T.A0F(r302, 0);
        synchronized (this.A04) {
            this.A07.remove(r302);
        }
    }
}
