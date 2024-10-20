package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.3Qu, reason: invalid class name */
/* loaded from: 3Qu.class */
public final class C3Qu {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;
    public final 1Br A04;

    public C3Qu(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        this.A00 = fbUserSession;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 84719);
        this.A02 = 1Bu.A03(r0, 84650);
        this.A01 = 1Bu.A03(r0, 99909);
    }

    public static final Cbd A00(C3Qu c3Qu) {
        return (Cbd) 1Br.A0B(c3Qu.A04);
    }

    public final void A01(MessageDraft messageDraft, ThreadKey threadKey) {
        String str;
        Cbd A00 = A00(this);
        String valueOf = String.valueOf(threadKey.A05);
        long A0r = threadKey.A0r();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s%s%d%s%d", valueOf, "_", Long.valueOf(A0r), "_", 1024);
        ((5Xc) A00.A0K.get()).AQX();
        AnonymousClass389 anonymousClass389 = (AnonymousClass389) A00.A06.get();
        Long l = null;
        if (messageDraft != null) {
            str = messageDraft.A03;
            l = messageDraft.A02;
        } else {
            str = null;
        }
        1Um A0O = 1BK.A0O(anonymousClass389, 0);
        MailboxFutureImpl A0P = 1BK.A0P(A0O);
        1Um.A02(A0O, new IbX(anonymousClass389, A0P, l, valueOf, str, formatStrLocaleSafe, 1024, A0r), A0P, false);
    }
}
