package X;

import android.content.Intent;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D4f.class */
public final class D4f implements 1K9 {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ 2Lm A01;
    public final /* synthetic */ C6D A02;
    public final /* synthetic */ Message A03;
    public final /* synthetic */ ThreadKey A04;
    public final /* synthetic */ C5ap A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public D4f(Intent intent, 2Lm r303, C6D c6d, Message message, ThreadKey threadKey, C5ap c5ap, boolean z, boolean z2) {
        this.A02 = c6d;
        this.A06 = z;
        this.A04 = threadKey;
        this.A01 = r303;
        this.A07 = z2;
        this.A00 = intent;
        this.A03 = message;
        this.A05 = c5ap;
    }

    public void onFailure(Throwable th) {
        0fH.A0s("LikeIntentHandler", "Failed to send like", th);
        C6D c6d = this.A02;
        F8q.A00(new FEd(2131958636), AbF.A0v(c6d.A05), false);
        if (this.A07) {
            ((C45d) c6d.A02.get()).A0H(this.A03, this.A04, this.A05, "like", false);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z = this.A06;
        if (!z) {
            7zR.A1M(AbF.A0v(this.A02.A05), 2131958635);
        }
        ThreadKey threadKey = this.A04;
        if (threadKey.A0z()) {
            this.A01.A04(threadKey, 7zM.A17(z));
        }
        if (this.A07) {
            String stringExtra = this.A00.getStringExtra("sender_id");
            C6D c6d = this.A02;
            C45d c45d = (C45d) c6d.A02.get();
            Message message = this.A03;
            C5ap c5ap = this.A05;
            c45d.A0H(message, threadKey, c5ap, "like", true);
            C5dz c5dz = (C5dz) c6d.A03.get();
            if (c5ap == C5ap.A1r) {
                if (stringExtra != null) {
                    C5dz.A02(threadKey, c5dz, "notification_like_action_success", stringExtra);
                } else {
                    C5dz.A01(threadKey, c5dz, "notification_like_action_success");
                }
            }
        }
    }
}
