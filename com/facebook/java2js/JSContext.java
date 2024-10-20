package com.facebook.java2js;

import X.02W;
import X.0FI;
import X.7kF;
import X.7zL;
import X.AnonymousClass001;
import X.C0il;
import X.GCi;
import X.Qx7;
import X.QxK;
import X.RIV;
import android.content.res.AssetManager;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.jni.HybridClassBase;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Stack;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: JSContext.class */
public class JSContext extends HybridClassBase {
    public static final JSContext $redex_init_class = null;
    public JSExecutionScope mCurrentLocalScope;
    public WeakReference mGlobalObject = 7zL.A14((Object) null);
    public final JSExecutionScope mGlobalScope;
    public volatile boolean mMainThreadHoldingLock;
    public long mNativeCtx;
    public volatile long mNextBackgroundLockTime;

    static {
        if (Qx7.A00) {
            return;
        }
        Qx7.A00 = true;
        C0il.A0B("java2js");
    }

    public JSContext(String str, String str2, String str3, String str4, ScheduledExecutorService scheduledExecutorService, String str5, boolean z, boolean z2, int i, int i2, long j, GCi gCi) {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.mNextBackgroundLockTime = SystemClock.uptimeMillis();
        this.mMainThreadHoldingLock = false;
        initHybrid("Global", str2, str3, "NT:State", null, false, 33554432, 67108864);
        JSMemoryArena jSMemoryArena = new JSMemoryArena(JSMemoryArena.sGlobalArenaCounter.getAndDecrement());
        JSMemoryArena.sArenas.put(Integer.valueOf(jSMemoryArena.mArenaId), jSMemoryArena);
        this.mGlobalScope = new JSExecutionScope(this, jSMemoryArena);
    }

    private native JSValue callModuleMethodNative(String str, String str2, JSValue[] jSValueArr);

    private native void evaluateSourceCodeNative(AssetManager assetManager, String str);

    private native void evaluateSourceCodeNative(File file);

    private native void evaluateSourceCodeNative(File file, String str);

    private native void evaluateSourceCodeNative(byte[] bArr, String str);

    private native long getGlobalObjectNative();

    private native void initHybrid(String str, String str2, String str3, String str4, ScheduledExecutorService scheduledExecutorService, boolean z, int i, int i2);

    private native long jsiRuntime();

    private native void lock();

    private native void registerSegmentNative(int i, String str);

    private native void setScopeNative(JSExecutionScope jSExecutionScope);

    private native void unlock();

    public void evaluateSourceCode(byte[] bArr, String str) {
        JSExecutionScope jSExecutionScope = this.mGlobalScope;
        jSExecutionScope.enter();
        try {
            evaluateSourceCodeNative(bArr, "NTStateUtil");
            jSExecutionScope.close();
        } catch (Throwable th) {
            try {
                jSExecutionScope.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public void finalize() {
        0FI.A09(-1066917983, 0FI.A03(-646510810));
    }

    public final LocalJSRef getGlobalObject(JSExecutionScope jSExecutionScope) {
        boolean z = true;
        02W.A06(AnonymousClass001.A1W(jSExecutionScope.jsContext, this), "scope is not associated with this context");
        Stack stack = (Stack) JSExecutionScope.sThreadScopes.get();
        02W.A05(!stack.empty());
        if (jSExecutionScope != ((RIV) stack.peek()).A01) {
            z = false;
        }
        02W.A06(z, "scope is not the current scope");
        return new LocalJSRef(getGlobalObjectNative());
    }

    public native int localReferences();

    public void lockWrapper() {
        lock();
    }

    public void setScope(JSExecutionScope jSExecutionScope) {
        QxK.A01++;
        if (jSExecutionScope != this.mCurrentLocalScope) {
            this.mCurrentLocalScope = jSExecutionScope;
            setScopeNative(jSExecutionScope);
        }
    }

    public native void shrinkLocalReferencesTable(int i);

    public void unlockWrapper() {
        unlock();
    }
}
