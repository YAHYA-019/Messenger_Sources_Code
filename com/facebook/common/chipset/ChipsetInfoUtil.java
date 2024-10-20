package com.facebook.common.chipset;

import X.AnonymousClass001;
import X.C0il;
import com.facebook.jni.HybridData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ChipsetInfoUtil.class */
public final class ChipsetInfoUtil {
    public static final ChipsetInfoUtil THE_ONE;
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("chipset");
        THE_ONE = new ChipsetInfoUtil();
    }

    public static native HybridData initHybrid();

    private native String[] nativeGetCpuinfoInfo();

    private native String[] nativeGetIsaInfo();

    private native String[] nativeGetOpenCLInfo();

    private native String[] nativeGetOpenGLInfo();

    private native String[] nativeGetVulkanInfo();

    public Map getCpuinfoInfo() {
        String[] nativeGetCpuinfoInfo = nativeGetCpuinfoInfo();
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= nativeGetCpuinfoInfo.length) {
                return A0u;
            }
            A0u.put(nativeGetCpuinfoInfo[i2], nativeGetCpuinfoInfo[i2 + 1]);
            i = i2 + 2;
        }
    }

    public Map getIsaInfo() {
        String[] nativeGetIsaInfo = nativeGetIsaInfo();
        HashMap A0u = AnonymousClass001.A0u();
        if (nativeGetIsaInfo != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= nativeGetIsaInfo.length) {
                    break;
                }
                A0u.put(nativeGetIsaInfo[i2], nativeGetIsaInfo[i2 + 1]);
                i = i2 + 2;
            }
        }
        return A0u;
    }

    public Map getOpenCLInfo() {
        String[] nativeGetOpenCLInfo = nativeGetOpenCLInfo();
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= nativeGetOpenCLInfo.length) {
                return A0u;
            }
            A0u.put(nativeGetOpenCLInfo[i2], nativeGetOpenCLInfo[i2 + 1]);
            i = i2 + 2;
        }
    }

    public Map getOpenGLInfo() {
        String[] nativeGetOpenGLInfo = nativeGetOpenGLInfo();
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= nativeGetOpenGLInfo.length) {
                return A0u;
            }
            A0u.put(nativeGetOpenGLInfo[i2], nativeGetOpenGLInfo[i2 + 1]);
            i = i2 + 2;
        }
    }

    public Map getVulkanInfo() {
        String[] nativeGetVulkanInfo = nativeGetVulkanInfo();
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= nativeGetVulkanInfo.length) {
                return A0u;
            }
            A0u.put(nativeGetVulkanInfo[i2], nativeGetVulkanInfo[i2 + 1]);
            i = i2 + 2;
        }
    }
}
