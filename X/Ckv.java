package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.groups.create.logging.CreateGroupAggregatedLatencyLogger;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: Ckv.class */
public final class Ckv implements DF8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C6mf A01;
    public final /* synthetic */ ThreadSummary A02;

    public Ckv(Context context, C6mf c6mf, ThreadSummary threadSummary) {
        this.A01 = c6mf;
        this.A02 = threadSummary;
        this.A00 = context;
    }

    @Override // X.DF8
    public void AJs(ImmutableList immutableList) {
        C6mf c6mf = this.A01;
        1BY r0 = c6mf.A00;
        FbUserSession A05 = 1Fw.A05(r0);
        ThreadSummary threadSummary = this.A02;
        ImmutableList immutableList2 = threadSummary.A1L;
        ImmutableList.Builder builder = ImmutableList.builder();
        23F A0l = AbJ.A0l(A05, r0);
        1Du it = immutableList2.iterator();
        while (it.hasNext()) {
            ThreadParticipant A0W = 4YU.A0W(it);
            1Du it2 = immutableList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    builder.m11011add((Object) A0l.A00(C28p.A01(A0W)));
                    break;
                } else if (AbG.A0t(it2).A0k.equals(C28p.A01(A0W))) {
                    break;
                }
            }
        }
        ImmutableList build = builder.build();
        Context context = this.A00;
        if (build.size() <= 2) {
            ((CIz) c6mf.A05.get()).A03(context);
            return;
        }
        HashSet A0v = AnonymousClass001.A0v();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) build);
        CreateCustomizableGroupParams createCustomizableGroupParams = new CreateCustomizableGroupParams(null, null, null, null, null, null, null, null, null, copyOf, "group_thread_create_without_blockers", null, null, threadSummary.A20, null, null, null, C1pq.A07(copyOf, "participants", A0v, A0v), ((53F) c6mf.A06.get()).A01(), false, false, false, false);
        ((CreateGroupAggregatedLatencyLogger) c6mf.A03.get()).A01(createCustomizableGroupParams.A00);
        CIz cIz = (CIz) c6mf.A05.get();
        c6mf.A07.get();
        ListenableFuture A02 = cIz.A02(A05, createCustomizableGroupParams, true);
        1Kd.A0D(c6mf.A08, new D4S(2, c6mf, threadSummary, A05, createCustomizableGroupParams), A02);
    }
}
