package com.facebook.sharedalbum.mca;

import X.1qX;
import X.91Q;
import X.9Pd;
import com.facebook.msys.mci.CQLResultSet;

/* loaded from: MailboxSharedAlbum$ExistingSharedAlbumsWithRangeObserverCallback.class */
public abstract class MailboxSharedAlbum$ExistingSharedAlbumsWithRangeObserverCallback {
    /* JADX WARN: Multi-variable type inference failed */
    private void callbackJNI(CQLResultSet cQLResultSet, CQLResultSet cQLResultSet2) {
        1qX r304 = null;
        1qX r305 = cQLResultSet == null ? null : new 1qX(cQLResultSet);
        if (cQLResultSet2 != null) {
            r304 = new 1qX(cQLResultSet2);
        }
        ((91Q) this).A00.setResult(new 9Pd(r305, r304));
    }
}
