package com.facebook.profilo.provider.aslsession;

import X.0Gw;
import X.C0T5;
import X.C0ft;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;

/* loaded from: AslSessionIdProvider.class */
public class AslSessionIdProvider extends C0T5 {
    static {
        ProvidersRegistry.A00.A02("asl_session");
    }

    public AslSessionIdProvider() {
        super(null);
    }

    @Override // X.C0T5
    public void A0A(TraceContext traceContext, 0Gw r303) {
        Buffer buffer = traceContext.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0L, 0, 8134124, 0, 0L), "Asl Session Id"), C0ft.A02());
    }
}
