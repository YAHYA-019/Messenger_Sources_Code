package X;

import java.io.File;

/* loaded from: Kro.class */
public final class Kro {
    public KqF A00;
    public boolean A01;
    public final String A02;
    public final long[] A03;
    public final /* synthetic */ Li6 A04;

    public Kro(Li6 li6, String str) {
        this.A04 = li6;
        this.A02 = str;
        this.A03 = new long[li6.A06];
    }

    public File A00() {
        return AnonymousClass001.A0D(this.A04.A07, AnonymousClass001.A0e(".", AnonymousClass001.A0n(this.A02), 0));
    }

    public File A01() {
        File file = this.A04.A07;
        StringBuilder A0n = AnonymousClass001.A0n(this.A02);
        A0n.append(".");
        A0n.append(0);
        return AnonymousClass001.A0D(file, AnonymousClass001.A0d(".tmp", A0n));
    }
}
