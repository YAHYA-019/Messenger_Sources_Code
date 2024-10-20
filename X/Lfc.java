package X;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Lfc.class */
public final class Lfc implements MJ0 {
    public final KYY A00;
    public final KYY A01;
    public final L0X A02;

    public Lfc(L0X l0x) {
        this.A02 = l0x;
        if (AbF.A1b(l0x.A01.A00)) {
            Kxp.A00(l0x);
        }
        KYY kyy = Kxp.A00;
        this.A01 = kyy;
        this.A00 = kyy;
    }

    @Override // X.MJ0
    public byte[] AMP(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            List A12 = JQx.A12(L4o.A00(copyOf), this.A02.A03);
            if (A12 == null) {
                A12 = Collections.emptyList();
            }
            Iterator it = A12.iterator();
            while (it.hasNext()) {
                try {
                    return ((MJ0) ((Klv) it.next()).A04).AMP(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        L0X l0x = this.A02;
        byte[] bArr3 = Kxk.A00;
        List A122 = JQx.A12(L4o.A00(bArr3), l0x.A03);
        if (A122 == null) {
            A122 = Collections.emptyList();
        }
        Iterator it2 = A122.iterator();
        while (it2.hasNext()) {
            try {
                return ((MJ0) ((Klv) it2.next()).A04).AMP(bArr, bArr2);
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw JQx.A10("decryption failed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x001d: THROW (r0 I:java.lang.Throwable), block:B:12:0x001d */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, byte[]] */
    @Override // X.MJ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] AQ2(byte[] r302, byte[] r303) {
        /*
            r301 = this;
            r0 = r301
            X.L0X r0 = r0.A02     // Catch: java.security.GeneralSecurityException -> L1d
            r304 = r0
            r0 = r304
            X.Klv r0 = r0.A00     // Catch: java.security.GeneralSecurityException -> L1d
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.A04     // Catch: java.security.GeneralSecurityException -> L1d
            r304 = r0
            r0 = r304
            X.MJ0 r0 = (X.MJ0) r0     // Catch: java.security.GeneralSecurityException -> L1d
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r303
            byte[] r0 = r0.AQ2(r1, r2)     // Catch: java.security.GeneralSecurityException -> L1d
            return r0
        L1d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lfc.AQ2(byte[], byte[]):byte[]");
    }
}
