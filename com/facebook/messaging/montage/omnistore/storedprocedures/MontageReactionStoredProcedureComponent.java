package com.facebook.messaging.montage.omnistore.storedprocedures;

import X.0fH;
import X.C15h;
import X.C3rQ;
import X.C4Xg;
import com.facebook.omnistore.module.OmnistoreStoredProcedureComponent;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: MontageReactionStoredProcedureComponent.class */
public final class MontageReactionStoredProcedureComponent implements OmnistoreStoredProcedureComponent {
    public static final Charset A02 = Charset.forName("UTF-8");
    public C3rQ A00;
    public final C15h A01 = new C4Xg(this, 19);

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderAvailable(C3rQ c3rQ) {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageReactionStoredProcedureComponent", " sender available");
        this.A00 = c3rQ;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onSenderInvalidated() {
        0fH.A0j("com.facebook.messaging.montage.omnistore.storedprocedures.MontageReactionStoredProcedureComponent", " sender invalidated");
        this.A00 = null;
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public void onStoredProcedureResult(ByteBuffer byteBuffer, String str) {
        0fH.A0g(new String(byteBuffer.array()), "com.facebook.messaging.montage.omnistore.storedprocedures.MontageReactionStoredProcedureComponent", " response received: %s");
    }

    @Override // com.facebook.omnistore.module.OmnistoreStoredProcedureComponent
    public int provideStoredProcedureId() {
        return 401;
    }
}
