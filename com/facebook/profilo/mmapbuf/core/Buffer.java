package com.facebook.profilo.mmapbuf.core;

import X.0H3;
import X.0Pz;
import X.C0il;
import android.util.Log;
import com.facebook.jni.HybridData;
import java.io.File;
import java.util.UUID;

/* loaded from: Buffer.class */
public class Buffer {
    public final HybridData mHybridData;

    static {
        C0il.A0B("profilo_mmapbuf");
    }

    public Buffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeUpdateId(String str);

    public String generateLocalSymbolsFilePath() {
        String localSymbolsFilePath;
        synchronized (this) {
            boolean z = false;
            if (getFilePath() != null) {
                z = true;
            }
            if (z) {
                localSymbolsFilePath = getLocalSymbolsFilePath();
                if (localSymbolsFilePath == null) {
                    localSymbolsFilePath = new 0H3(new File(getFilePath()).getParentFile()).A01(0Pz.A0W(0H3.A00(UUID.randomUUID().toString()), ".sym"));
                    if (localSymbolsFilePath != null) {
                        updateLocalSymbolsFilePath(localSymbolsFilePath);
                    }
                }
            } else {
                localSymbolsFilePath = null;
            }
        }
        return localSymbolsFilePath;
    }

    public String generateMemoryMappingFilePath() {
        String memoryMappingFilePath;
        synchronized (this) {
            boolean z = false;
            if (getFilePath() != null) {
                z = true;
            }
            if (z) {
                memoryMappingFilePath = getMemoryMappingFilePath();
                if (memoryMappingFilePath == null) {
                    memoryMappingFilePath = new 0H3(new File(getFilePath()).getParentFile()).A01(0Pz.A0W(0H3.A00(UUID.randomUUID().toString()), ".maps"));
                    if (memoryMappingFilePath != null) {
                        updateMemoryMappingFilePath(memoryMappingFilePath);
                    }
                }
            } else {
                memoryMappingFilePath = null;
            }
        }
        return memoryMappingFilePath;
    }

    public native synchronized String getFilePath();

    public native synchronized String getLocalSymbolsFilePath();

    public native synchronized String getMemoryMappingFilePath();

    public native synchronized boolean isForeground();

    public native synchronized void setForegroundState(boolean z);

    public native synchronized void updateFilePath(String str);

    public native synchronized void updateHeader(int i, long j, long j2, long j3);

    public void updateId(String str, String str2) {
        synchronized (this) {
            if (getFilePath() != null) {
                String A01 = new 0H3(new File(getFilePath()).getParentFile()).A01(0Pz.A0W(0H3.A00(str == null ? str2 : 0Pz.A0j(str, "_", str2)), ".buff"));
                if (A01 != null) {
                    try {
                        nativeUpdateId(str2);
                        updateFilePath(A01);
                    } catch (Exception e) {
                        Log.e("Prflo/Buffer", "Id update failed", e);
                    }
                }
            }
        }
    }

    public native synchronized void updateLocalSymbolsFilePath(String str);

    public native synchronized void updateMemoryMappingFilePath(String str);
}
