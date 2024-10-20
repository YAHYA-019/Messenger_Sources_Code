package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A9g.class */
public final class A9g implements 62A {
    public final AnonymousClass622 A00;
    public final 1De A01;

    public A9g(1De r302, AnonymousClass622 anonymousClass622) {
        this.A01 = r302;
        this.A00 = anonymousClass622;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01df, code lost:
    
        if (r303 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C5fq A4n(com.facebook.messaging.model.messages.Message r302) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9g.A4n(com.facebook.messaging.model.messages.Message):X.5fq");
    }

    public boolean BQi(Message message) {
        C01s A0G;
        String A0a;
        C60h c60h = (C60h) 1De.A00(this.A01, 49935);
        AnonymousClass622 anonymousClass622 = this.A00;
        63V A00 = c60h.A00(anonymousClass622);
        if ((!A00.equals(63V.A0O) && !A00.equals(63V.A0S)) || C1q7.A09(anonymousClass622.A03) || C1q7.A0J(message)) {
            return false;
        }
        ParticipantInfo participantInfo = message.A0K;
        if (participantInfo == null) {
            A0G = 4YV.A0G();
            A0a = "Message has null senderInfo";
        } else {
            C1yg c1yg = null;
            if (participantInfo.A00() != null) {
                return true;
            }
            A0G = 4YV.A0G();
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Message sender Info has null FbId, threadKey type: ");
            ThreadKey threadKey = message.A0V;
            if (threadKey != null) {
                c1yg = threadKey.A06;
            }
            A0a = AnonymousClass001.A0a(c1yg, A0k);
        }
        A0G.D0v("OrcaPhotoSyncAdapter", A0a);
        return false;
    }
}
