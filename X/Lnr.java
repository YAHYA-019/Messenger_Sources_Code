package X;

import com.facebook.video.analytics.cache.data.CacheItemTrackingData;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: Lnr.class */
public final class Lnr implements Runnable {
    public static final String __redex_internal_original_name = "CacheInstrumentationEventHandler$handleEventBatch$1";
    public final /* synthetic */ 6Dh A00;
    public final /* synthetic */ Jw1 A01;

    public Lnr(6Dh r302, Jw1 jw1) {
        this.A00 = r302;
        this.A01 = jw1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0055. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v258, types: [com.facebook.video.analytics.cache.data.CacheItemTrackingData, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ExecutorService A1G;
        String str;
        Runnable runnable;
        6Dh r0 = this.A00;
        Iterator it = this.A01.mCacheInstrumentationEvents.iterator();
        while (it.hasNext()) {
            LiX liX = (LiX) it.next();
            if (liX != null) {
                C00j.A05("CacheInstrumentationEventHandler.handleEvent", -1474765476);
                try {
                    KND knd = liX.mOperation;
                    if (knd != null) {
                        switch (knd) {
                            case SPAN_ADDED:
                                String A01 = 6Dh.A01(r0, liX);
                                if (A01 != null && 6Dh.A00(r0, A01) == null) {
                                    5Lw r308 = 5Lw.A03;
                                    String str2 = liX.mRequestType;
                                    if (str2 != null) {
                                        try {
                                            r308 = 5Lw.valueOf(str2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                    long j = liX.mTimestamp;
                                    String str3 = liX.mKey;
                                    String str4 = liX.mAssetUrl;
                                    String str5 = liX.mSourceModule;
                                    String obj = r308.toString();
                                    long j2 = liX.mPosition;
                                    long j3 = j2 + liX.mLength;
                                    boolean A1W = AnonymousClass001.A1W(r308, 5Lw.A02);
                                    String str6 = liX.mPrefetchTag;
                                    boolean z = liX.mIsSecondPhasePrefetch;
                                    String str7 = liX.mSubOrigin;
                                    long j4 = !A1W ? j : -1;
                                    String A13 = str5 != null ? 1BK.A13(str5) : str5;
                                    long j5 = j3 - j2;
                                    boolean z2 = !A1W;
                                    long j6 = -1;
                                    double d = 0.0d / 0.0d;
                                    ?? obj2 = new Object();
                                    obj2.inserted = j;
                                    obj2.evicted = j6;
                                    obj2.firstAccessed = j4;
                                    obj2.lastAccessed = j4;
                                    String str8 = A13;
                                    obj2.module = A13;
                                    obj2.sizeInBytes = j5;
                                    obj2.fetchType = obj;
                                    obj2.evictionReason = null;
                                    obj2.numHits = 0;
                                    obj2.accessed = z2;
                                    obj2.position = j2;
                                    obj2.endPosition = j3;
                                    obj2.itemId = str3;
                                    obj2.itemUrl = str4;
                                    obj2.prefetchTag = str6;
                                    obj2.prefetchModule = str5;
                                    obj2.isSecondPhasePrefetch = z;
                                    obj2.playerSubOrigin = str7;
                                    A1G = GOp.A1G(r0.A06);
                                    new J1L(r0, (CacheItemTrackingData) obj2, A01);
                                    A1G.execute(runnable);
                                }
                                C00j.A01(-1610740370);
                                break;
                            case SPAN_REMOVED:
                                String A012 = 6Dh.A01(r0, liX);
                                if (A012 != null) {
                                    CacheItemTrackingData A00 = 6Dh.A00(r0, A012);
                                    if (A00 != null) {
                                        long j7 = liX.mTimestamp;
                                        String str9 = liX.mEvictionReason;
                                        A00.evicted = j7;
                                        A00.evictionReason = str9;
                                        C00i c00i = r0.A05.A00;
                                        if (!((1CO) c00i.get()).AZk(36310920569095669L)) {
                                            1UG A08 = 1BK.A08(1Br.A02(r0.A04), "fb_video_cache_item_evicted");
                                            if (A08.isSampled()) {
                                                A08.A5Z("ts_insertion", Double.valueOf(A00.inserted));
                                                A08.A5Z("ts_eviction", Double.valueOf(A00.evicted));
                                                A08.A7R("cache_name", liX.mCacheName);
                                                String str10 = A00.fetchType;
                                                str = "unknown";
                                                if (str10 == null) {
                                                    str10 = str;
                                                }
                                                A08.A7R("insertion_reason", str10);
                                                String str11 = A00.evictionReason;
                                                A08.A7R("eviction_reason", str11 != null ? str11 : "unknown");
                                                A08.A6H("cache_hits", 1BK.A0l(A00.numHits));
                                                A08.A5H("is_second_phase_prefetch", Boolean.valueOf(A00.isSecondPhasePrefetch));
                                                A08.A7R("prefetch_module", A00.prefetchModule);
                                                A08.A7R("prefetch_tag", A00.prefetchTag);
                                                A08.A7R("asset_id", A00.itemId);
                                                A08.A7R("insertion_module", A00.module);
                                                A08.A6H("item_size", Long.valueOf(A00.sizeInBytes));
                                                A08.A5Z("ts_first_access", Double.valueOf(A00.firstAccessed));
                                                A08.A5Z("ts_last_access", Double.valueOf(A00.lastAccessed));
                                                A08.BZL();
                                            }
                                        } else if (((1CO) c00i.get()).AZk(36310920569161206L)) {
                                            ((Executor) r0.A02.get()).execute(new Lnq(A00, liX));
                                        }
                                        A1G = GOp.A1G(r0.A06);
                                        new IyS(r0, A012);
                                        A1G.execute(runnable);
                                    }
                                }
                                C00j.A01(-1610740370);
                                break;
                            case SPAN_TOUCHED:
                                String A013 = 6Dh.A01(r0, liX);
                                if (A013 != null) {
                                    CacheItemTrackingData A002 = 6Dh.A00(r0, A013);
                                    if (A002 != null) {
                                        long j8 = liX.mTimestamp;
                                        A002.numHits++;
                                        if (!A002.accessed) {
                                            A002.accessed = true;
                                            A002.firstAccessed = j8;
                                        }
                                        A002.lastAccessed = j8;
                                        A1G = GOp.A1G(r0.A06);
                                        new J1L(r0, A002, A013);
                                        A1G.execute(runnable);
                                    }
                                }
                                C00j.A01(-1610740370);
                                break;
                            case CACHE_PARTIAL_HIT:
                            case CACHE_PARTIAL_MISS:
                            case CACHE_HIT:
                            case CACHE_MISS:
                            case CACHE_UNKNOWN:
                                C00j.A01(-1610740370);
                                break;
                        }
                    }
                    throw AnonymousClass002.A0C(knd, "Unknown operation: ", AnonymousClass001.A0k());
                } catch (Throwable th) {
                    C00j.A01(-1422565011);
                    throw th;
                }
            }
        }
    }
}
