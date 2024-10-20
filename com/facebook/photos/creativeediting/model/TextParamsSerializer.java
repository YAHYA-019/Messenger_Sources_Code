package com.facebook.photos.creativeediting.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: TextParamsSerializer.class */
public class TextParamsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), TextParams.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        TextParams textParams = (TextParams) obj;
        if (textParams == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, textParams.id);
        AbstractC11224vw.A0D(r302, "uniqueId", textParams.uniqueId);
        AbstractC11224vw.A0D(r302, "text_string", textParams.textString);
        int i = textParams.textColor;
        r302.A0o("text_color");
        r302.A0f(i);
        boolean z = textParams.isSelectable;
        r302.A0o("isSelectable");
        r302.A0v(z);
        boolean z2 = textParams.isFrameItem;
        r302.A0o("isFrameItem");
        r302.A0v(z2);
        AbstractC11224vw.A05(r302, c26c, textParams.overlayParams, "relative_image_overlay_params");
        r302.A0Y();
    }
}
