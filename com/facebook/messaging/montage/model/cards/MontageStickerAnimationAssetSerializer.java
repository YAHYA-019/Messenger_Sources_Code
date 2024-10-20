package com.facebook.messaging.montage.model.cards;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: MontageStickerAnimationAssetSerializer.class */
public class MontageStickerAnimationAssetSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), MontageStickerAnimationAsset.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        MontageStickerAnimationAsset montageStickerAnimationAsset = (MontageStickerAnimationAsset) obj;
        if (montageStickerAnimationAsset == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, montageStickerAnimationAsset.A03);
        AbstractC11224vw.A0D(r302, "asset_id", montageStickerAnimationAsset.A01);
        AbstractC11224vw.A0D(r302, "keyframe_uri", montageStickerAnimationAsset.A02);
        AbstractC11224vw.A05(r302, c26c, montageStickerAnimationAsset.A00, "sticker_bounds");
        r302.A0Y();
    }
}
