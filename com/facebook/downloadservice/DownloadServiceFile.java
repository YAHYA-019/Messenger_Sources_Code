package com.facebook.downloadservice;

/* loaded from: DownloadServiceFile.class */
public interface DownloadServiceFile {
    String getFilePath();

    void release();

    void unlink();
}
