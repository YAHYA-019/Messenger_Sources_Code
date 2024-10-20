package com.facebook.acra.anr;

/* loaded from: ANRReportProvider.class */
public interface ANRReportProvider {
    void reportSoftError(String str, Throwable th);

    boolean shouldCollectAndUploadANRReports();
}
