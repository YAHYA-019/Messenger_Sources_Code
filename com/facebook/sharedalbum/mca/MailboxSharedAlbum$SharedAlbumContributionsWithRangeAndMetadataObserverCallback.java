package com.facebook.sharedalbum.mca;

import X.1qX;
import X.91R;
import X.9T4;
import com.facebook.msys.mci.CQLResultSet;

/* loaded from: MailboxSharedAlbum$SharedAlbumContributionsWithRangeAndMetadataObserverCallback.class */
public abstract class MailboxSharedAlbum$SharedAlbumContributionsWithRangeAndMetadataObserverCallback {
    /* JADX WARN: Multi-variable type inference failed */
    private void callbackJNI(CQLResultSet cQLResultSet, CQLResultSet cQLResultSet2, CQLResultSet cQLResultSet3, CQLResultSet cQLResultSet4) {
        1qX r306 = null;
        1qX r307 = cQLResultSet == null ? null : new 1qX(cQLResultSet);
        1qX r308 = cQLResultSet2 == null ? null : new 1qX(cQLResultSet2);
        1qX r309 = cQLResultSet3 == null ? null : new 1qX(cQLResultSet3);
        if (cQLResultSet4 != null) {
            r306 = new 1qX(cQLResultSet4);
        }
        ((91R) this).A00.setResult(new 9T4(r307, r308, r309, r306));
    }
}
