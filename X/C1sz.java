package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.1sz, reason: invalid class name */
/* loaded from: 1sz.class */
public class C1sz extends File implements C1t2 {
    @Override // X.C1t2
    public void AGs() {
    }

    @Override // X.C1t2
    public OutputStream BL4() {
        return C1tc.A00() ? new KLT(this) : new FileOutputStream((File) this, false);
    }

    @Override // X.C1t2
    public void DB7(InputStream inputStream) {
        OutputStream BL4 = BL4();
        try {
            C1te.A00(inputStream, BL4);
            BL4.close();
        } catch (Throwable th) {
            try {
                BL4.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }
}
