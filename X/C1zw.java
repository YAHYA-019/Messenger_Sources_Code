package X;

import java.util.LinkedHashMap;

/* renamed from: X.1zw, reason: invalid class name */
/* loaded from: 1zw.class */
public final class C1zw extends C00q implements C00m {
    public static final C1zw A00 = new C1zw();

    public C1zw() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        C1zu[] values = C1zu.values();
        int length = values.length;
        int A002 = 02J.A00(length);
        if (A002 < 16) {
            A002 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A002);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return linkedHashMap;
            }
            C1zu c1zu = values[i2];
            1BK.A1O(c1zu, linkedHashMap, c1zu.value);
            i = i2 + 1;
        }
    }
}
