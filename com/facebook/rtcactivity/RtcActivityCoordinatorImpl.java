package com.facebook.rtcactivity;

import X.0fH;
import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Du;
import X.1G1;
import X.1Lo;
import X.7zL;
import X.AbH;
import X.AbL;
import X.AbR;
import X.AnonymousClass001;
import X.C00i;
import X.C0il;
import X.C3Oh;
import X.DKD;
import X.GOn;
import X.IgA;
import X.ItN;
import X.IyB;
import X.Qo0;
import X.SBr;
import X.SBs;
import X.SBt;
import X.SDd;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.jni.HybridData;
import com.facebook.rtcactivity.common.NativeActivityCoordinatorFactory;
import com.facebook.rtcactivity.common.NativeComponentFactory;
import com.facebook.rtcactivity.interfaces.DataSender;
import com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorCallback;
import com.facebook.rtcactivity.interfaces.RtcActivityCoordinatorLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: RtcActivityCoordinatorImpl.class */
public class RtcActivityCoordinatorImpl {
    public static final String TAG;
    public 1BY _UL_mInjectionContext;
    public List mActivityCoordinatorEventListeners;
    public final RtcActivityCoordinatorCallback mCallback;
    public final FbUserSession mFbUserSession;
    public final HybridData mHybridData;
    public final ConcurrentHashMap mInitiatedActivities;
    public volatile ImmutableMap mParticipants;
    public final HashSet mPendingRemoteActivityIds;
    public final ConcurrentHashMap mRemoteActivities;
    public final AbR mUiThreadCallbackProvider;
    public final String mUserId;
    public final RtcActivityCoordinatorLogger mLogger = (RtcActivityCoordinatorLogger) 1Bn.A0B(114902);
    public final C00i mMobileConfig = 1BQ.A00();
    public final C00i mUiThreadExecutor = AbH.A0F();

    static {
        C0il.A0B("rtcactivity");
        TAG = "RtcActivityCoordinatorImpl";
    }

    public RtcActivityCoordinatorImpl(1BO r302, RtcActivityCoordinatorCallback rtcActivityCoordinatorCallback, FbUserSession fbUserSession) {
        AbR abR = (AbR) 1Bn.A0B(751);
        this.mUiThreadCallbackProvider = abR;
        this._UL_mInjectionContext = 7zL.A0Q(r302);
        this.mFbUserSession = fbUserSession;
        this.mUserId = ((1G1) fbUserSession).A05;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            IgA igA = new IgA(rtcActivityCoordinatorCallback);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.mCallback = igA;
            this.mInitiatedActivities = new ConcurrentHashMap();
            this.mRemoteActivities = new ConcurrentHashMap();
            this.mPendingRemoteActivityIds = AnonymousClass001.A0v();
            this.mActivityCoordinatorEventListeners = AnonymousClass001.A0s();
            this.mHybridData = initHybrid();
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    private NativeComponentFactory getNativeCoordinatorFactory() {
        1Bn.A0E((Context) null, this._UL_mInjectionContext, 114973);
        DataSender dataSender = (DataSender) 1Lo.A04((Context) null, this.mFbUserSession, this._UL_mInjectionContext, 114904);
        String str = this.mUserId;
        RtcActivityCoordinatorCallback rtcActivityCoordinatorCallback = this.mCallback;
        RtcActivityCoordinatorLogger rtcActivityCoordinatorLogger = this.mLogger;
        this.mMobileConfig.get();
        return new NativeActivityCoordinatorFactory(str, rtcActivityCoordinatorCallback, dataSender, rtcActivityCoordinatorLogger);
    }

    private native HybridData initHybrid();

    private void runOnUiThread(Runnable runnable) {
        if (DKD.A10() == Thread.currentThread()) {
            runnable.run();
        } else {
            1BK.A1E(this.mUiThreadExecutor).execute(runnable);
        }
    }

    public void acceptStartRequest(RtcActivity rtcActivity, Map map) {
        runOnUiThread(new SDd(rtcActivity, this, map));
        runOnUiThread(new SBs(Qo0.A01, this));
    }

    public native void acceptStartRequestNative(RtcActivity rtcActivity, Map map);

    public native void declineStartRequestNative(String str, String str2);

    public native void finishActivityNative(String str);

    /* renamed from: lambda$acceptStartRequest$2$com-facebook-rtcactivity-RtcActivityCoordinatorImpl, reason: not valid java name */
    public /* synthetic */ void m9858xc1988954(RtcActivity rtcActivity) {
        finishActivityNative(rtcActivity.mActivityId);
        this.mRemoteActivities.remove(rtcActivity.mActivityId);
        0fH.A0g(rtcActivity.mActivityId, "RtcActivityCoordinatorImpl", "Removed remote activity %s");
        rtcActivity.mListener = null;
        runOnUiThread(new SBs(Qo0.A02, this));
    }

    /* renamed from: lambda$acceptStartRequest$3$com-facebook-rtcactivity-RtcActivityCoordinatorImpl, reason: not valid java name */
    public /* synthetic */ void m9859x4ed33ad5(RtcActivity rtcActivity) {
        runOnUiThread(new SBr(rtcActivity, this));
    }

    /* renamed from: lambda$requestStartActivity$0$com-facebook-rtcactivity-RtcActivityCoordinatorImpl, reason: not valid java name */
    public /* synthetic */ void m9860x6192b59f(RtcActivity rtcActivity) {
        finishActivityNative(rtcActivity.mActivityId);
        this.mInitiatedActivities.remove(rtcActivity.mActivityId);
        rtcActivity.mListener = null;
        runOnUiThread(new SBs(Qo0.A02, this));
        0fH.A0g(rtcActivity.mActivityId, "RtcActivityCoordinatorImpl", "Removed local activity %s");
    }

    /* renamed from: lambda$requestStartActivity$1$com-facebook-rtcactivity-RtcActivityCoordinatorImpl, reason: not valid java name */
    public /* synthetic */ void m9861xeecd6720(RtcActivity rtcActivity) {
        runOnUiThread(new SBt(rtcActivity, this));
    }

    public void onCallEnded() {
        runOnUiThread(new ItN(this));
    }

    public native void onRawDataReceived(byte[] bArr);

    public native void requestCancelActivityStartNative(String str, String str2);

    public native void requestStartActivityNative(RtcActivity rtcActivity, Iterable iterable, int i);

    public void updateParticipants(ImmutableList immutableList) {
        ImmutableMap.Builder A0c = 1BK.A0c();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            C3Oh c3Oh = GOn.A13(it).A03;
            A0c.put(c3Oh.A03, c3Oh);
        }
        ImmutableMap build = A0c.build();
        0fH.A0j("RtcActivityCoordinatorImpl", "updateActivityCallModel(...)");
        1Du it2 = build.values().iterator();
        while (it2.hasNext()) {
            C3Oh c3Oh2 = (C3Oh) it2.next();
            0fH.A0Y(c3Oh2.A03, c3Oh2.A00().toString(), Boolean.valueOf(c3Oh2.A08), Boolean.valueOf(c3Oh2.A06), "RtcActivityCoordinatorImpl", "id %s state %s video %b audio %b");
        }
        runOnUiThread(new IyB(this, build));
    }
}
