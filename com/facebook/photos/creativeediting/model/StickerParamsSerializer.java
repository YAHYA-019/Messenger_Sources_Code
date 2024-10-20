package com.facebook.photos.creativeediting.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: StickerParamsSerializer.class */
public class StickerParamsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), StickerParams.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        StickerParams stickerParams = (StickerParams) obj;
        if (stickerParams == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_ID, stickerParams.id);
        AbstractC11224vw.A0D(r302, "uniqueId", stickerParams.uniqueId);
        AbstractC11224vw.A0D(r302, "frameCreditText", stickerParams.frameCreditText);
        boolean z = stickerParams.isFlipped;
        r302.A0o("isFlipped");
        r302.A0v(z);
        boolean z2 = stickerParams.isSelectable;
        r302.A0o("isSelectable");
        r302.A0v(z2);
        boolean z3 = stickerParams.isFrameItem;
        r302.A0o("isFrameItem");
        r302.A0v(z3);
        AbstractC11224vw.A0D(r302, "stickerType", stickerParams.stickerType);
        AbstractC11224vw.A05(r302, c26c, stickerParams.overlayParams, "relative_image_overlay_params");
        r302.A0Y();
    }
}
