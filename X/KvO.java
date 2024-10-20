package X;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: KvO.class */
public abstract class KvO {
    public static final void A00(Spannable spannable, Ls1 ls1, int i, int i2) {
        if (ls1 != null) {
            ArrayList A0z = 1BL.A0z(ls1);
            Iterator it = ls1.iterator();
            while (it.hasNext()) {
                A0z.add(((KsQ) it.next()).A00);
            }
            Locale[] localeArr = (Locale[]) A0z.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void A01(Spannable spannable, MNh mNh, int i, int i2, long j) {
        Object relativeSizeSpan;
        long A01 = LCI.A01(j);
        if (A01 == 4294967296L) {
            relativeSizeSpan = new AbsoluteSizeSpan(0KF.A01(mNh.D4S(j)), false);
        } else if (A01 != 8589934592L) {
            return;
        } else {
            relativeSizeSpan = new RelativeSizeSpan(JR1.A02(j));
        }
        spannable.setSpan(relativeSizeSpan, i, i2, 33);
    }
}
