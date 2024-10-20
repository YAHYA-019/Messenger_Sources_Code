package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3a5, reason: invalid class name */
/* loaded from: 3a5.class */
public final class C3a5 implements 2Ux {
    public final /* synthetic */ 2Ol A00;

    public C3a5(2Ol r302) {
        this.A00 = r302;
    }

    public void CSk(C2f5 c2f5, String str, String str2, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ThreadKey threadKey = (ThreadKey) it.next();
            2Ol r0 = this.A00;
            ThreadSummary A06 = ((2fE) r0.A00.get()).A06(threadKey);
            if (A06 == null || C2o7.A01(A06)) {
                ((B5I) r0).A01.A01();
                return;
            }
        }
    }
}
