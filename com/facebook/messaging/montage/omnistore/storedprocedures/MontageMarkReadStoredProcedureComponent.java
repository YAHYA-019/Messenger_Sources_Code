package com.facebook.messaging.montage.omnistore.storedprocedures;

import X.0fH;
import X.C15h;
import X.C3rQ;
import X.C4Xg;
import com.facebook.omnistore.module.OmnistoreStoredProcedureComponent;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: MontageMarkReadStoredProcedureComponent.class */
public final class MontageMarkReadStoredProcedureComponent implements OmnistoreStoredProcedureComponent {
    public static final Charset A02 = Charset.forName("UTF-8");
    public C3rQ A00;
    public final C15h A01 = new C4Xg(this, 18);

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderAvailable(C3rQ c3rQ) {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageMarkReadStoredProcedureComponent", " sender available");
        this.A00 = c3rQ;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderInvalidated() {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageMarkReadStoredProcedureComponent", " sender invalidated");
        this.A00 = null;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onStoredProcedureResult(ByteBuffer byteBuffer, String str) {
        0fH.A0g(new String(byteBuffer.array()), "com.facebook.messaging.montage.omnistore.storedprocedures.MontageMarkReadStoredProcedureComponent", " response received: %s");
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public int provideStoredProcedureId() {
        return 400;
    }
}
