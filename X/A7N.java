package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.message.click.logging.event.ShareButtonClickedEvent;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;

/* loaded from: A7N.class */
public final class A7N implements 1Vf {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadKey A02;

    public A7N(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = fbUserSession;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.message.click.logging.event.ShareButtonClickedEvent")) {
            throw 4YV.A0f(str);
        }
        ShareButtonClickedEvent shareButtonClickedEvent = (ShareButtonClickedEvent) r302;
        11T.A0F(shareButtonClickedEvent, 0);
        C9mX c9mX = (C9mX) 1Lm.A05(this.A00, this.A01, 68544);
        ThreadKey threadKey = this.A02;
        C5fv c5fv = shareButtonClickedEvent.A00;
        7M6 r0 = 7M6.A01;
        6Pq r02 = 6Pq.A07;
        BotResponseMetadata botResponseMetadata = (BotResponseMetadata) c5fv.AxW(5mF.A00);
        String str2 = botResponseMetadata != null ? botResponseMetadata.A0A : null;
        C5fu c5fu = (C5fu) c5fv;
        C9mX.A02(r0, r02, null, threadKey, c9mX, c5fu.A05.A06, c5fu.A09, str2, c5fu.A02);
    }
}
