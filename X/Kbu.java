package X;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: Kbu.class */
public abstract class Kbu {
    public static final String A00;
    public static final Charset A01;

    static {
        Charset charset = StandardCharsets.UTF_8;
        A01 = charset;
        A00 = charset.name();
    }
}
