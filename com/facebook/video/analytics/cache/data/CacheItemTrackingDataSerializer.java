package com.facebook.video.analytics.cache.data;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: CacheItemTrackingDataSerializer.class */
public class CacheItemTrackingDataSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), CacheItemTrackingData.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        CacheItemTrackingData cacheItemTrackingData = (CacheItemTrackingData) obj;
        if (cacheItemTrackingData == null) {
            r302.A0Z();
        }
        r302.A0b();
        long j = cacheItemTrackingData.inserted;
        r302.A0o("ts_insertion");
        r302.A0g(j);
        long j2 = cacheItemTrackingData.evicted;
        r302.A0o("ts_eviction");
        r302.A0g(j2);
        long j3 = cacheItemTrackingData.firstAccessed;
        r302.A0o("ts_first_access");
        r302.A0g(j3);
        long j4 = cacheItemTrackingData.lastAccessed;
        r302.A0o("ts_last_access");
        r302.A0g(j4);
        AbstractC11224vw.A0D(r302, "module", cacheItemTrackingData.module);
        long j5 = cacheItemTrackingData.sizeInBytes;
        r302.A0o("size");
        r302.A0g(j5);
        AbstractC11224vw.A0D(r302, "insertion_reason", cacheItemTrackingData.fetchType);
        AbstractC11224vw.A0D(r302, "eviction_reason", cacheItemTrackingData.evictionReason);
        int i = cacheItemTrackingData.numHits;
        r302.A0o("num_hits");
        r302.A0f(i);
        boolean z = cacheItemTrackingData.accessed;
        r302.A0o("accessed");
        r302.A0v(z);
        long j6 = cacheItemTrackingData.position;
        r302.A0o("start_position");
        r302.A0g(j6);
        long j7 = cacheItemTrackingData.endPosition;
        r302.A0o("end_position");
        r302.A0g(j7);
        AbstractC11224vw.A0D(r302, "item_id", cacheItemTrackingData.itemId);
        AbstractC11224vw.A0D(r302, "item_url", cacheItemTrackingData.itemUrl);
        AbstractC11224vw.A0D(r302, "prefetch_tag", cacheItemTrackingData.prefetchTag);
        AbstractC11224vw.A0D(r302, "prefetch_module", cacheItemTrackingData.prefetchModule);
        boolean z2 = cacheItemTrackingData.isSecondPhasePrefetch;
        r302.A0o("is_second_phase_prefetch");
        r302.A0v(z2);
        AbstractC11224vw.A0D(r302, "player_suborigin", cacheItemTrackingData.playerSubOrigin);
        r302.A0Y();
    }
}
