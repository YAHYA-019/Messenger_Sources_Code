package com.facebook.messaging.media.photoquality;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: PhotoQualityCacheItemSerializer.class */
public class PhotoQualityCacheItemSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), PhotoQualityCacheItem.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        PhotoQualityCacheItem photoQualityCacheItem = (PhotoQualityCacheItem) obj;
        if (photoQualityCacheItem == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "threadKey", photoQualityCacheItem.threadKey);
        int i = photoQualityCacheItem.resolution;
        r302.A0o("resolution");
        r302.A0f(i);
        int i2 = photoQualityCacheItem.thumbnailResolution;
        r302.A0o("thumbnailResolution");
        r302.A0f(i2);
        long j = photoQualityCacheItem.expirationTimeMs;
        r302.A0o("expirationTimeMs");
        r302.A0g(j);
        r302.A0Y();
    }
}
