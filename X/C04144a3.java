package X;

import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.tigon.TigonErrorException;
import java.util.List;

/* renamed from: X.4a3, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4a3.class */
public final class C04144a3 implements GraphQLService.DataCallbacks {
    public final GraphQLQuery A00;
    public final GraphQLService.DataCallbacks A01;

    public C04144a3(GraphQLQuery graphQLQuery, GraphQLService.DataCallbacks dataCallbacks) {
        this.A00 = graphQLQuery;
        this.A01 = dataCallbacks;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onError(TigonErrorException tigonErrorException, Summary summary) {
        Summary summary2 = summary;
        GraphQLQuery graphQLQuery = this.A00;
        C00j.A07("GraphQLService::onError[%s]", graphQLQuery.queryName(), 226684858);
        if (summary != null) {
            try {
                String str = summary.source;
                boolean z = summary.isFinal;
                boolean z2 = summary.isNetworkComplete;
                String str2 = summary.fbRequestId;
                int i = summary.attempts;
                List list = summary.retryTimes;
                long j = summary.requestStart;
                long j2 = summary.requestEnd;
                new Summary(str, z, z2, str2, i, list, j, summary.networkStart, summary.networkEnd, summary.parseStart, j2, summary.parsedDataSize, summary.additiveParseTimeMs, summary.networkChunksCount, summary.additiveThreadHopTimeMs, summary.fetchCachedResponseStart, summary.fetchCachedResponseEnd, summary.cachedResponseAge, summary.freshResponse, summary.code, summary.apiErrorCode, summary.summary, summary.description, summary.debugInfo, summary.isSilent, summary.isTransient, summary.requiresReauth, summary.consistencySource, summary.serverStartTime, summary.serverFlushTime, summary.cacheSyncStart, summary.cacheSyncEnd, summary.rejectedFromAdaptiveFetch, summary.prefetchPredictionID, summary.rtt, summary.upstreamLatency, graphQLQuery);
            } catch (Throwable th) {
                C00j.A01(-2089086538);
                throw th;
            }
        }
        this.A01.onError(tigonErrorException, summary2);
        C00j.A01(-1056758807);
        if (1VZ.A03) {
            0fH.A0z("GraphQLServiceImmersiveView", "TigonErrorWithSummaryException for query %s", tigonErrorException, new Object[]{graphQLQuery.queryName()});
            AnonymousClass047 ACu = ((AnonymousClass046) 1Bn.A0A(16669)).ACu("tigon_error", 817904216);
            ACu.A8K("query", graphQLQuery.queryName());
            ACu.Cmr(tigonErrorException);
            ACu.report();
        }
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onUpdate(Tree tree, Summary summary) {
        Summary summary2 = summary;
        GraphQLQuery graphQLQuery = this.A00;
        if (summary != null) {
            C00j.A04(graphQLQuery.queryName(), summary.source, "GraphQLService::onUpdate[%s_%s]", 1618639894);
            try {
                String str = summary.source;
                boolean z = summary.isFinal;
                boolean z2 = summary.isNetworkComplete;
                String str2 = summary.fbRequestId;
                int i = summary.attempts;
                List list = summary.retryTimes;
                long j = summary.requestStart;
                long j2 = summary.requestEnd;
                long j3 = summary.networkStart;
                long j4 = summary.networkEnd;
                long j5 = summary.parseStart;
                int i2 = summary.parsedDataSize;
                long j6 = summary.additiveParseTimeMs;
                long j7 = summary.networkChunksCount;
                long j8 = summary.additiveThreadHopTimeMs;
                boolean z3 = summary.rejectedFromAdaptiveFetch;
                new Summary(str, z, z2, str2, i, list, j, j3, j4, j5, j2, i2, j6, j7, j8, summary.fetchCachedResponseStart, summary.fetchCachedResponseEnd, summary.cachedResponseAge, summary.freshResponse, summary.code, summary.apiErrorCode, summary.summary, summary.description, summary.debugInfo, summary.isSilent, summary.isTransient, summary.requiresReauth, summary.consistencySource, summary.serverStartTime, summary.serverFlushTime, summary.cacheSyncStart, summary.cacheSyncEnd, z3, summary.prefetchPredictionID, summary.rtt, summary.upstreamLatency, graphQLQuery);
            } catch (Throwable th) {
                C00j.A01(-1082020938);
                throw th;
            }
        } else {
            C00j.A07("GraphQLService::onUpdate[%s]", graphQLQuery.queryName(), -389784088);
        }
        this.A01.onUpdate(tree, summary2);
        C00j.A01(-541636373);
    }
}
