package com.facebook.bugreporter.core.debug;

import X.AnonymousClass001;
import java.util.List;

/* loaded from: BugReportUploadStatus.class */
public final class BugReportUploadStatus {
    public String reportId = null;
    public String creationTime = null;
    public String description = null;
    public String networkType = null;
    public boolean isSuccessfullyUploaded = false;
    public List failedUploadAttempts = AnonymousClass001.A0s();
    public long wallTimeOfLastUpdateOfStatus = 0;
}
