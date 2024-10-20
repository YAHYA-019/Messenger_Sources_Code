package X;

import com.facebook.inspiration.composer.sprouts.framework.ranking.InspirationSproutSurfaceDiskStorage;

/* loaded from: G03.class */
public final class G03 implements Runnable {
    public static final String __redex_internal_original_name = "InspirationSproutSurfaceDiskStorage$prefetchDataWithoutFix$1";
    public final /* synthetic */ InspirationSproutSurfaceDiskStorage A00;

    public G03(InspirationSproutSurfaceDiskStorage inspirationSproutSurfaceDiskStorage) {
        this.A00 = inspirationSproutSurfaceDiskStorage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InspirationSproutSurfaceDiskStorage inspirationSproutSurfaceDiskStorage = this.A00;
        String A03 = InspirationSproutSurfaceDiskStorage.A03(inspirationSproutSurfaceDiskStorage, "homebase_ranking_info");
        inspirationSproutSurfaceDiskStorage.A01 = A03 == null ? null : InspirationSproutSurfaceDiskStorage.A01(A03);
        InspirationSproutSurfaceDiskStorage.A04(inspirationSproutSurfaceDiskStorage);
    }
}
