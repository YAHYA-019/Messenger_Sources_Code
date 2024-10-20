package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.mutators.DeleteThreadDialogFragment;
import com.facebook.messaging.service.model.MarkThreadFields;
import com.facebook.messaging.service.model.MarkThreadsParams;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: C7s.class */
public final class C7s {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public C7s(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 83024);
        this.A02 = AbG.A0V();
        this.A01 = 1Bu.A03(r0, 83025);
    }

    public final void A00(06Z r302, 1F9 r303, DIS dis, ImmutableList immutableList, String str, int i, boolean z) {
        11T.A0H(immutableList, r302);
        11T.A0F(r303, 3);
        11T.A0F(dis, 4);
        int size = immutableList.size();
        C00i c00i = this.A02.A00;
        Byb byb = new Byb(immutableList, null, null, null, null, null, AbG.A06(c00i).getString(2131959781), null, null, AbG.A06(c00i).getString(2131959783), null, AbG.A06(c00i).getQuantityString(2131820655, size, Integer.valueOf(size)));
        3EX r317 = z ? 3EX.A01 : 3EX.A02;
        CMw cMw = (CMw) 1Br.A0B(this.A00);
        ImmutableList immutableList2 = byb.A00;
        CMw.A01(r303, cMw, immutableList2, AbstractC00603o4.A00(228), str, false);
        String A0s = 7zR.A0s();
        ((C1266Ac8) 1Br.A0B(this.A01)).A01(r317, r303, A0s, 4, immutableList2.size(), i);
        DeleteThreadDialogFragment A05 = DeleteThreadDialogFragment.A05(byb);
        A05.A05 = new Cn4(r317, r303, dis, byb, this, A0s, str, i);
        A05.A0m(r302, "delete_thread_dialog");
    }

    public final void A01(FbUserSession fbUserSession, 1F9 r303, ImmutableList immutableList, int i, boolean z) {
        AbK.A1S(immutableList, r303);
        ((C1266Ac8) 1Br.A0B(this.A01)).A01(z ? 3EX.A01 : 3EX.A02, r303, 7zR.A0s(), 5, immutableList.size(), i);
        5I5 r0 = (5I5) 4YU.A0o(fbUserSession, this.A03, 49665);
        ImmutableList.Builder builder = ImmutableList.builder();
        Integer num = 0S2.A00;
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            ThreadSummary A0j = AbF.A0j(it);
            ThreadKey threadKey = A0j.A0n;
            long j = A0j.A0L;
            1F9 r02 = A0j.A0g;
            r02.getClass();
            long j2 = A0j.A0N;
            builder.m11011add((Object) new MarkThreadFields(r02, threadKey, -1, j, j2, j2, true));
        }
        5I5.A05(r0, new MarkThreadsParams(builder, num, true), true);
    }
}
