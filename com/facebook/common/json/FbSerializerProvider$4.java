package com.facebook.common.json;

import X.28Q;
import X.4YV;
import X.C23u;
import X.C26c;
import android.util.Base64;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: FbSerializerProvider$4.class */
public class FbSerializerProvider$4 extends JsonSerializer {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        r302.A0r(Base64.encodeToString(4YV.A1b((C23u) obj), 2));
    }
}