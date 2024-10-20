package com.facebook.http.internal.tigonengine;

import X.1BK;
import X.1CO;
import X.1EK;
import X.1JF;
import X.2Ag;
import X.2Ar;
import X.40E;
import X.41B;
import X.41C;
import X.41W;
import X.42H;
import X.43O;
import X.43Z;
import X.AnonymousClass001;
import X.AnonymousClass018;
import X.AnonymousClass413;
import X.C00i;
import X.C31i;
import X.C3o5;
import X.C41G;
import X.C41b;
import X.C42Y;
import X.C42c;
import X.C42g;
import X.C43P;
import X.C43R;
import X.C43c;
import X.C43d;
import X.C43q;
import X.C5e8;
import X.EnumC04093zx;
import X.H8q;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.common.util.TriState;
import com.facebook.fury.context.ReqContext;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.http.networkstatelogger.NetworkStateLogger;
import com.facebook.proxygen.TraceEventType;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import com.facebook.tigon.iface.FacebookLoggingRequestInfo;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.iface.TigonSamplingPolicy;
import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: FlowObserverRequestInfo.class */
public class FlowObserverRequestInfo implements HttpContext, CallerContextable {
    public static final String EXCEPTION_FMT = "Observers should not throw! %s threw an exception in %s call";
    public static final String TAG = "FlowObserverRequestInfo";
    public final HttpUriRequest mApacheRequest;
    public HttpResponse mApacheResponse;
    public Set mFlowObservers;
    public 41C mHttpFlowStatistics;
    public final C5e8 mHttpWireCallback;
    public TigonRequest mOriginalRequest;
    public List mRequestHttpFlowStatisticsCapture;
    public TigonRequest mSentRequest;
    public boolean mStartedInvoked;
    public final 40E mTigonFlowStateController;
    public Set mTigonLoggers;
    public TigonSamplingPolicy mTigonSamplingPolicy;
    public int mAttempt = 0;
    public int mTowerIdAtStart = -1;
    public TigonError mTigonError = TigonError.None;
    public final HashMap mContextMap = new HashMap(2);

