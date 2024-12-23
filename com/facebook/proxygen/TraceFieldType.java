package com.facebook.proxygen;

/* loaded from: TraceFieldType.class */
public interface TraceFieldType {
    public static final String AbrBWE = "abr_bwe";
    public static final String AbrConstraint = "abr_constraint";
    public static final String AbrConstraintReason = "abr_constraint_reason";
    public static final String AbrDecisionReason = "abr_decision_reason";
    public static final String AbrQualityLabel = "abr_quality_label";
    public static final String AdhocEventName = "event_name";
    public static final String BandwidthBps = "bandwidth_bps";
    public static final String BandwidthConfidence = "bandwidth_confidence";
    public static final String BandwidthCorrectedKbps = "bandwidth_corrected_kbps";
    public static final String BandwidthEstimateKbps = "bandwidth_estimate_kbps";
    public static final String BandwidthStdDev = "bandwidth_std_dev";
    public static final String BandwidthWeight = "bandwidth_weight";
    public static final String Bitrate = "bitrate";
    public static final String BodyHolbCount = "body_holb_count";
    public static final String BodyHolbTotal = "body_holb_total_time";
    public static final String BroadcastId = "broadcast_id";
    public static final String BufferedTime = "buffered_time";
    public static final String CNameRedirects = "cname_redirects";
    public static final String CachedActiveSessions = "cached_active_sessions";
    public static final String CachedFamily = "cached_family";
    public static final String CachedFamilyStatus = "cached_family_status";
    public static final String CachedSessions = "cached_sessions";
    public static final String CallPath = "call_path";
    public static final String CanonicalName = "canonical_name";
    public static final String CertificateVerifyEnd = "certificate_verify_end";
    public static final String CertificateVerifyStart = "certificate_verify_start";
    public static final String CipherName = "cipher_name";
    public static final String ClientPublicAddr = "client_public_address";
    public static final String ClientRttStdDev = "client_rtt_std_dev";
    public static final String CodecError = "codec_error";
    public static final String CompressionDictError = "compression_dict_error";
    public static final String CompressionDictID = "compression_dict_id";
    public static final String CompressionDictSuccess = "compression_dict_success";
    public static final String CompressionType = "compression_type";
    public static final String ConnLifeSpan = "connection_life_span";
    public static final String ConnRoutingStale = "connection_routing_stale";
    public static final String ConnectDuration = "connect_duration";
    public static final String ConnectReturnCode = "connect_return_code";
    public static final String ConnectionAcquisitionEnd = "connection_acquisition_end";
    public static final String ConnectionAcquisitionStart = "connection_acquisition_start_time";
    public static final String ConnectionToken = "connection_token";
    public static final String ConnsStarted = "conns_started";
    public static final String ContentLength = "content_length";
    public static final String ContentType = "content_type";
    public static final String CurrentState = "current_state";
    public static final String CurrentTransactions = "current_txns";
    public static final String Cwnd = "cwnd";
    public static final String CwndBytes = "cwnd_bytes";
    public static final String DNSCacheAgeSecs = "dns_cache_age_secs";
    public static final String DNSCacheEnabled = "dns_cache_enabled";
    public static final String DNSCacheHit = "dns_cache_hit";
    public static final String DNSCacheHitV4 = "dns_cache_hit_v4";
    public static final String DNSCacheHitV6 = "dns_cache_hit_v6";
    public static final String DNSCacheStale = "dns_cache_stale";
    public static final String DNSCacheStaleV4 = "dns_cache_stale_v4";
    public static final String DNSCacheStaleV6 = "dns_cache_stale_v6";
    public static final String DNSFallbackOutcome = "dns_fallback_outcome";
    public static final String DNSFallbackReason = "dns_fallback_reason";
    public static final String DNSPreconnectDomain = "dns_preconnect_domain";
    public static final String DNSProtocol = "dns_protocol";
    public static final String DirectionError = "error_direction";
    public static final String DnsResolutionEnd = "dns_resolution_end";
    public static final String DnsResolutionStart = "dns_resolution_start";
    public static final String DownloadBwQuality = "download_bw_quality";
    public static final String Duration = "duration";
    public static final String DynamicDomainLimitRatio = "dynamic_domain_limit_ratio";
    public static final String EgressBuffered = "egress_buffered";
    public static final String Error = "error_description";
    public static final String ErrorCode = "error_code";
    public static final String ErrorDomain = "error_domain";
    public static final String ErrorStage = "error_stage";
    public static final String EvbAvgLoopTime = "evb_avg_loop_time";
    public static final String EventLoopTimeAvg = "event_loop_time_avg";
    public static final String FailureReason = "failure_reason";
    public static final String FailureVerifiedCertDepthInChain = "failure_verified_cert_depth_in_chain";
    public static final String FakeKilled = "fake_killed";
    public static final String FallbackHealthReport = "fallback_health_report";
    public static final String FallbackHostConsecutiveFailures = "fallback_host_consecutive_failures";
    public static final String FallbackHostUsed = "fallback_host_used";
    public static final String FallbackHostname = "fallback_hostname";
    public static final String FallbackHostsAvailable = "fallback_hosts_available";
    public static final String FallbackPreviousHostHealthResponse = "fallback_previously_host_health_response";
    public static final String FallbackReason = "fallback_reason";
    public static final String FirstBodyByteFlushed = "first_body_byte_flushed";
    public static final String FirstBodyByteFlushedRatio = "first_body_byte_flushed_ratio";
    public static final String FirstByteFlushed = "first_byte_flushed";
    public static final String FizzECHConfigId = "fizz_ech_config_id";
    public static final String FizzECHDisposition = "fizz_ech_disposition";
    public static final String FizzECHRetryUsed = "fizz_ech_retry_used";
    public static final String FizzECHSNI = "fizz_ech_sni";
    public static final String FizzEarlyDataType = "fizz_early_data_type";
    public static final String FizzHandshakeSuccess = "fizz_handshake_success";
    public static final String FizzNamedGroup = "fizz_named_group";
    public static final String FizzProtocolVersion = "fizz_protocol_version";
    public static final String FizzPskType = "fizz_psk_type";
    public static final String FlowControlPauses = "flow_control_pauses";
    public static final String FrameId = "frame_id";
    public static final String FrameType = "frame_type";
    public static final String H3PriorityChanges = "h3_priority_changes";
    public static final String HEDrivenDns = "he_driven_dns";
    public static final String HESerializedEvents = "he_serialized_events";
    public static final String HTTPMethod = "http_method";
    public static final String HTTPResponsePriority = "http_response_pri";
    public static final String HTTPStatus = "http_status";
    public static final String HTTPStreamId = "http_stream_id";
    public static final String HandshakeDuration = "handshake_duration";
    public static final String HappyEyeballsV4Failure = "happy_eyeballs_v4_failure";
    public static final String HappyEyeballsV6Failure = "happy_eyeballs_v6_failure";
    public static final String HeadersHolbCount = "headers_holb_count";
    public static final String HeadersHolbTotal = "headers_holb_total_time";
    public static final String HistoricalMaximumTransactions = "historical_max_txns";
    public static final String HostName = "host_name";
    public static final String HostnameCandidates = "hostName_candidates";
    public static final String HumanReadableName = "human_readable_name";
    public static final String IdleCount = "idle_count";
    public static final String IdleDuration = "idle_duration";
    public static final String InFlightConns = "in_flight_conns";
    public static final String InflightPacketLoss = "inflight_packet_loss";
    public static final String InflightQuicConns = "in_flight_quic_conns";
    public static final String InvalidMapReason = "invalid_map_reason";
    public static final String IpAddr = "ip_address";
    public static final String IsBuffered = "is_buffered";
    public static final String IsCancelled = "is_cancelled";
    public static final String IsConnectionPreconnected = "is_connection_preconnected";
    public static final String IsForeground = "is_foreground";
    public static final String IsIncomingExRequest = "is_incoming_ex_request";
    public static final String IsMsgRecv = "is_msg_received";
    public static final String IsPushRequest = "is_push_request";
    public static final String IsSecure = "is_secure";
    public static final String IsWaitingForNewConn = "waiting_for_new_connection";
    public static final String LastBodyByteFlushed = "last_body_byte_flushed";
    public static final String LastBodyByteFlushedRatio = "last_body_byte_flushed_ratio";
    public static final String LastByteFlushed = "last_byte_flushed";
    public static final String LastReceivedError = "last_received_error";
    public static final String LatencyCapMs = "latency_cap_ms";
    public static final String LatencyQuality = "latency_quality";
    public static final String LoadBalancing = "load_balancing";
    public static final String LocalAddr = "local_addr";
    public static final String LocalPort = "local_port";
    public static final String MQTTBytesRead = "mqtt_bytes_read";
    public static final String MQTTBytesWritten = "mqtt_bytes_written";
    public static final String MQTTConnAttempts = "mqtt_conn_attempts";
    public static final String MQTTMsgBytes = "mqtt_msg_bytes";
    public static final String MQTTMsgRemainingLength = "mqtt_msg_remaining_length";
    public static final String MSS = "sending_mss";
    public static final String MTU = "mtu";
    public static final String MaxConnectionRetryCount = "max_connection_retry_count";
    public static final String MaxIdleHTTP2Sessions = "max_idle_http2_sessions";
    public static final String MaxIdleHTTPSessions = "max_idle_http_sessions";
    public static final String MsgId = "msg_id";
    public static final String MsgTopic = "msg_topic";
    public static final String MsgType = "msg_type";
    public static final String NetworkChangeDetail = "network_change_detail";
    public static final String NetworkID = "network_id";
    public static final String NetworkType = "network_type";
    public static final String NewConnTimeout = "new_conn_timeout";
    public static final String NewConnection = "new_connection";
    public static final String NewConnectionType = "new_conn_type";
    public static final String NewSession = "new_session";
    public static final String NumConnAttempts = "number_conn_attempts";
    public static final String NumRedirects = "num_redirects";
    public static final String NumWaiting = "num_waiting";
    public static final String NumberAnswers = "number_answers";
    public static final String NumberDNSRetries = "number_retries";
    public static final String NumberHTTPClientInits = "number_httpclient_inits";
    public static final String NumberResolvers = "number_resolvers";
    public static final String NumberTransactionsServed = "number_txns_served";
    public static final String OpenSSLVersion = "openssl_version";
    public static final String OpenedConn = "opened_conn";
    public static final String OriginalHostname = "original_host_name";
    public static final String PerDomainLimit = "per_domain_limit";
    public static final String PingRtt = "ping_rtt";
    public static final String PinningExcludedFound = "verified_pinning_excluded_found";
    public static final String PinningExcludedHash = "verified_pinning_excluded_hash";
    public static final String PinningHost = "verified_pinning_host";
    public static final String PinningReason = "verified_pinning_reason";
    public static final String PinningRequiredFound = "verified_pinning_required_found";
    public static final String PinningRequiredHash = "verified_pinning_required_hash";
    public static final String PinningSuccess = "verified_pinning_success";
    public static final String PinningTimePin = "verified_pinning_time_pin";
    public static final String PinningUserHash = "verified_pinning_user_hash";
    public static final String PinningUserInstalledCount = "verified_pinning_user_installed_count";
    public static final String PinningUserInstalledFound = "verified_pinning_user_installed_found";
    public static final String Port = "port";
    public static final String PreviousNetworkType = "previous_network_type";
    public static final String PreviousState = "previous_state";
    public static final String Protocol = "protocol";
    public static final String ProxyHost = "proxy_host";
    public static final String ProxyPort = "proxy_port";
    public static final String ProxyRespBody = "proxy_response_body";
    public static final String ProxyRespStatus = "proxy_response_status";
    public static final String ProxyUpstreamDest = "proxy_upstream_dest";
    public static final String ProxygenError = "proxygen_error";
    public static final String PskUses = "psk_uses";
    public static final String PushConnectedInFlight = "push_connected_in_flight";
    public static final String PushOrphaned = "push_orphaned";
    public static final String QoS = "qos";
    public static final String QueuingTime = "queuing_time";
    public static final String QuicClientCID = "quic_client_cid";
    public static final String QuicCongestionControlType = "quic_congestion_control_type";
    public static final String QuicConnectEndTime = "quic_connect_end_time";
    public static final String QuicConnectStartTime = "quic_connect_start_time";
    public static final String QuicDNSAddrs = "quic_dns_addrs";
    public static final String QuicEarlyDataEnabled = "quic_early_data_enabled";
    public static final String QuicEnabled = "quic_enabled";
    public static final String QuicNoEarlyDataReason = "quic_no_early_data_reason";
    public static final String QuicResult = "quic_result";
    public static final String QuicServerCID = "quic_server_cid";
    public static final String QuicSimulatorEnabled = "quic_simulator_enabled";
    public static final String QuicTransportRecvd = "quic_transport_recvd";
    public static final String QuicTransportSent = "quic_transport_sent";
    public static final String RTO = "rto";
    public static final String RTOCount = "rto_count";
    public static final String RTT = "rtt";
    public static final String RTTVar = "rtt_variance";
    public static final String RangeRequest = "range_request";
    public static final String RawBytesRead = "raw_bytes_read";
    public static final String RawBytesWritten = "raw_bytes_written";
    public static final String RcvWnd = "recv_window";
    public static final String ReceivedEOM = "received_eom";
    public static final String RecvToAck = "flow_control_recv_to_ack";
    public static final String RedirectLocation = "redirect_location";
    public static final String RedirectResponseCode = "redirect_response_code";
    public static final String ReplaySafe = "replay_safe";
    public static final String ReqBodySize = "request_body_size";
    public static final String ReqBwEgressAvg = "req_bw_egress_avg";
    public static final String ReqBwEgressStdDev = "req_bw_egress_std_dev";
    public static final String ReqBwIngressStdDev = "req_bw_ingress_std_dev";
    public static final String ReqHeaderCompSize = "request_header_compressed_size";
    public static final String ReqHeaderSize = "request_header_size";
    public static final String RequestCreationSystemTime = "request creation time based of system clock";
    public static final String RequestFamily = "request_family";
    public static final String RequestID = "request_id";
    public static final String RequestSendTime = "request_send_time";
    public static final String RequestsWaited = "requests_waited";
    public static final String ResolvedIpAddresses = "resolved_ip_addresses";
    public static final String ResolvedSuccess = "resolved_success";
    public static final String ResolversSerialized = "resolvers_serialized";
    public static final String RetryCount = "retry_count";
    public static final String RevokeReason = "verified_revoke_reason";
    public static final String RevokeSuccess = "verified_revoke_success";
    public static final String RspBodyBytesTime = "response_body_bytes_time";
    public static final String RspBodyCompSize = "response_body_compressed_size";
    public static final String RspBodyDecompressionTime = "response_body_decompression_time";
    public static final String RspBodyExpectedLen = "response_body_expected_length";
    public static final String RspBodySize = "response_body_size";
    public static final String RspHeaderCompSize = "response_header_compressed_size";
    public static final String RspHeaderSize = "response_header_size";
    public static final String RspIntvlAvg = "response_interval_average";
    public static final String RspIntvlStdDev = "response_interval_stddev";
    public static final String RspNumOnBody = "response_number_on_body";
    public static final String RttMilliseconds = "rtt_milliseconds";
    public static final String SecurityProtocol = "security_protocol";
    public static final String ServerAddr = "server_address";
    public static final String ServerCluster = "server_cluster";
    public static final String ServerCwnd = "server_cwnd";
    public static final String ServerDatetime = "server_datetime";
    public static final String ServerHostEnc = "server_host_enc";
    public static final String ServerMss = "server_mss";
    public static final String ServerPort = "server_port";
    public static final String ServerQuality = "response_server_quality";
    public static final String ServerRtt = "server_rtt";
    public static final String ServerRtx = "server_rtx";
    public static final String ServerTotalBytesWritten = "server_tbw";
    public static final String ServerTotalPackets = "server_total_packets";
    public static final String ServerTotalPacketsLost = "server_total_packets_lost";
    public static final String ServerUploadLatency = "upload_latency";
    public static final String ServerUpstreamLatency = "upstream_latency";
    public static final String SessionCacheHitType = "session_cache_hit_type";
    public static final String SessionReusable = "session_reusable";
    public static final String SessionType = "session_type";
    public static final String SignatureAlgorithmCertSHA1 = "signature_algorithm_verified_cert_sha1";
    public static final String SizeOfQueue = "size_of_queue";
    public static final String SpeedTestBandWidth = "speed_test_bandwidth";
    public static final String StartTime = "start_time";
    public static final String StartedExtraTcp = "started_extra_tcp";
    public static final String StartedQuicAsync = "started_quic_async";
    public static final String StatusCode = "status_code";
    public static final String StatusMessage = "status_message";
    public static final String StreamBytesReceived = "stream_bytes_received";
    public static final String StreamBytesSent = "stream_bytes_sent";
    public static final String StreamLimitExceeded = "stream_limit_exceeded";
    public static final String StreamLossCount = "stream_loss_count";
    public static final String StreamType = "stream_type";
    public static final String TLSCacheHit = "tls_cache_hit";
    public static final String TLSCachePersistence = "tls_cache_persistence";
    public static final String TLSReused = "tls_reused";
    public static final String TLSVersion = "ssl_version";
    public static final String TTFB = "ttfb";
    public static final String TTFBConfidence = "ttfb_confidence";
    public static final String TTFBEstimateMilliseconds = "ttfb_estimate_milliseconds";
    public static final String TTFBStdDev = "ttfb_std_dev";
    public static final String TTFBWeight = "ttfb_weight";
    public static final String TTLB = "ttlb";
    public static final String TXT = "TXT";
    public static final String TcpConnectEnd = "tcp_connect_end";
    public static final String TcpConnectStart = "tcp_connect_start";
    public static final String Throughput = "throughput";
    public static final String TimeSinceFirstHTTPClientInit = "time_since_first_httpclient_init";
    public static final String TimeSinceHTTPClientInit = "time_since_httpclient_init";
    public static final String TimestampVerifiedCertNotAfterTime = "timestamp_verified_cert_not_after_time";
    public static final String TimestampVerifiedCertNotBeforeTime = "timestamp_verified_cert_not_before_time";
    public static final String TimestampVerifiedClientTimeOverride = "timestamp_verified_client_time_override";
    public static final String TimestampVerifiedTrustedTime = "timestamp_verified_trusted_time";
    public static final String TotalConnsStarted = "total_conns_started";
    public static final String TotalPackets = "total_packets";
    public static final String TotalPacketsLost = "total_packets_lost";
    public static final String TotalRTOCount = "total_rto_count";
    public static final String TotalRequestsWaited = "total_requests_waited";
    public static final String TotalRetx = "total_retx";
    public static final String TraceStringId = "trace_string_id";
    public static final String TransportReplaySafe = "transport_replay_safe";
    public static final String TransportType = "transport_type";
    public static final String TripId = "trip_id";
    public static final String UploadBwQuality = "upload_bw_quality";
    public static final String UpstreamCapacity = "upstream_capacity";
    public static final String Uri = "uri";
    public static final String UrlModifiedReason = "url_modified_reason";
    public static final String UrlState = "url_state";
    public static final String UsingManualProxy = "using_manual_proxy";
    public static final String UsingProxy = "using_proxy";
    public static final String VerificationImpl = "verification_impl";
    public static final String VerifiedChain = "verified_chain";
    public static final String VerifiedChainFailureVerificationTime = "verified_chain_failure_verification_time";
    public static final String VerifiedChainFailuresOverridden = "verified_chain_failures_overridden";
    public static final String VerifiedError = "verified_error";
    public static final String VerifiedHostname = "verified_hostname";
    public static final String VerifiedHostnameFailMessage = "verified_hostnameFailMessage";
    public static final String VerifiedKeyLengthSuccess = "verified_key_length_success";
    public static final String VerifiedMatchedCommonName = "verified_matchedCommonName";
    public static final String VerifiedMatchedSubjectAltName = "verified_matchedSubjectAltName";
    public static final String VerifiedNameMatched = "verified_nameMatched";
    public static final String VerifiedProxyAddress = "verified_proxy_address";
    public static final String VerifiedReason = "verified_reason";
    public static final String VerifiedServerAddress = "verified_server_address";
    public static final String VerifiedSuccess = "verified_success";
    public static final String VerifiedTime = "verified_time";
    public static final String VerifiedTimeMerge = "verified_time_merge";
    public static final String VideoId = "video_id";
    public static final String WaitingMsgId = "waiting_msg_id";
    public static final String ZeroVersion = "zero_version";
}
