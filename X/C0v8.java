package X;

import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: X.0v8, reason: invalid class name */
/* loaded from: 0v8.class */
public final class C0v8 implements 0XB {
    public final 0vV A00 = new 0vV();

    public void AEO(0XC r302, StackTraceElement[] stackTraceElementArr) {
        0vV r0 = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        0vV.A02(r0);
        ListIterator listIterator = r0.A00.listIterator();
        while (listIterator.hasNext()) {
            0vY r02 = (0vY) listIterator.next();
            if (r02 != null) {
                if (r02.A0F.exists()) {
                    String A03 = r02.A03();
                    if (A03 != null) {
                        A0s.add(A03);
                    }
                } else {
                    r0.A01.remove(Integer.valueOf(r02.A0E));
                    listIterator.remove();
                }
            }
        }
        r302.A0D = A0s;
    }

    public void D6O() {
        0vV r0 = this.A00;
        0vV.A02(r0);
        ListIterator listIterator = r0.A00.listIterator();
        while (listIterator.hasNext()) {
            0vY r02 = (0vY) listIterator.next();
            if (r02 != null) {
                if (r02.A0F.exists()) {
                    r02.A04();
                } else {
                    r0.A01.remove(Integer.valueOf(r02.A0E));
                    listIterator.remove();
                }
            }
        }
    }

    public String getName() {
        return "wholestat";
    }
}
