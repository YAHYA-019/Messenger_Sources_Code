package X;

import android.content.Context;
import com.facebook.messaging.business.search.model.PlatformSearchData;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Crd.class */
public final class Crd implements DIv {
    public Context A00;
    public final 1Br A01;
    public final 1De A02;

    public Crd(1De r302) {
        this.A02 = r302;
        Context A0A = AbK.A0A(r302);
        this.A00 = A0A;
        this.A01 = 7zN.A0H(A0A);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9K(Btt btt, Object obj) {
        return 1hM.A01;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9M(PlatformSearchGameData platformSearchGameData, Object obj) {
        ListenableFuture listenableFuture = 1hM.A01;
        11T.A0A(listenableFuture);
        return listenableFuture;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9O(PlatformSearchUserData platformSearchUserData, Object obj) {
        Bn4 bn4 = (Bn4) obj;
        11T.A0F(platformSearchUserData, 0);
        Crs crs = (Crs) 7zR.A0o(this.A00, 83519);
        1Kh A0y = AbF.A0y();
        A0y.A05(platformSearchUserData.A04);
        A0y.A01(1Kq.A07);
        A0y.A0R = ((PlatformSearchData) platformSearchUserData).A01;
        A0y.A0g = ((PlatformSearchData) platformSearchUserData).A02;
        A0y.A1L = platformSearchUserData.A05;
        User A0w = AbF.A0w(A0y);
        return 2FP.A02(new D2q(bn4 != null ? bn4.A00 : null, A0w, 15), crs.D9o(A0w), 7zQ.A14());
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9X(ThreadSummary threadSummary, Object obj) {
        53N r314;
        Bn4 bn4 = (Bn4) obj;
        11T.A0F(threadSummary, 0);
        DataSourceIdentifier dataSourceIdentifier = null;
        DK4 dk4 = bn4 != null ? bn4.A00 : null;
        BOi A00 = BWH.A00(dk4);
        String str = AcW.A01(dk4).loggingName;
        11T.A0A(str);
        Double valueOf = Double.valueOf(threadSummary.A00);
        if (dk4 == null) {
            dk4 = EnumC1297Ada.A1N;
        }
        if (bn4 != null) {
            AcX acX = bn4.A01;
            r314 = acX.A0A;
            11T.A09(r314);
            dataSourceIdentifier = acX.A09;
            11T.A09(dataSourceIdentifier);
        } else {
            r314 = 53N.A0R;
        }
        return C3o5.A0J(new Csv(A00, threadSummary, dataSourceIdentifier, r314, dk4, valueOf, str));
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9Z(C1772As6 c1772As6, Object obj) {
        return 1hM.A01;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9a(Bt5 bt5, Object obj) {
        return 1hM.A01;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9b(8KN r302, Object obj) {
        return 1hM.A01;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9h(MessageSearchMessageModel messageSearchMessageModel, Object obj) {
        return 1hM.A01;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9j(MessageSearchThreadModel messageSearchThreadModel, Object obj) {
        ListenableFuture listenableFuture = 1hM.A01;
        11T.A0A(listenableFuture);
        return listenableFuture;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9p(User user, Object obj) {
        Bn4 bn4 = (Bn4) obj;
        11T.A0F(user, 0);
        DK4 dk4 = bn4 != null ? bn4.A00 : null;
        4iI r0 = (4iI) 1Br.A0B(this.A01);
        UserKey userKey = user.A0k;
        11T.A0A(userKey);
        return 2FP.A02(new D2u(3, dk4, user, bn4), r0.A05(userKey), 7zQ.A14());
    }
}
