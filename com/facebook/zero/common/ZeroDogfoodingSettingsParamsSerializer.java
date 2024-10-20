package com.facebook.zero.common;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ZeroDogfoodingSettingsParamsSerializer.class */
public class ZeroDogfoodingSettingsParamsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ZeroDogfoodingSettingsParams.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ZeroDogfoodingSettingsParams zeroDogfoodingSettingsParams = (ZeroDogfoodingSettingsParams) obj;
        if (zeroDogfoodingSettingsParams == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "zero_balance", zeroDogfoodingSettingsParams.mZeroBalance);
        AbstractC11224vw.A0C(r302, zeroDogfoodingSettingsParams.mDogfoodingSettingsTs, "dogfooding_settings_ts");
        r302.A0Y();
    }
}
