package com.facebook.messaging.montage.model.cards;

import X.28Q;
import X.4iJ;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: MontageStickerOverlayBoundsSerializer.class */
public class MontageStickerOverlayBoundsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), MontageStickerOverlayBounds.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        MontageStickerOverlayBounds montageStickerOverlayBounds = (MontageStickerOverlayBounds) obj;
        if (montageStickerOverlayBounds == null) {
            r302.A0Z();
        }
        r302.A0b();
        double d = montageStickerOverlayBounds.A00;
        r302.A0o("bound_x");
        r302.A0d(d);
        double d2 = montageStickerOverlayBounds.A01;
        r302.A0o("bound_y");
        r302.A0d(d2);
        double d3 = montageStickerOverlayBounds.A04;
        r302.A0o("bound_width");
        r302.A0d(d3);
        double d4 = montageStickerOverlayBounds.A02;
        r302.A0o("bound_height");
        r302.A0d(d4);
        double d5 = montageStickerOverlayBounds.A03;
        r302.A0o("bound_rotation");
        r302.A0d(d5);
        r302.A0Y();
    }
}
