package com.facebook.messaging.media.photoquality;

/* loaded from: PhotoQualityCacheItem.class */
public final class PhotoQualityCacheItem {
    public PhotoQuality A00;
    public final long expirationTimeMs;
    public final int resolution;
    public final String threadKey;
    public final int thumbnailResolution;

    public PhotoQualityCacheItem() {
        this.resolution = 0;
        this.thumbnailResolution = 0;
        this.expirationTimeMs = 0L;
        this.threadKey = "";
        this.A00 = new PhotoQuality(0);
    }

    public PhotoQualityCacheItem(int i, int i2, long j, String str) {
        this.resolution = i;
        this.thumbnailResolution = i2;
        this.expirationTimeMs = j;
        this.threadKey = str;
        this.A00 = new PhotoQuality(i2);
    }
}
