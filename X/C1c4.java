package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: X.1c4, reason: invalid class name */
/* loaded from: 1c4.class */
public final class C1c4 extends 1Km {
    public volatile int A04;
    public volatile int[] A05;
    public final 1Br A01 = 1Bq.A00(65839);
    public final 1Br A00 = 1Bq.A00(65968);
    public final 1Br A02 = 1Bu.A00(16455);
    public volatile HashSet A03 = new HashSet();

    public C02S Au6() {
        IllegalStateException A0h;
        if (this.A04 == 0) {
            synchronized (this) {
                if (this.A04 == 0) {
                    this.A05 = ((1QN) this.A00.A00.get()).A00.A06;
                    int[] iArr = this.A05;
                    if (iArr != null) {
                        HashSet hashSet = new HashSet(02J.A00(iArr.length));
                        for (int i : iArr) {
                            hashSet.add(Integer.valueOf(i));
                        }
                        this.A03 = hashSet;
                        int[] iArr2 = this.A05;
                        if (iArr2 != null) {
                            this.A04 = iArr2.length;
                        } else {
                            A0h = 1BK.A0h();
                        }
                    } else {
                        A0h = 1BK.A0h();
                    }
                    throw A0h;
                }
            }
        }
        int[] iArr3 = this.A05;
        if (iArr3 != null) {
            return new C02S(Arrays.copyOf(iArr3, iArr3.length), null);
        }
        throw 1BK.A0h();
    }

    public void C5i(C03b c03b) {
        11T.A0F(c03b, 0);
        if (this.A03.contains(Integer.valueOf(c03b.getMarkerId()))) {
            ((Executor) this.A02.A00.get()).execute(new 3gH(this, c03b));
        }
    }

    public void Ctc(QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 0);
        1Qd r0 = (1Qd) this.A01.A00.get();
        if (((2yD) r0.A05.A00.get()).AZk(36322920675100756L)) {
            return;
        }
        r0.A0B = quickPerformanceLogger;
    }

    public String getName() {
        return "critical_path";
    }
}
