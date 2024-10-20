package com.facebook.quickpromotion.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: QuickPromotionDefinition_AnimationSerializer.class */
public class QuickPromotionDefinition_AnimationSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), QuickPromotionDefinition.Animation.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        QuickPromotionDefinition.Animation animation = (QuickPromotionDefinition.Animation) obj;
        if (animation == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "set_slug", animation.setSlug);
        AbstractC11224vw.A0D(r302, "asset_url", animation.assetUrl);
        AbstractC11224vw.A0D(r302, "mode", animation.mode);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, animation.name);
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, animation.id);
        r302.A0Y();
    }
}
