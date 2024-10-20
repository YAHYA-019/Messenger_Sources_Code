package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadPreviewParams;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;
import java.util.Set;

/* renamed from: X.6hn, reason: invalid class name */
/* loaded from: 6hn.class */
public final class C6hn implements 1Vf {
    public static final Set A04 = 02H.A02(new Integer[]{Integer.valueOf(ActionId.APPLY_FINISHED_LIST), Integer.valueOf(ActionId.FUTURE_LISTENERS_COMPLETE)});
    public final 1Br A00 = 1Bq.A00(66481);
    public final 1Br A01;
    public final Context A02;
    public final FbUserSession A03;

    public C6hn(Context context, FbUserSession fbUserSession) {
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A01 = 1Lm.A00(context, fbUserSession, 33148);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        boolean contains;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
            throw 4YV.A0f(str);
        }
        OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
        11T.A0F(onThreadOpened, 0);
        ThreadKey threadKey = onThreadOpened.A00;
        ThreadPreviewParams threadPreviewParams = (ThreadPreviewParams) onThreadOpened.A01.A01((String) null, ThreadPreviewParams.class);
        if (threadPreviewParams == null || threadPreviewParams.A03) {
            return;
        }
        if (!11T.A0O(threadPreviewParams.A02, "cc_inbox_upsells") || !ThreadKey.A0a(threadKey)) {
            if (ThreadKey.A0a(threadKey)) {
                contains = ((1WY) this.A00.A00.get()).A0E();
            } else if (!ThreadKey.A0T(threadKey)) {
                contains = A04.contains(Integer.valueOf(threadPreviewParams.A00));
            }
            if (!contains) {
                return;
            }
        }
        int i = threadPreviewParams.A00;
        MailboxFeature mailboxFeature = (MailboxFeature) this.A01.A00.get();
        long A0s = threadKey.A0s();
        C0ty c0ty = C0ty.A00;
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new N83(i, 0, A0s, mailboxFeature, mailboxFutureImpl, c0ty))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
