package com.facebook.common.jit.jitoptions;

import X.0FI;
import X.0fH;
import X.AnonymousClass001;
import X.C0il;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FbJitOptions.class */
public class FbJitOptions {
    public static final boolean PLATFORM_IS_SUPPORTED;
    public final AtomicBoolean mFreed = new AtomicBoolean(false);
    public final long mPtr;

    static {
        boolean z;
        try {
            C0il.A0B("fbjitoptionsjni");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            0fH.A0r("FbJitOptions", "Error loading JitUtils", e);
            z = false;
        }
        PLATFORM_IS_SUPPORTED = z;
    }

    public FbJitOptions(long j) {
        this.mPtr = j;
    }

    public static FbJitOptions createFbJitOptions() {
        String str;
        if (PLATFORM_IS_SUPPORTED) {
            long nativeInit = nativeInit();
            if (nativeInit != 0) {
                return new FbJitOptions(nativeInit);
            }
            str = "Cannot create FbJitOptions since nativeInit returned null";
        } else {
            str = "Cannot create FbJitOptions since the current platform is not supported";
        }
        0fH.A0n("FbJitOptions", str);
        return null;
    }

    private boolean innerFree() {
        boolean andSet = this.mFreed.getAndSet(true);
        if (!andSet) {
            Log.d("FbJitOptions", "Freeing Fb Jit Options");
            nativeDestroy(this.mPtr);
        }
        return andSet;
    }

    public static native void nativeApplyAllowMultipleVerifications(long j, boolean z);

    public static native void nativeApplyAlwaysVerifyOnJitCompile(long j, boolean z);

    public static native void nativeApplyArenaAllocRetryFix(long j, boolean z);

    public static native void nativeApplyArenaMallocFallback(long j, boolean z);

    public static native void nativeApplyArenaRetryFastHook(long j, boolean z);

    public static native void nativeApplyBarrierFix(long j, boolean z);

    public static native void nativeApplyCallIntoJavaFromJitThreadFix(long j, boolean z);

    public static native void nativeApplyCustomJitPriorities(long j, boolean z);

    public static native void nativeApplyCustomQCCompilerFix(long j, boolean z);

    public static native void nativeApplyDisableProfilerThreadTimeoutCheck(long j, boolean z);

    public static native void nativeApplyDoNotStartProfilerWithJit(long j, boolean z);

    public static native void nativeApplyEnableThreadPoolPriority(long j, boolean z);

    public static native void nativeApplyFailOnSoftVerificationFailure(long j, boolean z);

    public static native void nativeApplyFlushInstructionCacheFix(long j, boolean z);

    public static native void nativeApplyGcJitFix(long j, boolean z);

    public static native void nativeApplyGenInvokeNoLineFix(long j, boolean z);

    public static native void nativeApplyLogGenInvokeNoInlineBug(long j, boolean z);

    public static native void nativeApplyMirMethodLoweringInfoResolveFix(long j, boolean z);

    public static native void nativeApplyMmapRaceFix(long j, boolean z);

    public static native void nativeApplyMobileConfigInlining(long j, boolean z);

    public static native void nativeApplyMprotectFix(long j, boolean z);

    public static native void nativeApplyMprotectJitCreationOverride(long j, boolean z);

    public static native void nativeApplyNotifyJitActivityFix(long j, boolean z);

    public static native void nativeApplyOverrideJitCompilerCompileMethod(long j, boolean z);

    public static native void nativeApplyOverrideProfilerThread(long j, boolean z);

    public static native void nativeApplyPerformMoveBugFix(long j, boolean z);

    public static native void nativeApplyProfileSaverProfilingThreadHooks(long j, boolean z);

    public static native void nativeApplyProfilerThreadTimeoutSeconds(long j, int i);

    public static native void nativeApplyThreadListRaceFix(long j, boolean z);

    public static native void nativeApplyThreadPoolPriority(long j, int i);

    public static native void nativeApplyThreadPoolThreadCount(long j, int i);

    public static native void nativeApplyUseRemapMprotectPtSafeTL(long j, boolean z);

    public static native void nativeDestroy(long j);

    public static native long nativeInit();

    public static native void nativeSetAppDir(long j, String str);

    public static native void nativeSetCodeCacheCapacity(long j, int i);

    public static native void nativeSetCodeCacheCapacityRatio(long j, double d);

    public static native void nativeSetCodeCacheInitialCapacity(long j, int i);

    public static native void nativeSetCodeCacheInitialCapacityRatio(long j, double d);

    public static native void nativeSetCodeCacheMaxCapacity(long j, int i);

