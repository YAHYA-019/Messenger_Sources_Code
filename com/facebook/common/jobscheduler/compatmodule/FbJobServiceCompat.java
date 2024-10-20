package com.facebook.common.jobscheduler.compatmodule;

import X.0FI;
import X.C08o;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* loaded from: FbJobServiceCompat.class */
public abstract class FbJobServiceCompat extends JobServiceCompat {
    public boolean A00 = false;

    @Override // android.app.Service
    public void onCreate() {
        int i;
        int A00 = C08o.A00(this, -194531382);
        int A04 = 0FI.A04(1857017816);
        super.onCreate();
        if (this.A00) {
            0FI.A0A(-373923090, A04);
            i = 438021206;
        } else {
            this.A00 = true;
            0FI.A0A(-1224125329, A04);
            i = -366789025;
        }
        C08o.A02(i, A00);
    }
}
