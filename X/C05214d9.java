package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: X.4d9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4d9.class */
public final class C05214d9 {
    public final 1Br A00 = 1Bq.A00(17085);
    public final 1Br A01 = 1Bu.A00(65708);
    public final 1Br A04 = 1Bq.A00(16467);
    public final 1Br A03 = 1Bu.A00(32920);
    public final 1Br A02 = 1Bq.A00(16688);

    public final void A00(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        2fI r0 = (2fI) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 67665);
        ImmutableList A00 = r0.BFA(1F9.A0I).A00();
        ArrayList arrayList = new ArrayList();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ThreadKey) next).A1K()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C1A3.A1D(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(4YU.A0l((ThreadKey) it2.next()));
        }
        1yC r307 = ((2yD) 1Bi.A03(16385)).AZk(36326360943580667L) ? (1yC) 1Bn.A0A(65708) : (1yC) this.A01.A00.get();
        C0ty c0ty = C0ty.A00;
        MailboxFutureImpl A002 = r307.A00((MailboxCallback) null, arrayList2, c0ty, c0ty, 100, true);
        A002.A00((Executor) this.A04.A00.get());
        A002.Cu4(new Cxn(4, r0, this, A00));
    }
}