    public static native void nativeSetCodeCacheMaxCapacityRatio(long j, double d);

    public static native void nativeSetCodePath(long j, String[] strArr);

    public static native void nativeSetCompileThreshold(long j, int i);

    public static native void nativeSetCompileThresholdRatio(long j, double d);

    public static native void nativeSetDumpInfoOnShutdown(long j, boolean z);

    public static native void nativeSetForeignDexPath(long j, String str);

    public static native void nativeSetHotStartupMethodSamples(long j, int i);

    public static native void nativeSetInvokeTransitionWeight(long j, int i);

    public static native void nativeSetInvokeTransitionWeightRatio(long j, double d);

    public static native void nativeSetMaxCodeCacheInitialCapacity(long j, int i);

    public static native void nativeSetMaxNotificationBeforeWake(long j, int i);

    public static native void nativeSetMinClassesToSave(long j, int i);

    public static native void nativeSetMinMethodsToSave(long j, int i);

    public static native void nativeSetMinNewClassesForCompilation(long j, int i);

    public static native void nativeSetMinNewMethodsForCompilation(long j, int i);

    public static native void nativeSetMinNotificationBeforeWake(long j, int i);

    public static native void nativeSetMinSavePeriodMs(long j, int i);

    public static native void nativeSetOldProfilerBackoffCoefficient(long j, float f);

    public static native void nativeSetOldProfilerDurationSec(long j, int i);

    public static native void nativeSetOldProfilerIntervalUS(long j, long j2);

    public static native void nativeSetOldProfilerPeriodSec(long j, int i);

    public static native void nativeSetOldProfilerStartImmediately(long j, boolean z);

    public static native void nativeSetOldProfilerTopKChangeThreshold(long j, float f);

    public static native void nativeSetOldProfilerTopKThreshold(long j, float f);

    public static native void nativeSetOsrThreshold(long j, int i);

    public static native void nativeSetOsrThresholdRatio(long j, double d);

    public static native void nativeSetPriorityThreadWeight(long j, int i);

    public static native void nativeSetPriorityThreadWeightRatio(long j, double d);

    public static native void nativeSetProfileBootClassPath(long j, boolean z);

    public static native void nativeSetProfilePath(long j, String str);

    public static native void nativeSetProfileSaverProfilingThreadIoPrioClass(long j, int i);

    public static native void nativeSetProfileSaverProfilingThreadIoPrioPriority(long j, int i);

    public static native void nativeSetProfilerOptionEnabled(long j, boolean z);

    public static native void nativeSetSaveProfilingInfo(long j, boolean z);

    public static native void nativeSetSaveResolvedClassesDelayMs(long j, int i);

    public static native void nativeSetUseJit(long j, boolean z);

    public static native void nativeSetWarmupThreshold(long j, int i);

    public static native void nativeSetWarmupThresholdRatio(long j, double d);

    private void verifiedNotCleaned() {
        if (this.mFreed.get()) {
            throw AnonymousClass001.A0N("FbJitOptions was already freed");
        }
    }

    public void finalize() {
        int A03 = 0FI.A03(-740738852);
        if (!innerFree()) {
            Log.e("FbJitOptions", "Fb Jit options needs to be freed explicitly. Doing fallback clean!");
        }
        0FI.A09(-1526263382, A03);
    }

    public void free() {
        if (innerFree()) {
            Log.w("FbJitOptions", "Fb Jit options was already freed");
        }
    }

    public long getPtr() {
        verifiedNotCleaned();
        return this.mPtr;
    }

    public void setAppDir(String str) {
        nativeSetAppDir(getPtr(), str);
    }

    public void setApplyAllowMultipleVerifications(boolean z) {
        nativeApplyAllowMultipleVerifications(getPtr(), z);
    }

    public void setApplyAlwaysVerifyOnJitCompile(boolean z) {
        nativeApplyAlwaysVerifyOnJitCompile(getPtr(), z);
    }

    public void setApplyArenaAllocRetryFix(boolean z) {
        nativeApplyArenaAllocRetryFix(getPtr(), true);
    }

    public void setApplyArenaMallocFallback(boolean z) {
        nativeApplyArenaMallocFallback(getPtr(), true);
    }

    public void setApplyArenaRetryFastHook(boolean z) {
        nativeApplyArenaRetryFastHook(getPtr(), true);
    }

    public void setApplyBarrierFix(boolean z) {
        nativeApplyBarrierFix(getPtr(), true);
    }

    public void setApplyCallIntoJavaFromJitThreadFix(boolean z) {
        nativeApplyCallIntoJavaFromJitThreadFix(getPtr(), true);
    }

