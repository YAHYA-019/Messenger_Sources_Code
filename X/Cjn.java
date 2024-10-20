package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: Cjn.class */
public final class Cjn implements C6hg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public Cjn(Context context, View view, 06Z r304, FbUserSession fbUserSession, FbUserSession fbUserSession2, ThreadKey threadKey, int i) {
        this.A00 = i;
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A05 = threadKey;
        this.A04 = r304;
        this.A03 = fbUserSession2;
        this.A06 = view;
    }

    @Override // X.C6hg
    public final void CHU(C6hk c6hk) {
        boolean z;
        if (this.A00 != 0) {
            if (c6hk != null) {
                5Hr r0 = (5Hr) 1Bn.A0A(67674);
                Context context = (Context) this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                ThreadKey threadKey = (ThreadKey) this.A05;
                ThreadSummary threadSummary = c6hk.A01;
                java.util.Map A00 = c6hk.A00.A00();
                long j = threadKey.A02;
                Capabilities A01 = r0.A01(context, fbUserSession, threadKey, threadSummary, (User) A00.get(AbH.A0v(j)), (2Sh) null);
                11T.A0B(DJX.A00);
                11T.A0F(A01, 6);
                1Br A012 = 1Bu.A01(context, 82377);
                1G1 r02 = (FbUserSession) this.A03;
                C5q c5q = (C5q) 1Br.A0B(A012);
                ImmutableList immutableList = threadSummary.A1L;
                11T.A0A(immutableList);
                ArrayList A0z = 1BL.A0z(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    A0z.add(AbH.A0j(it));
                }
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj : A0z) {
                    if (7zL.A1X(((ParticipantInfo) obj).A00(), r02.A02)) {
                        A0s.add(obj);
                    }
                }
                if (!(A0s instanceof Collection) || !A0s.isEmpty()) {
                    Iterator it2 = A0s.iterator();
                    while (it2.hasNext()) {
                        if (((ParticipantInfo) it2.next()).A0L) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (threadSummary.A0n.A18()) {
                    if (AbL.A1I(c5q.A05) || z) {
                        R1U.A00(context, String.valueOf(j));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (c6hk != null) {
            5Hr r03 = (5Hr) 1Bn.A0A(67674);
            Context context2 = (Context) this.A01;
            FbUserSession fbUserSession2 = (FbUserSession) this.A02;
            ThreadKey threadKey2 = (ThreadKey) this.A05;
            ThreadSummary threadSummary2 = c6hk.A01;
            Capabilities A013 = r03.A01(context2, fbUserSession2, threadKey2, threadSummary2, (User) c6hk.A00.A00().get(AbJ.A0o(threadKey2)), (2Sh) null);
            DJX djx = DJX.A00;
            11T.A0B(djx);
            11T.A0F(A013, 6);
            1Br A0Q = AbG.A0Q();
            1Br A014 = 1Bu.A01(context2, 82377);
            FbUserSession fbUserSession3 = (FbUserSession) this.A03;
            if (((C5q) 1Br.A0B(A014)).A00(threadSummary2)) {
                View view = (View) this.A06;
                djx.Bbb(BNV.A2M, "group_title");
                1F9 r04 = threadSummary2.A0g;
                if (r04 != null && r04 == 1F9.A0B && 4YU.A1Y(A013, 61)) {
                    ThreadKey threadKey3 = threadSummary2.A0l;
                    long A0r = threadKey3 != null ? threadKey3.A0r() : 0L;
                    22F r05 = (22F) 1Lm.A05(context2, fbUserSession3, 33174);
                    C00i c00i = A0Q.A00;
                    if (AbK.A0k(c00i).AZk(36315340060369658L) && AbK.A0k(c00i).AZk(36315340060304121L) && r05.A00(14, A0r)) {
                        AlP.A0L.A00(1vD.A00(view), threadKey2, (String) null);
                        return;
                    }
                    return;
                }
                if (2oI.A03(threadSummary2)) {
                    int i = AlR.A0v;
                    CPA.A03(1vD.A00(view), threadSummary2.A0n, (Long) null, "thread_view", "thread_settings");
                } else if ((threadKey2.A1F() || threadKey2.A1I()) && !2Gt.A0D(threadSummary2)) {
                    1Bn.A0A(67039);
                    if (4YU.A1Y(A013, 61)) {
                        ((CHD) 1Bu.A06(context2, 82378)).A01(fbUserSession3, threadSummary2, A013).show();
                    }
                }
            }
        }
    }
}
