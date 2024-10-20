package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* renamed from: X.9wc, reason: invalid class name */
/* loaded from: 9wc.class */
public final class C9wc implements DFN {
    public final /* synthetic */ long A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ Message A03;
    public final /* synthetic */ C9Ol A04;

    public C9wc(View view, FbUserSession fbUserSession, Message message, C9Ol c9Ol, long j) {
        this.A04 = c9Ol;
        this.A00 = j;
        this.A01 = view;
        this.A03 = message;
        this.A02 = fbUserSession;
    }

    public final void CHW(6BK r302) {
        if (r302 != null) {
            try {
                String BHd = r302.BHd();
                if (BHd != null) {
                    View view = this.A01;
                    7Ww A01 = 7Ww.A01(view.getContext());
                    7Wf r0 = (7Wf) 1Bi.A03(67837);
                    6Ft r02 = (6Ft) 7zR.A0o((Context) 1De.A00(this.A04.A00, 83719), 67836);
                    Message message = this.A03;
                    A01.A07(view, this.A02, r302, message, new 7Wg(message, (AnonymousClass637) null, r0, r02), (7X1) null, (7Lj) null, (7LX) null, BHd, BHd, (String) null);
                    return;
                }
            } catch (AIB unused) {
                1Br.A04(this.A04.A01).D0v("MessageReplyXmaCtaHandler", AnonymousClass001.A0h(AnonymousClass001.A0n("Unable to handle cta click. ctaId: "), this.A00));
                return;
            }
        }
        1Br.A04(this.A04.A01).D0v("MessageReplyXmaCtaHandler", AnonymousClass001.A0h(AnonymousClass001.A0n("Unable to load cta. ctaId: "), this.A00));
    }
}
