package X;

import java.util.Collections;

/* renamed from: X.18v, reason: invalid class name */
/* loaded from: 18v.class */
public enum C18v {
    CONNECT(1),
    CONNACK(2),
    PUBLISH(3),
    PUBACK(4),
    PUBREC(5),
    PUBREL(6),
    PUBCOMP(7),
    SUBSCRIBE(8),
    SUBACK(9),
    UNSUBSCRIBE(10),
    UNSUBACK(11),
    PINGREQ(12),
    PINGRESP(13),
    /* JADX INFO: Fake field, exist only in values array */
    DISCONNECT(14);

    public static final java.util.Map A00 = Collections.unmodifiableMap(new C0d6(1));
    public final int mValue;

    C18v(int i) {
        this.mValue = i;
    }
}
