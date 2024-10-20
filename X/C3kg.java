package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.3kg, reason: invalid class name */
/* loaded from: 3kg.class */
public final class C3kg extends C00q implements C00m {
    public static final C3kg A00 = new C3kg();

    public C3kg() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0c = 1BK.A0c();
        3Ej[] values = 3Ej.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0c.build();
            }
            3Ej r0 = values[i2];
            A0c.put(r0.serverConstant, r0);
            i = i2 + 1;
        }
    }
}
