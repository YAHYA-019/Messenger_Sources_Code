package X;

/* renamed from: X.4b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4b8.class */
public abstract class AbstractC04524b8 extends AbstractRunnableC04534b9 {
    public static final String __redex_internal_original_name = "StatefulProducerRunnable";
    public final InterfaceC04444az A00;
    public final InterfaceC04374as A01;
    public final 2IU A02;
    public final String A03;

    public AbstractC04524b8(InterfaceC04444az interfaceC04444az, InterfaceC04374as interfaceC04374as, 2IU r304, String str) {
        11T.A0F(interfaceC04444az, 1);
        11T.A0F(r304, 2);
        this.A00 = interfaceC04444az;
        this.A02 = r304;
        this.A01 = interfaceC04374as;
        this.A03 = str;
        r304.CEC(interfaceC04374as, str);
    }

    @Override // X.AbstractRunnableC04534b9
    public void A03() {
        2IU r0 = this.A02;
        InterfaceC04374as interfaceC04374as = this.A01;
        String str = this.A03;
        r0.ChL(interfaceC04374as, str);
        r0.CE6(interfaceC04374as, str, (java.util.Map) null);
        this.A00.Bn2();
    }

    @Override // X.AbstractRunnableC04534b9
    public void A04(Exception exc) {
        2IU r0 = this.A02;
        InterfaceC04374as interfaceC04374as = this.A01;
        String str = this.A03;
        r0.ChL(interfaceC04374as, str);
        r0.CE8(interfaceC04374as, str, exc, (java.util.Map) null);
        this.A00.onFailure(exc);
    }

    @Override // X.AbstractRunnableC04534b9
    public void A06(Object obj) {
        2IU r0 = this.A02;
        InterfaceC04374as interfaceC04374as = this.A01;
        String str = this.A03;
        r0.CEA(interfaceC04374as, str, r0.ChL(interfaceC04374as, str) ? A07(obj) : null);
        this.A00.C9C(obj, 1);
    }

    public java.util.Map A07(Object obj) {
        if (!(this instanceof 4bU)) {
            return null;
        }
        boolean z = false;
        if (obj != null) {
            z = true;
        }
        return C05004ck.A00("createdThumbnail", Boolean.toString(z));
    }
}
