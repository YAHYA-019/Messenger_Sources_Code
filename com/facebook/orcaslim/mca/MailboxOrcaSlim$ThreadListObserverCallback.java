package com.facebook.orcaslim.mca;

import X.1qW;
import X.1qX;
import X.1qY;
import com.facebook.msys.mci.CQLResultSet;
import java.util.Set;

/* loaded from: MailboxOrcaSlim$ThreadListObserverCallback.class */
public abstract class MailboxOrcaSlim$ThreadListObserverCallback {
    private void callbackJNI(CQLResultSet cQLResultSet, CQLResultSet cQLResultSet2, Set set, boolean z, int i) {
        1qX r307 = null;
        1qX r308 = cQLResultSet == null ? null : new 1qX(cQLResultSet);
        if (cQLResultSet2 != null) {
            r307 = new 1qX(cQLResultSet2);
        }
        callback(r308, r307, set, z, i);
    }

    public abstract void callback(1qW r1, 1qY r2, Set set, boolean z, int i);
}
