package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;

/* renamed from: X.4V6, reason: invalid class name */
/* loaded from: 4V6.class */
public abstract class C4V6 {
    public static String A00(AbstractC01033pi abstractC01033pi) {
        Object A1S = abstractC01033pi.A1S();
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("current token: ");
        A0k.append(abstractC01033pi.A1Z());
        A0k.append("\n");
        if (A1S instanceof InputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (abstractC01033pi instanceof 42U) {
                42U r0 = (42U) abstractC01033pi;
                int i = r0.A03;
                int i2 = r0.A04;
                int i3 = i - i2;
                if (i3 >= 1) {
                    r0.A04 = i2 + i3;
                    byteArrayOutputStream.write(r0.A06, i2, i3);
                }
            }
            byteArrayOutputStream.flush();
            A02(A0k, byteArrayOutputStream);
            byteArrayOutputStream.close();
            InputStream inputStream = (InputStream) A1S;
            while (true) {
                int read = inputStream.read();
                if (read == -1 || A0k.length() >= 100) {
                    break;
                }
                A0k.append((char) read);
            }
        } else if (A1S instanceof Reader) {
            StringWriter stringWriter = new StringWriter();
            if (abstractC01033pi instanceof C42f) {
                C42f c42f = (C42f) abstractC01033pi;
                int i4 = ((C42V) c42f).A03;
                int i5 = ((C42V) c42f).A04;
                int i6 = i4 - i5;
                if (i6 >= 1) {
                    ((C42V) c42f).A04 = i5 + i6;
                    stringWriter.write(c42f.A06, i5, i6);
                }
            }
            stringWriter.flush();
            A02(A0k, stringWriter);
            stringWriter.close();
            Reader reader = (Reader) A1S;
            while (true) {
                int read2 = reader.read();
                if (read2 == -1 || A0k.length() >= 100) {
                    break;
                }
                A0k.append((char) read2);
            }
            reader.close();
        } else if (A1S == null) {
            StringWriter stringWriter2 = new StringWriter();
            if (abstractC01033pi instanceof C42f) {
                C42f c42f2 = (C42f) abstractC01033pi;
                int i7 = ((C42V) c42f2).A03;
                int i8 = ((C42V) c42f2).A04;
                int i9 = i7 - i8;
                if (i9 >= 1) {
                    ((C42V) c42f2).A04 = i8 + i9;
                    stringWriter2.write(c42f2.A06, i8, i9);
                }
            }
            stringWriter2.flush();
            A02(A0k, stringWriter2);
            stringWriter2.close();
        }
        if (A0k.length() == 100) {
            A0k.append("...");
        }
        return A0k.toString();
    }

    public static void A01(AbstractC01033pi abstractC01033pi, Class cls, Exception exc) {
        String str;
        try {
            str = A00(abstractC01033pi);
        } catch (Exception unused) {
            str = "failed to get parser text";
        }
        String A0v = 0Pz.A0v("Failed to deserialize to instance ", cls.getSimpleName(), "\n", str);
        4DN A1C = abstractC01033pi.A1C();
        IOException iOException = new IOException(A0v, exc);
        ((2LD) iOException)._location = A1C;
        throw iOException;
    }

    public static void A02(StringBuilder sb, Object obj) {
        char[] charArray = obj.toString().toCharArray();
        sb.append(charArray, 0, Math.min(charArray.length, 100 - sb.length()));
    }
}
