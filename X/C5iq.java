package X;

import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.5iq, reason: invalid class name */
/* loaded from: 5iq.class */
public final class C5iq implements C5ir {
    public int A00;
    public LightweightQuickPerformanceLogger A01;
    public String A02;

    public C5iq(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i) {
        this.A01 = lightweightQuickPerformanceLogger;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // X.C5ir
    public void Bto() {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        int i = this.A00;
        lightweightQuickPerformanceLogger.markerAnnotate(i, "module", this.A02);
        lightweightQuickPerformanceLogger.markerEnd(i, (short) 2);
    }

    @Override // X.C5ir
    public void Bvt(6CK r302) {
        this.A01.markerStart(this.A00);
    }

    @Override // X.C5ir
    public void CGg(6CM r302) {
        MarkerEditor withMarker = this.A01.withMarker(this.A00);
        withMarker.annotate("sfd", r302.A01);
        withMarker.annotate("lfd", r302.A00);
        withMarker.annotate(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, r302.A02);
        withMarker.markerEditingCompleted();
    }
}
