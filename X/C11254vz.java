package X;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.4vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4vz.class */
public final class C11254vz implements InterfaceC10634u2 {
    public final /* synthetic */ 4cI A00;
    public final /* synthetic */ 2Ds A01;

    public C11254vz(4cI r302, 2Ds r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // X.InterfaceC10634u2
    public final void DAu(OutputStream outputStream) {
        11T.A0F(outputStream, 0);
        2Ds r0 = this.A01;
        11T.A0D(r0);
        InputStream A06 = r0.A06();
        if (A06 == null) {
            throw 1BK.A0h();
        }
        this.A00.A01.A00(A06, outputStream);
    }
}
