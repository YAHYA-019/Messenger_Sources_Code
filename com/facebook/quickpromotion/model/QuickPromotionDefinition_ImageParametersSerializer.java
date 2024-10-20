package com.facebook.quickpromotion.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: QuickPromotionDefinition_ImageParametersSerializer.class */
public class QuickPromotionDefinition_ImageParametersSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), QuickPromotionDefinition.ImageParameters.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        QuickPromotionDefinition.ImageParameters imageParameters = (QuickPromotionDefinition.ImageParameters) obj;
        if (imageParameters == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, TraceFieldType.Uri, imageParameters.uri);
        int i = imageParameters.width;
        r302.A0o(Property.ICON_TEXT_FIT_WIDTH);
        r302.A0f(i);
        int i2 = imageParameters.height;
        r302.A0o(Property.ICON_TEXT_FIT_HEIGHT);
        r302.A0f(i2);
        float f = imageParameters.scale;
        r302.A0o("scale");
        r302.A0e(f);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, imageParameters.name);
        r302.A0Y();
    }
}
