package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: Kvl.class */
public abstract class Kvl {
    public static final AutofillData A00(C11424wg c11424wg, C11384wc c11384wc) {
        8Lq r311;
        11T.A0F(c11424wg, 0);
        String BDB = c11384wc.A00.BDB(1GD.A07, 36874789625594261L);
        11T.A0D(BDB);
        8Lq r307 = null;
        if (11T.A0O(BDB, "recent")) {
            r311 = null;
            r307 = (8Lq) c11424wg.A0K.A02;
        } else if (11T.A0O(BDB, "recent_crossapp")) {
            C82b c82b = c11424wg.A0K;
            r307 = (8Lq) c82b.A02;
            r311 = (8Lq) c82b.A00;
        } else {
            r311 = null;
        }
        java.util.Map A01 = Kvk.A01(r307);
        java.util.Map A012 = Kvk.A01(r311);
        LinkedHashMap A06 = 04R.A06(Kvk.A01((8Lq) 0QD.A0J((List) c11424wg.A0B.A00, 0)));
        Set set = c11424wg.A03.A07;
        if (set != null) {
            for (Object obj : set) {
                CharSequence charSequence = (CharSequence) A06.get(obj);
                if (charSequence == null || charSequence.length() == 0) {
                    CharSequence charSequence2 = (CharSequence) A01.get(obj);
                    A06.put(obj, (charSequence2 == null || charSequence2.length() == 0) ? A012.get(obj) : A01.get(obj));
                }
            }
        }
        return new AutofillData(A06);
    }

    public static final java.util.Map A01(C11424wg c11424wg, C11384wc c11384wc) {
        LinkedHashMap A0G;
        CharSequence charSequence;
        CharSequence charSequence2;
        1BK.A1M(c11424wg, c11384wc);
        if (!c11384wc.A0C(false) && !c11384wc.A08() && !c11384wc.A09()) {
            C82b c82b = c11424wg.A0K;
            if (c82b.A00 != null || c82b.A02 != null) {
                boolean z = false;
                String BDB = c11384wc.A00.BDB(1GD.A07, 36874789625594261L);
                11T.A0D(BDB);
                if (!11T.A0O(BDB, "control")) {
                    java.util.Map A01 = Kvk.A01((8Lq) c82b.A02);
                    java.util.Map A012 = Kvk.A01((8Lq) c82b.A00);
                    java.util.Map A013 = Kvk.A01((8Lq) 0QD.A0J((List) c11424wg.A0B.A00, 0));
                    java.util.Map A0v = JQz.A0v(A00(c11424wg, c11384wc));
                    11T.A0A(A0v);
                    LinkedHashSet A15 = 7zL.A15();
                    LinkedHashSet A152 = 7zL.A15();
                    Set set = c11424wg.A03.A07;
                    if (set != null) {
                        for (Object obj : set) {
                            CharSequence charSequence3 = (CharSequence) A013.get(obj);
                            if (charSequence3 == null || charSequence3.length() == 0) {
                                CharSequence charSequence4 = (CharSequence) A0v.get(obj);
                                if (charSequence4 == null || charSequence4.length() == 0 || (charSequence2 = (CharSequence) A01.get(obj)) == null || charSequence2.length() == 0) {
                                    CharSequence charSequence5 = (CharSequence) A0v.get(obj);
                                    if (charSequence5 != null && charSequence5.length() != 0 && (charSequence = (CharSequence) A012.get(obj)) != null && charSequence.length() != 0) {
                                        A152.add(obj);
                                    }
                                } else {
                                    A15.add(obj);
                                }
                                z = true;
                            }
                        }
                    }
                    A0G = 1BK.A1C();
                    if (z) {
                        A0G.put("supplemented_wallet_data_from_recent", C7kP.A00(A15));
                        A0G.put("supplemented_wallet_data_from_crossapp", C7kP.A00(A152));
                        return A0G;
                    }
                    return A0G;
                }
            }
        }
        A0G = 04R.A0G();
        return A0G;
    }
}
