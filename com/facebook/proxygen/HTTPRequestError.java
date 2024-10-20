package com.facebook.proxygen;

import X.1BL;

/* loaded from: HTTPRequestError.class */
public class HTTPRequestError {
    public ProxygenError mErrCode;
    public String mErrMsg;
    public HTTPRequestStage mErrStage;

    /* loaded from: HTTPRequestError$HTTPRequestStage.class */
    public enum HTTPRequestStage {
        ProcessRequest,
        DNSResolution,
        TCPConnection,
        TLSSetup,
        SendRequest,
        RecvResponse,
        Unknown,
        ZeroRttSent,
        WaitingRequest,
        RecvRequest,
        SendResponse,
        Max
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: HTTPRequestError$ProxygenError.class */
    public final class ProxygenError {
        public static final ProxygenError None = 1BL.A0X("None", 0);
        public static final ProxygenError Message = 1BL.A0X("Message", 1);
        public static final ProxygenError Connect = 1BL.A0X("Connect", 2);
        public static final ProxygenError ConnectTimeout = 1BL.A0X("ConnectTimeout", 3);
        public static final ProxygenError Read = 1BL.A0X("Read", 4);
        public static final ProxygenError Write = 1BL.A0X("Write", 5);
        public static final ProxygenError Timeout = 1BL.A0X("Timeout", 6);
        public static final ProxygenError Handshake = 1BL.A0X("Handshake", 7);
        public static final ProxygenError NoServer = 1BL.A0X("NoServer", 8);
        public static final ProxygenError MaxRedirects = 1BL.A0X("MaxRedirects", 9);
        public static final ProxygenError InvalidRedirect = 1BL.A0X("InvalidRedirect", 10);
        public static final ProxygenError ResponseAction = 1BL.A0X("ResponseAction", 11);
        public static final ProxygenError MaxConnects = 1BL.A0X("MaxConnects", 12);
        public static final ProxygenError Dropped = 1BL.A0X("Dropped", 13);
        public static final ProxygenError Connection = 1BL.A0X("Connection", 14);
        public static final ProxygenError ConnectionReset = 1BL.A0X("ConnectionReset", 15);
        public static final ProxygenError ParseHeader = 1BL.A0X("ParseHeader", 16);
        public static final ProxygenError ParseBody = 1BL.A0X("ParseBody", 17);
        public static final ProxygenError EOF = 1BL.A0X("EOF", 18);
        public static final ProxygenError ClientRenegotiation = 1BL.A0X("ClientRenegotiation", 19);
        public static final ProxygenError Unknown = 1BL.A0X("Unknown", 20);
        public static final ProxygenError BadDecompress = 1BL.A0X("BadDecompress", 21);
        public static final ProxygenError SSL = 1BL.A0X("SSL", 22);
        public static final ProxygenError StreamAbort = 1BL.A0X("StreamAbort", 23);
        public static final ProxygenError StreamUnacknowledged = 1BL.A0X("StreamUnacknowledged", 24);
        public static final ProxygenError WriteTimeout = 1BL.A0X("WriteTimeout", 25);
        public static final ProxygenError AddressPrivate = 1BL.A0X("AddressPrivate", 26);
        public static final ProxygenError AddressFamilyNotSupported = 1BL.A0X("AddressFamilyNotSupported", 27);
        public static final ProxygenError DNSResolutionErr = 1BL.A0X("DNSResolutionErr", 28);
        public static final ProxygenError DNSNoResults = 1BL.A0X("DNSNoResults", 29);
        public static final ProxygenError MalformedInput = 1BL.A0X("MalformedInput", 30);
        public static final ProxygenError UnsupportedExpectation = 1BL.A0X("UnsupportedExpectation", 31);
        public static final ProxygenError MethodNotSupported = 1BL.A0X("MethodNotSupported", 32);
        public static final ProxygenError UnsupportedScheme = 1BL.A0X("UnsupportedScheme", 33);
        public static final ProxygenError Shutdown = 1BL.A0X("Shutdown", 34);
        public static final ProxygenError IngressStateTransition = 1BL.A0X("IngressStateTransition", 35);
        public static final ProxygenError ClientSilent = 1BL.A0X("ClientSilent", 36);
        public static final ProxygenError Canceled = 1BL.A0X("Canceled", 37);
        public static final ProxygenError ParseResponse = 1BL.A0X("ParseResponse", 38);
        public static final ProxygenError ConnRefused = 1BL.A0X("ConnRefused", 39);
        public static final ProxygenError DNSOtherServer = 1BL.A0X("DNSOtherServer", 40);
        public static final ProxygenError DNSOtherClient = 1BL.A0X("DNSOtherClient", 41);
        public static final ProxygenError DNSOtherCancelled = 1BL.A0X("DNSOtherCancelled", 42);
        public static final ProxygenError DNSshutdown = 1BL.A0X("DNSshutdown", 43);
        public static final ProxygenError DNSgetaddrinfo = 1BL.A0X("DNSgetaddrinfo", 44);
        public static final ProxygenError DNSthreadpool = 1BL.A0X("DNSthreadpool", 45);
        public static final ProxygenError DNSunimplemented = 1BL.A0X("DNSunimplemented", 46);
        public static final ProxygenError Network = 1BL.A0X("Network", 47);
        public static final ProxygenError Configuration = 1BL.A0X("Configuration", 48);
        public static final ProxygenError EarlyDataRejected = 1BL.A0X("EarlyDataRejected", 49);
        public static final ProxygenError EarlyDataFailed = 1BL.A0X("EarlyDataFailed", 50);
        public static final ProxygenError AuthRequired = 1BL.A0X("AuthRequired", 51);
        public static final ProxygenError Unauthorized = 1BL.A0X("Unauthorized", 52);
        public static final ProxygenError EgressEOMSeenOnParentStream = 1BL.A0X("EgressEOMSeenOnParentStream", 53);
        public static final ProxygenError TransportIsDraining = 1BL.A0X("TransportIsDraining", 54);
        public static final ProxygenError ParentStreamNotExist = 1BL.A0X("ParentStreamNotExist", 55);
        public static final ProxygenError CreatingStream = 1BL.A0X("CreatingStream", 56);
        public static final ProxygenError PushNotSupported = 1BL.A0X("PushNotSupported", 57);
        public static final ProxygenError MaxConcurrentOutgoingStreamLimitReached = 1BL.A0X("MaxConcurrentOutgoingStreamLimitReached", 58);
        public static final ProxygenError BadSocket = 1BL.A0X("BadSocket", 59);
        public static final ProxygenError DuplicatedStreamId = 1BL.A0X("DuplicatedStreamId", 60);
        public static final ProxygenError ClientTransactionGone = 1BL.A0X("ClientTransactionGone", 61);
        public static final ProxygenError NetworkSwitch = 1BL.A0X("NetworkSwitch", 62);
        public static final ProxygenError Forbidden = 1BL.A0X("Forbidden", 63);
        public static final ProxygenError InternalError = 1BL.A0X("InternalError", 64);
        public static final ProxygenError Max = 1BL.A0X("Max", 65);
        public static final /* synthetic */ ProxygenError[] $VALUES = $values();

