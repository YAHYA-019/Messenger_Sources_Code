package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.events.common.data.OnDataChanged;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* renamed from: X.3gk, reason: invalid class name */
/* loaded from: 3gk.class */
public final class C3gk implements Runnable {
    public static final String __redex_internal_original_name = "SelectiveSyncThreadListHandler$onInboxDataChanged$$inlined$scheduleDataProcess$1";
    public final /* synthetic */ 2Wl A00;
    public final /* synthetic */ OnDataChanged A01;

    public C3gk(2Wl r302, OnDataChanged onDataChanged) {
        this.A00 = r302;
        this.A01 = onDataChanged;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder A0k;
        String str;
        2Wl r0 = this.A00;
        2WF r02 = r0.A07;
        Object A00 = this.A01.A00();
        if (A00 instanceof 2Sg) {
            2Sg r03 = (2Sg) A00;
            11T.A0F(r03, 0);
            1Hb r04 = (1Hb) r03.A00.A01((String) null, 1Hb.class);
            1Hb A01 = 2Wl.A01(r0);
            if (r04 == A01) {
                if (r02.CyE(A00)) {
                    ImmutableList BFV = r02.BFV(A00);
                    if (BFV.isEmpty()) {
                        str = "Skipping sync as there are no thread summaries";
                    } else {
                        FbUserSession fbUserSession = r0.A01;
                        2bI r05 = (2bI) 1Lm.A05(r0.A00, fbUserSession, 66503);
                        2bK A002 = r05.A00(r04);
                        if (11T.A0O(A002.A02, BFV)) {
                            str = "Skipping sync as thread summaries were the same as previous";
                        } else {
                            Set BF9 = r02.BF9(BFV);
                            Set set = A002.A03;
                            r05.A02(r04, BFV, BF9);
                            boolean A0O = 11T.A0O(BF9, set);
                            if (A0O || set.containsAll(BF9)) {
                                A0k = AnonymousClass001.A0k();
                                A0k.append("Ending potential sync because ");
                                A0k.append(A0O ? "thread keys are the same" : "all threads were in prior sync");
                            } else {
                                long B02 = r02.B02(BFV);
                                long j = A002.A00;
                                if (B02 < j) {
                                    StringBuilder A0k2 = AnonymousClass001.A0k();
                                    A0k2.append("Received new data result to sync: ");
                                    A0k2.append(A00);
                                    1BL.A1I(r04, " for filter ", "SelectiveSyncThreadListHandler", A0k2);
                                    r05.A01(r04, B02);
                                    2Wl.A04(r0, r04, 6, false);
                                    2Wl.A02(fbUserSession, A002.A01, r0, r04, BFV, B02, 2Wl.A00(r0).A04);
                                    return;
                                }
                                0fH.A0j("SelectiveSyncThreadListHandler", 0Pz.A0i("Prior timestamp: ", " && newest timestamp: ", j, B02));
                                str = "Ending potential sync because timestamp is not older";
                            }
                        }
                    }
                } else {
                    str = "Skipping as we've determined we should not further process the result";
                }
                0fH.A0j("SelectiveSyncThreadListHandler", str);
            }
            A0k = AnonymousClass001.A0k();
            A0k.append("Data changed: mismatch filter type with curr ");
            A0k.append(A01);
            A0k.append(" and data ");
            A0k.append(r04);
            str = A0k.toString();
            0fH.A0j("SelectiveSyncThreadListHandler", str);
        }
    }
}
