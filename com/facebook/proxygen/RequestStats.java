package com.facebook.proxygen;

import X.0Pz;
import X.AnonymousClass001;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: RequestStats.class */
public class RequestStats {
    public static final Map mFlowTimeMap = Collections.unmodifiableMap(new HashMap() { // from class: com.facebook.proxygen.RequestStats.1
        {
            String[] strArr = new String[42];
            System.arraycopy(new String[]{TraceFieldType.Uri, TraceFieldType.IsSecure, TraceFieldType.StatusCode, TraceFieldType.StatusMessage, TraceFieldType.ContentType, TraceFieldType.ClientPublicAddr, TraceFieldType.ServerCluster, TraceFieldType.ServerHostEnc, TraceFieldType.ServerDatetime, TraceFieldType.LocalPort, TraceFieldType.ReqHeaderSize, TraceFieldType.ReqHeaderCompSize, TraceFieldType.ReqBodySize, TraceFieldType.RspHeaderSize, TraceFieldType.RspHeaderCompSize, TraceFieldType.RedirectLocation, TraceFieldType.NumRedirects, TraceFieldType.Protocol, TraceFieldType.FirstBodyByteFlushedRatio, TraceFieldType.LastBodyByteFlushedRatio, TraceFieldType.SecurityProtocol, TraceFieldType.FlowControlPauses, TraceFieldType.ReplaySafe, TraceFieldType.HTTPMethod, TraceFieldType.RangeRequest, TraceFieldType.RequestSendTime, TraceFieldType.TraceStringId}, 0, strArr, 0, 27);
            System.arraycopy(new String[]{TraceFieldType.TransportReplaySafe, TraceFieldType.EvbAvgLoopTime, TraceFieldType.TripId, TraceFieldType.TimeSinceFirstHTTPClientInit, TraceFieldType.TimeSinceHTTPClientInit, TraceFieldType.NumberHTTPClientInits, TraceFieldType.PreviousNetworkType, TraceFieldType.NetworkType, TraceFieldType.HTTPResponsePriority, TraceFieldType.H3PriorityChanges, TraceFieldType.UsingManualProxy, TraceFieldType.HTTPStreamId, TraceFieldType.FirstBodyByteFlushed, TraceFieldType.LastBodyByteFlushed, TraceFieldType.ConnectionAcquisitionEnd}, 0, strArr, 27, 15);
            put(TraceEventType.RequestExchange, Arrays.asList(strArr));
            put(TraceEventType.ResponseBodyRead, Arrays.asList(TraceFieldType.RspIntvlAvg, TraceFieldType.RspIntvlStdDev, TraceFieldType.RspNumOnBody, TraceFieldType.ServerQuality, TraceFieldType.RecvToAck, TraceFieldType.RspBodyBytesTime, TraceFieldType.ServerRtx, TraceFieldType.ServerCwnd, TraceFieldType.ServerUpstreamLatency, TraceFieldType.ServerUploadLatency, TraceFieldType.ServerTotalPackets, TraceFieldType.ServerTotalPacketsLost));
            put(TraceEventType.TotalConnect, Arrays.asList(new String[0]));
            put(TraceEventType.PreConnect, Arrays.asList(TraceFieldType.NewConnection, TraceFieldType.IsWaitingForNewConn, TraceFieldType.NewConnTimeout, TraceFieldType.InFlightConns, TraceFieldType.CachedSessions, TraceFieldType.CachedActiveSessions, TraceFieldType.ConnRoutingStale, TraceFieldType.StartedQuicAsync, TraceFieldType.ConnsStarted, TraceFieldType.RequestsWaited, TraceFieldType.TotalConnsStarted, TraceFieldType.TotalRequestsWaited, TraceFieldType.SessionCacheHitType, TraceFieldType.PerDomainLimit, TraceFieldType.DynamicDomainLimitRatio, TraceFieldType.LoadBalancing, TraceFieldType.MaxConnectionRetryCount, TraceFieldType.MaxIdleHTTPSessions, TraceFieldType.MaxIdleHTTP2Sessions, TraceFieldType.StartedExtraTcp, TraceFieldType.InflightQuicConns, TraceFieldType.QuicEnabled, TraceFieldType.NewConnectionType, TraceFieldType.ConnectionAcquisitionStart));
            put(TraceEventType.DnsConnect, Arrays.asList(new String[0]));
            put(TraceEventType.DnsResolution, Arrays.asList(TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.ResolversSerialized, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.TXT, TraceFieldType.DNSProtocol, TraceFieldType.ResolvedIpAddresses));
            put(TraceEventType.DnsCache, Arrays.asList(TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.DNSCacheHit, TraceFieldType.DNSCacheHitV4, TraceFieldType.DNSCacheHitV6, TraceFieldType.DNSCacheStale, TraceFieldType.DNSCacheStaleV4, TraceFieldType.DNSCacheStaleV6, TraceFieldType.DNSCacheAgeSecs, TraceFieldType.ResolvedIpAddresses, TraceFieldType.DnsResolutionStart, TraceFieldType.DnsResolutionEnd));
            put(TraceEventType.RetryingDnsResolution, Arrays.asList(TraceFieldType.NumberDNSRetries, TraceFieldType.ResolvedSuccess));
            put(TraceEventType.TcpConnect, Arrays.asList(TraceFieldType.CachedFamily, TraceFieldType.CachedFamilyStatus, TraceFieldType.HEDrivenDns, TraceFieldType.HESerializedEvents, TraceFieldType.TcpConnectStart, TraceFieldType.TcpConnectEnd));
            put(TraceEventType.TlsSetup, Arrays.asList(TraceFieldType.TLSReused, TraceFieldType.TLSCacheHit, TraceFieldType.CipherName, TraceFieldType.TLSVersion, TraceFieldType.OpenSSLVersion, TraceFieldType.TLSCachePersistence));
            put(TraceEventType.ProxyConnect, Arrays.asList(TraceFieldType.ProxyHost, TraceFieldType.ProxyPort));
            put(TraceEventType.PostConnect, Arrays.asList(TraceFieldType.NewSession, TraceFieldType.NumWaiting, TraceFieldType.TransportType, TraceFieldType.LocalAddr, TraceFieldType.LocalPort));
            put(TraceEventType.SessionTransactions, Arrays.asList(TraceFieldType.CurrentTransactions, TraceFieldType.HistoricalMaximumTransactions, TraceFieldType.NumberTransactionsServed, TraceFieldType.StreamLimitExceeded));
            put(TraceEventType.TransportInfo, Arrays.asList(TraceFieldType.Cwnd, TraceFieldType.CwndBytes, TraceFieldType.TotalRetx, TraceFieldType.InflightPacketLoss, TraceFieldType.RTO, TraceFieldType.MSS, TraceFieldType.MTU, TraceFieldType.RcvWnd, TraceFieldType.UpstreamCapacity, TraceFieldType.QuicClientCID, TraceFieldType.RTOCount, TraceFieldType.TotalRTOCount, TraceFieldType.TotalPackets, TraceFieldType.TotalPacketsLost, TraceFieldType.QuicTransportSent, TraceFieldType.QuicTransportRecvd));
            put(TraceEventType.PostTransactionTransportInfo, Arrays.asList(TraceFieldType.RTT, TraceFieldType.RTTVar, TraceFieldType.QuicServerCID, TraceFieldType.StreamLossCount, TraceFieldType.StreamBytesSent, TraceFieldType.StreamBytesReceived));
            put(TraceEventType.ConnInfo, Arrays.asList(TraceFieldType.ConnLifeSpan, TraceFieldType.EgressBuffered, TraceFieldType.SessionType, TraceFieldType.IsConnectionPreconnected));
            put(TraceEventType.Decompression, Arrays.asList(TraceFieldType.RspBodySize, TraceFieldType.RspBodyCompSize, TraceFieldType.CompressionType, TraceFieldType.RspBodyDecompressionTime));
            put(TraceEventType.ReplaySafety, Arrays.asList(new String[0]));
            put(TraceEventType.Push, Arrays.asList(TraceFieldType.IsPushRequest, TraceFieldType.PushConnectedInFlight, TraceFieldType.PushOrphaned));
            put(TraceEventType.CertVerification, Arrays.asList(TraceFieldType.VerificationImpl, TraceFieldType.CertificateVerifyStart, TraceFieldType.CertificateVerifyEnd));
            put(TraceEventType.FizzConnect, Arrays.asList(TraceFieldType.FizzHandshakeSuccess, TraceFieldType.FizzProtocolVersion, TraceFieldType.FizzNamedGroup, TraceFieldType.FizzPskType, TraceFieldType.FizzEarlyDataType, TraceFieldType.FizzECHConfigId, TraceFieldType.FizzECHDisposition, TraceFieldType.FizzECHRetryUsed, TraceFieldType.FizzECHSNI, TraceFieldType.PskUses));
            put(TraceEventType.QuicConnect, Arrays.asList(TraceFieldType.QuicClientCID, TraceFieldType.QuicDNSAddrs, TraceFieldType.QuicEarlyDataEnabled, TraceFieldType.PskUses, TraceFieldType.FizzHandshakeSuccess, TraceFieldType.FizzProtocolVersion, TraceFieldType.FizzNamedGroup, TraceFieldType.FizzPskType, TraceFieldType.FizzEarlyDataType, TraceFieldType.FizzECHConfigId, TraceFieldType.FizzECHDisposition, TraceFieldType.FizzECHSNI, TraceFieldType.FizzECHRetryUsed, TraceFieldType.Error, TraceFieldType.QuicConnectStartTime, TraceFieldType.QuicConnectEndTime));
            put(TraceEventType.ConnSelector, Arrays.asList(TraceFieldType.QuicResult));
            put(TraceEventType.NetworkChange, Arrays.asList(TraceFieldType.NetworkChangeDetail));
            put(TraceEventType.DnsFallback, Arrays.asList(TraceFieldType.DNSFallbackOutcome, TraceFieldType.DNSFallbackReason));
            put(TraceEventType.TotalRequest, Arrays.asList(TraceFieldType.TTFB, TraceFieldType.TTLB));
        }
    });
    public TraceEvent[] mEvents;

