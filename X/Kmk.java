package X;

import androidx.navigation.Navigator$Name;

/* loaded from: Kmk.class */
public final class Kmk {
    public final String A00(Class cls) {
        11T.A0F(cls, 0);
        java.util.Map map = L2u.A02;
        String A0b = AnonymousClass001.A0b(cls, map);
        if (A0b == null) {
            Navigator$Name navigator$Name = (Navigator$Name) cls.getAnnotation(Navigator$Name.class);
            if (navigator$Name != null) {
                A0b = navigator$Name.value();
                if (A0b != null && A0b.length() > 0) {
                    map.put(cls, A0b);
                }
            }
            throw 0Pz.A05("No @Navigator.Name annotation found for ", cls.getSimpleName());
        }
        11T.A0D(A0b);
        return A0b;
    }
}
