package com.facebook.omnistore.module;

import X.C3rQ;
import java.nio.ByteBuffer;

/* loaded from: OmnistoreStoredProcedureComponent.class */
public interface OmnistoreStoredProcedureComponent {
    void onSenderAvailable(C3rQ c3rQ);

    void onSenderInvalidated();

    void onStoredProcedureResult(ByteBuffer byteBuffer, String str);

    int provideStoredProcedureId();
}
