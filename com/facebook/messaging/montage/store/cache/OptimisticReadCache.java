package com.facebook.messaging.montage.store.cache;

import X.1Lo;
import X.6uX;
import X.AbI;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Collections;
import java.util.Set;

/* loaded from: OptimisticReadCache.class */
public final class OptimisticReadCache {
    public final Set A00 = Collections.synchronizedSet(AbI.A07());
    public final 6uX A01;

    public OptimisticReadCache(FbUserSession fbUserSession) {
        this.A01 = (6uX) 1Lo.A06(fbUserSession, 85200);
    }
}
