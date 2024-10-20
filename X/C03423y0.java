package X;

import android.app.ActivityManager;

/* renamed from: X.3y0, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3y0.class */
public final class C03423y0 implements InterfaceC03403xy {
    @Override // X.InterfaceC03403xy
    public String AMN() {
        return "perf_stats";
    }

    @Override // X.InterfaceC03403xy
    public long BeG() {
        return 4294968080L;
    }

    @Override // X.InterfaceC03403xy
    public void CDW(C03b c03b) {
        ActivityManager.MemoryInfo memoryInfo;
        long j;
        0uR B2U = c03b.B2U();
        if (B2U != null && B2U.A0H) {
            0Gn AxQ = c03b.AxQ();
            0Gn.A00(AxQ);
            AxQ.A01.add("cpu_stats");
            c03b.AxQ().A02("start_pri", B2U.A00);
            c03b.AxQ().A02("stop_pri", B2U.A01);
            c03b.AxQ().A03("ps_cpu_ms", B2U.A07);
            long j2 = B2U.A0A;
            if (j2 != -1) {
                c03b.AxQ().A03("th_cpu_ms", j2);
            }
            c03b.AxQ().A06("low_power_state", B2U.A0G);
        }
        15M B2U2 = c03b.B2U();
        if (B2U2 != null && ((0uR) B2U2).A0H) {
            0Gn AxQ2 = c03b.AxQ();
            0Gn.A00(AxQ2);
            AxQ2.A01.add("io_stats");
            c03b.AxQ().A03("ps_flt", ((0uR) B2U2).A08);
            c03b.AxQ().A03("proc_delayacct_blkio_ticks", ((0uR) B2U2).A06);
            0Gn AxQ3 = c03b.AxQ();
            C0bq c0bq = ((0uR) B2U2).A0F;
            AxQ3.A02("loaded_libs", c0bq != null ? c0bq.A00 : -1);
            long j3 = ((0uR) B2U2).A0B;
            long j4 = -1;
            if (j3 != j4) {
                c03b.AxQ().A03("th_flt", j3);
            }
            15M r0 = B2U2;
            c03b.AxQ().A02("class_load_attempts", r0.A0A.A00);
            c03b.AxQ().A02("dex_queries", r0.A0A.A02);
            c03b.AxQ().A02("class_loads_failed", r0.A0A.A01);
            c03b.AxQ().A02("locator_assists", r0.A0A.A04);
            c03b.AxQ().A02("wrong_dfa_guesses", r0.A0A.A03);
            long j5 = ((0uR) B2U2).A03;
            if (j5 != j4) {
                c03b.AxQ().A03("allocstall", j5);
            }
            long j6 = ((0uR) B2U2).A04;
            if (j6 != j4) {
                c03b.AxQ().A03("pages_in", j6);
            }
            long j7 = ((0uR) B2U2).A05;
            if (j7 != j4) {
                c03b.AxQ().A03("pages_out", j7);
            }
            c03b.AxQ().A03("ps_min_flt", ((0uR) B2U2).A09);
            0Gn AxQ4 = c03b.AxQ();
            if (((0uR) B2U2).A0E == null) {
                j = -1;
            } else {
                0HD r02 = 0HC.A00;
                r02.A00.block();
                j = r02.A03.get();
            }
            AxQ4.A03("avail_disk_spc_kb", j);
            0Xi r03 = ((0uR) B2U2).A0D;
            if (r03 != null) {
                long j8 = r03.A01;
                if (j8 != j4) {
                    c03b.AxQ().A03("io_readbytes", j8);
                    0Gn AxQ5 = c03b.AxQ();
                    0Xi r04 = ((0uR) B2U2).A0D;
                    AxQ5.A03("io_readchars", r04 != null ? r04.A02 : -1);
                    0Gn AxQ6 = c03b.AxQ();
                    0Xi r05 = ((0uR) B2U2).A0D;
                    AxQ6.A03("io_readsyscalls", r05 != null ? r05.A03 : -1);
                    0Gn AxQ7 = c03b.AxQ();
                    0Xi r06 = ((0uR) B2U2).A0D;
                    AxQ7.A03("io_writebytes", r06 != null ? r06.A04 : -1);
                    0Gn AxQ8 = c03b.AxQ();
                    0Xi r07 = ((0uR) B2U2).A0D;
                    AxQ8.A03("io_writechars", r07 != null ? r07.A05 : -1);
                    0Gn AxQ9 = c03b.AxQ();
                    0Xi r08 = ((0uR) B2U2).A0D;
                    AxQ9.A03("io_writesyscalls", r08 != null ? r08.A06 : -1);
                    0Gn AxQ10 = c03b.AxQ();
                    0Xi r09 = ((0uR) B2U2).A0D;
                    AxQ10.A03("io_cancelledwb", r09 != null ? r09.A00 : -1);
                }
            }
        }
        15M B2U3 = c03b.B2U();
        if (B2U3 != null && ((0uR) B2U3).A0H && (memoryInfo = ((0uR) B2U3).A0C) != null) {
            0Gn AxQ11 = c03b.AxQ();
            0Gn.A00(AxQ11);
            AxQ11.A01.add("memory_stats");
            c03b.AxQ().A03("avail_mem", memoryInfo.availMem);
            c03b.AxQ().A03("low_mem", memoryInfo.threshold);
            c03b.AxQ().A03("total_mem", memoryInfo.totalMem);
            15M r010 = B2U3;
            c03b.AxQ().A03("native_heap_at_start", r010.A01);
            c03b.AxQ().A03("java_heap_at_start", r010.A00);
        }
        15M B2U4 = c03b.B2U();
        if (B2U4 == null || !((0uR) B2U4).A0H) {
            return;
        }
        15M r011 = B2U4;
        long j9 = r011.A04;
        long j10 = r011.A07;
        long j11 = r011.A06;
        long j12 = r011.A09;
        long j13 = r011.A05;
        long j14 = r011.A08;
        long j15 = r011.A02;
        long j16 = r011.A03;
        long j17 = -1;
        if (j9 == j17 && j11 == j17 && j13 == j17 && j15 == j17 && j16 == j17) {
            return;
        }
        0Gn AxQ12 = c03b.AxQ();
        0Gn.A00(AxQ12);
        AxQ12.A01.add("perf_event_info");
        if (j9 != j17) {
            c03b.AxQ().A03("user_instruction_count", j9);
        }
        if (j10 != j17) {
            c03b.AxQ().A03("user_kernel_instruction_count", j10);
        }
        if (j11 != j17) {
            c03b.AxQ().A03("user_instruction_count_ps", j11);
        }
        if (j12 != j17) {
            c03b.AxQ().A03("user_kernel_instruction_count_ps", j12);
        }
        if (j13 != j17) {
            c03b.AxQ().A03("user_instruction_count_main_th", j13);
        }
        if (j14 != j17) {
            c03b.AxQ().A03("user_kernel_instruction_count_main_th", j14);
        }
        if (j15 != j17) {
            c03b.AxQ().A03("perf_cpu_clock", j15);
        }
        if (j16 != j17) {
            c03b.AxQ().A03("perf_task_clock", j16);
        }
    }
}
