package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.MessageReactionsOverlayFragment;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.base.Function;

/* loaded from: Imn.class */
public final class Imn implements Function {
    public final /* synthetic */ MessageReactionsOverlayFragment A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ java.util.Map A05;

    public Imn(MessageReactionsOverlayFragment messageReactionsOverlayFragment, Integer num, String str, String str2, String str3, java.util.Map map) {
        this.A00 = messageReactionsOverlayFragment;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = map;
        this.A01 = num;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.messaging.reactions.MessageReactionsOverlayFragment, androidx.fragment.app.Fragment] */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z;
        if (AnonymousClass001.A1V(obj)) {
            z = false;
        } else {
            ?? r0 = this.A00;
            String str = this.A04;
            String str2 = this.A03;
            String str3 = this.A02;
            java.util.Map map = this.A05;
            Capabilities capabilities = MessageReactionsOverlayFragment.A0f;
            Message message = r0.A06;
            if (message != null && message.A0K != null) {
                Integer num = null;
                String A0i = !r0.A0B.A00() ? AnonymousClass001.A0i(r0.A0B.A00.iterator()) : null;
                7Y0 r02 = r0.A0A;
                Message message2 = r0.A06;
                String A00 = message2.A0K.A00();
                ThreadSummary threadSummary = r0.A07;
                if (threadSummary != null) {
                    num = 1BK.A0k(threadSummary.A1L);
                }
                r02.A01(message2, num, str2, str3, A0i, str, A00, map);
            }
            if (str != null) {
                ((5II) r0.A0X.get()).A0A("reactions_select");
            }
            Integer num2 = this.A01;
            if (r0.A07 != null) {
                C7te c7te = r0.A0C;
                if (c7te == null) {
                    c7te = C7te.A00(r0.requireContext(), r0.A07);
                    r0.A0C = c7te;
                }
                HdK hdK = c7te.A00.A00;
                int andIncrement = C1Y6.A04.getAndIncrement();
                1YC r03 = hdK.A00;
                String A002 = 4YT.A00(990);
                String A003 = 4YT.A00(1279);
                r03.A08(A002, A003, "logSecondaryConversion", andIncrement);
                r03.A06(A003, "logSecondaryConversion", andIncrement);
            }
            Message message3 = r0.A06;
            if (message3 != null && message3.A1V != null) {
                if (ThreadKey.A0q(message3.A0V)) {
                    5Q2 r04 = (5Q2) r0.A02.get();
                    Message message4 = r0.A06;
                    ThreadKey threadKey = message4.A0V;
                    long j = message4.A05;
                    if (str == null) {
                        str = "";
                    }
                    String str4 = message4.A1V;
                    if (!ThreadKey.A0q(threadKey)) {
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("sendOptimisticReaction not supported for thread type: ");
                        throw AnonymousClass001.A0q(AnonymousClass001.A0a(threadKey.A06, A0k));
                    }
                    C3Qu c3Qu = (C3Qu) r04.A0B.get();
                    AbK.A1S(threadKey, str4);
                    Cbd A004 = C3Qu.A00(c3Qu);
                    5Xd A005 = Cbd.A00(A004);
                    Long A0l = 4YU.A0l(threadKey);
                    Long valueOf = Long.valueOf(j);
                    Long valueOf2 = Long.valueOf(threadKey.A05);
                    1Um AQV = A005.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P = 1BK.A0P(AQV);
                    1Um.A02(AQV, new Ibc(valueOf2, A0P, A005, valueOf, A0l, str, str4, 1), A0P, false);
                    A0P.addResultCallback(new Iaj(A004, threadKey, 9));
                } else {
                    I09 i09 = (I09) r0.A0V.get();
                    FbUserSession fbUserSession = r0.A01;
                    fbUserSession.getClass();
                    Context requireContext = r0.requireContext();
                    Message message5 = r0.A06;
                    I09.A00(requireContext, fbUserSession, message5.A0V, r0.A07, i09, MessageReactionsOverlayFragment.A0f, 0S2.A00, num2, str, message5.A1V, message5.A05);
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
