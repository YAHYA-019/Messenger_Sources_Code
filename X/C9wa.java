package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9wa, reason: invalid class name */
/* loaded from: 9wa.class */
public final class C9wa implements 5Vz {
    public final int A00;
    public final Object A01;

    public C9wa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bq7(ImmutableList immutableList) {
        Capabilities capabilities;
        String str;
        if (this.A00 == 0) {
            11T.A0F(immutableList, 0);
            User user = (User) 0QD.A0E(immutableList);
            if (user == null || (capabilities = user.A0o) == null || capabilities.equals(6oJ.A0C)) {
                return;
            }
            6oJ r0 = (6oJ) this.A01;
            ((C21N) 1Br.A0B(r0.A04)).A01(r0.A08);
            6oJ.A00(r0, capabilities);
            return;
        }
        11T.A0F(immutableList, 0);
        User user2 = (User) 0QD.A0J(immutableList, 0);
        RfA rfA = (RfA) this.A01;
        Capabilities capabilities2 = RfA.A0B;
        Capabilities capabilities3 = null;
        if ((user2 != null ? user2.A0d : null) != 1M1.A0D) {
            if (user2 != null) {
                capabilities3 = user2.A0o;
            }
            if (11T.A0O(capabilities3, RfA.A0B)) {
                return;
            }
            ((C21N) 1Br.A0B(rfA.A06)).A01(rfA.A08);
            ThreadSummary threadSummary = rfA.A02;
            if (threadSummary == null) {
                str = "threadSummary";
            } else {
                06Z r02 = rfA.A01;
                if (r02 != null) {
                    RfA.A00(r02, threadSummary, rfA, user2);
                    return;
                }
                str = "fragmentManager";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }
}
