package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.OutputStream;

/* renamed from: X.4w3, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4w3.class */
public final class C11294w3 extends AbstractC11304w4 {
    public boolean A00;
    public final int A01;
    public final /* synthetic */ 2Jv A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11294w3(2Jv r302, OutputStream outputStream, int i) {
        super(outputStream);
        this.A02 = r302;
        ((AbstractC11304w4) this).A00 = 0L;
        this.A00 = false;
        this.A01 = i;
    }

    @Override // X.AbstractC11304w4, X.AbstractC11284w2, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i;
        if (!this.A00 && (i = this.A01) != 0) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02.A01;
            lightweightQuickPerformanceLogger.markerAnnotate(42991646, i, "written_bytes", ((AbstractC11304w4) this).A00);
            lightweightQuickPerformanceLogger.markerEnd(42991646, i, (short) 2);
        }
        super.close();
    }
}
