package com.facebook.messaging.montage.omnistore.storedprocedures;

import X.0fH;
import X.1BQ;
import X.1Bn;
import X.C00i;
import X.C01233qc;
import X.C15h;
import X.C3rQ;
import X.C4Xh;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.omnistore.module.OmnistoreStoredProcedureComponent;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: MontageNonUserRefreshStoredProcedureComponent.class */
public final class MontageNonUserRefreshStoredProcedureComponent implements OmnistoreStoredProcedureComponent {
    public static final Charset A0A = Charset.forName("UTF-8");
    public C3rQ A00;
    public Long A01;
    public final C00i A05 = new 1BQ(32777);
    public final C00i A04 = new 1BQ(32778);
    public final C00i A03 = new 1BQ(16467);
    public final C15h A09 = new C4Xh(this, 4);
    public final C01233qc A06 = (C01233qc) 1Bn.A0A(32782);
    public final C00i A02 = new 1BQ(99390);
    public final Map A07 = new HashMap();
    public final Set A08 = new HashSet();

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderAvailable(C3rQ c3rQ) {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageNonUserRefreshStoredProcedureComponent", " sender available");
        this.A00 = c3rQ;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderInvalidated() {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageNonUserRefreshStoredProcedureComponent", " sender invalidated");
        this.A00 = null;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onStoredProcedureResult(ByteBuffer byteBuffer, String str) {
        String str2 = new String(byteBuffer.array());
        0fH.A0g(str2, "com.facebook.messaging.montage.omnistore.storedprocedures.MontageNonUserRefreshStoredProcedureComponent", " response received: %s");
        Map map = this.A07;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (!str2.equals(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE)) {
                this.A08.remove(obj);
            } else {
                this.A08.add(obj);
                map.remove(str);
            }
        }
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public int provideStoredProcedureId() {
        return 402;
    }
}
