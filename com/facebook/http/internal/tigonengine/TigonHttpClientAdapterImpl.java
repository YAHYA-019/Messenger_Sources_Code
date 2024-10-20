package com.facebook.http.internal.tigonengine;

import X.0Zi;
import X.11T;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.40C;
import X.40E;
import X.40J;
import X.40K;
import X.40L;
import X.40U;
import X.AnonymousClass409;
import X.C00i;
import X.C21t;
import X.C40j;
import X.C40o;
import X.C40u;
import X.C40w;
import X.C40y;
import X.C4Vl;
import X.C4YF;
import X.C5e8;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.inject.FbInjector;
import com.facebook.tigon.TigonBodyProvider;
import com.facebook.tigon.TigonRequestToken;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.iface.HttpPriorityContext;
import com.facebook.tigon.iface.TigonRequestBuilder;
import com.facebook.tigon.tigonliger.TigonLigerConfig;
import com.facebook.tigon.tigonliger.TigonLigerService;
import com.facebook.tigon.tigonobserver.TigonObservable;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.apache.http.impl.client.RequestWrapper;

/* loaded from: TigonHttpClientAdapterImpl.class */
public class TigonHttpClientAdapterImpl {
    public static final boolean LOG_RESPONSE_BODY = false;
    public static final String TAG = "TigonHttpClientAdapterImpl";
    public final ArrayList mAbortAllListeners;
    public final C00i mBackgroundExecutor;
    public final C00i mFbHttpRequestPreProcessor;
    public TigonObservable mNativeObserver;
    public final C00i mRequestBuilder;
    public final 40C mRequestStates;
    public final C00i mResponseHandlerExecutor;
    public final boolean mRethrowGeneralExceptions;
    public final C00i mTigonFlowStateContoller;
    public final C00i mTigonLigerConfig;
    public TigonObservable mTigonObservable;
    public final C00i mTigonService;

    public TigonHttpClientAdapterImpl() {
        1BQ r0 = new 1BQ(66072);
        this.mTigonService = r0;
        1BQ r02 = new 1BQ(32853);
        this.mTigonFlowStateContoller = r02;
        this.mRequestBuilder = new 1BV(32865);
        1BQ r03 = new 1BQ(32864);
        this.mBackgroundExecutor = r03;
        this.mResponseHandlerExecutor = new 1BQ(32863);
        1BQ r04 = new 1BQ(66071);
        this.mTigonLigerConfig = r04;
        this.mFbHttpRequestPreProcessor = new 1BQ(32856);
        this.mRequestStates = new 40C();
        this.mAbortAllListeners = new ArrayList();
        Context A00 = FbInjector.A00();
        11T.A0F(A00, 0);
        this.mRethrowGeneralExceptions = 0Zi.A01(A00).A86;
        TigonXplatService tigonXplatService = (TigonXplatService) r0.get();
        Executor executor = (Executor) r03.get();
        if (tigonXplatService != null && tigonXplatService.isAvailable() && tigonXplatService.isObservable()) {
            40J[] r05 = {new 40J((40E) r02.get(), (TigonLigerConfig) r04.get())};
            this.mNativeObserver = new TigonObservable(tigonXplatService, false, true, executor, r05, r05);
            Set A06 = 1Bi.A06(248);
            if (A06.isEmpty()) {
                return;
            }
            this.mTigonObservable = new TigonObservable(tigonXplatService, false, false, executor, (40K[]) A06.toArray(new 40K[0]), new 40L[0]);
        }
    }

