package X;

import com.facebook.messaging.composer.ComposerKeyboardManager;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.stickers.keyboardopenparams.StickerLSKeyboardOpenParams;

/* renamed from: X.9tr, reason: invalid class name */
/* loaded from: 9tr.class */
public final class C9tr implements DIb {
    public final /* synthetic */ 6Rv A00;

    public C9tr(6Rv r302) {
        this.A00 = r302;
    }

    @Override // X.DIb
    public void BqF() {
        6QS r0 = this.A00.A00;
        if (6QS.A0Y(r0)) {
            ComposerKeyboardManager composerKeyboardManager = r0.A09;
            C3R9 c3r9 = new C3R9();
            c3r9.A01(new StickerLSKeyboardOpenParams(0S2.A0j));
            ComposerKeyboardManager.A03(composerKeyboardManager, c3r9.A00(), "stickers_ls", null);
        }
    }

    @Override // X.DIb
    public void BvO(Message message) {
        6Rv r0 = this.A00;
        String A0x = 4YU.A0x(message);
        6PS r02 = ((OneLineComposerView) r0.A00.A0A).A0Z.A0R;
        r02.A05(A0x == null ? "" : A0x);
        r02.A03(7zQ.A05(A0x));
        r02.A02.requestFocus();
    }

    @Override // X.DIb
    public void C7R(ThreadKey threadKey) {
        6Rb r0 = this.A00.A00.A0F;
        if (r0 != null) {
            r0.A04(threadKey);
        }
    }

    @Override // X.DIb
    public void CKV(5Pz r302, Message message) {
        11T.A0F(r302, 1);
        this.A00.A00.A1r(r302, message);
    }

    @Override // X.DIb
    public void CLV() {
        6QS.A0L(this.A00.A00, 12, true, true);
    }
}
