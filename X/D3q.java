package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserFbidIdentifier;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3q.class */
public final class D3q implements 2eF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public D3q(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A05 = str;
        this.A03 = obj4;
        this.A04 = obj2;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        2JY A0B;
        Object obj2;
        Object obj3;
        if (this.A00 == 0) {
            2JY A0B2 = 1BK.A0B(1BK.A0B((2JY) ((AbstractC08294mh) obj).A03, 2JX.class, 1026442562, -1076380055), 2JX.class, 1656343746, 1026970836);
            String A0r = (A0B2 == null || (A0B = 1BK.A0B(A0B2, 2JX.class, 883555422, -619886357)) == null) ? null : A0B.A0r(-439748141);
            7V4 r0 = (7V4) this.A01;
            ThreadKey threadKey = (ThreadKey) this.A04;
            C3sa A00 = 7V4.A00(7V4.A01(threadKey, r0, A0r, this.A05), threadKey, r0);
            AbstractC05414dq A0A = 1VX.A0A((Context) this.A02, (FbUserSession) this.A03);
            4YU.A1J(A00, 3859739090723409L);
            return A0A.A03(A00);
        }
        C5nf c5nf = (C5nf) obj;
        if (c5nf == null || (obj2 = c5nf.A00) == null || (obj3 = c5nf.A01) == null) {
            if (AbL.A0M().AZk(36326339468547526L)) {
                if (AnonymousClass001.A1V(4VJ.A02((Context) this.A02, (4VJ) this.A01, (C4Dl) this.A03, this.A05).get())) {
                    return C3o5.A0K(true);
                }
            }
            return ((C7S) ((4VJ) this.A01).A0H.get()).A01();
        }
        String str = (String) obj2;
        boolean A1V = AnonymousClass001.A1V(obj3);
        4VJ r02 = (4VJ) this.A01;
        C0s c0s = (C0s) r02.A05.get();
        Intent intent = (Intent) this.A04;
        c0s.A00(intent.getData().getAuthority(), str, intent.getData().getQuery(), this.A05);
        ThreadKey A03 = ((4iI) r02.A0F.get()).A03(new UserFbidIdentifier(str));
        if (A1V) {
            intent.putExtra("extra_thread_deeplink_back_navigation", "discover");
        }
        intent.putExtra("hash", intent.getData().getQueryParameter("hash"));
        return ((C4Dl) this.A03).A0B((Context) this.A02, intent, A03);
    }
}
