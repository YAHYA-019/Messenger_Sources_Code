package X;

import java.util.Comparator;

/* loaded from: DAi.class */
public final class DAi implements Comparator {
    public final DIp A00;

    public DAi(DIp dIp) {
        this.A00 = dIp;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DIp dIp = this.A00;
        Number number = (Number) ((AcX) obj).A07(dIp);
        Number number2 = (Number) ((AcX) obj2).A07(dIp);
        int i = 1;
        if (AnonymousClass001.A1U(number) ^ AnonymousClass001.A1U(number2)) {
            if (number != null) {
                i = -1;
            }
            return i;
        }
        if (number == null) {
            return 0;
        }
        return Float.compare(number.floatValue(), number2.floatValue());
    }
}
