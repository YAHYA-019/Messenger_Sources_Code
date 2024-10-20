package X;

import com.facebook.messaging.polling.datamodels.PollingDraftOption;
import com.google.common.base.Predicate;

/* loaded from: In1.class */
public final class In1 implements Predicate {
    public static final In1 A00 = new In1();

    @Override // com.google.common.base.Predicate
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        PollingDraftOption pollingDraftOption = (PollingDraftOption) obj;
        boolean z = false;
        if ((pollingDraftOption != null ? pollingDraftOption.A05 : null) != null) {
            String str = pollingDraftOption.A05;
            11T.A0A(str);
            int length = str.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                int i2 = length;
                if (!z2) {
                    i2 = i;
                }
                boolean A1Z = 7zT.A1Z(str, i2);
                if (z2) {
                    if (!A1Z) {
                        break;
                    }
                    length--;
                } else if (A1Z) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            String A0z = GOq.A0z(length, i, str);
            if (A0z != null && A0z.length() != 0) {
                z = true;
            }
        }
        return z;
    }
}
