package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.UserKey;

/* renamed from: X.Aeu, reason: case insensitive filesystem */
/* loaded from: Aeu.class */
public final class C1352Aeu extends ClickableSpan {
    public final /* synthetic */ ThreadSummary A00;
    public final /* synthetic */ 64W A01;

    public C1352Aeu(ThreadSummary threadSummary, 64W r303) {
        this.A00 = threadSummary;
        this.A01 = r303;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        if (!((C61c) 1Bi.A03(68021)).A09()) {
            this.A01.BdR("roll_call");
            return;
        }
        ThreadKey threadKey = this.A00.A0n;
        if (threadKey != null) {
            this.A01.AGQ(R1B.A00((Message) null, threadKey, (BMJ) null, (MediaResource) null, (UserKey) null, (Integer) null, (String) null));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        11T.A0F(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
