package X;

import java.util.Comparator;

/* renamed from: X.0r2, reason: invalid class name */
/* loaded from: 0r2.class */
public final class C0r2 implements Comparator {
    public final int A00;

    public C0r2(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                str = (String) obj;
                str2 = (String) obj2;
                return str.compareTo(str2);
            case 1:
                str = ((0KP) obj).A02;
                str2 = ((0KP) obj2).A02;
                return str.compareTo(str2);
            default:
                return 0;
        }
    }
}
