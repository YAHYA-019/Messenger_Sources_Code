package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.pando.PandoError;
import com.facebook.pando.Summary;
import java.util.Collections;
import java.util.List;

/* loaded from: Fku.class */
public final class Fku implements GI4 {
    public final C0dp A00;
    public final 1K9 A01;

    public Fku(C0dp c0dp, 1K9 r303) {
        this.A01 = r303;
        this.A00 = c0dp;
    }

    @Override // X.GI4
    public void BwM(PandoError pandoError) {
        this.A01.onFailure(AbF.A1D(pandoError.message));
    }

    @Override // X.GI4
    public /* bridge */ /* synthetic */ void CSa(Summary summary, Object obj) {
        1K9 r0 = this.A01;
        String str = summary.source;
        String str2 = "network";
        boolean equals = str.equals(str2);
        if (!equals) {
            if (str.equals("fresh_cache") || str.equals("stale_cache")) {
                str2 = "cache";
            } else {
                str2 = 1BJ.A00(389);
                if (!str.equals(str2)) {
                    str2 = "";
                }
            }
        }
        boolean z = summary.isFinal;
        if (!equals && !str.equals("fresh_cache") && !str.equals("stale_cache")) {
            z = true;
        }
        List emptyList = Collections.emptyList();
        boolean z2 = summary.isFinal;
        String str3 = summary.fbRequestId;
        long j = summary.requestStartTime;
        long j2 = summary.parseEndTime;
        String str4 = str2;
        boolean z3 = z;
        r0.onSuccess(new GraphQLResult(EnumC08284mf.A06, new com.facebook.graphservice.interfaces.Summary(str4, z2, z3, str3, 0, emptyList, j, summary.networkStartTime, summary.networkEndTime, summary.parseStartTime, j2, (int) summary.parsedBytes, summary.parserElapsedMs, summary.networkChunksCount, summary.additiveThreadHopTimeMs, summary.cacheStartTime, summary.cacheEndTime, summary.cacheAge, summary.source.equals("fresh_cache"), 0, 0, "", "", "", false, false, false, "", 0L, 0L, 0L, 0L, false, "", 0L, 0L, null), obj, this.A00.now()));
    }
}
