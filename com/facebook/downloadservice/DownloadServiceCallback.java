package com.facebook.downloadservice;

import com.facebook.tigon.TigonError;

/* loaded from: DownloadServiceCallback.class */
public interface DownloadServiceCallback {
    void onError(TigonError tigonError, DownloadServiceSummary downloadServiceSummary);

    void onFinished(DownloadServiceFile downloadServiceFile, DownloadServiceSummary downloadServiceSummary);

    void onProgress(long j, long j2);
}
