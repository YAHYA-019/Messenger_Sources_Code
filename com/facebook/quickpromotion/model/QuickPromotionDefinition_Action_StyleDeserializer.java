package com.facebook.quickpromotion.model;

import X.AbstractC01033pi;
import X.C27T;
import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: QuickPromotionDefinition_Action_StyleDeserializer.class */
public class QuickPromotionDefinition_Action_StyleDeserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return QuickPromotionDefinition.Action.Style.fromString(abstractC01033pi.A1Z());
    }
}
