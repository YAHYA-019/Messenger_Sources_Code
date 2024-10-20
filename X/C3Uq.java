package X;

import com.facebook.imagepipeline.module.BitmapPoolStatsTracker;
import com.facebook.imagepipeline.module.NativeMemoryChunkPoolStatsTracker;
import com.facebook.imagepipeline.module.SmallByteArrayPoolStatsTracker;
import java.util.List;

/* renamed from: X.3Uq, reason: invalid class name */
/* loaded from: 3Uq.class */
public final class C3Uq implements InterfaceC08314mj {
    public final 2H8 A00 = (2H8) 1Bi.A04(2H8.class);

    @Override // X.InterfaceC08314mj
    public 2Jy AU5(String str, long j) {
        2Jy r0;
        synchronized (this) {
            r0 = new 2Jy("image_pipeline_counters");
            2H8 r02 = this.A00;
            synchronized (r02) {
                List list = r02.A02;
                if (!list.isEmpty()) {
                    r0.A09(list, "image_cache_stats_counter");
                    list.clear();
                }
            }
            ((2Ci) 1Bi.A05(2Ci.class, NativeMemoryChunkPoolStatsTracker.class)).A5V(r0);
            ((2Ci) 1Bi.A05(2Ci.class, SmallByteArrayPoolStatsTracker.class)).A5V(r0);
            ((2Ci) 1Bi.A05(2Ci.class, BitmapPoolStatsTracker.class)).A5V(r0);
            r0.A0D("pigeon_reserved_keyword_module", "image_pipeline");
        }
        return r0;
    }
}
