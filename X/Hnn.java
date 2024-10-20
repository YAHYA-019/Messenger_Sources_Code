package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.messages.Message;
import com.facebook.video.player.RichVideoPlayer;

/* loaded from: Hnn.class */
public final class Hnn {
    public Message A00;
    public H54 A01;

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.video.player.RichVideoPlayer, android.view.View] */
    public void A00() {
        C62t c62t;
        H54 h54 = this.A01;
        if (h54 != null) {
            6TI r0 = h54.A05;
            if (r0 != null) {
                RichVideoPlayer richVideoPlayer = h54.A04;
                if (richVideoPlayer.A0F == null) {
                    richVideoPlayer.A0N(r0);
                }
            }
            h54.A00.setVisibility(8);
            ?? r02 = h54.A04;
            r02.setVisibility(0);
            Message message = h54.A02;
            11T.A0I(message, 4YT.A00(ActionId.ASYNC_ACTION_FAIL));
            String str = message.A1g;
            if (str != null && (c62t = h54.A03) != null) {
                c62t.CUW(str);
            }
            r02.CXU(C52j.A09);
        }
    }
}
