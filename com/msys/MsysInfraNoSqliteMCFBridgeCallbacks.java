package com.msys;

import X.0fH;
import X.38M;
import X.3DG;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.Execution;
import java.util.Set;

/* loaded from: MsysInfraNoSqliteMCFBridgeCallbacks.class */
public class MsysInfraNoSqliteMCFBridgeCallbacks {

    /* loaded from: MsysInfraNoSqliteMCFBridgeCallbacks$MCIAuxiliaryDatabasesActivationCallback.class */
    public abstract class MCIAuxiliaryDatabasesActivationCallback {
        private void callbackJNI(int i, MsysError msysError) {
            3DG r0 = (3DG) this;
            if (msysError != null) {
                0fH.A14("MessengerMsysMailboxConfig", "aux db open error: %s", new Object[]{Integer.valueOf(i), msysError});
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            0fH.A0g(valueOf, "MessengerMsysMailboxConfig", "aux db open: %s");
            Set set = r0.A02;
            set.remove(valueOf);
            if (set.isEmpty()) {
                Execution.executeAsync(new 38M(r0), r0.A01, 1);
            }
        }
    }
}
