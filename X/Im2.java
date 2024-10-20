package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.stickers.model.Sticker;

/* loaded from: Im2.class */
public final class Im2 implements JJR {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 6fM A01;
    public final /* synthetic */ C6qc A02;

    public Im2(FbUserSession fbUserSession, 6fM r303, C6qc c6qc) {
        this.A01 = r303;
        this.A02 = c6qc;
        this.A00 = fbUserSession;
    }

    public void ByE(Sticker sticker) {
        6fM r0 = this.A01;
        InterfaceC07034in interfaceC07034in = 6fM.A0I;
        7Qb r02 = r0.A05;
        C6qc c6qc = this.A02;
        6fM.A00(this.A00, r0, c6qc, r02.A09(sticker, c6qc));
    }

    public void ByF() {
        6fM r0 = this.A01;
        InterfaceC07034in interfaceC07034in = 6fM.A0I;
        0fH.A14("StickerDrawable", "Error loading sticker %s", new Object[]{r0.A07});
    }
}
