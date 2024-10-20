package com.facebook.messaging.montage.omnistore.storedprocedures;

import X.0fH;
import X.1Bi;
import X.C3rQ;
import com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent;
import com.facebook.omnistore.module.OmnistoreStoredProcedureComponent;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: MontageNewsfeedRefreshStoredProcedureComponent.class */
public final class MontageNewsfeedRefreshStoredProcedureComponent implements OmnistoreStoredProcedureComponent {
    public static final Charset A02 = Charset.forName("UTF-8");
    public C3rQ A00;
    public final MontageOmnistoreComponent A01 = (MontageOmnistoreComponent) 1Bi.A03(32777);

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderAvailable(C3rQ c3rQ) {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageNewsfeedRefreshStoredProcedureComponent", " sender available");
        this.A00 = c3rQ;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderInvalidated() {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageNewsfeedRefreshStoredProcedureComponent", " sender invalidated");
        this.A00 = null;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onStoredProcedureResult(ByteBuffer byteBuffer, String str) {
        0fH.A0g(new String(byteBuffer.array()), "com.facebook.messaging.montage.omnistore.storedprocedures.MontageNewsfeedRefreshStoredProcedureComponent", " response received: %s");
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public int provideStoredProcedureId() {
        return 409;
    }
}
