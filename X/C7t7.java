package X;

import java.io.InputStream;
import java.util.Scanner;

/* renamed from: X.7t7, reason: invalid class name */
/* loaded from: 7t7.class */
public final class C7t7 {
    public static String A00() {
        try {
            try {
                InputStream resourceAsStream = C7t7.class.getResourceAsStream("/assets/params_map.txt");
                Scanner useDelimiter = new Scanner(resourceAsStream).useDelimiter("\\A");
                String next = useDelimiter.hasNext() ? useDelimiter.next() : "";
                1Cu.A01(resourceAsStream);
                return next;
            } catch (Exception e) {
                throw 1BK.A0s("IOException encountered while reading resource", e);
            }
        } catch (Throwable th) {
            1Cu.A01((InputStream) null);
            throw th;
        }
    }
}
