package X;

import android.net.Uri;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.50a, reason: invalid class name */
/* loaded from: 50a.class */
public final class C50a {
    public static HashMap A00(FbSharedPreferences fbSharedPreferences) {
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        1G2 r0 = C50b.A04;
        for (1G2 r02 : fbSharedPreferences.Asu(r0)) {
            String A09 = r02.A09(r0);
            if (A09.endsWith("/ts")) {
                long Av1 = fbSharedPreferences.Av1(r02, 0L);
                String decode = Uri.decode(A09.substring(0, A09.length() - "/ts".length()));
                if (decode != null) {
                    C50c c50c = (C50c) hashMap.get(decode);
                    if (c50c == null) {
                        c50c = new C50b(fbSharedPreferences, decode, true);
                        hashMap.put(decode, c50c);
                    }
                    c50c.A00 = Av1;
                } else {
                    hashSet.add(r02);
                }
            } else {
                if (A09.endsWith("/val")) {
                    long Av12 = fbSharedPreferences.Av1(r02, 0L);
                    String decode2 = Uri.decode(A09.substring(0, A09.length() - "/val".length()));
                    if (decode2 != null) {
                        C50b c50b = (C50b) hashMap.get(decode2);
                        if (c50b == null) {
                            c50b = new C50b(fbSharedPreferences, decode2, true);
                            hashMap.put(decode2, c50b);
                        }
                        if ((1 & Av12) != 0) {
                            ((C50c) c50b).A02 = true;
                        }
                        if ((2 & Av12) != 0) {
                            c50b.A06 = true;
                        }
                        if ((4 & Av12) != 0) {
                            ((C50c) c50b).A01 = true;
                        }
                        if ((8 & Av12) != 0) {
                            c50b.A05 = true;
                        }
                        if ((16 & Av12) != 0) {
                            c50b.A04 = true;
                        }
                        if ((32 & Av12) != 0) {
                            ((C50c) c50b).A03 = true;
                        }
                        c50b.A00 = Av12;
                    }
                }
                hashSet.add(r02);
            }
        }
        if (!hashSet.isEmpty()) {
            1Ql edit = fbSharedPreferences.edit();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                edit.Cdj((1G2) it.next());
            }
            edit.commit();
        }
        return hashMap;
    }
}
