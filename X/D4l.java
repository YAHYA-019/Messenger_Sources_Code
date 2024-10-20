package X;

import android.content.Intent;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: D4l.class */
public final class D4l implements 1K9 {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ 2Lm A01;
    public final /* synthetic */ CFd A02;
    public final /* synthetic */ Message A03;
    public final /* synthetic */ ThreadKey A04;
    public final /* synthetic */ C5ap A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public D4l(Intent intent, 2Lm r303, CFd cFd, Message message, ThreadKey threadKey, C5ap c5ap, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = cFd;
        this.A07 = z;
        this.A04 = threadKey;
        this.A06 = z2;
        this.A09 = z3;
        this.A01 = r303;
        this.A08 = z4;
        this.A00 = intent;
        this.A03 = message;
        this.A05 = c5ap;
    }

    public void onFailure(Throwable th) {
        if (!this.A07) {
            this.A02.A02.get();
            return;
        }
        0fH.A0s("RemoteInputReplyIntentHandler", "Failed to send remote input reply", th);
        CFd cFd = this.A02;
        F8q.A00(new FEd(2131955785), AbF.A0v(cFd.A06), false);
        cFd.A02.get();
        ThreadKey threadKey = this.A04;
        if (this.A08) {
            ((C45d) cFd.A03.get()).A0H(this.A03, threadKey, this.A05, "reply", false);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (!this.A07) {
            this.A02.A02.get();
            return;
        }
        boolean z = this.A06;
        if (!z) {
            7zR.A1M(AbF.A0v(this.A02.A06), 2131955784);
        }
        ThreadKey threadKey = this.A04;
        if (threadKey.A0z() || !this.A09) {
            this.A01.A04(threadKey, 7zM.A17(z));
        }
        CFd cFd = this.A02;
        cFd.A02.get();
        if (this.A08) {
            String stringExtra = this.A00.getStringExtra("sender_id");
            C45d c45d = (C45d) cFd.A03.get();
            Message message = this.A03;
            C5ap c5ap = this.A05;
            c45d.A0H(message, threadKey, c5ap, "reply", true);
            C5dz c5dz = (C5dz) cFd.A04.get();
            if (c5ap == C5ap.A1r) {
                if (stringExtra != null) {
                    C5dz.A02(threadKey, c5dz, "notification_reply_action_success", stringExtra);
                } else {
                    C5dz.A01(threadKey, c5dz, "notification_reply_action_success");
                }
            }
        }
    }
}
