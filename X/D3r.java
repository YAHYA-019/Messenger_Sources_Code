package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: D3r.class */
public final class D3r implements 2eF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ BOp A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ ThreadSummary A04;
    public final /* synthetic */ DGD A05;
    public final /* synthetic */ Cu4 A06;

    public D3r(Context context, 06Z r303, BOp bOp, FbUserSession fbUserSession, ThreadSummary threadSummary, DGD dgd, Cu4 cu4) {
        this.A06 = cu4;
        this.A03 = fbUserSession;
        this.A04 = threadSummary;
        this.A00 = context;
        this.A01 = r303;
        this.A02 = bOp;
        this.A05 = dgd;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        boolean A03;
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        if (abstractCollection == null) {
            A03 = false;
        } else {
            ArrayList A0z = 1BL.A0z(abstractCollection);
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                User A0t = AbG.A0t(it);
                11T.A0D(A0t);
                A0z.add(C28p.A00(A0t));
            }
            Cu4 cu4 = this.A06;
            7U8 r0 = (7U8) 1Br.A0B(cu4.A04);
            FbUserSession fbUserSession = this.A03;
            ThreadSummary threadSummary = this.A04;
            A03 = r0.A03(fbUserSession, threadSummary, A0z);
            if (A03) {
                cu4.A00(this.A00, this.A01, this.A02, threadSummary, this.A05, A0z);
            }
        }
        return 1Kd.A0A(Boolean.valueOf(A03));
    }
}
