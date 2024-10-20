package com.facebook.facedetection.model;

import X.28Q;
import X.4iJ;
import X.C24e;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: TagDescriptorSerializer.class */
public class TagDescriptorSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), TagDescriptor.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        TagDescriptor tagDescriptor = (TagDescriptor) obj;
        if (tagDescriptor == null) {
            r302.A0Z();
        }
        r302.A0b();
        float f = tagDescriptor._targetId;
        r302.A0o("target_id");
        r302.A0e(f);
        float f2 = tagDescriptor._x;
        r302.A0o("x");
        r302.A0e(f2);
        float f3 = tagDescriptor._y;
        r302.A0o("y");
        r302.A0e(f3);
        float f4 = tagDescriptor._left;
        r302.A0o("left");
        r302.A0e(f4);
        float f5 = tagDescriptor._top;
        r302.A0o("top");
        r302.A0e(f5);
        float f6 = tagDescriptor._right;
        r302.A0o("right");
        r302.A0e(f6);
        float f7 = tagDescriptor._bottom;
        r302.A0o("bottom");
        r302.A0e(f7);
        int i = tagDescriptor._scale;
        r302.A0o("scale");
        r302.A0f(i);
        int i2 = tagDescriptor._model;
        r302.A0o("model");
        r302.A0f(i2);
        float f8 = tagDescriptor._confidence;
        r302.A0o("confidence");
        r302.A0e(f8);
        int i3 = tagDescriptor._cropWidth;
        r302.A0o("crop_width");
        r302.A0f(i3);
        int i4 = tagDescriptor._cropHeight;
        r302.A0o("crop_height");
        r302.A0f(i4);
        byte[] crop = tagDescriptor.getCrop();
        if (crop != null) {
            r302.A0o("crop");
            r302.A0h(C24e.A01, crop, 0, crop.length);
        }
        r302.A0Y();
    }
}
