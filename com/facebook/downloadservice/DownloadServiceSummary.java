package com.facebook.downloadservice;

/* loaded from: DownloadServiceSummary.class */
public interface DownloadServiceSummary {
    long getAssetManagerCount();

    long getContentLength();

    long getDownloadCount();

    long getDurationMillis();

    long getFileLength();

    long getFileSystemAvailable();

    long getFileSystemCapacity();

    long getFileSystemFree();

    long getLastDownloadedLength();

    int getLastHttpStatusCode();

    long getNumAttempts();

    boolean getResumable();

    long getResumeCount();
}
