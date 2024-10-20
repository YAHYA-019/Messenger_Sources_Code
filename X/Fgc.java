package X;

import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.graphqlrealtimeservice.interfaces.StreamStatus;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.tigon.TigonErrorException;
import java.util.List;

/* loaded from: Fgc.class */
public final class Fgc implements GraphQLRealtimeService.RealtimeDataCallbacks {
    public final GraphQLRealtimeService.RealtimeDataCallbacks A00;
    public final GraphQLQuery A01;

    public Fgc(GraphQLRealtimeService.RealtimeDataCallbacks realtimeDataCallbacks, GraphQLQuery graphQLQuery) {
        this.A01 = graphQLQuery;
        this.A00 = realtimeDataCallbacks;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onError(TigonErrorException tigonErrorException, Summary summary) {
        11T.A0F(tigonErrorException, 0);
        C00j.A07("GraphQLRealtimeService::onError[%s]", this.A01.queryName(), 1235022512);
        try {
            this.A00.onError(tigonErrorException, summary);
            C00j.A01(696434640);
        } catch (Throwable th) {
            C00j.A01(-183521041);
            throw th;
        }
    }

    @Override // com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService.RealtimeDataCallbacks
    public void onStatusChange(StreamStatus streamStatus, Summary summary) {
        11T.A0F(streamStatus, 0);
        C00j.A07("GraphQLRealtimeService::onStatusChange[%s]", this.A01.queryName(), 1347485299);
        try {
            this.A00.onStatusChange(streamStatus, summary);
            C00j.A01(389216626);
        } catch (Throwable th) {
            C00j.A01(1506235221);
            throw th;
        }
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onUpdate(Tree tree, Summary summary) {
        Summary summary2 = summary;
        11T.A0F(tree, 0);
        GraphQLQuery graphQLQuery = this.A01;
        if (summary != null) {
            C00j.A04(graphQLQuery.queryName(), summary.source, "GraphQLRealtimeService::onUpdate[%s_%s]", -1159159953);
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
                C00j.A01(-702281712);
                throw th;
            }
        } else {
            C00j.A07("GraphQLRealtimeService::onUpdate[%s]", graphQLQuery.queryName(), 2084779769);
        }
        this.A00.onUpdate(tree, summary2);
        C00j.A01(-1320147516);
    }
}
