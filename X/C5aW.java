package X;

import java.util.LinkedHashMap;

/* renamed from: X.5aW, reason: invalid class name */
/* loaded from: 5aW.class */
public final class C5aW extends C00q implements C00m {
    public static final C5aW A00 = new C5aW();

    public C5aW() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        5aU[] values = 5aU.values();
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
            5aU r0 = values[i2];
            linkedHashMap.put(Integer.valueOf(r0.serverConstant), r0);
            i = i2 + 1;
        }
    }
}
