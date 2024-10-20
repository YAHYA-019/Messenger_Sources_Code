package X;

import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: J7f.class */
public final class J7f extends GZIPOutputStream {
    public J7f(OutputStream outputStream) {
        super(outputStream);
        ((DeflaterOutputStream) this).def.setLevel(9);
    }
}
