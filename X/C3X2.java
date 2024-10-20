package X;

import java.util.Set;

/* renamed from: X.3X2, reason: invalid class name */
/* loaded from: 3X2.class */
public final class C3X2 implements InterfaceC00051a0 {
    public final InterfaceC00051a0 A00;
    public final boolean A01;

    public C3X2(InterfaceC00051a0 interfaceC00051a0, boolean z) {
        this.A00 = interfaceC00051a0;
        this.A01 = z;
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 AFD() {
        this.A00.AFD();
        return this;
    }

    @Override // X.InterfaceC00051a0
    public boolean AGl(int i) {
        if (this.A01) {
            return false;
        }
        return this.A00.AGl(i);
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 Ca2(String str, boolean z) {
        11T.A0F(str, 0);
        this.A00.Ca2(str, z);
        return this;
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 Ca6(String str, double d) {
        11T.A0F(str, 0);
        this.A00.Ca6(str, d);
        return this;
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 CaB(String str, float f) {
        11T.A0F(str, 0);
        this.A00.CaB(str, f);
        return this;
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 CaD(String str, int i) {
        11T.A0F(str, 0);
        this.A00.CaD(str, i);
        return this;
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 CaG(String str, long j) {
        11T.A0F(str, 0);
        this.A00.CaG(str, j);
        return this;
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 CaK(String str, String str2) {
        11T.A0F(str, 0);
        this.A00.CaK(str, str2);
        return this;
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 CaO(String str, Set set) {
        11T.A0F(str, 0);
        this.A00.CaO(str, set);
        return this;
    }

    @Override // X.InterfaceC00051a0
    public InterfaceC00051a0 Cdi(String str) {
        11T.A0F(str, 0);
        this.A00.Cdi(str);
        return this;
    }

    @Override // X.InterfaceC00051a0
    public void apply() {
        if (this.A01) {
            return;
        }
        this.A00.apply();
    }

    @Override // X.InterfaceC00051a0
    public boolean commit() {
        if (this.A01) {
            return false;
        }
        return this.A00.commit();
    }
}
