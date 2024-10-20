package com.facebook.messaging.montage.omnistore.storedprocedures;

import X.0fH;
import X.C3rQ;
import com.facebook.omnistore.module.OmnistoreStoredProcedureComponent;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: MontageMoreBucketsStoredProcedureComponent.class */
public final class MontageMoreBucketsStoredProcedureComponent implements OmnistoreStoredProcedureComponent {
    public static final Charset A01 = Charset.forName("UTF-8");
    public C3rQ A00;

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderAvailable(C3rQ c3rQ) {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageMoreBucketsStoredProcedureComponent", " sender available");
        this.A00 = c3rQ;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderInvalidated() {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageMoreBucketsStoredProcedureComponent", " sender invalidated");
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onStoredProcedureResult(ByteBuffer byteBuffer, String str) {
        0fH.A0g(new String(byteBuffer.array()), "com.facebook.messaging.montage.omnistore.storedprocedures.MontageMoreBucketsStoredProcedureComponent", " response recevied: %s");
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public int provideStoredProcedureId() {
        return 410;
    }
}
