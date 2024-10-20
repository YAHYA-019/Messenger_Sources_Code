package X;

/* renamed from: X.02b, reason: invalid class name */
/* loaded from: 02b.class */
public final class C02b extends ThreadLocal {
    public int A00() {
        Number number = (Number) get();
        int intValue = (number == null ? -1 : number.intValue()) + 1;
        set(Integer.valueOf(intValue));
        return intValue;
    }

    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        return -1;
    }
}
