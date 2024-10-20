package X;

import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.03P, reason: invalid class name */
/* loaded from: 03P.class */
public final class C03P implements NativeTraceWriterCallbacks {
    public final /* synthetic */ 03M A00;
    public final /* synthetic */ TraceContext A01;

    public C03P(03M r302, TraceContext traceContext) {
        this.A00 = r302;
        this.A01 = traceContext;
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteAbort(long j, int i) {
        this.A00.A02.CRJ(this.A01, i);
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteEnd(long j) {
        this.A00.A02.CRK(this.A01);
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteException(long j, Throwable th) {
        this.A00.A02.CRL(this.A01, th);
    }

    @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
    public void onTraceWriteStart(long j, int i) {
        this.A00.A02.CRM(this.A01);
    }
}