    public void setApplyCustomJitPriorities(boolean z) {
        nativeApplyCustomJitPriorities(getPtr(), true);
    }

    public void setApplyCustomQCCompilerFix(boolean z) {
        nativeApplyCustomQCCompilerFix(getPtr(), true);
    }

    public void setApplyDisableProfilerThreadTimeoutCheck(boolean z) {
        nativeApplyDisableProfilerThreadTimeoutCheck(getPtr(), true);
    }

    public void setApplyDoNotStartProfilerWithJit(boolean z) {
        nativeApplyDoNotStartProfilerWithJit(getPtr(), true);
    }

    public void setApplyEnableThreadPoolPriority(boolean z) {
        nativeApplyEnableThreadPoolPriority(getPtr(), true);
    }

    public void setApplyFailOnSoftVerificationFailure(boolean z) {
        nativeApplyFailOnSoftVerificationFailure(getPtr(), z);
    }

    public void setApplyFlushInstructionCacheFix(boolean z) {
        nativeApplyFlushInstructionCacheFix(getPtr(), true);
    }

    public void setApplyGcJitFix(boolean z) {
        nativeApplyGcJitFix(getPtr(), true);
    }

    public void setApplyGenInvokeNoLineFix(boolean z) {
        nativeApplyGenInvokeNoLineFix(getPtr(), true);
    }

    public void setApplyLogGenInvokeNoInlineBug(boolean z) {
        nativeApplyLogGenInvokeNoInlineBug(getPtr(), true);
    }

    public void setApplyMirMethodLoweringInfoResolveFix(boolean z) {
        nativeApplyMirMethodLoweringInfoResolveFix(getPtr(), true);
    }

    public void setApplyMmapRaceFix(boolean z) {
        nativeApplyMmapRaceFix(getPtr(), true);
    }

    public void setApplyMobileConfigInlining(boolean z) {
        nativeApplyMobileConfigInlining(getPtr(), true);
    }

    public void setApplyMprotectFix(boolean z) {
        nativeApplyMprotectFix(getPtr(), true);
    }

    public void setApplyMprotectJitCreationOverride(boolean z) {
        nativeApplyMprotectJitCreationOverride(getPtr(), true);
    }

    public void setApplyNotifyJitActivityFix(boolean z) {
        nativeApplyNotifyJitActivityFix(getPtr(), true);
    }

    public void setApplyOverrideJitCompilerCompileMethod(boolean z) {
        nativeApplyOverrideJitCompilerCompileMethod(getPtr(), true);
    }

    public void setApplyOverrideProfilerThread(boolean z) {
        nativeApplyOverrideProfilerThread(getPtr(), true);
    }

    public void setApplyPerformMoveBugFix(boolean z) {
        nativeApplyPerformMoveBugFix(getPtr(), true);
    }

    public void setApplyProfileSaverProfilingThreadHooks(boolean z) {
        nativeApplyProfileSaverProfilingThreadHooks(getPtr(), true);
    }

    public void setApplyProfilerThreadTimeoutSeconds(int i) {
        nativeApplyProfilerThreadTimeoutSeconds(getPtr(), i);
    }

    public void setApplyThreadListRaceFix(boolean z) {
        nativeApplyThreadListRaceFix(getPtr(), true);
    }

    public void setApplyThreadPoolPriority(int i) {
        nativeApplyThreadPoolPriority(getPtr(), i);
    }

    public void setApplyThreadPoolThreadCount(int i) {
        nativeApplyThreadPoolThreadCount(getPtr(), i);
    }

    public void setApplyUseRemapMprotectPtSafeTL(boolean z) {
        nativeApplyUseRemapMprotectPtSafeTL(getPtr(), true);
    }

    public void setCodeCacheCapacity(int i) {
        nativeSetCodeCacheCapacity(getPtr(), i);
    }

    public void setCodeCacheCapacityRatio(double d) {
        nativeSetCodeCacheCapacityRatio(getPtr(), d);
    }

    public void setCodeCacheInitialCapacity(int i) {
        nativeSetCodeCacheInitialCapacity(getPtr(), i);
    }

    public void setCodeCacheInitialCapacityRatio(double d) {
        nativeSetCodeCacheInitialCapacityRatio(getPtr(), d);
    }

    public void setCodeCacheMaxCapacity(int i) {
        nativeSetCodeCacheMaxCapacity(getPtr(), i);
    }

    public void setCodeCacheMaxCapacityRatio(double d) {
        nativeSetCodeCacheMaxCapacityRatio(getPtr(), d);
    }

