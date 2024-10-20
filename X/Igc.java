package X;

import com.facebook.messaging.avatar.avatartab.plugins.keyboard.AvatarStickerLSKeyboardFactoryImplementation;
import com.facebook.stickers.model.Sticker;

/* loaded from: Igc.class */
public final class Igc implements JJ1 {
    public final /* synthetic */ AvatarStickerLSKeyboardFactoryImplementation A00;

    public Igc(AvatarStickerLSKeyboardFactoryImplementation avatarStickerLSKeyboardFactoryImplementation) {
        this.A00 = avatarStickerLSKeyboardFactoryImplementation;
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
