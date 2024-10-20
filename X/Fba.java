package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: Fba.class */
public final class Fba implements C7yb {
    public final /* synthetic */ Fbb A00;
    public final /* synthetic */ String A01;

    public Fba(Fbb fbb, String str) {
        this.A00 = fbb;
        this.A01 = str;
    }

    @Override // X.C7yb
    public boolean AF9() {
        return true;
    }

    @Override // X.C7yb
    public 4cU AGk(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        File A00 = Fbb.A00(this.A01);
        if (!A00.exists()) {
            throw new IOException("Insertion must have happened before calling commit.");
        }
        A00.setLastModified(currentTimeMillis);
        return new 4cU(A00);
    }

    @Override // X.C7yb
    public void DB3(InterfaceC10634u2 interfaceC10634u2, Object obj) {
        File A00 = Fbb.A00(this.A01);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(A00);
            try {
                interfaceC10634u2.DAu(fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            throw new IOException(0Pz.A0W("Failed to open file for writing: ", A00.getCanonicalPath()), e);
        }
    }
}
