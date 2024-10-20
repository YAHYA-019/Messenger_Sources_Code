package com.facebook.messaging.photos.editing;

import com.facebook.messaging.montage.model.cards.MontageFeedbackPoll;

/* loaded from: InteractivePollStickerLayer.class */
public final class InteractivePollStickerLayer extends InteractiveStickerLayer {
    public MontageFeedbackPoll A00;
    public boolean A01;

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public void A01(float f) {
        if (this.A01) {
            return;
        }
        super.A01(f);
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public void A02(float f) {
        if (this.A01) {
            return;
        }
        super.A02(f);
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public void A03(float f, float f2) {
        if (this.A01) {
            return;
        }
        super.A03(f, f2);
    }
}
