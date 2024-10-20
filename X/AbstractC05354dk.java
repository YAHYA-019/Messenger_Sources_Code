package X;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.4dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dk.class */
public abstract class AbstractC05354dk {
    public InputStream A01() {
        return new FileInputStream(((C05344dj) this).A00);
    }

    public void A02(OutputStream outputStream) {
        outputStream.getClass();
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            FileInputStream fileInputStream = new FileInputStream(((C05344dj) this).A00);
            c05364dl.A00(fileInputStream);
            1SB.A00(fileInputStream, outputStream);
        } finally {
        }
    }
}
