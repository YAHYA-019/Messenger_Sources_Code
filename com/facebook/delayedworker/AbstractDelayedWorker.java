package com.facebook.delayedworker;

import X.4cG;
import X.C00g;
import android.content.Context;
import com.facebook.ui.media.cache.FileCacheDelayedWorker;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AbstractDelayedWorker.class */
public abstract class AbstractDelayedWorker implements C00g {
    public Context A00;

    public void A00() {
    }

    public void A01() {
        FileCacheDelayedWorker fileCacheDelayedWorker = (FileCacheDelayedWorker) this;
        Set set = fileCacheDelayedWorker.A01;
        long j = 0;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                j = Math.max(((4cG) it.next()).AFl(5184000000L), j);
            }
        }
        fileCacheDelayedWorker.A00.A00.A01(FileCacheDelayedWorker.class, j > 0 ? ((5184000000L - j) / 1000) + 86400 : 5184000L);
    }

    @Override // X.C00g
    public Context getContext() {
        return this.A00;
    }
}
