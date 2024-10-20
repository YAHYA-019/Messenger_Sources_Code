package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Fk7.class */
public final class Fk7 implements 55B {
    public final MigColorScheme A00;
    public final String A01;
    public final String A02;

    public Fk7(MigColorScheme migColorScheme, String str, String str2) {
        this.A00 = migColorScheme;
        this.A02 = str;
        this.A01 = str2;
    }

    public static void A00(55E r301, AnonymousClass557 anonymousClass557, MigColorScheme migColorScheme, String str, String str2) {
        anonymousClass557.A04 = new Fk7(migColorScheme, str, str2);
        anonymousClass557.A05 = r301;
    }

    public boolean BVh(55B r302) {
        if (r302 == null || !11T.A0O(r302.getClass(), Fk7.class)) {
            return false;
        }
        Fk7 fk7 = (Fk7) r302;
        String str = this.A01;
        return (str == null || str.length() == 0 || str.equals(fk7.A01)) && 11T.A0O(this.A02, fk7.A02) && 11T.A0O(this.A00, fk7.A00);
    }
}
