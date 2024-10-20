package X;

/* renamed from: X.4c9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4c9.class */
public final class C04894c9 extends AbstractC04664bm {
    public boolean A00;
    public final C04844c4 A01;
    public final InterfaceC04374as A02;
    public final 2I8 A03;
    public final boolean A04;
    public final /* synthetic */ C04224ad A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04894c9(InterfaceC04444az interfaceC04444az, InterfaceC04374as interfaceC04374as, C04224ad c04224ad, 2I8 r305, boolean z) {
        super(interfaceC04444az);
        this.A05 = c04224ad;
        this.A00 = false;
        this.A02 = interfaceC04374as;
        Boolean bool = ((C04364ar) interfaceC04374as).A07.A0H;
        this.A04 = bool != null ? bool.booleanValue() : z;
        this.A03 = r305;
        this.A01 = new C04844c4(new 4cA(this, c04224ad), c04224ad.A01, 100);
        interfaceC04374as.A5P(new 4cB(interfaceC04444az, this, c04224ad));
    }
}
