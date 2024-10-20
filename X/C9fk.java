package X;

import java.util.regex.Pattern;

/* renamed from: X.9fk, reason: invalid class name */
/* loaded from: 9fk.class */
public final class C9fk {
    public static final Pattern A03;
    public static final Pattern A04 = Pattern.compile("([\\d]{2}):([\\d]{2}):([\\d]{2}),([\\d]{3})");
    public final 1Br A02 = 7zM.A0P();
    public final 1Br A00 = 1Bq.A00(16477);
    public final 1Br A01 = 1Bq.A00(16511);

    static {
        Pattern compile = Pattern.compile("([\\d]{2}:[\\d]{2}:[\\d]{2},[\\d]{3}).*([\\d]{2}:[\\d]{2}:[\\d]{2},[\\d]{3})");
        11T.A0A(compile);
        A03 = compile;
    }
}
