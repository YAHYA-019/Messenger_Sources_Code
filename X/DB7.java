package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: DB7.class */
public final class DB7 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public DB7(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj3;
        this.A03 = obj2;
        this.A05 = str;
        this.A02 = obj;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord;
        ImmutableList of;
        String A0v;
        switch (this.A00) {
            case 0:
                String A00 = DKB.A00(64);
                String str = this.A05;
                String A0W = 0Pz.A0W("fetchResponseForKey:", str);
                EI8 ei8 = (EI8) this.A03;
                FGk fGk = (FGk) this.A04;
                try {
                    1kF.A01(0Pz.A0Y(A00, A0W, ':'));
                    50G r0 = fGk.A03;
                    ei8.A00("io_read_start", r0.currentMonotonicTimestamp());
                    EbW ebW = fGk.A01;
                    11T.A0F(str, 0);
                    byte[] readResourceToMemory = ebW.A00.readResourceToMemory(str);
                    ei8.A00("io_read_end", r0.currentMonotonicTimestamp());
                    1kF.A00();
                    if (readResourceToMemory != null) {
                        ei8.A00("deserialize_start", r0.currentMonotonicTimestamp());
                        componentQueryDiskCacheRecord = FGk.A00(fGk, CBQ.A00(readResourceToMemory), str);
                        ei8.A00("deserialize_end", r0.currentMonotonicTimestamp());
                    } else {
                        componentQueryDiskCacheRecord = null;
                    }
                    ((Executor) this.A01).execute(new G3O(ei8, componentQueryDiskCacheRecord, (Function1) this.A02));
                    return 04S.A00;
                } catch (Throwable th) {
                    1kF.A00();
                    throw th;
                }
            case 1:
                C3q c3q = (C3q) this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                ImmutableList immutableList = (ImmutableList) this.A04;
                ImmutableCollection immutableCollection = (ImmutableCollection) this.A03;
                String str2 = this.A05;
                ImmutableList.Builder builder = ImmutableList.builder();
                if (str2 != null) {
                    builder.m11011add((Object) new Rs1(str2));
                }
                for (int i = 0; i < immutableList.size(); i++) {
                    User user = (User) immutableList.get(i);
                    builder.m11011add((Object) c3q.A00(fbUserSession, BP6.A0R, user, null, CIz.A00(user, immutableCollection), true));
                }
                return builder.build();
            case 2:
                7V3 r02 = (7V3) this.A01;
                String str3 = r02.A01;
                if (str3 != null && str3.equals("FILE") && ((6oD) r02.A03.get()).A02()) {
                    r02.A06.A03((ThreadKey) this.A04);
                }
                String str4 = r02.A01;
                if (str4 != null && str4.equals("PHOTO_AND_VIDEO") && 1BK.A0N(r02.A05).AZk(36324136150126042L)) {
                    r02.A06.A03((ThreadKey) this.A04);
                }
                7V4 r03 = r02.A06;
                FbUserSession fbUserSession2 = (FbUserSession) this.A03;
                ThreadKey threadKey = (ThreadKey) this.A04;
                String str5 = this.A05;
                String str6 = r02.A01;
                Context context = (Context) this.A02;
                7V4.A02(r03);
                D3q d3q = new D3q(context, threadKey, r03, fbUserSession2, str6, 0);
                AbstractC05414dq A0A = 1VX.A0A(context, fbUserSession2);
                C30G A0H = AbF.A0H(86);
                A0H.A03("thread_id", 1BK.A0w(threadKey));
                A0H.A03("fbid", String.valueOf(str5));
                C3sa A002 = 7V4.A00(A0H, threadKey, r03);
                4YU.A1J(A002, 3859739090723409L);
                return 2FP.A00(d3q, A0A.A03(A002), 1JU.A01);
            default:
                Bxi bxi = (Bxi) this.A04;
                4bT r04 = (4bT) 1Br.A0B(bxi.A06);
                1G1 r05 = (FbUserSession) this.A01;
                2eT r06 = (2eT) 1Br.A0B(bxi.A05);
                ImmutableCollection immutableCollection2 = (ImmutableCollection) this.A03;
                2eW A003 = r06.A00("invited_users");
                A003.A06 = UserKey.A03(immutableCollection2);
                Bn2 A004 = ((C7E) 1Br.A0B(bxi.A04)).A00(r05, 2To.A0I, r04.A00(r05, A003));
                ImmutableList immutableList2 = A004.A00;
                ImmutableList immutableList3 = A004.A01;
                String str7 = this.A05;
                BOi bOi = (BOi) this.A02;
                if (immutableList2.isEmpty() || immutableList3.isEmpty() || immutableList2.size() != immutableList3.size()) {
                    of = ImmutableList.of();
                } else {
                    ImmutableList.Builder builder2 = ImmutableList.builder();
                    1Br A0S = 7zL.A0S(r05, bxi.A02, 33102);
                    if (11T.A0O(r05.A02, str7)) {
                        A0v = 1BK.A04(bxi.A01).getString(2131965589);
                    } else {
                        User A0t = AbK.A0t((23F) 1Br.A0B(A0S), str7);
                        A0v = A0t != null ? 1BK.A0v(1BK.A04(bxi.A01), A0t.A0X.firstName, 2131965588) : null;
                    }
                    int size = immutableList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        User user2 = (User) immutableList2.get(i2);
                        11T.A0D(user2);
                        ThreadKey A02 = ((4iI) 1Br.A0B(bxi.A07)).A02(7zQ.A0H(user2));
                        if (A02 == null) {
                            throw 1BK.A0h();
                        }
                        builder2.m11011add((Object) new Csw(bOi, A02, user2, ((RankingLoggingItem) immutableList3.get(i2)).A03, A0v, "invited_users"));
                    }
                    of = builder2.build();
                }
                11T.A0A(of);
                return of;
        }
    }
}
