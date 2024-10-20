package X;

import java.io.ByteArrayOutputStream;
import java.io.Writer;

/* renamed from: X.5r2, reason: invalid class name */
/* loaded from: 5r2.class */
public final class C5r2 extends 4BQ {
    public final ByteArrayOutputStream A00;

    public C5r2(C49w c49w, ByteArrayOutputStream byteArrayOutputStream) {
        super(c49w, byteArrayOutputStream);
        this.A00 = byteArrayOutputStream;
    }

    public 4CR A00() {
        return 1lJ.A01().A02(this.A00);
    }

    public void A01() {
    }

    public void A02() {
        this.A00.reset();
    }

    public void A04(Writer writer) {
        writer.write(this.A00.toString());
    }

    public String AlS() {
        return "";
    }

    public boolean CyK() {
        return false;
    }
}
