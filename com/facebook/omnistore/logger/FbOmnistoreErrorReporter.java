package com.facebook.omnistore.logger;

import X.11T;
import X.1Bq;
import X.1Br;
import X.C01s;
import X.C06w;
import X.C06z;
import com.facebook.omnistore.OmnistoreErrorReporter;

/* loaded from: FbOmnistoreErrorReporter.class */
public final class FbOmnistoreErrorReporter implements OmnistoreErrorReporter {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(FbOmnistoreErrorReporter.class, "fbErrorReporter", "getFbErrorReporter()Lcom/facebook/common/errorreporting/FbErrorReporter;", 0)};
    public final 1Br fbErrorReporter$delegate = 1Bq.A00(16511);

    private final C01s getFbErrorReporter() {
        return 1Br.A04(this.fbErrorReporter$delegate);
    }

    @Override // com.facebook.omnistore.OmnistoreErrorReporter
    public void reportError(String str, String str2, Throwable th) {
        11T.A0H(str, str2);
        11T.A0F(th, 2);
        1Br.A04(this.fbErrorReporter$delegate).softReport(str, str2, th);
    }
}
