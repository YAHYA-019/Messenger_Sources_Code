package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.resources.ui.FbTextView;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.9kl, reason: invalid class name */
/* loaded from: 9kl.class */
public final class C9kl {
    public 1BY A00;
    public 6QS A01;
    public RFj A02;
    public final FrameLayout A03;
    public final 06Z A04;
    public final FbUserSession A05;
    public final C00i A07;
    public final C00i A0A;
    public final ThreadSummary A0C;
    public final FbTextView A0E;
    public final 2Wo A0F;
    public final String A0G;
    public final C00i A09 = 1BV.A01((1BY) null, 49882);
    public final C00i A06 = 1BQ.A02(68543);
    public final C00i A08 = 1BQ.A00();
    public final C00i A0H = 1BV.A01((1BY) null, 98321);
    public final 6Rb A0B = new 8rR(this);
    public final 6F5 A0D = new 8vR(this);

    public C9kl(Context context, FrameLayout frameLayout, 06Z r304, FbUserSession fbUserSession, 1BO r306, ThreadSummary threadSummary, FbTextView fbTextView, 2Wo r309, String str) {
        this.A00 = 7zL.A0Q(r306);
        this.A0A = new 1HH(context, 99435);
        this.A05 = fbUserSession;
        this.A04 = r304;
        this.A03 = frameLayout;
        this.A0F = r309;
        this.A0E = fbTextView;
        this.A0C = threadSummary;
        this.A0G = str;
        this.A07 = new C00y(new AHh(context, fbUserSession, 0));
        ((5zC) this.A09.get()).Cn0(((5Su) this.A06.get()).A00());
        boolean AZk = 1BK.A0N(this.A08).AZk(2342158005673468270L);
        2OB r0 = this.A0E;
        if (AZk) {
            C9py.A04(r0, this, ActionId.APP_MAIN);
        } else {
            r0.setVisibility(8);
        }
    }

    public static void A00(C9kl c9kl) {
        6QS r0 = c9kl.A01;
        if (r0 != null) {
            r0.A1c();
            c9kl.A01.A1f();
        }
        c9kl.A03.setVisibility(8);
        c9kl.A0F.A02();
        RFj rFj = c9kl.A02;
        if (rFj != null) {
            Rh7.A02(rFj.A00);
        }
    }

    public static void A01(C9kl c9kl, User user) {
        Capabilities A02;
        6QS r0 = c9kl.A01;
        if (r0 != null) {
            FbUserSession fbUserSession = c9kl.A05;
            ThreadSummary threadSummary = c9kl.A0C;
            ThreadKey threadKey = threadSummary.A0n;
            if (((5VV) c9kl.A0H.get()).A01(threadSummary).isEmpty()) {
                A02 = 5Hr.A06;
            } else {
                A02 = Capabilities.A01.A02(new int[0]);
            }
            r0.A1q(fbUserSession, (MessagesCollection) null, threadKey, (ThreadSummary) null, (ThreadViewParams) null, user, A02, 5Si.A00, "ephemeral_media_viewer_show_composer");
        }
    }
}
