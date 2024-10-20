package X;

import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* loaded from: M6V.class */
public final class M6V extends C00q implements Function1 {
    public static final M6V A00 = new M6V();

    public M6V() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String str = (String) obj;
        11T.A0F(str, 0);
        String A18 = 4YU.A18(JR0.A0y(), str);
        if (A18.length() > 0) {
            StringBuilder A0k = AnonymousClass001.A0k();
            char charAt = A18.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale A0y = JR0.A0y();
                String valueOf2 = String.valueOf(charAt);
                11T.A0I(valueOf2, "null cannot be cast to non-null type java.lang.String");
                valueOf = valueOf2.toUpperCase(A0y);
                11T.A0A(valueOf);
                if (valueOf.length() > 1) {
                    if (charAt != 329) {
                        valueOf = 0Pz.A0K(1BK.A13(DKC.A19(valueOf, 1)), valueOf.charAt(0));
                    }
                } else if (valueOf.equals(AbJ.A1A(valueOf2))) {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                }
            } else {
                valueOf = String.valueOf(charAt);
            }
            A0k.append((Object) valueOf);
            A18 = AnonymousClass001.A0d(DKC.A19(A18, 1), A0k);
        }
        return A18;
    }
}