    public static final TigonHttpClientAdapterImpl _UL__ULSEP_com_facebook_http_internal_tigonengine_TigonHttpClientAdapterImpl_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new TigonHttpClientAdapterImpl();
    }

    public static int convertToHttpPriority(RequestPriority requestPriority) {
        int i = requestPriority.requestPriority;
        if (i == 0) {
            return 0;
        }
        int i2 = 3;
        if (i != 1) {
            i2 = 7;
        }
        return i2;
    }

    private void notifyAbortAllListeners() {
        synchronized (this) {
            Iterator it = this.mAbortAllListeners.iterator();
            while (it.hasNext()) {
                ((C4Vl) ((C4YF) it.next())).A00.A03();
            }
        }
    }

    public void abortOutstandingRequests() {
        ((TigonLigerService) this.mTigonService.get()).cancelAllRequests();
        notifyAbortAllListeners();
    }

    public void addAbortAllListener(C4YF c4yf) {
        synchronized (this) {
            this.mAbortAllListeners.add(c4yf);
        }
    }

    public void cancel(int i) {
        TigonRequestToken tigonRequestToken;
        C40w A00 = this.mRequestStates.A00(i);
        if (A00 == null || (tigonRequestToken = A00.A05) == null) {
            return;
        }
        tigonRequestToken.cancel();
    }

    public void changeHttpPriority(int i, RequestPriority requestPriority, boolean z) {
        TigonRequestToken tigonRequestToken;
        C40w A00 = this.mRequestStates.A00(i);
        if (A00 == null || (tigonRequestToken = A00.A05) == null) {
            return;
        }
        tigonRequestToken.changeHttpPriority(convertToHttpPriority(requestPriority), z);
    }

    public void cleanup(int i) {
        40C r0 = this.mRequestStates;
        synchronized (r0) {
            if (r0.A00(i) != null) {
                r0.A00.delete(i);
            }
        }
    }

    public void executeAsync(AnonymousClass409 anonymousClass409, SettableFuture settableFuture) {
        int i;
        TigonRequestToken sendRequest;
        RequestWrapper A00 = ((40U) this.mFbHttpRequestPreProcessor.get()).A00(anonymousClass409);
        int i2 = anonymousClass409.A03;
        C5e8 c5e8 = anonymousClass409.A08;
        String str = anonymousClass409.A0D;
        C40j c40j = (C40j) this.mRequestBuilder.get();
        try {
            TigonBodyProvider A03 = c40j.A03(str, A00);
            ByteBuffer[] byteBufferArr = null;
            C40o A01 = A03 == null ? C40j.A01(A00) : null;
            FlowObserverRequestInfo flowObserverRequestInfo = new FlowObserverRequestInfo((40E) this.mTigonFlowStateContoller.get(), A00, ((TigonLigerConfig) this.mTigonLigerConfig.get()).tigonSamplingPolicy, c5e8, (List) anonymousClass409.A0B.orNull());
            CallerContext callerContext = anonymousClass409.A06;
            C40u c40u = new C40u(c5e8, this, callerContext != null ? callerContext.A03 : "", i2);
            C21t c21t = (C21t) this.mTigonService.get();
            C40w A012 = this.mRequestStates.A01(flowObserverRequestInfo, c21t, settableFuture, str, anonymousClass409.A01(), i2);
            try {
                TigonRequestBuilder.TigonRequestImpl A04 = c40j.A04(anonymousClass409, new C40y(), -1);
                flowObserverRequestInfo.onAdded(A04, i2);
                ExecutorService executorService = (ExecutorService) this.mBackgroundExecutor.get();
                if (A03 != null) {
                    sendRequest = c21t.sendRequest(A04, A03, c40u, executorService);
                    synchronized (A012) {
                    }
                }
                if (A01 != null) {
                    if (A01.A01) {
                        ArrayList arrayList = A01.A00;
                        boolean z = false;
                        boolean z2 = false;
                        if (arrayList.size() == 1) {
                            z2 = true;
                        }
                        Preconditions.checkState(z2);
                        if (((Buffer) arrayList.get(0)).remaining() == 0) {
                            z = true;
                        }
                        Preconditions.checkState(z);
                    }
                    ArrayList arrayList2 = A01.A00;
                    byteBufferArr = (ByteBuffer[]) arrayList2.toArray(new ByteBuffer[arrayList2.size()]);
                    int i3 = 0;
                    i = 0;
                    while (true) {
                        if (i3 >= arrayList2.size()) {
                            break;
                        }
                        i += ((Buffer) arrayList2.get(i3)).position();
                        i3++;
                    }
                } else {
                    i = 0;
                }
                sendRequest = c21t.sendRequest(A04, byteBufferArr, i, c40u, executorService);
                synchronized (A012) {
                }
                A012.A05 = sendRequest;
            } catch (Exception e) {
                settableFuture.setException(e);
                if (A012.A05 == null) {
                    A00.getURI();
                    if (A012.A02 < 1) {
                        TigonRequestToken tigonRequestToken = A012.A05;
                        if (tigonRequestToken != null) {
                            tigonRequestToken.toString();
                        }
                        A012.A02++;
                    }
                    cleanup(i2);
                }
            }
        } catch (IOException e2) {
            settableFuture.setException(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        if (r0 == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getInternalDebugState() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.http.internal.tigonengine.TigonHttpClientAdapterImpl.getInternalDebugState():java.lang.String");
    }

    public void init() {
    }

    public boolean isAvailable() {
        return ((C21t) this.mTigonService.get()).isAvailable();
    }

    public int numPendingRequests() {
        int size;
        40C r0 = this.mRequestStates;
        synchronized (r0) {
            size = r0.A00.size();
        }
        return size;
    }

    public void updateHttpPriorityContext(int i, HttpPriorityContext httpPriorityContext) {
        TigonRequestToken tigonRequestToken;
        C40w A00 = this.mRequestStates.A00(i);
        if (A00 == null || (tigonRequestToken = A00.A05) == null) {
            return;
        }
        tigonRequestToken.updateHttpPriorityContext(httpPriorityContext);
    }
}
