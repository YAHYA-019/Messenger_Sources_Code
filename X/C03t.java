package X;

import java.io.Reader;
import java.io.StringWriter;

/* renamed from: X.03t, reason: invalid class name */
/* loaded from: 03t.class */
public abstract class C03t {
    public static final String A00(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        while (true) {
            int read = reader.read(cArr);
            if (read < 0) {
                String obj = stringWriter.toString();
                11T.A0A(obj);
                return obj;
            }
            stringWriter.write(cArr, 0, read);
        }
    }
}
