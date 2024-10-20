package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.Ghx, reason: case insensitive filesystem */
/* loaded from: Ghx.class */
public final class C2584Ghx extends C4Pu {
    public final long A00;
    public final long A01;
    public final File A02;

    public C2584Ghx(File file, String str, String str2, long j, long j2) {
        super(str, j2, str2);
        this.A02 = file;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // X.C4Pu
    public void A05(OutputStream outputStream) {
        InputStream inputStream;
        long j;
        long read;
        C05344dj c05344dj = new C05344dj(this.A02);
        long j2 = this.A01;
        long j3 = this.A00;
        boolean z = true;
        Preconditions.checkArgument(1BL.A1S((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1))), "offset (%s) may not be negative", j2);
        if (j3 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "length (%s) may not be negative", j3);
        outputStream.getClass();
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            InputStream A01 = c05344dj.A01();
            if (j2 > 0) {
                byte[] bArr = null;
                long j4 = 0;
                while (true) {
                    j = j4;
                    if (j >= j2) {
                        break;
                    }
                    long j5 = j2 - j;
                    try {
                        int available = A01.available();
                        if (available != 0) {
                            read = A01.skip(Math.min(available, j5));
                            if (read != 0) {
                                continue;
                                j4 = j + read;
                            }
                        }
                        int min = (int) Math.min(j5, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
                        if (bArr == null) {
                            bArr = new byte[min];
                        }
                        read = A01.read(bArr, 0, min);
                        if (read == -1) {
                            break;
                        } else {
                            j4 = j + read;
                        }
                    } finally {
                    }
                }
                if (j < j2) {
                    A01.close();
                    new ByteArrayInputStream(new byte[0]);
                    c05364dl.A00(inputStream);
                    1SB.A00(inputStream, outputStream);
                }
            }
            new H8p(A01, j3);
            c05364dl.A00(inputStream);
            1SB.A00(inputStream, outputStream);
        } finally {
        }
    }
}
