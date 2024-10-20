package X;

import java.util.Comparator;

/* renamed from: X.0j4, reason: invalid class name */
/* loaded from: 0j4.class */
public final /* synthetic */ class C0j4 implements Comparator {
    public final /* synthetic */ java.util.Map A00;
    public final /* synthetic */ java.util.Map A01;

    public /* synthetic */ C0j4(java.util.Map map, java.util.Map map2) {
        this.A00 = map;
        this.A01 = map2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        java.util.Map map = this.A00;
        java.util.Map map2 = this.A01;
        Number number = (Number) map.get(obj);
        Number number2 = (Number) map.get(obj2);
        if (number == null || number2 == null) {
            number = (Number) map2.get(obj);
            if (number == null) {
                number = 0L;
            }
            number2 = (Number) map2.get(obj2);
            if (number2 == null) {
                number2 = 0L;
            }
        }
        return (int) (number.longValue() - number2.longValue());
    }
}