        public static /* synthetic */ ProxygenError[] $values() {
            ProxygenError[] proxygenErrorArr = new ProxygenError[66];
            System.arraycopy(new ProxygenError[]{None, Message, Connect, ConnectTimeout, Read, Write, Timeout, Handshake, NoServer, MaxRedirects, InvalidRedirect, ResponseAction, MaxConnects, Dropped, Connection, ConnectionReset, ParseHeader, ParseBody, EOF, ClientRenegotiation, Unknown, BadDecompress, SSL, StreamAbort, StreamUnacknowledged, WriteTimeout, AddressPrivate}, 0, proxygenErrorArr, 0, 27);
            System.arraycopy(new ProxygenError[]{AddressFamilyNotSupported, DNSResolutionErr, DNSNoResults, MalformedInput, UnsupportedExpectation, MethodNotSupported, UnsupportedScheme, Shutdown, IngressStateTransition, ClientSilent, Canceled, ParseResponse, ConnRefused, DNSOtherServer, DNSOtherClient, DNSOtherCancelled, DNSshutdown, DNSgetaddrinfo, DNSthreadpool, DNSunimplemented, Network, Configuration, EarlyDataRejected, EarlyDataFailed, AuthRequired, Unauthorized, EgressEOMSeenOnParentStream}, 0, proxygenErrorArr, 27, 27);
            System.arraycopy(new ProxygenError[]{TransportIsDraining, ParentStreamNotExist, CreatingStream, PushNotSupported, MaxConcurrentOutgoingStreamLimitReached, BadSocket, DuplicatedStreamId, ClientTransactionGone, NetworkSwitch, Forbidden, InternalError, Max}, 0, proxygenErrorArr, 54, 12);
            return proxygenErrorArr;
        }

        public ProxygenError(String str, int i) {
        }

        public static ProxygenError valueOf(String str) {
            return (ProxygenError) Enum.valueOf(ProxygenError.class, str);
        }

        public static ProxygenError[] values() {
            return (ProxygenError[]) $VALUES.clone();
        }
    }

    public HTTPRequestError(String str, HTTPRequestStage hTTPRequestStage, ProxygenError proxygenError) {
        this.mErrMsg = str;
        this.mErrStage = hTTPRequestStage;
        this.mErrCode = proxygenError;
    }

    public ProxygenError getErrCode() {
        return this.mErrCode;
    }

    public String getErrMsg() {
        return this.mErrMsg;
    }

    public HTTPRequestStage getErrStage() {
        return this.mErrStage;
    }
}
