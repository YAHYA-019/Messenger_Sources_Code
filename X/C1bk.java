package X;

import com.facebook.acra.constants.ErrorReportingConstants;

/* renamed from: X.1bk, reason: invalid class name */
/* loaded from: 1bk.class */
public final class C1bk implements InterfaceC00471b6 {
    public final 1Br A00;
    public final boolean A01;

    public C1bk() {
        1Br A00 = 1Bq.A00(16385);
        this.A00 = A00;
        this.A01 = ((2yD) A00.A00.get()).AZk(36318526922830604L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.1bI] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.1bH] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, X.1bH] */
    @Override // X.InterfaceC00471b6
    public 1bY AKq() {
        return new 1bY("m4a_touch_responsiveness", new C1bM[]{new 1bN((1bI) new Object()), new 1bN(new 1bJ((1bH) new Object(), 200L, 0L, 1L)), new 1bN(new 1bJ((1bH) new Object(), 500L, 0L, 1L)), new 1bN(new C1bp(200L)), new 1bN(new C1bp(500L))}, new 1bK[]{new Object(), new Object(), new 1bR(ErrorReportingConstants.ENDPOINT), new 1bR("completion_endpoint"), new 1bR("touch_phase")}, 895755772);
    }

    @Override // X.InterfaceC00471b6
    public boolean isEnabled() {
        return this.A01;
    }
}
