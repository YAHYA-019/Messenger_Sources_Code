package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadParams;
import com.facebook.rtc.launch.CallStartOutcome;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: D3t.class */
public final class D3t implements 2eF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ B9r A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public D3t(Context context, FbUserSession fbUserSession, B9r b9r, String str, List list, boolean z, boolean z2, boolean z3) {
        this.A02 = b9r;
        this.A00 = context;
        this.A04 = list;
        this.A07 = z;
        this.A05 = z2;
        this.A03 = str;
        this.A06 = z3;
        this.A01 = fbUserSession;
    }

    /* JADX WARN: Type inference failed for: r0v76, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        CallStartOutcome callStartOutcome;
        CallStartOutcome callStartOutcome2;
        Boolean bool = (Boolean) obj;
        0fH.A0h(String.valueOf(bool), B9r.__redex_internal_original_name, "Mqtt wake result: %s");
        if (bool == null || !bool.booleanValue()) {
            return C3o5.A0J(new CallStartOutcome(H9h.A02, "NoMqttConnection"));
        }
        final B9r b9r = this.A02;
        final Context context = this.A00;
        List list = this.A04;
        final boolean z = this.A07;
        boolean z2 = this.A05;
        final String str = this.A03;
        boolean z3 = this.A06;
        final FbUserSession fbUserSession = this.A01;
        if (list.isEmpty()) {
            callStartOutcome = new CallStartOutcome(H9h.A02, null);
        } else {
            if (list.size() == 1) {
                String str2 = (String) list.get(0);
                if (z2) {
                    try {
                        0fH.A0h(Boolean.valueOf(z3), B9r.__redex_internal_original_name, "Start group call with isE2ee? %s");
                        return 4YV.A0b(b9r.A01, new 2eF() { // from class: X.D3m
                            public final ListenableFuture A8b(Object obj2) {
                                ImmutableList A01;
                                B9r b9r2 = b9r;
                                Context context2 = context;
                                boolean z4 = z;
                                ThreadSummary threadSummary = (ThreadSummary) obj2;
                                return (threadSummary == null || !threadSummary.A2H || (A01 = 5OA.A01(threadSummary)) == null) ? C3o5.A0J(new CallStartOutcome(H9h.A02, "ThreadSummaryNotCallable")) : B9r.A00(context2, fbUserSession, threadSummary.A0n, b9r2, A01, str, z4);
                            }
                        }, ((CbW) 1Lo.A04(context, fbUserSession, (1BY) null, 83487)).A03(z3 ? ThreadKey.A01(Long.parseLong(str2)) : AbI.A0Y(str2)));
                    } catch (NumberFormatException e) {
                        0fH.A0z(B9r.__redex_internal_original_name, "Invalid group thread id: %s", e, new Object[]{str2});
                        callStartOutcome2 = new CallStartOutcome(H9h.A02, "NotCallable");
                    }
                } else {
                    try {
                        long parseLong = Long.parseLong(str2);
                        CbW cbW = (CbW) 1Lo.A04(context, fbUserSession, (1BY) null, 83487);
                        C5V0 c5v0 = (C5V0) 1Lo.A06(fbUserSession, 115765);
                        1Hz A10 = AbF.A10();
                        ThreadKey A02 = ((4iI) cbW.A07.get()).A02(parseLong);
                        if (A02 != null) {
                            A10.A05(A02);
                        }
                        ImmutableSet A07 = A10.A07();
                        Bundle A05 = 1BK.A05();
                        1He r0 = 1He.A04;
                        11T.A0F(A07, 0);
                        A05.putParcelable("fetchThreadParams", new FetchThreadParams(r0, null, new ThreadCriteria(null, A07), null, 0, 0L, false, false, false, false, false));
                        1IB A0M = 4YU.A0M(A05, CallerContext.A06(CbW.class), 4YU.A0L(cbW.A04), "fetch_threads", true);
                        D2l d2l = new D2l(cbW, 8);
                        1JU r02 = 1JU.A01;
                        return 2FP.A00(new D3u(context, fbUserSession, b9r, cbW, c5v0, str, parseLong, z3, z), 2FP.A02(new D2l(cbW, 7), 2FP.A02(d2l, A0M, r02), r02), r02);
                    } catch (NumberFormatException unused) {
                        callStartOutcome2 = new CallStartOutcome(H9h.A02, null);
                    }
                }
                return C3o5.A0J(callStartOutcome2);
            }
            if (!z2) {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0s.add(7zN.A0d(AbF.A0y(), AnonymousClass001.A0i(it)));
                }
                ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
                CbW cbW2 = (CbW) 1Lo.A04(context, fbUserSession, (1BY) null, 83487);
                User user = (User) 1Bn.A0E((Context) null, cbW2.A03, 83430);
                1FV A0j = 4YU.A0j();
                C00i c00i = cbW2.A06;
                ((Cc5) c00i.get()).AEC();
                ((Cc5) c00i.get()).A01 = new C1619Anx(2, A0j, copyOf, cbW2);
                ((Cc5) c00i.get()).A00(CED.A00(user, copyOf, true, false));
                ?? A0j2 = 4YU.A0j();
                1Kd.A0D(b9r.A01, new D4h(context, fbUserSession, b9r, cbW2, A0j2, str, list, z), A0j);
                return A0j2;
            }
            0fH.A0n(B9r.__redex_internal_original_name, "Unable to start group call with more than one thread id.");
            callStartOutcome = new CallStartOutcome(H9h.A02, "NotCallable");
        }
        return C3o5.A0J(callStartOutcome);
    }
}
