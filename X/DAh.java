package X;

import java.text.Collator;
import java.util.Comparator;

/* loaded from: DAh.class */
public final class DAh implements Comparator {
    public final 1Br A00 = 1Bu.A00(83139);

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        BlL blL = (BlL) obj;
        BlL blL2 = (BlL) obj2;
        11T.A0H(blL, blL2);
        String str = blL.A01;
        String str2 = blL2.A01;
        int i = 0;
        if (str == null || str.length() == 0) {
            if (str2 != null && str2.length() != 0) {
                if (str == null) {
                    return 1;
                }
            }
            return i;
        }
        if (str.length() == 0) {
            return 1;
        }
        if (str2 == null || str2.length() == 0) {
            return -1;
        }
        i = ((Collator) 1Br.A0B(this.A00)).compare(str, str2);
        return i;
    }
}
