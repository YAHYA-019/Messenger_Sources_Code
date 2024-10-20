package X;

import java.net.InetAddress;

/* renamed from: X.3Ns, reason: invalid class name */
/* loaded from: 3Ns.class */
public final class C3Ns {
    public final long A00;
    public final InetAddress A01;

    public C3Ns(InetAddress inetAddress, long j) {
        this.A01 = inetAddress;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InetAddress (");
        A0k.append(this.A01);
        A0k.append(", expiry: ");
        A0k.append(this.A00);
        return AnonymousClass001.A0d(" ms", A0k);
    }
}
