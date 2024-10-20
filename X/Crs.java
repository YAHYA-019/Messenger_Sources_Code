package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Crs.class */
public final class Crs implements DIp {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final FbUserSession A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005c, code lost:
    
        if (r0.A02() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Crs(android.content.Context r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r302
            X.1Br r0 = X.7zN.A0H(r0)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r302
            X.1Br r0 = X.7zM.A0e(r0)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r303
            com.facebook.auth.usersession.FbUserSession r0 = X.1Br.A03(r0)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r303
            X.1G1 r0 = (X.1G1) r0
            java.lang.String r0 = r0.A02
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A04 = r1
            r0 = 66804(0x104f4, float:9.3612E-41)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.1gs r0 = (X.C1gs) r0
            r304 = r0
            X.1gb r0 = X.AbJ.A0Y()
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0J()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L5f
            r0 = r304
            boolean r0 = r0.A02()
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L64
        L5f:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L64:
            r0 = r301
            r1 = r305
            r0.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Crs.<init>(android.content.Context):void");
    }

    @Override // X.DIp
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public ListenableFuture D9o(User user) {
        11T.A0F(user, 0);
        if (user.A0C()) {
            ListenableFuture A0A = 1Kd.A0A(ThreadKey.A0F(AbG.A03(user.A0k.id), Long.parseLong(this.A04)));
            11T.A0D(A0A);
            return A0A;
        }
        if (this.A05) {
            return ((CNa) 1Bu.A06(this.A00, 82461)).A03(this.A03, user, false);
        }
        4iI r0 = (4iI) 1Br.A0B(this.A01);
        UserKey userKey = user.A0k;
        11T.A0A(userKey);
        return r0.A05(userKey);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9J(Btt btt) {
        return null;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9L(PlatformSearchGameData platformSearchGameData) {
        ListenableFuture listenableFuture = 1hM.A01;
        11T.A0A(listenableFuture);
        return listenableFuture;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9N(PlatformSearchUserData platformSearchUserData) {
        11T.A0F(platformSearchUserData, 0);
        ListenableFuture A0A = 1Kd.A0A(AbH.A0l((4iI) 1Br.A0B(this.A01), 1BK.A0X(platformSearchUserData.A04)));
        11T.A0A(A0A);
        return A0A;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9W(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey.A17()) {
            return ((C75) 1Lm.A05(this.A00, 1Br.A03(this.A02), 82162)).A01(threadSummary);
        }
        1hM A0J = C3o5.A0J(threadKey);
        11T.A0D(A0J);
        return A0J;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9Y(C1772As6 c1772As6) {
        11T.A0F(c1772As6, 0);
        return 1Kd.A0A(c1772As6.A01);
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9g(MessageSearchMessageModel messageSearchMessageModel) {
        11T.A0F(messageSearchMessageModel, 0);
        ListenableFuture A0A = 1Kd.A0A(AbJ.A0S(messageSearchMessageModel.A01));
        11T.A0A(A0A);
        return A0A;
    }

    @Override // X.DIp
    public /* bridge */ /* synthetic */ Object D9i(MessageSearchThreadModel messageSearchThreadModel) {
        11T.A0F(messageSearchThreadModel, 0);
        ListenableFuture A0A = 1Kd.A0A(messageSearchThreadModel.A02.A0n);
        11T.A0A(A0A);
        return A0A;
    }
}
