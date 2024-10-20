package X;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* loaded from: JZa.class */
public final class JZa extends Spinner {
    public int A00;
    public int A01;
    public 1Im A02;
    public REk A03;
    public PhoneNumberUtil A04;
    public Locale A05;
    public ArrayList A06;
    public Fz7[] A07;
    public final AdapterView.OnItemSelectedListener A08;
    public final 1GS A09;

    public JZa(Context context) {
        super(context, 0);
        this.A09 = (1GS) 1Bi.A03(16504);
        this.A00 = 2132541786;
        A00(context, this);
        this.A08 = new LLC(this, 4);
        this.A01 = C98U.PRIMARY.colorInt;
    }

    public static void A00(Context context, JZa jZa) {
        jZa.A04 = (PhoneNumberUtil) 1Bi.A03(100133);
        String str = (String) 1Bn.A0E(context, (1BY) null, 99409);
        jZa.A05 = jZa.A09.A05();
        String[] iSOCountries = Locale.getISOCountries();
        jZa.A06 = AnonymousClass001.A0s();
        for (String str2 : iSOCountries) {
            int countryCodeForRegion = jZa.A04.getCountryCodeForRegion(str2);
            if (countryCodeForRegion != 0) {
                Collator collator = Fz7.A04;
                jZa.A06.add(new JwY(jZa, str2, 0Pz.A0T("+", countryCodeForRegion), new Locale(jZa.A05.getLanguage(), str2).getDisplayCountry(jZa.A05)));
            }
        }
        Collections.sort(jZa.A06);
        ArrayList arrayList = jZa.A06;
        Fz7[] fz7Arr = (Fz7[]) arrayList.toArray(new Fz7[arrayList.size()]);
        jZa.A07 = fz7Arr;
        jZa.setAdapter((SpinnerAdapter) new ArrayAdapter(jZa.getContext(), jZa.A00, 2131363413, fz7Arr));
        jZa.A01(str);
    }

    public void A01(String str) {
        if (1JF.A0A(str)) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            Fz7[] fz7Arr = this.A07;
            if (i2 >= fz7Arr.length) {
                return;
            }
            if (fz7Arr[i2].A02.equals(str)) {
                if (i2 != -1) {
                    setSelection(i2);
                    return;
                }
                return;
            }
            i = i2 + 1;
        }
    }
}
