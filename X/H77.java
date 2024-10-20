package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: H77.class */
public final class H77 extends 6DJ {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final String A06;

    public H77(Context context) {
        super(false);
        this.A05 = context.getResources();
        this.A06 = context.getPackageName();
    }

    public Uri BIM() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0076, code lost:
    
        if (r0.matches("\\d+") != false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f8  */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Throwable, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long CVO(X.6DQ r302) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H77.CVO(X.6DQ):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        if (r301.A04 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r301.A04 = false;
        A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        throw r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
    
        if (r301.A04 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00aa, code lost:
    
        if (r301.A04 == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H77.close():void");
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            long j2 = -1;
            if (j != j2) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new 6Dc((String) null, e, 2000);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read != -1) {
                long j3 = this.A00;
                if (j3 != j2) {
                    this.A00 = j3 - read;
                }
                A03(read);
                return read;
            }
            if (this.A00 != j2) {
                throw new 6Dc("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
