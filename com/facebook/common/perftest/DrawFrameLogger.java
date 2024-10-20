package com.facebook.common.perftest;

import X.1Bi;
import X.1MM;
import X.AnonymousClass001;
import X.C1pl;
import X.C62l;
import X.Jvr;
import com.google.common.base.Preconditions;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: DrawFrameLogger.class */
public class DrawFrameLogger {
    public static long A05 = 255;
    public static int A06;
    public static boolean A07;
    public long A00;
    public C62l A01;
    public C1pl A02;
    public boolean A03;
    public final PerfTestConfig A04;
    public static final long[] A0A = new long[6000];
    public static final long[] A09 = new long[6000];
    public static final long[] A08 = new long[6000];

    public DrawFrameLogger() {
        PerfTestConfig perfTestConfig = (PerfTestConfig) 1Bi.A03(16592);
        C62l c62l = (C62l) 1Bi.A03(131273);
        this.A00 = -1;
        this.A03 = false;
        Preconditions.checkArgument(1MM.A01);
        this.A04 = perfTestConfig;
        this.A01 = c62l;
        this.A02 = new Jvr(this, 0);
        clearFrameRateLog();
    }

    public static void clearFrameRateLog() {
        A06 = 0;
        int i = 0;
        do {
            A0A[i] = 0;
            A09[i] = 0;
            A08[i] = 0;
            i++;
        } while (i < 6000);
        A07 = false;
        A05 = -1;
    }

    public static JSONObject getFrameRateLogJSON() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("markerLag", A05);
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        int i = 0;
        do {
            long j = A0A[i];
            if (j == 0) {
                break;
            }
            jSONArray.put(i, j);
            jSONArray2.put(i, A09[i]);
            jSONArray3.put(i, A08[i]);
            i++;
        } while (i < 6000);
        A12.put("frameTimestampBuffer", jSONArray);
        A12.put("frameSystemTimeBuffer", jSONArray2);
        A12.put("frameElapsedMsBuffer", jSONArray3);
        return A12;
    }
}
