package X;

import java.io.File;

/* renamed from: X.5hq, reason: invalid class name */
/* loaded from: 5hq.class */
public final class C5hq implements Runnable {
    public static final String __redex_internal_original_name = "HeroManager$8";
    public final /* synthetic */ 5L4 A00;

    public C5hq(5L4 r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        5L4 r0 = this.A00;
        r0.A0C();
        if (r0.A09) {
            return;
        }
        5KV r02 = r0.A0F.cache;
        if (r02.allowOldCacheCleanup) {
            String str = r02.cacheDirectory;
            String str2 = r02.oldCacheDirectory;
            if (str.equalsIgnoreCase(str2)) {
                return;
            }
            r0.A09 = true;
            File A0E = AnonymousClass001.A0E(0Pz.A0W(str2, "/ExoPlayerCacheDir/videocache"));
            if (A0E.exists()) {
                5L4.A08(A0E);
            }
        }
    }
}
