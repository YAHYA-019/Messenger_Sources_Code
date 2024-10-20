package com.facebook.assistant.stella.ipc.common.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: StellaMediaItemSerializer.class */
public class StellaMediaItemSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), StellaMediaItem.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        StellaMediaItem stellaMediaItem = (StellaMediaItem) obj;
        if (stellaMediaItem == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, TraceFieldType.Uri, stellaMediaItem.uri);
        int i = stellaMediaItem.height;
        r302.A0o(Property.ICON_TEXT_FIT_HEIGHT);
        r302.A0f(i);
        int i2 = stellaMediaItem.width;
        r302.A0o(Property.ICON_TEXT_FIT_WIDTH);
        r302.A0f(i2);
        AbstractC11224vw.A0D(r302, "thumbnailUri", stellaMediaItem.thumbnailUri);
        long j = stellaMediaItem.mediaDurationMs;
        r302.A0o("mediaDurationMs");
        r302.A0g(j);
        r302.A0Y();
    }
}
