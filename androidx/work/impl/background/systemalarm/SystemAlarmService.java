package androidx.work.impl.background.systemalarm;

import X.0FI;
import X.4IR;
import X.4IS;
import X.C01w;
import X.C08o;
import X.LRm;
import X.MC0;
import android.content.Intent;
import android.util.Log;
import androidx.lifecycle.LifecycleService;

/* loaded from: SystemAlarmService.class */
public class SystemAlarmService extends LifecycleService implements MC0 {
    public static final String A02 = 4IS.A01("SystemAlarmService");
    public LRm A00;
    public boolean A01;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, -488916408);
        int A04 = 0FI.A04(-28763192);
        super.onCreate();
        LRm lRm = new LRm(this);
        this.A00 = lRm;
        if (lRm.A02 != null) {
            4IS.A00();
            Log.e(LRm.A0B, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            lRm.A02 = this;
        }
        this.A01 = false;
        0FI.A0A(-207292783, A04);
        C08o.A02(-530772595, A00);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(-253960804);
        super.onDestroy();
        this.A01 = true;
        4IR r0 = this.A00;
        4IS.A00().A02(LRm.A0B, "Destroying SystemAlarmDispatcher");
        ((LRm) r0).A04.A03(r0);
        ((LRm) r0).A02 = null;
        0FI.A0A(563478687, A04);
        C01w.A00(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, 1318340339);
        int A04 = 0FI.A04(239442611);
        super.onStartCommand(intent, i, i2);
        if (this.A01) {
            4IS.A00();
            Log.i(A02, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            4IR r0 = this.A00;
            4IS A00 = 4IS.A00();
            String str = LRm.A0B;
            A00.A02(str, "Destroying SystemAlarmDispatcher");
            ((LRm) r0).A04.A03(r0);
            ((LRm) r0).A02 = null;
            LRm lRm = new LRm(this);
            this.A00 = lRm;
            if (lRm.A02 != null) {
                4IS.A00();
                Log.e(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                lRm.A02 = this;
            }
            this.A01 = false;
        }
        if (intent != null) {
            this.A00.A02(intent, i2);
        }
        0FI.A0A(-125523449, A04);
        C08o.A03(-2059691444, A01);
        return 3;
    }
}
