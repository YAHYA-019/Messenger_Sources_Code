package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: H76.class */
public final class H76 extends 6DJ {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public H76(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
    }

    public Uri BIM() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long CVO(X.6DQ r302) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H76.CVO(X.6DQ):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (r301.A04 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        r301.A04 = false;
        A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        throw r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (r301.A04 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        if (r301.A04 == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H76.close():void");
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
                    throw new 6Dc(2000, e);
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
        }
        return -1;
    }
}
