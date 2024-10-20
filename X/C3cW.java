package X;

/* renamed from: X.3cW, reason: invalid class name */
/* loaded from: 3cW.class */
public final class C3cW implements 5Tc {
    public final /* synthetic */ 4Zo A00;
    public final /* synthetic */ 0CL A01;

    public C3cW(4Zo r302, 0CL r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    public void C9J(int i) {
        if (i == 4) {
            4Zo r0 = this.A00;
            5Ta A00 = 4Zo.A00(r0);
            0CL r02 = this.A01;
            A00.A03.decrementAndGet();
            5TQ r03 = (5TQ) r02.element;
            11T.A0F(r03, 0);
            4Zo.A05(r0, r03, "FAIL");
            synchronized (r0.A0B) {
                5TQ r04 = r0.A00;
                if (r04 != null && r04.equals(r03)) {
                    r0.A00 = null;
                }
            }
            r0.A07();
            return;
        }
        if (i == 2) {
            0CL r05 = this.A01;
            5TQ r06 = (5TQ) r05.element;
            4Zo r07 = this.A00;
            4Zo.A03(r07, r06, "PRERENDERING");
            5Ta A002 = 4Zo.A00(r07);
            5TP r08 = (5TQ) r05.element;
            11T.A0F(r08, 0);
            A002.A03.decrementAndGet();
            1UG A08 = 1BK.A08(1Br.A02(A002.A00), "preload_manager_prerender_success");
            if (A08.isSampled()) {
                A08.A7R("preload_manager_id", A002.A02);
                A08.A7R("surface_id", r08.A01);
                A08.BZL();
            }
            C00i c00i = A002.A01.A00;
            C1cv c1cv = (C1cv) c00i.get();
            5TR A02 = C1cv.A02(c1cv, r08);
            if (A02 != null) {
                A02.A03 = ((1Od) 1Br.A0B(c1cv.A03)).A07();
            }
            C1cv c1cv2 = (C1cv) c00i.get();
            5TR A022 = C1cv.A02(c1cv2, r08);
            if (A022 != null) {
                A022.A04 = 1Br.A01(c1cv2.A04);
            }
            r07.A07();
        }
    }
}
