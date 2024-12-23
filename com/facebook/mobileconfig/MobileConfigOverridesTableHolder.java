package com.facebook.mobileconfig;

import X.C00o;
import X.C0gh;
import com.facebook.jni.HybridData;

/* loaded from: MobileConfigOverridesTableHolder.class */
public class MobileConfigOverridesTableHolder implements C00o {
    public final HybridData mHybridData;

    static {
        C0gh.A03("mobileconfig-jni");
    }

    public MobileConfigOverridesTableHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.C00o
    public native boolean boolOverrideForParam(long j, boolean z);

    @Override // X.C00o
    public native double doubleOverrideForParam(long j, double d);

    @Override // X.C00o
    public native String experimentOverrideForUniverse(String str);

    @Override // X.C00o
    public native String groupOverrideForUniverse(String str);

    @Override // X.C00o
    public native boolean hasBoolOverrideForParam(long j);

    @Override // X.C00o
    public native boolean hasDoubleOverrideForParam(long j);

    @Override // X.C00o
    public native boolean hasIntOverrideForParam(long j);

    public native boolean hasNullOverrideForParam(long j);

    @Override // X.C00o
    public native boolean hasOverrideForUniverse(String str);

    @Override // X.C00o
    public native boolean hasOverridesFile();

    @Override // X.C00o
    public native boolean hasStringOverrideForParam(long j);

    @Override // X.C00o
    public native long intOverrideForParam(long j, long j2);

    @Override // X.C00o
    public native void removeAllOverrides();

    @Override // X.C00o
    public native void removeOverrideForParam(long j);

    @Override // X.C00o
    public native void removeOverridesForQEUniverse(String str);

    public native void setOverridesFileUpdatedCallback(MobileConfigUpdateOverridesTableCallback mobileConfigUpdateOverridesTableCallback);

    @Override // X.C00o
    public native String stringOverrideForParam(long j, String str);

    public native void updateOverrideForBool(long j, boolean z);

    public native void updateOverrideForDouble(long j, double d);

    public native void updateOverrideForInt(long j, long j2);

    @Override // X.C00o
    public void updateOverrideForParam(long j, double d) {
        updateOverrideForDouble(j, d);
    }

    @Override // X.C00o
    public void updateOverrideForParam(long j, long j2) {
        updateOverrideForInt(j, j2);
    }

    @Override // X.C00o
    public void updateOverrideForParam(long j, String str) {
        updateOverrideForString(j, str);
    }

    @Override // X.C00o
    public void updateOverrideForParam(long j, boolean z) {
        updateOverrideForBool(j, z);
    }

    @Override // X.C00o
    public native void updateOverrideForQE(String str, String str2, String str3);

    public native void updateOverrideForString(long j, String str);
}
