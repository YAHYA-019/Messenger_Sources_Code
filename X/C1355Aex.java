package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.Aex, reason: case insensitive filesystem */
/* loaded from: Aex.class */
public final class C1355Aex extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C1355Aex(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        if (this.A00 != 0) {
            CQ2 cq2 = (CQ2) this.A01;
            String str = this.A02;
            FeedbackReportFragment feedbackReportFragment = cq2.A00;
            if (feedbackReportFragment == null || str.isEmpty()) {
                return;
            }
            feedbackReportFragment.A1P(str);
            return;
        }
        11T.A0F(view, 0);
        ThreadKey threadKey = (ThreadKey) this.A01;
        String str2 = this.A02;
        long A0r = threadKey.A0r();
        AlC.A0M.A00(1vD.A00(view), threadKey, AbG.A0w(new CommunityExtraData(false, null, null, null, str2, null, A0r), new C3R9()));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (this.A00 == 0) {
            11T.A0F(textPaint, 0);
            super.updateDrawState(textPaint);
        }
        textPaint.setUnderlineText(false);
    }
}
