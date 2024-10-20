package com.facebook.video.analytics.cache.data;

import X.AnonymousClass001;

/* loaded from: CacheItemTrackingData.class */
public final class CacheItemTrackingData {
    public boolean accessed;
    public long endPosition;
    public long evicted;
    public String evictionReason;
    public String fetchType;
    public long firstAccessed;
    public long inserted;
    public boolean isSecondPhasePrefetch;
    public String itemId;
    public String itemUrl;
    public long lastAccessed;
    public String module;
    public int numHits;
    public String playerSubOrigin;
    public long position;
    public String prefetchModule;
    public String prefetchTag;
    public long sizeInBytes;

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CacheItemData{module='");
        A0k.append(this.module);
        A0k.append("', fetchType='");
        A0k.append(this.fetchType);
        A0k.append("', evictionReason='");
        A0k.append(this.evictionReason);
        A0k.append("', numHits=");
        A0k.append(this.numHits);
        A0k.append(", itemId='");
        A0k.append(this.itemId);
        A0k.append("', itemUrl='");
        A0k.append(this.itemUrl);
        A0k.append("', prefetchTag='");
        A0k.append(this.prefetchTag);
        A0k.append("', prefetchModule='");
        A0k.append(this.prefetchModule);
        A0k.append("', isSecondPhasePrefetch='");
        A0k.append(this.isSecondPhasePrefetch);
        return AnonymousClass001.A0d("'}", A0k);
    }
}
