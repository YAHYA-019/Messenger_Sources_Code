package X;

import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.30U, reason: invalid class name */
/* loaded from: 30U.class */
public final class C30U implements C2sd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C30U(C2sd c2sd, C2se c2se, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = c2sd;
            this.A02 = c2se;
        } else {
            this.A02 = c2se;
            this.A01 = c2sd;
        }
    }

    @Override // X.C2sd
    public ListenableFuture ARv(ImmutableList immutableList) {
        if (this.A00 != 0) {
            11T.A0F(immutableList, 0);
            return 2FP.A02(new ABe(this.A02, 5), ((C2sd) this.A01).ARv(immutableList), 2eQ.A01);
        }
        11T.A0F(immutableList, 0);
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(immutableList.size());
        23F r0 = (23F) 1Lm.A06(((C2se) this.A02).A00, 33102);
        1Du it = immutableList.iterator();
        int i = 0;
        ImmutableList.Builder builder = null;
        while (it.hasNext()) {
            UserKey userKey = (UserKey) it.next();
            User A00 = r0.A00(userKey);
            if (A00 != null) {
                builderWithExpectedSize.m11011add((Object) A00);
                i++;
            } else {
                if (builder == null) {
                    builder = ImmutableList.builder();
                }
                builder.m11011add((Object) userKey);
            }
        }
        if (builder == null) {
            return 1Kd.A0A(builderWithExpectedSize.build());
        }
        C2sd c2sd = (C2sd) this.A01;
        if (i == 0) {
            return c2sd.ARv(immutableList);
        }
        return 2FP.A02(new ABe(builderWithExpectedSize, 4), c2sd.ARv(1Fj.A01(builder)), 2eQ.A01);
    }
}
