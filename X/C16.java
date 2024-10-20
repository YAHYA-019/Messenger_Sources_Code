package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import kotlin.jvm.functions.Function1;

/* loaded from: C16.class */
public final class C16 {
    public final C00i A00;

    public C16(FbUserSession fbUserSession) {
        this.A00 = AbF.A0B(fbUserSession, (1BY) null, 17061);
    }

    public SettableFuture A00(final C5ow c5ow, final BEV bev, final int i) {
        2bT r0 = new 2bT();
        7zU.A0o(bev, i).getClass();
        final ThreadKey A00 = C21a.A00(null, AbH.A10(((1qX) bev).mResultSet, i, 0), 7zP.A0n(bev, i));
        ((C2eo) this.A00.get()).A07(new Cmj(r0.A00(new Function1() { // from class: X.DBp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BEV bev2 = bev;
                int i2 = i;
                C5ow c5ow2 = c5ow;
                ThreadKey threadKey = A00;
                ImmutableList immutableList = (ImmutableList) obj;
                if (immutableList.size() <= 0) {
                    String A002 = 4YT.A00(1175);
                    0fH.A0j(1BJ.A00(297), A002);
                    throw AnonymousClass001.A0N(A002);
                }
                User user = (User) 1BK.A0r(immutableList);
                ((1qX) bev2).mResultSet.getNullableLong(i2, 9).getClass();
                5PI r02 = new 5PI();
                r02.A0E(7zP.A0j(bev2, i2));
                r02.A1g = 7zP.A0k(bev2, i2);
                3pI r03 = new 3pI();
                r03.A09 = user.A0k;
                r03.A0D = user.A0X.displayName;
                r03.A01(Long.valueOf(user.A0K));
                r03.A02(Long.valueOf(user.A0L));
                r03.A06 = ((1qX) bev2).mResultSet.getNullableLong(i2, 9).longValue();
                r02.A0K = r03.A00();
                5PI.A00(r02, ThreadKey.A0Y(threadKey) ? 7zP.A0m(bev2, i2) : c5ow2.A09);
                r02.A0V = threadKey;
                r02.A05 = ((1qX) bev2).mResultSet.getLong(i2, 8);
                r02.A0B = C5p1.A00(c5ow2.A03);
                r02.A1f = c5ow2.A0C;
                r02.A1e = c5ow2.A0A;
                return 4YU.A0U(r02);
            }
        }, true, false), 2), ImmutableList.of((Object) 1BK.A0m(((1qX) bev).mResultSet, i, 5)));
        return r0.A00;
    }
}
