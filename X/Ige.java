package X;

import com.facebook.messaging.stickers.plugins.core.keyboardls.StickerLSKeyboardFactoryImplementation;

/* loaded from: Ige.class */
public final class Ige implements JGa {
    public final /* synthetic */ StickerLSKeyboardFactoryImplementation A00;

    public Ige(StickerLSKeyboardFactoryImplementation stickerLSKeyboardFactoryImplementation) {
        this.A00 = stickerLSKeyboardFactoryImplementation;
    }

    @Override // X.JGa
    public final boolean ByZ(String str) {
        11T.A0F(str, 0);
        boolean z = true;
        if (1Br.A07(this.A00.A02).AZk(36318479679763111L) && str.equals("avatar_tab_id")) {
            z = false;
        }
        return z;
    }
}
