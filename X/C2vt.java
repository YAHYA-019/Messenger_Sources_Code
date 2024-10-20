package X;

import java.util.Locale;

/* renamed from: X.2vt, reason: invalid class name */
/* loaded from: 2vt.class */
public abstract class C2vt {
    public static final String A00(long j) {
        String format = String.format(Locale.getDefault(), "%s.%s", Long.valueOf(j / 1000), Long.valueOf(j % 1000));
        11T.A0A(format);
        return format;
    }
}
