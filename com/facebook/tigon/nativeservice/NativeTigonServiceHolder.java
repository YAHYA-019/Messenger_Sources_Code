package com.facebook.tigon.nativeservice;

import X.1Bi;
import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.nativeservice.common.NativePlatformContextHolder;

/* loaded from: NativeTigonServiceHolder.class */
public class NativeTigonServiceHolder extends TigonServiceHolder {
    static {
        C0il.A0B("fb");
        C0il.A0B("tigonnativeservice");
    }

    public NativeTigonServiceHolder() {
        super(null);
        this.mHybridData = initHybrid((TigonServiceHolder) 1Bi.A03(115143), (NativePlatformContextHolder) 1Bi.A03(66762));
    }

    private native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, NativePlatformContextHolder nativePlatformContextHolder);
}
