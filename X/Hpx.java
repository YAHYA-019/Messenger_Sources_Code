package X;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* loaded from: Hpx.class */
public final class Hpx {
    public long A01;
    public long A02;
    public File A04;
    public I9V A03 = null;
    public URL A05 = null;
    public int A00 = -1;

    public Hpx(File file) {
        long j = -1;
        this.A02 = j;
        this.A01 = j;
        this.A04 = file;
    }

    public HuY A00() {
        if (this.A05 == null) {
            if (this.A04 == null) {
                throw AnonymousClass001.A0L("Source file and url cannot be both null");
            }
        } else if (this.A04 != null) {
            throw AnonymousClass001.A0L("Source file and url cannot be both non-null");
        }
        if (this.A03 == null) {
            long j = -1;
            this.A03 = new I9V(TimeUnit.MILLISECONDS, j, j);
        }
        return new HuY(this);
    }
}
