package com.google.android.gms.analytics;

import X.0FI;
import X.AnonymousClass001;
import X.C01w;
import X.C08o;
import X.K6g;
import X.L24;
import X.L9t;
import X.LCw;
import X.MGH;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: AnalyticsService.class */
public final class AnalyticsService extends Service implements MGH {
    public L24 A00;

    public final void DCB(JobParameters jobParameters, boolean z) {
        throw AnonymousClass001.A0p();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (this.A00 != null) {
            return null;
        }
        this.A00 = new L24(this);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A00 = C08o.A00(this, 290715201);
        int A04 = 0FI.A04(1563828197);
        super.onCreate();
        L24 l24 = this.A00;
        if (l24 == null) {
            l24 = new L24(this);
            this.A00 = l24;
        }
        K6g k6g = L9t.A01(l24.A00).A0C;
        L9t.A02(k6g);
        LCw.A0A(k6g, "Local AnalyticsService is starting up", 2);
        0FI.A0A(1783207508, A04);
        C08o.A02(-1896330238, A00);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = 0FI.A04(-657970395);
        L24 l24 = this.A00;
        if (l24 == null) {
            l24 = new L24(this);
            this.A00 = l24;
        }
        K6g k6g = L9t.A01(l24.A00).A0C;
        L9t.A02(k6g);
        LCw.A0A(k6g, "Local AnalyticsService is shutting down", 2);
        super.onDestroy();
        0FI.A0A(1303338529, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, -279201795);
        int A04 = 0FI.A04(-273301568);
        L24 l24 = this.A00;
        if (l24 == null) {
            l24 = new L24(this);
            this.A00 = l24;
        }
        int A012 = l24.A01(intent, i2);
        0FI.A0A(168731270, A04);
        C08o.A03(1554478188, A01);
        return A012;
    }
}
