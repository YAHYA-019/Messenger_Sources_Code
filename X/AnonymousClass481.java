package X;

import com.facebook.common.perfcounter.PerfCounter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* renamed from: X.481, reason: invalid class name */
/* loaded from: 481.class */
public final class AnonymousClass481 extends 2Lg {
    public static long A00(String str, java.util.Map map) {
        Number number = (Number) map.get(str);
        return number != null ? number.longValue() : -1;
    }

    public static void A01(C03b c03b, String str, long j, long j2) {
        long j3 = -1;
        if (j == j3 || j2 == j3) {
            return;
        }
        c03b.AxQ().A03(str, j2 - j);
    }

    public /* bridge */ /* synthetic */ Object A02() {
        C4Tw c4Tw = new C4Tw();
        HashMap A0u = AnonymousClass001.A0u();
        synchronized (PerfCounter.locK) {
            if (PerfCounter.callerCount != 0) {
                PerfCounter.nativeReport(A0u);
            }
        }
        c4Tw.A05 = A00("user-only-instructions", A0u);
        c4Tw.A02 = A00("user-kernel-instructions", A0u);
        c4Tw.A07 = A00("process-user-only-instructions", A0u);
        c4Tw.A04 = A00("process-user-kernel-instructions", A0u);
        c4Tw.A06 = A00("main-th-user-only-instructions", A0u);
        c4Tw.A03 = A00("main-th-user-kernel-instructions", A0u);
        c4Tw.A00 = A00("perf_cpu_clock", A0u);
        c4Tw.A01 = A00("perf_task_clock", A0u);
        return c4Tw;
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        C4Tw c4Tw = (C4Tw) obj;
        C4Tw c4Tw2 = (C4Tw) obj2;
        if (c4Tw != null && c4Tw2 != null) {
            A01(r302, "user_instruction_count", c4Tw.A05, c4Tw2.A05);
            A01(r302, "user_instruction_count_ps", c4Tw.A07, c4Tw2.A07);
            A01(r302, "user_instruction_count_main_th", c4Tw.A06, c4Tw2.A06);
            A01(r302, "user_kernel_instruction_count", c4Tw.A02, c4Tw2.A02);
            A01(r302, "user_kernel_instruction_count_ps", c4Tw.A04, c4Tw2.A04);
            A01(r302, "user_kernel_instruction_count_main_th", c4Tw.A03, c4Tw2.A03);
            A01(r302, "perf_cpu_clock", c4Tw.A00, c4Tw2.A00);
            A01(r302, "perf_task_clock", c4Tw.A01, c4Tw2.A01);
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "perf_event_info";
    }

    public int B5R() {
        return 33;
    }

    public Class BBP() {
        return C4Tw.class;
    }

    public boolean BS6(2Lc r302) {
        return PerfCounter.isEnabled();
    }

    public /* bridge */ /* synthetic */ void D2e(Object obj) {
        PerfCounter.end();
    }
}
