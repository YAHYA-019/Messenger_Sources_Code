package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.facebook.messaging.threadview.params.ThreadAndMaybeMessage;

/* loaded from: AG3.class */
public final class AG3 implements Runnable {
    public static final String __redex_internal_original_name = "QRCodeDetectionHelper$onOpenThreadViewForUser$1$1";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ 9gU A01;
    public final /* synthetic */ 6HS A02;

    public AG3(ThreadKey threadKey, 9gU r303, 6HS r304) {
        this.A02 = r304;
        this.A00 = threadKey;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A09 = this.A02.A09(this.A00, (MessageDeepLinkInfo) null, (ThreadAndMaybeMessage) null, (5SW) null, "qr_code_camera", false);
        9gU r0 = this.A01;
        9XO r02 = (9XO) 1Br.A0B(r0.A07);
        String str = r0.A0B;
        04J A02 = 1Br.A02(r02.A00);
        if (A09) {
            7zV.A16(A02, "qr_code_thread_id_open_success", str);
        } else {
            7zV.A16(A02, "qr_code_thread_id_open_fail", str);
        }
    }
}
