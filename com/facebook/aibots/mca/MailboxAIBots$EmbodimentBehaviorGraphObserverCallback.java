package com.facebook.aibots.mca;

import X.1qX;
import X.8EG;
import X.9QB;
import com.facebook.msys.mci.CQLResultSet;

/* loaded from: MailboxAIBots$EmbodimentBehaviorGraphObserverCallback.class */
public abstract class MailboxAIBots$EmbodimentBehaviorGraphObserverCallback {
    private void callbackJNI(CQLResultSet cQLResultSet, CQLResultSet cQLResultSet2, CQLResultSet cQLResultSet3) {
        1qX r305 = null;
        1qX r306 = cQLResultSet == null ? null : new 1qX(cQLResultSet);
        1qX r307 = cQLResultSet2 == null ? null : new 1qX(cQLResultSet2);
        if (cQLResultSet3 != null) {
            r305 = new 1qX(cQLResultSet3);
        }
        ((8EG) this).A00.setResult(new 9QB(r306, r307, r305));
    }
}
