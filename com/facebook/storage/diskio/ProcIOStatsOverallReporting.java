package com.facebook.storage.diskio;

import X.0Xi;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1UG;
import X.2yD;
import X.4YU;
import X.4YV;
import X.C0d7;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: ProcIOStatsOverallReporting.class */
public final class ProcIOStatsOverallReporting {
    public int A00;
    public long A01;
    public 0Xi A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final boolean A06;

    public ProcIOStatsOverallReporting() {
        1Br A00 = 1Bq.A00(16386);
        this.A04 = A00;
        this.A06 = ((2yD) A00.A00.get()).AZk(18296869918673601L);
        this.A03 = 1Bq.A00(16634);
        this.A05 = 1Bq.A00(84490);
    }

    public static final int A00(long j) {
        if (j <= 2147483647L) {
            return (int) j;
        }
        C0d7.A09("ProcIOStats", "Hit Max Integer limit, due to USL limits");
        return (-1) >>> 1;
    }

    public static final void A01(0Xi r301, ProcIOStatsOverallReporting procIOStatsOverallReporting, int i) {
        long now = ((RealtimeSinceBootClock) procIOStatsOverallReporting.A05.A00.get()).now();
        if (r301 != null && procIOStatsOverallReporting.A02 != null) {
            1UG A08 = 1BK.A08(1Br.A02(procIOStatsOverallReporting.A03), 1BJ.A00(1945));
            long j = now - procIOStatsOverallReporting.A01;
            if (A08.isSampled()) {
                0Xi r0 = procIOStatsOverallReporting.A02;
                11T.A0D(r0);
                0Xi A01 = r301.A01(r0);
                A08.A5q("cancelled_write_bytes", Integer.valueOf(A00(A01.A00)));
                A08.A7R("elapsed_ms", String.valueOf(j));
                A08.A5q("elapsed_s", Integer.valueOf((int) 4YU.A06(j)));
                A08.A5H(TraceFieldType.IsForeground, Boolean.valueOf(4YV.A1U(procIOStatsOverallReporting.A00)));
                A08.A5q("read_bytes", Integer.valueOf(A00(A01.A01)));
                A08.A5q("read_chars", Integer.valueOf(A00(A01.A02)));
                A08.A5q("read_sys_calls", Integer.valueOf(A00(A01.A03)));
                A08.A5q("write_bytes", Integer.valueOf(A00(A01.A04)));
                A08.A5q("write_chars", Integer.valueOf(A00(A01.A05)));
                A08.A5q("write_sys_calls", Integer.valueOf(A00(A01.A06)));
                A08.BZL();
            }
        }
        procIOStatsOverallReporting.A02 = r301;
        procIOStatsOverallReporting.A00 = i;
        procIOStatsOverallReporting.A01 = now;
    }
}
