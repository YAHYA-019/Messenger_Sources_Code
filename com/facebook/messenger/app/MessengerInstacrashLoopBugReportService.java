package com.facebook.messenger.app;

import X.0FI;
import X.1BQ;
import X.1Bi;
import X.1Gz;
import X.1Mg;
import X.5TL;
import X.C00i;
import X.C01o;
import X.C08o;
import X.EPO;
import X.ExU;
import X.F6w;
import X.Frp;
import X.GFD;
import X.JVp;
import X.RsB;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

/* loaded from: MessengerInstacrashLoopBugReportService.class */
public class MessengerInstacrashLoopBugReportService extends Service {
    public 1Mg A00;
    public GFD A02 = new RsB(this);
    public final IBinder A05 = new JVp(this);
    public GFD A01 = this.A02;
    public final 1Gz A03 = new C01o(new Frp(this, 3), "com.facebook.bugreporter.BUG_REPORT_FLOW_FINISHED_ACTION");
    public final C00i A04 = 1BQ.A02(49736);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.A05;
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, -1203572749);
        int A04 = 0FI.A04(-970069212);
        super.onCreate();
        this.A00 = (1Mg) 1Bi.A03(100175);
        IntentFilter intentFilter = new IntentFilter("com.facebook.bugreporter.BUG_REPORT_FLOW_FINISHED_ACTION");
        1Mg r0 = this.A00;
        r0.getClass();
        r0.A01.A01(this.A03, intentFilter);
        5TL r02 = (5TL) this.A04.get();
        ExU exU = new ExU();
        exU.A00(getApplicationContext());
        exU.A01(EPO.A0K);
        exU.A0B = true;
        exU.A0T = true;
        r02.A0C(new F6w(exU));
        0FI.A0A(158304491, A04);
        C08o.A02(-1004735458, A00);
    }
}
