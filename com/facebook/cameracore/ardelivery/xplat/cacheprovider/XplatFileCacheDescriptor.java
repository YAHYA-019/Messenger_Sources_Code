package com.facebook.cameracore.ardelivery.xplat.cacheprovider;

import X.11T;

/* loaded from: XplatFileCacheDescriptor.class */
public final class XplatFileCacheDescriptor {
    public final int assetType;
    public final String cacheIdentifier;
    public final long maxSizeInBytes;

    public XplatFileCacheDescriptor(int i, String str, long j) {
        11T.A0F(str, 2);
        this.assetType = i;
        this.cacheIdentifier = str;
        this.maxSizeInBytes = j;
    }

    public final int getAssetType() {
        return this.assetType;
    }

    public final String getCacheIdentifier() {
        return this.cacheIdentifier;
    }

    public final long getMaxSizeInBytes() {
        return this.maxSizeInBytes;
    }
}
