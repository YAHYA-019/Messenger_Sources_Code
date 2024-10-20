package com.facebook.cameracore.ardelivery.xplatcache.stash;

import X.AnonymousClass001;
import X.C0il;
import X.DKD;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCacheEntry;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileInMemoryStatus;
import com.facebook.jni.HybridData;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Map;
import java.util.Set;

/* loaded from: StashARDFileCache.class */
public class StashARDFileCache extends ARDFileCache {
    public static final StashARDFileCache $redex_init_class = null;
    public final FileStash mStash;

    static {
        C0il.A0B("ardcache-stash");
    }

    public StashARDFileCache(long j, FileStash fileStash) {
        this.mStash = fileStash;
        this.mHybridData = initHybrid(j, fileStash);
    }

    public static native HybridData initHybrid(long j, FileStash fileStash);

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public void clear() {
        this.mStash.removeAll();
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public void commit(String str) {
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public void flush() {
        throw AnonymousClass001.A0q("flush() is not supported in Stash");
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public Set getAllKeys() {
        if (Thread.currentThread() != DKD.A10()) {
            return this.mStash.getAllKeys();
        }
        throw AnonymousClass001.A0N("StashARDFileCache.getAllKeys() shouldn't be called on the main thread.");
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public Map.Entry[] getAllMetas() {
        throw AnonymousClass001.A0q("getAllMetas() is not supported in Stash");
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public ARDFileCacheEntry getCacheEntry(String str) {
        File file = this.mStash.getFile(str);
        if (file != null) {
            return new ARDFileCacheEntry(file.getAbsolutePath());
        }
        return null;
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public ARDFileCacheEntry getCacheEntryWithoutPromotion(String str) {
        if (this.mStash.hasKey(str)) {
            return new ARDFileCacheEntry(this.mStash.getFilePath(str).getAbsolutePath());
        }
        return null;
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public long getSize() {
        return this.mStash.getSizeBytes();
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public ARDFileCacheEntry insertAndLock(String str) {
        return new ARDFileCacheEntry(this.mStash.insertFile(str).getAbsolutePath());
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public ARDFileInMemoryStatus memContains(String str) {
        return this.mStash.hasKey(str) ? ARDFileInMemoryStatus.IN_CACHE : ARDFileInMemoryStatus.NOT_IN_CACHE;
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public boolean remove(String str) {
        return this.mStash.remove(str);
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public void unlock(String str) {
    }

    @Override // com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache
    public boolean updateExtra(String str, byte[] bArr) {
        throw AnonymousClass001.A0q("updateExtra() is not supported in Stash");
    }
}
