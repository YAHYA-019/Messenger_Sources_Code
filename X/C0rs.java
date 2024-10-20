package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.0rs, reason: invalid class name */
/* loaded from: 0rs.class */
public final class C0rs implements Comparator {
    public final int A00;

    public C0rs(int i) {
        this.A00 = i;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = ((0NF) obj).A02;
                i2 = ((0NF) obj2).A02;
                break;
            case 1:
                return (int) (((File) obj2).lastModified() - ((File) obj).lastModified());
            case 2:
                i = ((C02U) obj).A01;
                i2 = ((C02U) obj2).A01;
                break;
            default:
                return 0;
        }
        return i - i2;
    }
}
