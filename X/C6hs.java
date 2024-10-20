package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.threadview.ThreadViewMessagesRecyclerView;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.6hs, reason: invalid class name */
/* loaded from: 6hs.class */
public final /* synthetic */ class C6hs implements Runnable {
    public static final String __redex_internal_original_name = "ThreadViewMessagesFragment$6$$ExternalSyntheticLambda0";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ 6FB A01;

    public /* synthetic */ C6hs(ThreadKey threadKey, 6FB r303) {
        this.A01 = r303;
        this.A00 = threadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6FB r0 = this.A01;
        ThreadKey threadKey = this.A00;
        6F2 r02 = r0.A00;
        ImmutableSet immutableSet = 6F2.A4P;
        C00j.A05("DelegateAnnouncer.onThreadVisible", -2075526932);
        6FK r03 = r02.A3c;
        r03.CQZ(threadKey);
        C00j.A01(796369044);
        C6Ff c6Ff = r02.A0z;
        C6i7 A09 = 6F2.A09(r02);
        ThreadViewMessagesRecyclerView threadViewMessagesRecyclerView = c6Ff.A0N;
        ((2Y2) A09).A00 = threadViewMessagesRecyclerView;
        C0Ad.A0B(threadViewMessagesRecyclerView, A09);
        if (r02.A2F == C0et.A0U) {
            Bundle A05 = 1BK.A05();
            A05.putString("thread_id", 6F2.A0F(r02));
            ThreadKey threadKey2 = r02.A0h;
            A05.putLong("page_id", (threadKey2 == null || !threadKey2.A1K()) ? -1 : threadKey2.A05);
            Activity A1P = r02.A1P();
            if (A1P != null && A1P.getIntent() != null) {
                A05.putParcelable("activity_intent_extras", A1P.getIntent().getExtras());
            }
            r02.A3K.get();
        }
        r02.A06 = 0L;
        6F2.A0a(r02);
        if (!6F2.A08(r02).equals(5Sl.A09)) {
            r03.C8x(6F2.A07(r02).A08(), (ThreadViewParams) null);
        }
    }
}
