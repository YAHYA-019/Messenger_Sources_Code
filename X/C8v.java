package X;

import android.content.Context;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* loaded from: C8v.class */
public final class C8v {
    public final 1Br A00;
    public final Context A01;
    public final 1De A02;

    public C8v(1De r302) {
        this.A02 = r302;
        Context A0A = AbK.A0A(r302);
        this.A01 = A0A;
        this.A00 = 7zN.A0H(A0A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        if (r305 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        if (r316 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.Csv A00(X.BOi r302, com.facebook.messaging.model.threads.ThreadSummary r303, X.DK4 r304, com.google.common.collect.ImmutableMap r305, com.google.common.collect.ImmutableMap r306, java.lang.String r307, java.lang.String r308) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8v.A00(X.BOi, com.facebook.messaging.model.threads.ThreadSummary, X.DK4, com.google.common.collect.ImmutableMap, com.google.common.collect.ImmutableMap, java.lang.String, java.lang.String):X.Csv");
    }

    public final ImmutableList A01(BOi bOi, 53N r303, DK4 dk4, ImmutableList immutableList, ImmutableList immutableList2, String str) {
        ImmutableList build;
        if (immutableList.isEmpty()) {
            build = ImmutableList.of();
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            int size = immutableList.size();
            for (int i = 0; i < size; i++) {
                User user = (User) immutableList.get(i);
                11T.A0D(user);
                ThreadKey A02 = ((4iI) 1Br.A0B(this.A00)).A02(7zQ.A0H(user));
                if (A02 == null) {
                    throw 1BK.A0h();
                }
                RankingLoggingItem rankingLoggingItem = (RankingLoggingItem) immutableList2.get(i);
                String str2 = rankingLoggingItem != null ? rankingLoggingItem.A03 : null;
                RankingLoggingItem rankingLoggingItem2 = (RankingLoggingItem) immutableList2.get(i);
                builder.m11011add((Object) new Csw(bOi, A02, r303, dk4 == null ? EnumC1297Ada.A1N : dk4, user, rankingLoggingItem2 != null ? Float.valueOf(rankingLoggingItem2.A00) : null, str2, str));
            }
            build = builder.build();
        }
        11T.A0A(build);
        return build;
    }

    public final ImmutableList A02(BOi bOi, DK4 dk4, ImmutableList immutableList, ImmutableMap immutableMap, ImmutableMap immutableMap2, String str, String str2) {
        ImmutableList of;
        if (immutableList == null || immutableList.isEmpty()) {
            of = ImmutableList.of();
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            int size = immutableList.size();
            for (int i = 0; i < size; i++) {
                ThreadSummary threadSummary = (ThreadSummary) immutableList.get(i);
                11T.A0D(threadSummary);
                builder.m11011add((Object) A00(bOi, threadSummary, dk4, immutableMap, immutableMap2, str, str2));
            }
            of = builder.build();
        }
        11T.A0A(of);
        return of;
    }
}
