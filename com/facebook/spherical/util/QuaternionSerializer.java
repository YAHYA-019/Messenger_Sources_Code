package com.facebook.spherical.util;

import X.28Q;
import X.4iJ;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: QuaternionSerializer.class */
public class QuaternionSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), Quaternion.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Quaternion quaternion = (Quaternion) obj;
        if (quaternion == null) {
            r302.A0Z();
        }
        r302.A0b();
        float f = quaternion.w;
        r302.A0o("w");
        r302.A0e(f);
        float f2 = quaternion.x;
        r302.A0o("x");
        r302.A0e(f2);
        float f3 = quaternion.y;
        r302.A0o("y");
        r302.A0e(f3);
        float f4 = quaternion.z;
        r302.A0o("z");
        r302.A0e(f4);
        r302.A0Y();
    }
}
