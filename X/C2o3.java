package X;

import android.content.res.Resources;
import com.facebook.messaging.model.threads.ThreadConnectivityData;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.2o3, reason: invalid class name */
/* loaded from: 2o3.class */
public final class C2o3 implements C2nj {
    public final AnonymousClass207 A00 = C2o4.A01;

    @Override // X.C2nj
    public AnonymousClass207 Asi() {
        return this.A00;
    }

    @Override // X.C2nj
    public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
        Resources resources;
        int i;
        11T.A0F(threadSummary, 0);
        C2o4 c2o4 = null;
        if (!threadSummary.A0n.A16()) {
            2oR r0 = (2oR) 1Bn.A0A(66298);
            ThreadConnectivityData threadConnectivityData = threadSummary.A11;
            String str = threadSummary.A1p;
            if (str == null) {
                r0.A01.A00.get();
                if (2Gt.A0E(threadSummary) && threadConnectivityData != null) {
                    String A01 = threadConnectivityData.A01();
                    if (!11T.A0O(A01, "NONE")) {
                        int hashCode = A01.hashCode();
                        if (hashCode != -2117415362) {
                            if (hashCode == 888861655 && A01.equals("BASED_ON_SETTINGS")) {
                                resources = (Resources) 1Br.A0B(r0.A00);
                                i = 2131954816;
                                str = resources.getString(i);
                                11T.A0A(str);
                            }
                        } else if (A01.equals("INBOX_MESSAGE_REQUEST")) {
                            resources = (Resources) 1Br.A0B(r0.A00);
                            i = 2131954817;
                            str = resources.getString(i);
                            11T.A0A(str);
                        }
                    }
                }
                str = "";
            }
            if (!0CU.A0O(str)) {
                c2o4 = new C2o4(str);
            }
        }
        return c2o4;
    }
}