    public RequestStats(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }

    public static Map getFlowTimeFieldsMap() {
        return mFlowTimeMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r301.equals("http/2") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isValidCodecProtocolStr(java.lang.String r301) {
        /*
            java.lang.String r0 = "http/1.1"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1c
            r0 = r301
            java.lang.String r1 = "http/2"
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            r303 = r0
        L1e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.RequestStats.isValidCodecProtocolStr(java.lang.String):boolean");
    }

    public static void joinMetaFields(Map map, Map map2, String str) {
        if (map.containsKey(str)) {
            map2.put(str, map2.containsKey(str) ? 0Pz.A0j((String) map2.get(str), ";", (String) map.get(str)) : map.get(str));
        }
    }

    public static boolean readBooleanMeta(Map map, String str, boolean z) {
        if (map.containsKey(str)) {
            z = true;
            if (!Boolean.parseBoolean((String) map.get(str)) && !((String) map.get(str)).equals(ConstantsKt.CAMERA_ID_BACK)) {
                z = false;
            }
        }
        return z;
    }

    public static int readIntMeta(Map map, String str, int i) {
        if (!map.containsKey(str)) {
            return i;
        }
        try {
            return Integer.parseInt((String) map.get(str));
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long readLongMeta(Map map, String str, long j) {
        if (!map.containsKey(str)) {
            return j;
        }
        try {
            return Long.parseLong((String) map.get(str));
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static String readStrMeta(Map map, String str, String str2) {
        if (map.containsKey(str)) {
            str2 = (String) map.get(str);
        }
        return str2;
    }

    public Map getCertificateVerificationData() {
        String A0j;
        Object obj;
        HashMap A0u = AnonymousClass001.A0u();
        boolean z = false;
        for (TraceEvent traceEvent : this.mEvents) {
            if (traceEvent.mName.equals(TraceEventType.CertVerification)) {
                for (Map.Entry entry : traceEvent.getMetaData().entrySet()) {
                    A0u.put(entry.getKey(), entry.getValue());
                }
                z = true;
            } else if (traceEvent.mName.equals(TraceEventType.QuicConnect) || traceEvent.mName.equals(TraceEventType.TcpConnect) || traceEvent.mName.equals(TraceEventType.PostConnect)) {
                Map metaData = traceEvent.getMetaData();
                String readStrMeta = readStrMeta(metaData, TraceFieldType.ServerAddr, "");
                int readIntMeta = readIntMeta(metaData, TraceFieldType.ServerPort, 0);
                if (!readStrMeta.equals("") && readIntMeta > 0) {
                    A0j = 0Pz.A0j(readStrMeta, ":", String.valueOf(readIntMeta));
                    obj = TraceFieldType.VerifiedServerAddress;
                    A0u.put(obj, A0j);
                }
            } else if (traceEvent.mName.equals(TraceEventType.TlsSetup)) {
                Map metaData2 = traceEvent.getMetaData();
                String readStrMeta2 = readStrMeta(metaData2, TraceFieldType.CipherName, "");
                int readIntMeta2 = readIntMeta(metaData2, TraceFieldType.TLSVersion, 0);
                long readIntMeta3 = readIntMeta(metaData2, TraceFieldType.OpenSSLVersion, 0);
                if (!readStrMeta2.equals("")) {
                    A0u.put(TraceFieldType.CipherName, readStrMeta2);
                }
                if (readIntMeta2 != 0) {
                    A0u.put(TraceFieldType.TLSVersion, String.valueOf(readIntMeta2));
                }
                if (readIntMeta3 != 0) {
                    A0u.put(TraceFieldType.OpenSSLVersion, String.valueOf(readIntMeta3));
                }
            } else if (traceEvent.mName.equals(TraceEventType.ProxyConnect)) {
                Map metaData3 = traceEvent.getMetaData();
                String readStrMeta3 = readStrMeta(metaData3, TraceFieldType.ProxyHost, "");
                int readIntMeta4 = readIntMeta(metaData3, TraceFieldType.ProxyPort, 0);
                if (!readStrMeta3.equals("") && readIntMeta4 > 0) {
                    A0j = 0Pz.A0j(readStrMeta3, ":", String.valueOf(readIntMeta4));
                    obj = TraceFieldType.VerifiedProxyAddress;
                    A0u.put(obj, A0j);
                }
            }
        }
        if (!z) {
            A0u = new HashMap(0);
        }
        return A0u;
    }

    public Map getFlowTimeData() {
        String valueOf;
        Object obj;
        HashMap A0u = AnonymousClass001.A0u();
        TraceEvent[] traceEventArr = this.mEvents;
        int length = traceEventArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0u;
            }
            TraceEvent traceEvent = traceEventArr[i2];
            Map map = mFlowTimeMap;
            if (map.containsKey(traceEvent.mName)) {
                Map metaData = traceEvent.getMetaData();
                long j = traceEvent.mStart;
                if (j != 0) {
                    long j2 = traceEvent.mEnd;
                    if (j2 != 0 && j < j2) {
                        A0u.put(traceEvent.mName, String.valueOf(j2 - j));
                    }
                }
                for (Object obj2 : (List) map.get(traceEvent.mName)) {
                    if (metaData.containsKey(obj2)) {
                        A0u.put(obj2, metaData.get(obj2));
                    }
                }
                if (metaData.containsKey(TraceFieldType.ServerAddr)) {
                    A0u.put(TraceFieldType.ServerAddr, metaData.get(TraceFieldType.ServerAddr));
                    A0u.put(TraceFieldType.ServerPort, metaData.get(TraceFieldType.ServerPort));
                }
                if (metaData.containsKey(TraceFieldType.Error)) {
                    A0u.put(TraceFieldType.ErrorStage, A0u.containsKey(TraceFieldType.ErrorStage) ? 0Pz.A0j((String) A0u.get(TraceFieldType.ErrorStage), ";", traceEvent.mName) : traceEvent.mName);
                    joinMetaFields(metaData, A0u, TraceFieldType.Error);
                    joinMetaFields(metaData, A0u, TraceFieldType.DirectionError);
                    joinMetaFields(metaData, A0u, TraceFieldType.ProxygenError);
                    joinMetaFields(metaData, A0u, TraceFieldType.CodecError);
                }
            }
            String str = traceEvent.mName;
            if (TraceEventType.DnsCache.equals(str)) {
                A0u.put(TraceFieldType.DnsResolutionStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                obj = TraceFieldType.DnsResolutionEnd;
            } else if (TraceEventType.TcpConnect.equals(str)) {
                A0u.put(TraceFieldType.TcpConnectStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                obj = TraceFieldType.TcpConnectEnd;
            } else if (TraceEventType.CertVerification.equals(str)) {
                A0u.put(TraceFieldType.CertificateVerifyStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                obj = TraceFieldType.CertificateVerifyEnd;
            } else if (TraceEventType.ResponseBodyRead.equals(str)) {
                valueOf = String.valueOf(traceEvent.mEnd - traceEvent.mStart);
                obj = TraceFieldType.RspBodyBytesTime;
            } else if (TraceEventType.QuicConnect.equals(str)) {
                A0u.put(TraceFieldType.QuicConnectStartTime, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                obj = TraceFieldType.QuicConnectEndTime;
            } else {
                i = i2 + 1;
            }
            A0u.put(obj, valueOf);
            i = i2 + 1;
        }
    }

    public TraceEvent[] getTraceEvents() {
        return this.mEvents;
    }
}