    public FlowObserverRequestInfo(40E r302, HttpUriRequest httpUriRequest, TigonSamplingPolicy tigonSamplingPolicy, C5e8 c5e8, List list) {
        this.mTigonFlowStateController = r302;
        this.mApacheRequest = httpUriRequest;
        this.mTigonSamplingPolicy = tigonSamplingPolicy;
        this.mHttpWireCallback = c5e8;
        this.mRequestHttpFlowStatisticsCapture = list;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [X.43a, java.lang.Object] */
    private void decorateStatistics(C42g c42g, String str) {
        boolean z;
        this.mHttpFlowStatistics.getClass();
        this.mHttpFlowStatistics.A08.getClass();
        this.mOriginalRequest.getClass();
        C43P c43p = 43O.A04;
        C42c c42c = (C42c) c42g.AtR(c43p);
        EnumC04093zx requestCategory = this.mOriginalRequest.requestCategory();
        EnumC04093zx enumC04093zx = EnumC04093zx.A0D;
        if (requestCategory == enumC04093zx) {
            40E r0 = this.mTigonFlowStateController;
            Object AtR = c42g.AtR(43O.A00);
            if (AtR != null) {
                r0.mAppNetSessionIdInfo.set(AtR);
            }
            C42c c42c2 = (C42c) c42g.AtR(c43p);
            if (c42c2 != null) {
                Map map = c42c2.A01;
                r0.mClientPublicAddress.set(map.get(TraceFieldType.ClientPublicAddr));
                r0.mServerCluster.set(map.get(TraceFieldType.ServerCluster));
                r0.mServerHostEnc.set(map.get(TraceFieldType.ServerHostEnc));
                r0.mServerDatetime.set(map.get(TraceFieldType.ServerDatetime));
                if (!1JF.A0B((CharSequence) map.get(TraceFieldType.HostName)) && !1JF.A0B((CharSequence) map.get(TraceFieldType.ServerAddr))) {
                    r0.A09.put(map.get(TraceFieldType.HostName), map.get(TraceFieldType.ServerAddr));
                }
                C42Y c42y = (C42Y) c42g.AtR(43O.A0B);
                if (c42y != null) {
                    String str2 = (String) c42y.A00.get("rmd_original_hostname");
                    if (!1JF.A0B(str2) && !1JF.A0B((CharSequence) map.get(TraceFieldType.ServerAddr))) {
                        r0.A09.put(str2, map.get(TraceFieldType.ServerAddr));
                    }
                }
            }
        }
        if (c42c != null) {
            Map map2 = c42c.A01;
            if (map2.get(TraceFieldType.RspBodyCompSize) != null && map2.get(TraceEventType.ResponseBodyRead) != null && map2.get(TraceFieldType.RTT) != null) {
                40E r02 = this.mTigonFlowStateController;
                boolean z2 = false;
                if (this.mOriginalRequest.requestCategory() == enumC04093zx) {
                    z2 = true;
                }
                int parseInt = Integer.parseInt((String) map2.get(TraceFieldType.RspBodyCompSize));
                long parseLong = Long.parseLong((String) map2.get(TraceEventType.ResponseBodyRead));
                long parseLong2 = Long.parseLong((String) map2.get(TraceFieldType.RTT));
                if (!z2) {
                    r02.A02.A00(parseInt, parseLong);
                }
                ((C43R) r02.A08.get()).A01(parseLong2);
            }
            if (map2.get(TraceFieldType.ReqHeaderSize) != null) {
                this.mHttpFlowStatistics.requestHeaderBytes.A00 = Long.parseLong((String) map2.get(TraceFieldType.ReqHeaderSize));
            }
            if (map2.get(TraceFieldType.ReqBodySize) != null) {
                this.mHttpFlowStatistics.requestBodyBytes.A00 = Long.parseLong((String) map2.get(TraceFieldType.ReqBodySize));
            }
            if (map2.get(TraceFieldType.RspHeaderSize) != null) {
                this.mHttpFlowStatistics.responseHeaderBytes.A00 = Long.parseLong((String) map2.get(TraceFieldType.RspHeaderSize));
            }
            if (map2.get(TraceFieldType.RspBodyCompSize) != null) {
                this.mHttpFlowStatistics.responseBodyBytes.A00 = Long.parseLong((String) map2.get(TraceFieldType.RspBodyCompSize));
            }
            if (map2.get(TraceFieldType.RspBodySize) != null) {
                this.mHttpFlowStatistics.bytesReadByApp.A00 = Long.parseLong((String) map2.get(TraceFieldType.RspBodySize));
            }
            if (map2.get(TraceFieldType.TTFB) != null) {
                this.mHttpFlowStatistics.A00 = Long.parseLong((String) map2.get(TraceFieldType.TTFB));
            }
            if (map2.get(TraceFieldType.TTLB) != null) {
                this.mHttpFlowStatistics.A01 = Long.parseLong((String) map2.get(TraceFieldType.TTLB));
            }
            if (map2.get(TraceFieldType.ServerUpstreamLatency) != null) {
                this.mHttpFlowStatistics.A02 = Long.parseLong((String) map2.get(TraceFieldType.ServerUpstreamLatency));
            }
            if (map2.get(TraceFieldType.Cwnd) != null) {
                Long.parseLong((String) map2.get(TraceFieldType.Cwnd));
            }
            if (map2.get(TraceFieldType.CwndBytes) != null) {
                Long.parseLong((String) map2.get(TraceFieldType.CwndBytes));
            }
            if (!1JF.A0B((CharSequence) map2.get(TraceFieldType.ClientPublicAddr))) {
                map2.get(TraceFieldType.ClientPublicAddr);
            }
            if (!1JF.A0B((CharSequence) map2.get(TraceFieldType.ServerAddr))) {
                this.mHttpFlowStatistics.A05 = (String) map2.get(TraceFieldType.ServerAddr);
            }
            if (!1JF.A0B((CharSequence) map2.get(TraceFieldType.HostName))) {
                this.mHttpFlowStatistics.A04 = (String) map2.get(TraceFieldType.HostName);
            }
            this.mHttpFlowStatistics.A03 = TriState.valueOf(Boolean.parseBoolean((String) map2.get(TraceFieldType.NewSession)));
            NetworkStateLogger networkStateLogger = (NetworkStateLogger) this.mTigonFlowStateController.A07.get();
            synchronized (networkStateLogger) {
                try {
                    z = networkStateLogger.A0D;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                40E r03 = this.mTigonFlowStateController;
                String A0b = AnonymousClass001.A0b(TraceFieldType.ClientPublicAddr, map2);
                networkStateLogger = (NetworkStateLogger) r03.A07.get();
                synchronized (networkStateLogger) {
                    if (networkStateLogger.A0D && A0b != null && !A0b.isEmpty() && !A0b.equals(networkStateLogger.A04)) {
                        networkStateLogger.A04 = A0b;
                        Map map3 = networkStateLogger.A0A;
                        if (!map3.containsKey(A0b)) {
                            HashMap A0u = AnonymousClass001.A0u();
                            NetworkStateLogger.A01(networkStateLogger, A0u);
                            map3.put(A0b, A0u);
                        }
                    }
                }
            }
        }
        if (this.mTigonLoggers != null) {
            TigonSamplingPolicy tigonSamplingPolicy = this.mTigonSamplingPolicy;
            TigonRequest tigonRequest = this.mSentRequest;
            if (tigonRequest == null) {
                tigonRequest = this.mOriginalRequest;
            }
            41B A00 = 41B.A00(this);
            41C r04 = this.mHttpFlowStatistics;
            TigonError tigonError = this.mTigonError;
            40E r05 = this.mTigonFlowStateController;
            1EK.A09("TigonFlowStateController", 4760009080727693L);
            try {
                ReqContext A04 = AnonymousClass018.A04("TigonFlowStateController", 0);
                try {
                    43Z Ayv = ((2Ag) r05.A06.get()).Ayv();
                    if (A04 != null) {
                        A04.close();
                    }
                    1EK.A03();
                    int i = this.mTowerIdAtStart;
                    ?? obj = new Object();
                    obj.A07 = tigonSamplingPolicy;
                    obj.A06 = tigonRequest;
                    obj.A03 = A00;
                    obj.A01 = r04;
                    obj.A05 = c42g;
                    obj.A04 = tigonError;
                    obj.A08 = str;
                    obj.A02 = Ayv;
                    obj.A00 = i;
                    Iterator it = this.mTigonLoggers.iterator();
                    while (it.hasNext()) {
                        ((C43c) it.next()).BbL(obj);
                    }
                } finally {
                }
            } catch (Throwable th2) {
                1EK.A03();
                throw th2;
            }
        }
    }

    private void kickOffObserverFlows() {
        40E r0 = this.mTigonFlowStateController;
        41C r02 = new 41C(r0.A00, this.mHttpWireCallback, r0.A01);
        C00i c00i = r0.A04;
        r02.A07 = ((FbNetworkManager) c00i.get()).A0H();
        r02.A06 = ((FbNetworkManager) c00i.get()).A0G();
        ((FbNetworkManager) c00i.get()).A0I();
        r02.A09 = ((FbNetworkManager) c00i.get()).A0Q();
        this.mHttpFlowStatistics = r02;
        List list = this.mRequestHttpFlowStatisticsCapture;
        if (list != null) {
            list.add(r02);
        }
        this.mStartedInvoked = false;
        this.mTigonLoggers = (Set) this.mTigonFlowStateController.A0B.get();
        Set<C41G> set = (Set) this.mTigonFlowStateController.A0A.get();
        this.mFlowObservers = set;
        for (C41G c41g : set) {
            if (c41g != null) {
                try {
                    c41g.ABj(this.mHttpFlowStatistics, this.mApacheRequest, this);
                } catch (Throwable th) {
                    C3o5.A0l(AnonymousClass001.A0Y(c41g), "beginRequest", TAG, th);
                    throw th;
                }
            }
        }
    }

    private void notifyObserversOfError(IOException iOException) {
        double d;
        this.mHttpFlowStatistics.getClass();
        this.mFlowObservers.getClass();
        if (this.mStartedInvoked) {
            if (this.mTigonError != null && this.mApacheResponse == null) {
                C43R c43r = (C43R) this.mTigonFlowStateController.A08.get();
                synchronized (c43r) {
                    double[] dArr = c43r.A07;
                    d = dArr[6];
                    if (d == 0.0d) {
                        d = ((1CO) c43r.A05.get()).Auy(36591815693303927L);
                        dArr[6] = d;
                    }
                }
                if (d > 0.0d) {
                    c43r.A01(d);
                }
            }
            for (C41G c41g : this.mFlowObservers) {
                if (c41g != null) {
                    try {
                        HttpResponse httpResponse = this.mApacheResponse;
                        c41g.BwY(iOException, httpResponse == null ? "http_client_execute" : "read_response_body", this.mApacheRequest, httpResponse, this);
                    } catch (Throwable th) {
                        C3o5.A0l(AnonymousClass001.A0Y(c41g), "onError", TAG, th);
                        throw th;
                    }
                }
            }
        }
    }

    private void updateFlowStatisticsInternal(C42g c42g, IOException iOException) {
        updateFlowStatistics(c42g, TigonErrorException.convertExceptionToRequestStatus(iOException), TigonErrorException.formatTigonException(iOException));
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        return this.mContextMap.get(str);
    }

    public 41C getHttpFlowStatistics() {
        return this.mHttpFlowStatistics;
    }

    public HttpUriRequest getRequest() {
        return this.mApacheRequest;
    }

    public InputStream interceptResponseStream(InputStream inputStream) {
        Set<41W> set = this.mFlowObservers;
        if (set != null && this.mApacheResponse != null) {
            for (41W r0 : set) {
                if (r0 != null && (r0 instanceof 41W)) {
                    41W r02 = r0;
                    InputStream inputStream2 = inputStream;
                    try {
                        Set set2 = r02.A03;
                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                            Iterator it = set2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((42H) it.next()).isEnabled()) {
                                    if (inputStream == null) {
                                        inputStream2 = null;
                                    } else {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        r02.A00 = byteArrayOutputStream;
                                        new H8q(inputStream, byteArrayOutputStream);
                                    }
                                }
                            }
                        }
                        inputStream = inputStream2;
                    } catch (Throwable th) {
                        C3o5.A0l(AnonymousClass001.A0Y(r0), "interceptResponseStream", TAG, th);
                        throw th;
                    }
                }
            }
        }
        return inputStream;
    }

    public void onAdded(TigonRequest tigonRequest, int i) {
        RequestPriority requestPriority;
        String str;
        FacebookLoggingRequestInfo facebookLoggingRequestInfo = (FacebookLoggingRequestInfo) tigonRequest.getLayerInformation(AnonymousClass413.A01);
        int tigonPriority = tigonRequest.tigonPriority();
        RequestPriority requestPriority2 = RequestPriority.A00;
        RequestPriority[] values = RequestPriority.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                requestPriority = requestPriority2;
                break;
            }
            requestPriority = values[i2];
            if (requestPriority.requestPriority == tigonPriority) {
                break;
            } else {
                i2++;
            }
        }
        new 41B((facebookLoggingRequestInfo == null || (str = facebookLoggingRequestInfo.A01) == null || str.isEmpty()) ? CallerContext.A08(FlowObserverRequestInfo.class, null) : CallerContext.A0C(str, facebookLoggingRequestInfo.A00), tigonRequest.requestCategory(), facebookLoggingRequestInfo != null ? facebookLoggingRequestInfo.A02 : "null", requestPriority.toString()).A01(this);
        this.mOriginalRequest = tigonRequest;
        kickOffObserverFlows();
    }

    public void onEOM(C42g c42g) {
        if (this.mFlowObservers == null || this.mApacheResponse == null) {
            return;
        }
        this.mHttpFlowStatistics.getClass();
        HttpUriRequest httpUriRequest = this.mApacheRequest;
        httpUriRequest.getClass();
        httpUriRequest.getParams().getLongParameter("fb_request_tailing_wait_time", 0L);
        this.mTigonError = TigonError.None;
        updateFlowStatisticsInternal(c42g, null);
        for (C41G c41g : this.mFlowObservers) {
            if (c41g != null) {
                try {
                    c41g.CbP(this.mApacheResponse, this);
                } catch (Throwable th) {
                    C3o5.A0l(AnonymousClass001.A0Y(c41g), "receivedResponseBody", TAG, th);
                    throw th;
                }
            }
        }
    }

    public void onError(C42g c42g, IOException iOException) {
        if (this.mFlowObservers != null) {
            TigonError A00 = C31i.A00(iOException);
            if (A00 != null) {
                this.mTigonError = A00;
            }
            updateFlowStatisticsInternal(c42g, iOException);
            notifyObserversOfError(iOException);
        }
    }

    public void onResponse(HttpResponse httpResponse) {
        Set<C41G> set = this.mFlowObservers;
        if (set != null) {
            this.mApacheResponse = httpResponse;
            for (C41G c41g : set) {
                if (c41g != null) {
                    try {
                        c41g.CbQ(this.mApacheResponse, this);
                    } catch (Throwable th) {
                        C3o5.A0l(AnonymousClass001.A0Y(c41g), "receivedResponseHeaders", TAG, th);
                        throw th;
                    }
                }
            }
        }
    }

    public void onStarted(TigonRequest tigonRequest) {
        this.mSentRequest = tigonRequest;
        for (Map.Entry entry : tigonRequest.headers().entrySet()) {
            this.mApacheRequest.setHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (this.mFlowObservers != null) {
            this.mHttpFlowStatistics.getClass();
            this.mStartedInvoked = true;
            this.mTigonFlowStateController.A00.now();
            HttpUriRequest httpUriRequest = this.mApacheRequest;
            httpUriRequest.getClass();
            httpUriRequest.getParams().getLongParameter("fb_request_creation_time", 0L);
            C41b c41b = (C41b) tigonRequest.getLayerInformation(AnonymousClass413.A06);
            if (c41b != null && (c41b.A03 & 8) != 0) {
                C43d c43d = (C43d) this.mTigonFlowStateController.A05.get();
                1EK.A09("TigonLogUtils", 4760009080727693L);
                try {
                    ReqContext A04 = AnonymousClass018.A04("TigonLogUtils", 0);
                    try {
                        int A0f = C43d.A01(c43d) ? ((2Ar) ((C43q) c43d.A01.get()).A01.get()).A00().A0f() : -1;
                        if (A04 != null) {
                            A04.close();
                        }
                        1EK.A03();
                        this.mTowerIdAtStart = A0f;
                    } finally {
                    }
                } catch (Throwable th) {
                    1EK.A03();
                    throw th;
                }
            }
            for (C41G c41g : this.mFlowObservers) {
                if (c41g != null) {
                    try {
                        c41g.CYC(this.mApacheRequest, this);
                    } catch (Throwable th2) {
                        C3o5.A0l(AnonymousClass001.A0Y(c41g), "preRequestSend", TAG, th2);
                        throw th2;
                    }
                }
            }
        }
    }

    public void onWillRetry(TigonError tigonError, C42g c42g, int i) {
        try {
            boolean z = false;
            if (i == this.mAttempt) {
                z = true;
            }
            Preconditions.checkState(z);
            TigonErrorException tigonErrorException = new TigonErrorException(tigonError);
            this.mTigonError = tigonError;
            updateFlowStatisticsInternal(c42g, tigonErrorException);
            notifyObserversOfError(tigonErrorException);
        } catch (IllegalStateException e) {
            1BK.A09(this.mTigonFlowStateController.A03).D0y("Tigon retry state", String.format(Locale.US, "att:%d/%d", AnonymousClass001.A1b(Integer.valueOf(i), this.mAttempt)), 1, e);
        }
        this.mAttempt++;
        this.mApacheResponse = null;
        kickOffObserverFlows();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        return this.mContextMap.remove(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        this.mContextMap.put(str, obj);
    }

    public void updateFlowStatistics(C42g c42g, String str, String str2) {
        this.mHttpFlowStatistics.getClass();
        this.mHttpFlowStatistics.A08 = str;
        if (c42g != null) {
            decorateStatistics(c42g, str2);
        }
    }
}
