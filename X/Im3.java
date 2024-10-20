package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.ui.StickerDraweeView;

/* loaded from: Im3.class */
public final class Im3 implements JJR {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C6qc A01;
    public final /* synthetic */ StickerDraweeView A02;

    public Im3(FbUserSession fbUserSession, C6qc c6qc, StickerDraweeView stickerDraweeView) {
        this.A02 = stickerDraweeView;
        this.A01 = c6qc;
        this.A00 = fbUserSession;
    }

    public void ByE(Sticker sticker) {
        StickerDraweeView stickerDraweeView = this.A02;
        7Qb r0 = stickerDraweeView.A07;
        C6qc c6qc = this.A01;
        StickerDraweeView.A01(this.A00, c6qc, stickerDraweeView, r0.A09(sticker, c6qc));
    }

    public void ByF() {
        0fH.A14("StickerDrawable", "Error loading sticker %s", new Object[]{this.A01.A06});
    }
}
