package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Clh.class */
public final class Clh implements DH6 {
    public final /* synthetic */ B5M A00;

    public Clh(B5M b5m) {
        this.A00 = b5m;
    }

    @Override // X.DH6
    public void C46() {
        0fH.A0o("SelectMessagesPresenter", "message load failed");
        B5M.A00(this.A00);
    }

    @Override // X.DH6
    public void C4V(MessagesCollection messagesCollection) {
        B5M b5m = this.A00;
        if (b5m.A06 == null) {
            B5M.A00(b5m);
            return;
        }
        1BY r0 = b5m.A00;
        AbR abR = (AbR) 1Bn.A0E((Context) null, r0, 939);
        Context A03 = AbI.A03(r0);
        ThreadSummary threadSummary = b5m.A06;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            9ZS r02 = new 9ZS(A03, messagesCollection, threadSummary);
            1Bn.A0K();
            FbInjector.A04(A01);
            b5m.A03 = r02;
            if (messagesCollection.A01.isEmpty()) {
                return;
            }
            b5m.A0A = 1Br.A07(((C5yo) 1Bn.A0E((Context) null, r0, 68197)).A01).AZk(36312239091486883L);
            B5M.A01(b5m, true);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
