package com.facebook.tigon.nativeservice.authed;

import X.0fH;
import X.0tF;
import X.AnonymousClass001;
import X.C00j;
import X.C0il;
import X.C0k4;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.nativeservice.common.NativePlatformContextHolder;
import java.util.concurrent.Callable;

/* loaded from: NativeAuthedTigonServiceHolder.class */
public class NativeAuthedTigonServiceHolder extends TigonServiceHolder {
    public static final NativeAuthedTigonServiceHolder $redex_init_class = null;
    public final ViewerContext mViewerContext;

    static {
        C0il.A0B("fb");
        C0il.A0B("tigonnativeservice");
        C0il.A0B("tigonnativeauthedservice");
    }

    public NativeAuthedTigonServiceHolder(ViewerContext viewerContext, Callable callable, Callable callable2) {
        super(null);
        0tF r0 = 0tF.A0O;
        0tF r02 = r0;
        if (r02 != null) {
            r0.A03("InjectTigonServiceHolder", callable);
            r02 = r0;
            r02.A03("InjectNativePlatformContextHolder", callable2);
        }
        try {
            TigonServiceHolder tigonServiceHolder = (TigonServiceHolder) callable.call();
            C0k4.A00(tigonServiceHolder);
            NativePlatformContextHolder nativePlatformContextHolder = (NativePlatformContextHolder) callable2.call();
            C0k4.A00(nativePlatformContextHolder);
            this.mHybridData = tracedInitHybrid(tigonServiceHolder, nativePlatformContextHolder, viewerContext.mAuthToken);
            this.mViewerContext = viewerContext;
        } catch (Exception unused) {
            throw AnonymousClass001.A0U(r02);
        }
    }

    public NativeAuthedTigonServiceHolder(String str, Callable callable, Callable callable2) {
        super(null);
        0tF r0 = 0tF.A0O;
        0tF r02 = r0;
        if (r02 != null) {
            r0.A03("InjectTigonServiceHolder", callable);
            r02 = r0;
            r02.A03("InjectNativePlatformContextHolder", callable2);
        }
        try {
            TigonServiceHolder tigonServiceHolder = (TigonServiceHolder) callable.call();
            C0k4.A00(tigonServiceHolder);
            NativePlatformContextHolder nativePlatformContextHolder = (NativePlatformContextHolder) callable2.call();
            C0k4.A00(nativePlatformContextHolder);
            this.mHybridData = tracedInitHybrid(tigonServiceHolder, nativePlatformContextHolder, str);
            this.mViewerContext = null;
        } catch (Exception unused) {
            throw AnonymousClass001.A0U(r02);
        }
    }

    private native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, NativePlatformContextHolder nativePlatformContextHolder, String str);

    private HybridData tracedInitHybrid(TigonServiceHolder tigonServiceHolder, NativePlatformContextHolder nativePlatformContextHolder, String str) {
        C00j.A05("NativeAuthedTigonServiceHolder.tracedInitHybrid", 2145990962);
        try {
            HybridData initHybrid = initHybrid(tigonServiceHolder, nativePlatformContextHolder, str);
            C00j.A01(-1999938981);
            return initHybrid;
        } catch (Throwable th) {
            C00j.A01(-360614915);
            throw th;
        }
    }

    public void broadcastInvalidToken(String str, String str2) {
        0fH.A0n("NativeAuthedTigonServiceHolder", "Encountered invalid access token");
    }
}
