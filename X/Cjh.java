package X;

import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.orca.notify.MessagesNotificationManager;
import com.google.common.collect.ImmutableList;

/* loaded from: Cjh.class */
public final class Cjh implements C5xz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cjh(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C5xz
    public final void CHX(ThreadSummary threadSummary) {
        ThreadSummary threadSummary2;
        switch (this.A00) {
            case 0:
                C3Nb c3Nb = (C3Nb) this.A01;
                if (threadSummary == null || threadSummary.A2i) {
                    threadSummary2 = null;
                } else {
                    C1zm A0g = AbF.A0g(threadSummary);
                    A0g.A2V = true;
                    threadSummary2 = AbF.A0i(A0g);
                }
                c3Nb.A00(threadSummary2);
                return;
            case 1:
                if (threadSummary == null) {
                    ((DH5) this.A02).BxV();
                    return;
                } else {
                    ((AeX) 1Bn.A0E((Context) null, ((BRT) this.A01).A00, 82710)).A01(new CjX(this, 5), threadSummary);
                    return;
                }
            case 2:
                ImmutableList.Builder A0h = 4YU.A0h();
                if (threadSummary != null) {
                    A0h.m11011add((Object) threadSummary);
                    ((1FX) this.A01).set(((C8v) 1Br.A0B(((Cav) this.A02).A00)).A02(BOi.A0O, EnumC1297Ada.A0R, A0h.build(), null, null, "", "memories"));
                    return;
                }
                return;
            default:
                if (threadSummary == null || !AbF.A1X(threadSummary)) {
                    return;
                }
                MessagesNotificationManager messagesNotificationManager = (MessagesNotificationManager) this.A01;
                1G2 r0 = MessagesNotificationManager.A0X;
                ((C5b4) messagesNotificationManager.A0I.get()).A00(((Message) this.A02).A1V);
                return;
        }
    }
}
