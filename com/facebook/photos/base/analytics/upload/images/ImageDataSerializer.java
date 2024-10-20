package com.facebook.photos.base.analytics.upload.images;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: ImageDataSerializer.class */
public class ImageDataSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ImageData.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ImageData imageData = (ImageData) obj;
        if (imageData == null) {
            r302.A0Z();
        }
        r302.A0b();
        int i = imageData.width;
        r302.A0o(Property.ICON_TEXT_FIT_WIDTH);
        r302.A0f(i);
        int i2 = imageData.height;
        r302.A0o(Property.ICON_TEXT_FIT_HEIGHT);
        r302.A0f(i2);
        AbstractC11224vw.A0D(r302, "format", imageData.format);
        long j = imageData.bytes;
        r302.A0o("bytes");
        r302.A0g(j);
        AbstractC11224vw.A09(r302, imageData.msSsim, "ms_ssim");
        int i3 = imageData.rotation;
        r302.A0o("rotation");
        r302.A0f(i3);
        r302.A0Y();
    }
}
