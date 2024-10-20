package X;

import com.facebook.messaging.stickers.plugins.core.keyboardls.StickerLSKeyboardFactoryImplementation;
import com.facebook.stickers.model.Sticker;

/* loaded from: Igd.class */
public final class Igd implements JJ1 {
    public final /* synthetic */ StickerLSKeyboardFactoryImplementation A00;

    public Igd(StickerLSKeyboardFactoryImplementation stickerLSKeyboardFactoryImplementation) {
        this.A00 = stickerLSKeyboardFactoryImplementation;
    }

    @Override // X.JJ1
    public void CNV(Sticker sticker, C5es c5es) {
        11T.A0H(sticker, c5es);
        this.A00.A03.A00.A0I.A00.A1z(sticker, c5es);
    }

    @Override // X.JJ1
    public void Cuh(int i) {
        this.A00.A04.Cuh(i);
    }
}
