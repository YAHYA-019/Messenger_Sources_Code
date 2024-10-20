package X;

import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.63e, reason: invalid class name */
/* loaded from: 63e.class */
public final class C63e {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    public C63e(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A00 = 1Bq.A00(68201);
        this.A01 = 1Bu.A01(context, 49935);
    }

    public final boolean A00(AnonymousClass622 anonymousClass622, Integer num) {
        boolean A00;
        ThreadSummary threadSummary = anonymousClass622.A05;
        if (threadSummary == null || !ThreadKey.A0a(threadSummary.A0n)) {
            return false;
        }
        Message message = anonymousClass622.A03;
        11T.A09(message);
        if (5PY.A04 != message.A0C() || 5Q0.A06(message) || C1q7.A0Q(message) || C1q7.A0j(message) || message.A24 || 11T.A0O(C1q7.A06(message), "ADMIN") || ((C60h) this.A01.A00.get()).A00(anonymousClass622) == 63V.A03) {
            return false;
        }
        7Xm A01 = anonymousClass622.A04.A01(7Xm.class);
        if (A01 != null && A01.A01) {
            return false;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 4 || intValue == 5) {
                A00 = 62G.A00(anonymousClass622.A0E);
            } else {
                if (intValue != 2 && intValue != 3) {
                    return false;
                }
                A00 = 62G.A01(anonymousClass622.A0E);
            }
            if (A00) {
                return false;
            }
        }
        return ((89M) this.A00.A00.get()).A00();
    }
}