    public void setCodePath(String[] strArr) {
        nativeSetCodePath(getPtr(), strArr);
    }

    public void setCompileThreshold(int i) {
        nativeSetCompileThreshold(getPtr(), i);
    }

    public void setCompileThresholdRatio(double d) {
        nativeSetCompileThresholdRatio(getPtr(), d);
    }

    public void setDumpInfoOnShutdown(boolean z) {
        nativeSetDumpInfoOnShutdown(getPtr(), z);
    }

    public void setInvokeTransitionWeight(int i) {
        nativeSetInvokeTransitionWeight(getPtr(), i);
    }

    public void setInvokeTransitionWeightRatio(double d) {
        nativeSetInvokeTransitionWeightRatio(getPtr(), d);
    }

    public void setMaxCodeCacheInitialCapacity(int i) {
        nativeSetMaxCodeCacheInitialCapacity(getPtr(), i);
    }

    public void setMaxNotificationBeforeWake(int i) {
        nativeSetMaxNotificationBeforeWake(getPtr(), i);
    }

    public void setMinClassesToSave(int i) {
        nativeSetMinClassesToSave(getPtr(), i);
    }

    public void setMinMethodsToSave(int i) {
        nativeSetMinMethodsToSave(getPtr(), i);
    }

    public void setMinNewClassesForCompilation(int i) {
        nativeSetMinNewClassesForCompilation(getPtr(), i);
    }

    public void setMinNewMethodsForCompilation(int i) {
        nativeSetMinNewMethodsForCompilation(getPtr(), i);
    }

    public void setMinNotificationBeforeWake(int i) {
        nativeSetMinNotificationBeforeWake(getPtr(), i);
    }

    public void setMinSavePeriodMs(int i) {
        nativeSetMinSavePeriodMs(getPtr(), i);
    }

    public void setOldProfilerBackoffCoefficient(float f) {
        nativeSetOldProfilerBackoffCoefficient(getPtr(), f);
    }

    public void setOldProfilerDurationSec(int i) {
        nativeSetOldProfilerDurationSec(getPtr(), i);
    }

    public void setOldProfilerIntervalUS(long j) {
        nativeSetOldProfilerIntervalUS(getPtr(), j);
    }

    public void setOldProfilerPeriodSec(int i) {
        nativeSetOldProfilerPeriodSec(getPtr(), i);
    }

    public void setOldProfilerStartImmediately(boolean z) {
        nativeSetOldProfilerStartImmediately(getPtr(), z);
    }

    public void setOldProfilerTopKChangeThreshold(float f) {
        nativeSetOldProfilerTopKChangeThreshold(getPtr(), f);
    }

    public void setOldProfilerTopKThreshold(float f) {
        nativeSetOldProfilerTopKThreshold(getPtr(), f);
    }

    public void setOsrThreshold(int i) {
        nativeSetOsrThreshold(getPtr(), i);
    }

    public void setOsrThresholdRatio(double d) {
        nativeSetOsrThresholdRatio(getPtr(), d);
    }

    public void setPriorityThreadWeight(int i) {
        nativeSetPriorityThreadWeight(getPtr(), i);
    }

    public void setPriorityThreadWeightRatio(double d) {
        nativeSetPriorityThreadWeightRatio(getPtr(), d);
    }

    public void setProfileBootClassPath(boolean z) {
        nativeSetProfileBootClassPath(getPtr(), z);
    }

    public void setProfilePath(String str) {
        nativeSetProfilePath(getPtr(), str);
    }

    public void setProfileSaverProfilingThreadIoPrioClass(int i) {
        nativeSetProfileSaverProfilingThreadIoPrioClass(getPtr(), i);
    }

    public void setProfileSaverProfilingThreadIoPrioPriority(int i) {
        nativeSetProfileSaverProfilingThreadIoPrioPriority(getPtr(), i);
    }

    public void setProfilerOptionEnabled(boolean z) {
        nativeSetProfilerOptionEnabled(getPtr(), z);
    }

    public void setSaveProfilingInfo(boolean z) {
        nativeSetSaveProfilingInfo(getPtr(), z);
    }

    public void setSaveResolvedClassesDelayMs(int i) {
        nativeSetSaveResolvedClassesDelayMs(getPtr(), i);
    }

    public void setUseJit(boolean z) {
        nativeSetUseJit(getPtr(), z);
    }

    public void setWarmupThreshold(int i) {
        nativeSetWarmupThreshold(getPtr(), i);
    }

    public void setWarmupThresholdRatio(double d) {
        nativeSetWarmupThresholdRatio(getPtr(), d);
    }
}
