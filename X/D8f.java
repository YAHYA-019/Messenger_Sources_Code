package X;

import android.widget.TextView;
import com.facebook.messaging.model.messages.ParticipantInfo;

/* loaded from: D8f.class */
public final class D8f implements Runnable {
    public static final String __redex_internal_original_name = "ThreadTitleView$setThreadNameViewData$1";
    public final /* synthetic */ BIf A00;
    public final /* synthetic */ 5Xv A01;

    public D8f(BIf bIf, 5Xv r303) {
        this.A00 = bIf;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ParticipantInfo participantInfo;
        BIf bIf = this.A00;
        DP1 dp1 = bIf.A03;
        11T.A0D(dp1);
        5Xv r0 = this.A01;
        dp1.A07(r0);
        6NI r02 = bIf.A04;
        11T.A0D(r02);
        r02.A06(r0);
        bIf.A09 = (r0 == null || (participantInfo = r0.A01) == null) ? null : participantInfo.A0F;
        BIf.A00(bIf);
        11T.A0D(dp1);
        CharSequence contentDescription = dp1.getContentDescription();
        TextView textView = bIf.A00;
        if (textView != null) {
            contentDescription = AbI.A14(bIf.getResources(), contentDescription, textView.getText(), 2131956743);
        }
        11T.A0D(contentDescription);
        bIf.setContentDescription(contentDescription);
    }
}
