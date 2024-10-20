package X;

import com.facebook.messaging.magicwords.model.MagicWord;
import com.facebook.messaging.magicwords.model.MagicWordRange;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* renamed from: X.7l4, reason: invalid class name */
/* loaded from: 7l4.class */
public abstract class C7l4 {
    public static final void A00(String str, java.util.Map map, Function2 function2, C04t c04t) {
        if (str == null || str.length() == 0 || map.isEmpty()) {
            return;
        }
        Iterator it = c04t.A04(str, 0).iterator();
        while (it.hasNext()) {
            C0zq A09 = ((0PH) it.next()).A02.A09(2);
            if (A09 != null) {
                String A13 = 1BK.A13(A09.A00);
                MagicWord magicWord = (MagicWord) map.get(A13);
                if (magicWord != null) {
                    07E r0 = A09.A01;
                    int i = ((07F) r0).A01 + 1;
                    int i2 = ((07F) r0).A00;
                    function2.invoke(new MagicWordRange(magicWord, i - i2, i2, false), A13);
                }
            }
        }
    }
}
