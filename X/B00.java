package X;

import android.preference.ListPreference;
import android.preference.Preference;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.Iterator;
import java.util.List;

/* loaded from: B00.class */
public final class B00 extends C1rj {
    public MigColorScheme A00;
    public String A01;
    public List A02;
    public List A03;
    public java.util.Map A04;
    public boolean A05;

    public B00() {
        super("M4NotificationPreferenceLayout");
    }

    public static void A00(CQY cqy, List list, java.util.Map map) {
        String A0b;
        if (map != null && (A0b = AnonymousClass001.A0b(list, map)) != null) {
            cqy.A0P(A0b);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CMB cmb = (CMB) it.next();
            Object obj = cmb.A01;
            if (obj instanceof DFo) {
                ((DFo) obj).ACE();
            }
            int i = cmb.A00;
            if (i == 1) {
                cqy.A0I(cmb.A02, ((Preference) obj).getTitle(), ((Preference) obj).getSummary() != null ? ((Preference) obj).getSummary() : "");
            } else if (i == 2) {
                cqy.A0J(cmb.A02, ((Preference) obj).getTitle(), ((Preference) obj).getSummary() != null ? ((Preference) obj).getSummary() : "", cmb.A04);
            } else if (obj instanceof DNg) {
                ListPreference listPreference = (ListPreference) obj;
                9hR r0 = new 9hR();
                r0.A05 = listPreference.getTitle();
                r0.A04 = listPreference.getSummary() != null ? listPreference.getSummary() : "";
                cqy.A0F(r0.A01());
                CharSequence[] entries = listPreference.getEntries();
                CharSequence[] entryValues = listPreference.getEntryValues();
                CNf cNf = new CNf();
                CNf.A01(cNf, listPreference, 4);
                cNf.A01 = cmb.A03;
                for (int i2 = 0; i2 < entries.length; i2++) {
                    cNf.A05(entries[i2], entryValues[i2]);
                }
                CNf.A00(cNf, cqy);
            }
        }
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A05), this.A00, this.A01, this.A04, this.A02, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A00;
        boolean z = this.A05;
        List list = this.A03;
        List list2 = this.A02;
        java.util.Map map = this.A04;
        String str = this.A01;
        CQY A00 = ((C1i) 1Bn.A0A(83250)).A00(r302, migColorScheme);
        if (!z) {
            int i = 9GF.A00;
            int i2 = 9GF.A01;
            LightColorScheme.A00();
            A00.A0L(new C55g(C1u7.A0A, migColorScheme, 2KE.A04, str, i, i2, i2, -1, false));
        }
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A00(A00, (List) it.next(), map);
                if (it.hasNext()) {
                    A00.A0A();
                }
            }
        } else {
            A00(A00, list, map);
        }
        return A00.A09();
    }
}
