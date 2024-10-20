package com.facebook.xanalytics.provider;

import X.0Pz;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1M9;
import X.1gT;
import X.2Jm;
import X.AbstractC05764eu;
import X.AnonymousClass001;
import X.C00i;
import X.C0es;
import X.S3p;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.facebook.xanalytics.XAnalyticsNative;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: NativeXAnalyticsProvider.class */
public final class NativeXAnalyticsProvider implements 1gT {
    public static final String A07 = NativeXAnalyticsProvider.class.toString();
    public final XAnalyticsNative A03;
    public final String A04;
    public final ScheduledExecutorService A05;
    public final C0es A06;
    public final C00i A02 = 1BQ.A02(33032);
    public final C00i A01 = 1BQ.A02(66191);
    public ScheduledFuture A00 = null;

    public NativeXAnalyticsProvider() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16464);
        C0es c0es = (C0es) 1Bn.A0A(83607);
        Context A00 = FbInjector.A00();
        this.A06 = c0es;
        XAnalyticsNative xAnalyticsNative = new XAnalyticsNative();
        this.A03 = xAnalyticsNative;
        String absolutePath = 1M9.A00(A00).AUq((2Jm) null, 1651433207).getAbsolutePath();
        this.A04 = absolutePath;
        String AXB = c0es.AXB();
        String A0j = 0Pz.A0j(c0es.AXB(), "|", c0es.AXF());
        S3p s3p = new S3p(this);
        String[] strArr = {AXB, A0j, absolutePath, "graph.facebook.com"};
        if ("graph.facebook.com".length() == 0) {
            strArr[3] = "graph.facebook.com";
        }
        if (scheduledExecutorService == null) {
            throw AnonymousClass001.A0L("Executor Required for xAnalytics");
        }
        xAnalyticsNative.init(strArr, s3p, null, scheduledExecutorService, 97, 11, 51200);
        this.A05 = scheduledExecutorService;
        AbstractC05764eu.A00(NativeXAnalyticsProvider.class);
    }

    public /* bridge */ /* synthetic */ XAnalyticsHolder BL6() {
        return this.A03;
    }
}
