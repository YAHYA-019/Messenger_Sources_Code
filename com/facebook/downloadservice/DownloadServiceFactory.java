package com.facebook.downloadservice;

import X.0BR;
import X.0BS;
import X.0fH;
import X.1BK;
import X.5Ju;
import X.C00i;
import X.C0il;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: DownloadServiceFactory.class */
public class DownloadServiceFactory {
    public static final String CASK_FEATURE_NAME = "downloadservice_cache";
    public DownloadService lastDownloadService;
    public String lastPath;
    public final 5Ju mCask;
    public final AndroidAsyncExecutorFactory mDefaultExecutorFactory;
    public final C00i mFbErrorReporter;
    public final HybridData mHybridData = initHybrid();
    public boolean mRetryOnTimeout;
    public final TigonServiceHolder mTigonServiceHolder;
    public long mTransientErrorRetryLimit;

    static {
        C0il.A0B("downloadservice-jni");
    }

    public DownloadServiceFactory(TigonServiceHolder tigonServiceHolder, 5Ju r303, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, C00i c00i, long j, boolean z) {
        this.mTigonServiceHolder = tigonServiceHolder;
        this.mCask = r303;
        this.mFbErrorReporter = c00i;
        this.mTransientErrorRetryLimit = j;
        this.mRetryOnTimeout = z;
        this.mDefaultExecutorFactory = androidAsyncExecutorFactory;
    }

    private native HybridData initHybrid();

    private native DownloadService newDownloadService(TigonServiceHolder tigonServiceHolder, String str, int i, boolean z, AndroidAsyncExecutorFactory androidAsyncExecutorFactory);

    public void initDownloadService() {
        try {
            provideDownloadService();
        } catch (RuntimeException e) {
            0fH.A0w("download_service", "failed to init download service", e);
        }
    }

    public DownloadService provideDownloadService() {
        String absolutePath = this.mCask.AUU(260613155).getAbsolutePath();
        DownloadService downloadService = this.lastDownloadService;
        if (downloadService == null || !absolutePath.equals(this.lastPath)) {
            try {
                downloadService = newDownloadService(this.mTigonServiceHolder, absolutePath, (int) this.mTransientErrorRetryLimit, this.mRetryOnTimeout, this.mDefaultExecutorFactory);
                this.lastDownloadService = downloadService;
                this.lastPath = absolutePath;
            } catch (Exception e) {
                0BS A01 = 0BR.A01("download_service", e.getLocalizedMessage());
                A01.A04 = e;
                A01.A05 = false;
                A01.A00 = 1;
                1BK.A09(this.mFbErrorReporter).D0u(new 0BR(A01));
                throw e;
            }
        }
        return downloadService;
    }

    public void setTransientErrorRetryLimit(long j) {
        this.mTransientErrorRetryLimit = j;
    }
}
