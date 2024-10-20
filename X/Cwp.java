package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.FeedbackPage;

/* loaded from: Cwp.class */
public final class Cwp implements AnonymousClass553 {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ CQ2 A01;
    public final /* synthetic */ FeedbackPage A02;
    public final /* synthetic */ boolean A03;

    public Cwp(FbUserSession fbUserSession, CQ2 cq2, FeedbackPage feedbackPage, boolean z) {
        this.A03 = z;
        this.A01 = cq2;
        this.A00 = fbUserSession;
        this.A02 = feedbackPage;
    }

    @Override // X.AnonymousClass553
    public void onClick(View view) {
        if (this.A03) {
            return;
        }
        CQ2.A01(this.A00, this.A01, this.A02.A00, false);
    }
}
