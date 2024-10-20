package X;

import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.TimerTask;

/* renamed from: X.3k7, reason: invalid class name */
/* loaded from: 3k7.class */
public final class C3k7 extends TimerTask {
    public static final String __redex_internal_original_name = "PairedThreadUncommittedDrafts$removeDraftDelayed$$inlined$schedule$1";
    public final /* synthetic */ 2gZ A00;
    public final /* synthetic */ MessageDraft A01;
    public final /* synthetic */ ThreadKey A02;

    public C3k7(2gZ r302, MessageDraft messageDraft, ThreadKey threadKey) {
        this.A00 = r302;
        this.A02 = threadKey;
        this.A01 = messageDraft;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        2gZ r0 = this.A00;
        ThreadKey threadKey = this.A02;
        MessageDraft messageDraft = 2gZ.A02;
        r0.A00.remove(C2ga.A00(threadKey), this.A01);
    }
}
