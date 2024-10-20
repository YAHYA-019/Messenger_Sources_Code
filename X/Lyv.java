package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Lyv.class */
public final class Lyv extends AtomicInteger {
    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return (byte) intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return super.doubleValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return super.floatValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return super.longValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return (short) intValue();
    }
}
