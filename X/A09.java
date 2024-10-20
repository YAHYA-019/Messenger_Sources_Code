package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: A09.class */
public final class A09 implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;

    public A09(Object obj, long j, int i) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                boolean A1W = 7zP.A1W(obj);
                0fH.A0j("SelectiveSyncCommunityChannelListHandler", 0Pz.A0g(A1W ? "Successfully synced" : "Failed to sync", " community channel list for ", this.A01));
                ((A7c) this.A02).A03.A00(A1W ? 0S2.A00 : 0S2.A01);
                return;
            case 1:
                1qX A0t = 7zL.A0t(obj);
                21X r0 = (21X) this.A02;
                HashMap hashMap = r0.A05;
                long j = this.A01;
                Long valueOf = Long.valueOf(j);
                Iterable iterable = (Iterable) hashMap.remove(valueOf);
                HashSet A0v = AnonymousClass001.A0v();
                if (A0t != null && 1qX.A00(A0t) > 0) {
                    int A00 = 1qX.A00(A0t);
                    for (int i = 0; i < A00; i++) {
                        A0v.add(String.valueOf(7zQ.A0E(A0t, i)));
                    }
                }
                hashMap.put(valueOf, A0v);
                if (iterable != null) {
                    for (String str : 0QD.A0h(iterable, A0v)) {
                        C00i c00i = r0.A03.A00;
                        String str2 = ((5SR) c00i.get()).A01;
                        c00i.get();
                        7NV r02 = (7NV) 1Br.A0B(r0.A02);
                        04R.A09(7zO.A1b(TraceFieldType.Protocol, "UPI", 1BK.A1G("presenceState", "NOT_IN_THREAD")));
                        r02.A00();
                        5SR.A01(r0.A00, (5SR) c00i.get(), str2, str, 0);
                    }
                }
                if (7zM.A1b(A0v)) {
                    Iterator it = A0v.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        String valueOf2 = String.valueOf(j);
                        C00i c00i2 = r0.A03.A00;
                        c00i2.get();
                        7NV r03 = (7NV) 1Br.A0B(r0.A02);
                        04R.A09(new 03Y[]{1BK.A1G("presenceState", "IN_THREAD"), 1BK.A1G(TraceFieldType.Protocol, "UPI")});
                        r03.A00();
                        5SR r04 = (5SR) c00i2.get();
                        FbUserSession fbUserSession = r0.A00;
                        11T.A0D(str3);
                        5SR.A01(fbUserSession, r04, valueOf2, str3, 1);
                    }
                    return;
                }
                return;
            case 2:
                9W0 r05 = (9W0) this.A02;
                if (r05.A03 && r05.A02) {
                    long j2 = this.A01;
                    8yG r06 = (8yG) 1Br.A0B(r05.A08);
                    1Um AQV = r06.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P = 1BK.A0P(AQV);
                    1Um.A02(AQV, new A0O(14, j2, new C8z3(AQV, r06), r06, A0P), A0P, false);
                    A1d.A01(A0P, r05, ActionId.VIEW_DID_LOAD_BEGIN);
                    return;
                }
                return;
            default:
                boolean A1W2 = 7zP.A1W(obj);
                UserFlowLogger A0Z = 4YV.A0Z(((C8v6) this.A02).A06);
                long j3 = this.A01;
                if (A1W2) {
                    A0Z.flowEndSuccess(j3);
                    return;
                } else {
                    A0Z.flowEndFail(j3, "Failed to update typing indicator account setting", null);
                    return;
                }
        }
    }
}
