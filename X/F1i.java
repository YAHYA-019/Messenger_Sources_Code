package X;

import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;

/* loaded from: F1i.class */
public abstract class F1i {
    public static final void A00(Summary summary, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, int i2) {
        11T.A0F(lightweightQuickPerformanceLogger, 0);
        MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(i, i2);
        11T.A0D(withMarker);
        11T.A0F(withMarker, 0);
        String A0J = str == null ? "" : 0Pz.A0J(str, '_');
        String str2 = summary.fbRequestId;
        if (str2 != null && str2.length() > 0) {
            withMarker.annotate("fb_request_id", str2);
        }
        long j = summary.parseStart;
        if (j > 0) {
            withMarker.point(0Pz.A0W(A0J, "gql_parser_start"), j);
        }
        long j2 = summary.networkStart;
        if (j2 > 0) {
            withMarker.point(0Pz.A0W(A0J, "gql_network_start"), j2);
        }
        long j3 = summary.networkEnd;
        if (j3 > 0) {
            withMarker.point(0Pz.A0W(A0J, "gql_network_end"), j3);
        }
        long j4 = summary.serverStartTime;
        if (j4 > 0) {
            long j5 = summary.serverFlushTime;
            if (j5 > 0) {
                long j6 = summary.networkStart;
                if (j6 > 0 && summary.networkEnd > 0) {
                    long j7 = j5 - j4;
                    long j8 = j6 + (((summary.parseStart - j6) - j7) / 2);
                    withMarker.point(0Pz.A0W(A0J, "gql_server_start"), j8);
                    withMarker.point(0Pz.A0W(A0J, "gql_server_end"), j8 + j7);
                }
            }
        }
        long j9 = summary.requestStart;
        if (j9 > 0) {
            PointEditor pointCustomTimestamp = withMarker.pointEditor(0Pz.A0W(A0J, "gql_request_start")).pointCustomTimestamp(j9);
            GraphQLQuery graphQLQuery = summary.query;
            pointCustomTimestamp.addPointData("query_name", graphQLQuery != null ? graphQLQuery.queryName() : "").pointEditingCompleted();
        }
        long j10 = summary.requestEnd;
        if (j10 > 0) {
            withMarker.pointEditor(0Pz.A0W(A0J, "gql_request_end")).pointCustomTimestamp(j10).addPointData("parsed_bytes", summary.parsedDataSize).addPointData("additive_parse_time", summary.additiveParseTimeMs).addPointData("network_attempts", summary.attempts).pointEditingCompleted();
        }
        long j11 = summary.rtt;
        if (j11 > 0) {
            withMarker.annotate(0Pz.A0W(A0J, TraceFieldType.RTT), j11);
        }
        long j12 = summary.upstreamLatency;
        if (j12 > 0) {
            withMarker.annotate(0Pz.A0W(A0J, AbstractC00603o4.A00(89)), j12);
        }
        withMarker.markerEditingCompleted();
    }

    public static final void A01(Summary summary, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, int i2) {
        11T.A0F(lightweightQuickPerformanceLogger, 0);
        String A0J = str == null ? "" : 0Pz.A0J(str, '_');
        MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(i, i2);
        long j = summary.fetchCachedResponseStart;
        if (j > 0) {
            PointEditor pointCustomTimestamp = withMarker.pointEditor(0Pz.A0W(A0J, "fetch_cached_response_start")).pointCustomTimestamp(j);
            GraphQLQuery graphQLQuery = summary.query;
            pointCustomTimestamp.addPointData("query_name", graphQLQuery != null ? graphQLQuery.queryName() : "").pointEditingCompleted();
        }
        long j2 = summary.fetchCachedResponseEnd;
        if (j2 > 0) {
            withMarker.pointEditor(0Pz.A0W(A0J, "fetch_cached_response_end")).pointCustomTimestamp(j2).addPointData("cache_response_age", summary.cachedResponseAge).pointEditingCompleted();
        }
        long j3 = summary.cacheSyncStart;
        if (j3 > 0) {
            withMarker.point(0Pz.A0W(A0J, "cached_response_consistency_sync_start"), j3);
        }
        long j4 = summary.cacheSyncEnd;
        if (j4 > 0) {
            withMarker.point(0Pz.A0W(A0J, "cached_response_consistency_sync_end"), j4);
        }
        withMarker.markerEditingCompleted();
    }
}
