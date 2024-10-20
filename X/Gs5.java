package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import java.util.Set;

/* loaded from: Gs5.class */
public final class Gs5 extends C21h {
    public final /* synthetic */ C10854us A00;
    public final /* synthetic */ ThreadKey A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs5(C10854us c10854us, ThreadKey threadKey) {
        super("CutoverFetchFromOpenThreadId");
        this.A01 = threadKey;
        this.A00 = c10854us;
    }

    @Override // X.C21h
    public void A00(Set set) {
        ThreadKey threadKey = this.A01;
        long A0s = threadKey.A0s();
        C10854us c10854us = this.A00;
        CNa cNa = (CNa) 1Br.A0B(c10854us.A05);
        FbUserSession A0E = 7zS.A0E(c10854us.A02);
        Iaj iaj = new Iaj(threadKey, c10854us, 7);
        11T.A0F(A0E, 1);
        CNa.A00(A0E, cNa).A00((MailboxCallback) null, A0s).A00(CNa.A01(cNa)).Cu4(iaj);
    }
}
