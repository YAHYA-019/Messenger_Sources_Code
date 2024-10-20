package X;

import com.facebook.acra.anr.ANRReportProvider;
import java.util.HashMap;

/* renamed from: X.04p, reason: invalid class name */
/* loaded from: 04p.class */
public final class C04p implements ANRReportProvider {
    public final /* synthetic */ 04V A00;

    public C04p(04V r302) {
        this.A00 = r302;
    }

    @Override // com.facebook.acra.anr.ANRReportProvider
    public void reportSoftError(String str, Throwable th) {
        HashMap A0u = AnonymousClass001.A0u();
        C0iy.A01("anr_error_msg", str, A0u).Bwu("ANRReportProvider", th, A0u);
    }

    @Override // com.facebook.acra.anr.ANRReportProvider
    public boolean shouldCollectAndUploadANRReports() {
        return this.A00.A07;
    }
}
