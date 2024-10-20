package com.facebook.quickpromotion.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: QuickPromotionDefinition_CreativeSerializer.class */
public class QuickPromotionDefinition_CreativeSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), QuickPromotionDefinition.Creative.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        QuickPromotionDefinition.Creative creative = (QuickPromotionDefinition.Creative) obj;
        if (creative == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "title", creative.title);
        AbstractC11224vw.A0D(r302, "content", creative.content);
        AbstractC11224vw.A05(r302, c26c, creative.imageParams, "image");
        AbstractC11224vw.A05(r302, c26c, creative.animatedImageParams, "animated_image");
        AbstractC11224vw.A05(r302, c26c, creative.primaryAction, "primary_action");
        AbstractC11224vw.A05(r302, c26c, creative.secondaryAction, "secondary_action");
        AbstractC11224vw.A05(r302, c26c, creative.dismissAction, "dismiss_action");
        AbstractC11224vw.A05(r302, c26c, creative.socialContext, "social_context");
        AbstractC11224vw.A0D(r302, "footer", creative.footer);
        AbstractC11224vw.A05(r302, c26c, creative.template, "template");
        AbstractC11224vw.A05(r302, c26c, creative.templateParameters, "template_parameters");
        AbstractC11224vw.A05(r302, c26c, creative.brandingImageParams, "branding_image");
        AbstractC11224vw.A06(r302, c26c, "bullet_list", creative.bulletList);
        r302.A0Y();
    }
}
