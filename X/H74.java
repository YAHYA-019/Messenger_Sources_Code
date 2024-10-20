package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: H74.class */
public final class H74 extends 6DJ {
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    public H74(Context context) {
        super(false);
        this.A04 = context.getAssets();
    }

    public Uri BIM() {
        return this.A01;
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0114: THROW (r0 I:java.lang.Throwable), block:B:56:0x0114 */
    public long CVO(6DQ r302) {
        Throwable th;
        try {
            Uri uri = r302.A06;
            this.A01 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            A02();
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            long j = r302.A04;
            if (open.skip(j) < j) {
                throw new 6Dc(2008, (Throwable) null);
            }
            long j2 = r302.A03;
            long j3 = -1;
            if (j2 != j3) {
                this.A00 = j2;
            } else {
                long available = this.A02.available();
                this.A00 = available;
                if (available == 2147483647L) {
                    this.A00 = j3;
                }
            }
            this.A03 = true;
            A04(r302);
            return this.A00;
        } catch (H79 unused) {
            throw th;
        } catch (IOException e) {
            int i = 2000;
            if (e instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new 6Dc(i, e);
        }
    }

    public void close() {
        this.A01 = null;
        try {
            try {
                InputStream inputStream = this.A02;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new 6Dc(2000, e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
        }
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
            int read = this.A02.read(bArr, i, i2);
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
