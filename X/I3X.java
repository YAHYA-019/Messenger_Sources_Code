package X;

import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;

/* loaded from: I3X.class */
public final class I3X {
    public ARDFileCache A00;
    public ARDFileCache A01;
    public final C00i A03 = 1BQ.A02(16967);
    public final C00i A02 = 1BV.A00(98883);

    private StashARDFileCache A00(int i, long j) {
        2Jh r0 = (2Jh) this.A03.get();
        2Ji r02 = new 2Ji();
        r02.A05 = "<override-ignore>";
        r02.A09 = false;
        r02.A01 = new C1Z7(j, j, j, false, false);
        return new StashARDFileCache(j, 2Jh.A01(r0, 2Jh.A02(new 2Jj(r02), i), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache] */
    public ARDFileCache A01() {
        StashARDFileCache stashARDFileCache = this.A00;
        if (stashARDFileCache == null) {
            this.A02.get();
            stashARDFileCache = A00(584232554, 50 << 20);
            this.A00 = stashARDFileCache;
        }
        return stashARDFileCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache] */
    public ARDFileCache A02() {
        StashARDFileCache stashARDFileCache = this.A01;
        if (stashARDFileCache == null) {
            this.A02.get();
            stashARDFileCache = A00(206282182, 50 << 20);
            this.A01 = stashARDFileCache;
        }
        return stashARDFileCache;
    }
}
