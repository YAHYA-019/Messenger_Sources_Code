package X;

/* renamed from: X.GiS, reason: case insensitive filesystem */
/* loaded from: GiS.class */
public final class C2590GiS extends AbstractC04524b8 {
    public static final String __redex_internal_original_name = "LocalVideoThumbnailProducer$1";
    public final /* synthetic */ IT4 A00;
    public final /* synthetic */ InterfaceC04374as A01;
    public final /* synthetic */ 2IU A02;
    public final /* synthetic */ 2Dp A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2590GiS(InterfaceC04444az interfaceC04444az, IT4 it4, InterfaceC04374as interfaceC04374as, InterfaceC04374as interfaceC04374as2, 2IU r306, 2IU r307, 2Dp r308) {
        super(interfaceC04444az, interfaceC04374as, r306, "VideoThumbnailProducer");
        this.A00 = it4;
        this.A02 = r307;
        this.A01 = interfaceC04374as2;
        this.A03 = r308;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r0.A02 > 96) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r304 == null) goto L20;
     */
    @Override // X.AbstractRunnableC04534b9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object A01() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2590GiS.A01():java.lang.Object");
    }

    @Override // X.AbstractC04524b8, X.AbstractRunnableC04534b9
    public void A04(Exception exc) {
        super.A04(exc);
        2IU r0 = this.A02;
        InterfaceC04374as interfaceC04374as = this.A01;
        r0.CS8(interfaceC04374as, "VideoThumbnailProducer", false);
        interfaceC04374as.CaJ("local", "video");
    }

    @Override // X.AbstractRunnableC04534b9
    public /* bridge */ /* synthetic */ void A05(Object obj) {
        2EU.A04((2EU) obj);
    }

    @Override // X.AbstractC04524b8, X.AbstractRunnableC04534b9
    public /* bridge */ /* synthetic */ void A06(Object obj) {
        super.A06(obj);
        2IU r0 = this.A02;
        InterfaceC04374as interfaceC04374as = this.A01;
        r0.CS8(interfaceC04374as, "VideoThumbnailProducer", AnonymousClass001.A1T(obj));
        interfaceC04374as.CaJ("local", "video");
    }

    @Override // X.AbstractC04524b8
    public /* bridge */ /* synthetic */ java.util.Map A07(Object obj) {
        return C05004ck.A00("createdThumbnail", String.valueOf(AnonymousClass001.A1T(obj)));
    }
}
