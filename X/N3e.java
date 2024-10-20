package X;

import com.facebook.common.locale.Country;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.smartcapture.logging.MC;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: N3e.class */
public final class N3e {
    public static final ImmutableList A01 = ImmutableList.of(A01("AT"), A01("BE"), A01("BG"), A01("HR"), A01("CY"), A01("CZ"), A01("DK"), A01("EE"), A01("FI"), A01("FR"), A01("DE"), A01("GR"), A01("HU"), A01("IS"), A01("IE"), A01("IT"), A01("LV"), A01("LI"), A01("LT"), A01("LU"), A01("MT"), A01("NL"), A01("NO"), A01("PL"), A01("PT"), A01("RO"), A01("SK"), A01("SI"), A01("ES"), A01("SE"), A01("GB"));
    public final FI2 A00 = (FI2) 1Bn.A0A(99119);

    public static final N3e A00() {
        return new N3e();
    }

    public static String A01(String str) {
        return Country.A00(null, str).A00.getCountry();
    }

    public ImmutableList A02(PaymentItemType paymentItemType) {
        HashSet A1E = AbF.A1E(Arrays.asList(Locale.getISOCountries()));
        String BCy = FI2.A00(this.A00).BCy(MC.android_payment.purx_ofac_countries_blacklist);
        11T.A0A(BCy);
        1Du it = FI2.A01(BCy).iterator();
        while (it.hasNext()) {
            A1E.remove(it.next());
        }
        if (PaymentItemType.A0I.equals(paymentItemType)) {
            1Du it2 = A01.iterator();
            while (it2.hasNext()) {
                A1E.remove(it2.next());
            }
        }
        return ImmutableList.copyOf((Collection) A1E);
    }
}
