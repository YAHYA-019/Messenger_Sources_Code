package com.facebook.profilo.mmapbuf.core;

import X.0H3;
import X.0Pz;
import X.C0il;
import com.facebook.jni.HybridData;
import java.io.File;
import java.util.UUID;

/* loaded from: MmapBufferManager.class */
public class MmapBufferManager {
    public static final MmapBufferManager $redex_init_class = null;
    public final 0H3 mFileHelper;
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("profilo_mmapbuf");
    }

    public MmapBufferManager(File file) {
        this.mFileHelper = new 0H3(file);
    }

    public static native HybridData initHybrid();

    private native Buffer nativeAllocateBuffer(int i);

    private native Buffer nativeAllocateBuffer(int i, String str);

    private native boolean nativeDeallocateBuffer(Buffer buffer);

    public Buffer allocateBuffer(int i, boolean z) {
        if (!z) {
            return nativeAllocateBuffer(i);
        }
        String A01 = this.mFileHelper.A01(0Pz.A0W(0H3.A00(UUID.randomUUID().toString()), ".buff"));
        if (A01 == null) {
            return null;
        }
        return nativeAllocateBuffer(i, A01);
    }

    public boolean deallocateBuffer(Buffer buffer) {
        boolean nativeDeallocateBuffer;
        synchronized (this) {
            nativeDeallocateBuffer = nativeDeallocateBuffer(buffer);
        }
        return nativeDeallocateBuffer;
    }
}
