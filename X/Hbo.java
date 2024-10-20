package X;

import android.util.LruCache;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Hbo.class */
public final class Hbo {
    public final ScheduledExecutorService A01 = Executors.newSingleThreadScheduledExecutor();
    public final LruCache A00 = new LruCache(3);
}
