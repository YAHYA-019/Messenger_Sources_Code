package X;

import android.net.Uri;

/* renamed from: X.1bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1bi.class */
public final class C00591bi implements InterfaceC00281am {
    public final InterfaceC00281am A00;
    public final 1Od A01;
    public final String A02;
    public final String A03;

    public C00591bi(1Od r302, InterfaceC00281am interfaceC00281am, String str) {
        this.A00 = interfaceC00281am;
        this.A01 = r302;
        this.A02 = str;
        this.A03 = 0Pz.A0W(str, " FBBK/1");
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder AX6() {
        return this.A00.AX6();
    }

    @Override // X.InterfaceC00281am
    public String AX7() {
        return this.A01.A0E() ? this.A03 : this.A02;
    }

    @Override // X.InterfaceC00281am
    public String[] Ai5() {
        return this.A00.Ai5();
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder AoA() {
        return this.A00.AoA();
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder AoB() {
        return this.A00.AoB();
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder AoO() {
        return this.A00.AoO();
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder Axy() {
        return this.A00.Axy();
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder B9S() {
        return this.A00.B9S();
    }

    @Override // X.InterfaceC00281am
    public Uri.Builder B9U() {
        return this.A00.B9U();
    }
}
