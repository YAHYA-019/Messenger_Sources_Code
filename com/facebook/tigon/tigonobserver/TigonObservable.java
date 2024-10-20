package com.facebook.tigon.tigonobserver;

import X.02W;
import X.05U;
import X.0fH;
import X.1BK;
import X.40K;
import X.40L;
import X.40O;
import X.40P;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C0il;
import X.C0jy;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonXplatService;
import java.util.concurrent.Executor;

/* loaded from: TigonObservable.class */
public class TigonObservable {
    public static final String TAG;
    public final 40L[] mDebugObservers;
    public final Executor mExecutor;
    public final HybridData mHybridData;
    public final 05U mObjectPool;
    public final 40K[] mObservers;

    static {
        C0il.A0B("tigonobserver");
        TAG = "TigonObservable";
    }

    public TigonObservable(TigonXplatService tigonXplatService, boolean z, boolean z2, Executor executor, 40K[] r306, 40L[] r307) {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        40P r0 = new 40P(this);
        if (awakeTimeSinceBootClock == null) {
            throw AnonymousClass001.A0L(AnonymousClass000.A00(40));
        }
        this.mObjectPool = new 05U(r0, awakeTimeSinceBootClock, 40O.class, 16, 1024, 16);
        02W.A03("Executor is required", executor);
        02W.A06(tigonXplatService.isObservable(), "Tigon stack is not Observable");
        this.mObservers = r306;
        this.mDebugObservers = r307;
        this.mExecutor = executor;
        this.mHybridData = initHybrid(tigonXplatService, false, z2);
    }

    private native HybridData initHybrid(TigonXplatService tigonXplatService, boolean z, boolean z2);

    private void onAdded(TigonObserverData tigonObserverData) {
        if (tigonObserverData.submittedRequest() == null) {
            0fH.A17("TigonObservable", "SubmittedRequest was null before Java onAdded for id %d", 1BK.A1Z(tigonObserverData.requestId()));
        }
        runExecutor(0, tigonObserverData);
    }

    private void onDownloadBody(TigonBodyObservation tigonBodyObservation) {
        runDebugExecutor(7, tigonBodyObservation);
    }

    private void onEOM(TigonObserverData tigonObserverData) {
        runExecutor(3, tigonObserverData);
    }

    private void onError(TigonObserverData tigonObserverData) {
        runExecutor(4, tigonObserverData);
    }

    private void onResponse(TigonObserverData tigonObserverData) {
        runExecutor(2, tigonObserverData);
    }

    private void onStarted(TigonObserverData tigonObserverData) {
        runExecutor(1, tigonObserverData);
    }

    private void onUploadBody(TigonBodyObservation tigonBodyObservation) {
        runDebugExecutor(6, tigonBodyObservation);
    }

    private void onWillRetry(TigonObserverData tigonObserverData) {
        runExecutor(5, tigonObserverData);
    }

    private void runDebugExecutor(int i, TigonBodyObservation tigonBodyObservation) {
        40O r0 = (40O) this.mObjectPool.A01();
        r0.A00 = i;
        r0.A01 = tigonBodyObservation;
        this.mExecutor.execute(C0jy.A02(r0, "TigonObservable_runDebugExecutor", ReqContextTypeResolver.resolveName("tigon_java")));
    }

    private void runExecutor(int i, TigonObserverData tigonObserverData) {
        40O r0 = (40O) this.mObjectPool.A01();
        r0.A00 = i;
        r0.A02 = tigonObserverData;
        if (tigonObserverData.submittedRequest() == null) {
            0fH.A17(r0.A03, "SubmittedRequest was null after initStep for id %d", 1BK.A1Z(tigonObserverData.requestId()));
        }
        this.mExecutor.execute(C0jy.A02(r0, "TigonObservable_runExecutor", ReqContextTypeResolver.resolveName("tigon_java")));
    }
}
