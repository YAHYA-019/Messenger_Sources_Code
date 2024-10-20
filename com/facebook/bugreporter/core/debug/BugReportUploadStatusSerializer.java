package com.facebook.bugreporter.core.debug;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: BugReportUploadStatusSerializer.class */
public class BugReportUploadStatusSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), BugReportUploadStatus.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        BugReportUploadStatus bugReportUploadStatus = (BugReportUploadStatus) obj;
        if (bugReportUploadStatus == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "reportId", bugReportUploadStatus.reportId);
        AbstractC11224vw.A0D(r302, "creationTime", bugReportUploadStatus.creationTime);
        AbstractC11224vw.A0D(r302, "description", bugReportUploadStatus.description);
        AbstractC11224vw.A0D(r302, "networkType", bugReportUploadStatus.networkType);
        boolean z = bugReportUploadStatus.isSuccessfullyUploaded;
        r302.A0o("isSuccessfullyUploaded");
        r302.A0v(z);
        AbstractC11224vw.A06(r302, c26c, "failedUploadAttempts", bugReportUploadStatus.failedUploadAttempts);
        long j = bugReportUploadStatus.wallTimeOfLastUpdateOfStatus;
        r302.A0o("wallTimeOfLastUpdateOfStatus");
        r302.A0g(j);
        r302.A0Y();
    }
}
