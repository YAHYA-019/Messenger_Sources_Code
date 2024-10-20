package X;

import java.util.HashMap;

/* renamed from: X.29Q, reason: invalid class name */
/* loaded from: 29Q.class */
public final class C29Q {
    public static final java.util.Map A04 = new HashMap();
    public final byte A00;
    public final String A01;
    public final java.util.Map A02;
    public final short A03;

    public C29Q() {
        this("", (byte) 0, (short) 0);
    }

    public C29Q(String str, byte b, short s) {
        this(str, A04, b, s);
    }

    public C29Q(String str, java.util.Map map, byte b, short s) {
        this.A01 = str;
        this.A00 = b;
        this.A03 = s;
        this.A02 = map;
    }

    public String toString() {
        return String.format("<TField name:'%s' type:%d field-id:%d metadata='%s'>", this.A01, Byte.valueOf(this.A00), Short.valueOf(this.A03), this.A02);
    }
}
