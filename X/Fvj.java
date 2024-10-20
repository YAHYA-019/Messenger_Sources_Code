package X;

import com.google.common.base.Supplier;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: Fvj.class */
public final class Fvj implements Supplier {
    public final int A00;
    public final Object A01;

    public Fvj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.google.common.base.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                Object obj = this.A01;
                try {
                    return C1my.A02(new Fvf(obj, 0), 1JW.A04(new Fvf(obj, 1), Arrays.asList(Locale.getISOCountries())));
                } catch (RuntimeException e) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Failed to construct a unique ISO3 index of items: ");
                    throw 1BK.A0s(AnonymousClass001.A0a(1JW.A04(new Fvf(obj, 1), Arrays.asList(Locale.getISOCountries())), A0k), e);
                }
            case 1:
                return ((F9H) this.A01).A06.A01();
            case 2:
                return Fca.A00(1BK.A05(), ((F9H) this.A01).A06, "disable_fingerprint_nonce");
            default:
                return this.A01;
        }
    }
}
