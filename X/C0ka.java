package X;

/* renamed from: X.0ka, reason: invalid class name */
/* loaded from: 0ka.class */
public final class C0ka implements 0XB, 0M1 {
    public 0C3 A00;
    public 0C3 A01;
    public 0C3 A02;
    public final C0Cy A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C0ka(C0Cy c0Cy) {
        this.A03 = c0Cy;
        c0Cy.A5x(this);
    }

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        if (r302 instanceof C0v5) {
            C0v5 c0v5 = (C0v5) r302;
            0C3 r0 = this.A01;
            if (r0 != null) {
                c0v5.A06 = r0.name();
            }
            0C3 r02 = this.A02;
            if (r02 != null) {
                c0v5.A0C = r02.name();
            }
            0C3 r03 = this.A00;
            if (r03 != null) {
                c0v5.A04 = r03.name();
            }
        }
    }

    public void BiB(0C3 r302) {
        this.A00 = r302;
    }

    public void C2u(0C3 r302) {
        this.A01 = r302;
    }

    public void CPg(0C3 r302) {
        this.A02 = r302;
    }

    public void D6O() {
    }

    public String getName() {
        return "memory_red";
    }
}
