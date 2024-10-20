package com.facebook.common.dextricks;

import X.AnonymousClass001;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: InputDexIterator.class */
public abstract class InputDexIterator implements Iterator, Closeable {
    public int mDexPos = 0;
    public final DexManifest.Dex[] mDexes;
    public LightweightQuickPerformanceLogger mQplCollector;

    public InputDexIterator(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.mDexes = dexManifest.dexes;
        this.mQplCollector = lightweightQuickPerformanceLogger;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final int getIdx() {
        return this.mDexPos;
    }

    public final int getLength() {
        return this.mDexes.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass001.A1R(this.mDexPos, this.mDexes.length);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable, com.facebook.common.dextricks.InputDex] */
    @Override // java.util.Iterator
    public final InputDex next() {
        ?? nextImpl;
        try {
            DexManifest.Dex[] dexArr = this.mDexes;
            int i = this.mDexPos;
            this.mDexPos = i + 1;
            nextImpl = nextImpl(dexArr[i]);
            return nextImpl;
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(nextImpl);
        }
    }

    public abstract InputDex nextImpl(DexManifest.Dex dex);

    @Override // java.util.Iterator
    public final void remove() {
        throw AnonymousClass001.A0p();
    }
}
