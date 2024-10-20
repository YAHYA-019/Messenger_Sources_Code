package com.facebook.xapp.messaging.clockskew;

import X.0fH;
import X.1BQ;
import X.4Yg;
import X.BPR;
import X.C00i;
import X.C4Av;
import X.CHG;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: ClockSkewCheckConditionalWorker.class */
public final class ClockSkewCheckConditionalWorker implements C4Av, CallerContextable {
    public final C00i A00 = 1BQ.A02(84726);

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        if (!r302.A01()) {
            return false;
        }
        0fH.A0j("com.facebook.xapp.messaging.clockskew.ClockSkewCheckConditionalWorker", "Starting clock skew check in bg");
        try {
            ((CHG) this.A00.get()).A00();
            return true;
        } catch (BPR e) {
            0fH.A0r("com.facebook.xapp.messaging.clockskew.ClockSkewCheckConditionalWorker", "Exception in running ClockSkewCheckConditionalWorker", e);
            return false;
        }
    }
}
