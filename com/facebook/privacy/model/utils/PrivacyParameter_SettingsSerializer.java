package com.facebook.privacy.model.utils;

import X.28Q;
import X.4iJ;
import X.C26c;
import X.DKG;
import com.facebook.privacy.model.utils.PrivacyParameter;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: PrivacyParameter_SettingsSerializer.class */
public class PrivacyParameter_SettingsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), PrivacyParameter.Settings.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        PrivacyParameter.Settings settings = (PrivacyParameter.Settings) obj;
        if (settings == null) {
            r302.A0Z();
        }
        r302.A0b();
        DKG.A1T(r302, "no_tag_expansion", settings.noTagExpansion);
    }
}
