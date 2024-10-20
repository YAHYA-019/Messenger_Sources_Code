package X;

/* renamed from: X.3gt, reason: invalid class name */
/* loaded from: 3gt.class */
public final class C3gt implements Runnable {
    public static final String __redex_internal_original_name = "KeyTransparencyShadowTestUtils$maybeCleanupForShadowTest$runnable$1";
    public final /* synthetic */ C23v A00;
    public final /* synthetic */ String A01;

    public C3gt(C23v c23v, String str) {
        this.A00 = c23v;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23v c23v = this.A00;
        C00i c00i = c23v.A04.A00;
        1BK.A0V(c00i).markerStart(976892663);
        1BK.A0V(c00i).markerPoint(976892663, "cleanup_shadow_test_data");
        1Ql A08 = 1Br.A08(c23v.A02);
        A08.Cdj(1G9.A05(1G0.A0B.A0F("key_transparency_shadow_test"), this.A01));
        A08.commit();
        1BK.A0V(c00i).markerEnd(976892663, (short) 2);
    }
}
