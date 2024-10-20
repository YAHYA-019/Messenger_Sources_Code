package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.common.translator.AbstractMsysMessagesCollectionTranslator;

/* loaded from: Bym.class */
public final class Bym {
    public C07764kq A00;
    public final Context A01;
    public final BwK A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07 = 1Bq.A00(66584);
    public final 1Br A08;
    public final 1Br A09;
    public final ThreadKey A0A;
    public final AbstractMsysMessagesCollectionTranslator A0B;
    public final C1yc A0C;
    public final String A0D;

    public Bym(Context context, BwK bwK, FbUserSession fbUserSession, ThreadKey threadKey, String str) {
        this.A0A = threadKey;
        this.A0D = str;
        this.A01 = context;
        this.A03 = fbUserSession;
        this.A02 = bwK;
        this.A04 = 1Lm.A00(context, fbUserSession, 33148);
        this.A05 = 1Lm.A00(context, fbUserSession, 84153);
        1Br A00 = 1Lm.A00(context, fbUserSession, 16886);
        this.A09 = A00;
        C1yc A01 = ((C1ya) 1Br.A0B(A00)).A01(threadKey);
        11T.A0A(A01);
        this.A0C = A01;
        1Br A002 = 1Lm.A00(context, fbUserSession, 49840);
        this.A06 = A002;
        AbstractMsysMessagesCollectionTranslator A003 = ((C5pd) 1Br.A0B(A002)).A00(threadKey);
        11T.A0A(A003);
        this.A0B = A003;
        this.A08 = 7zM.A0R();
    }
}
