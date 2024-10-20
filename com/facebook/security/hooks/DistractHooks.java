package com.facebook.security.hooks;

import X.0fH;
import X.11T;
import X.5KE;
import X.C0il;
import X.DLf;
import com.facebook.jni.HybridData;

/* loaded from: DistractHooks.class */
public final class DistractHooks {
    public static final 5KE Companion = new Object();
    public static final String TAG = "SecurityDistractHooks";
    public final String blocklist;
    public final DLf hookProduct;
    public volatile boolean installed;
    public HybridData mHybridData;

    public DistractHooks(DLf dLf, String str) {
        11T.A0F(dLf, 1);
        11T.A0F(str, 2);
        this.hookProduct = dLf;
        this.blocklist = str;
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, String str);

    private final native boolean initLibraryLoadersHook_Android_dlopen_ext();

    private final native boolean initLibraryLoadersHook_Dlopen();

    private final void initLibraryLoadersHooksInternal(boolean z, boolean z2) {
        if (z && initLibraryLoadersHook_Dlopen()) {
            0fH.A0l(TAG, "initLibraryLoadersHook_Dlopen success");
        }
        if (z2 && initLibraryLoadersHook_Android_dlopen_ext()) {
            0fH.A0l(TAG, "initLibraryLoadersHook_Android_dlopen_ext success");
        }
    }

    private final void initMemoryAllocatorsHooksInternal(boolean z, boolean z2) {
        if (z && initMemoryAllocatorsHooks_GetNewHandler()) {
            0fH.A0l(TAG, "initMemoryAllocatorsHooks_GetNewHandler success");
        }
        if (z2 && initMemoryAllocatorsHooks_SetNewHandler()) {
            0fH.A0l(TAG, "initMemoryAllocatorsHooks_SetNewHandler success");
        }
    }

    private final native boolean initMemoryAllocatorsHooks_GetNewHandler();

    private final native boolean initMemoryAllocatorsHooks_SetNewHandler();

    public final boolean InstallHooks(boolean z, boolean z2, boolean z3, boolean z4) {
        0fH.A0l(TAG, "init_security_distract_hooks");
        if (!z && !z2 && !z3 && !z4) {
            0fH.A0l(TAG, "No hooks to install");
            return false;
        }
        if (!this.installed) {
            synchronized (DistractHooks.class) {
                if (!this.installed) {
                    C0il.A0B("securityhooks-jni");
                    int i = this.hookProduct.value;
                    String str = this.blocklist;
                    if (str == null || str.length() == 0) {
                        str = "";
                    }
                    this.mHybridData = initHybrid(i, str);
                    this.installed = true;
                    initLibraryLoadersHooksInternal(z, z2);
                    initMemoryAllocatorsHooksInternal(z3, z4);
                }
            }
        }
        return this.installed;
    }
}
