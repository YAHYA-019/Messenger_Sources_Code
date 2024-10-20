package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.62g, reason: invalid class name */
/* loaded from: 62g.class */
public final class C62g {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;

    public C62g(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = 1Bq.A00(82525);
        this.A02 = 1Bu.A01(context, 49935);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (X.C2o7.A01(r301) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(com.facebook.messaging.model.threads.ThreadSummary r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            r0 = r302
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0a(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2d
            r0 = r302
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0f(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2d
            r0 = r302
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0h(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2d
            r0 = r302
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0T(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L38
        L2d:
            r0 = r301
            boolean r0 = X.C2o7.A01(r0)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L3a
        L38:
            r0 = 0
            r303 = r0
        L3a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62g.A00(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }

    public final boolean A01(FbUserSession fbUserSession, AnonymousClass622 anonymousClass622, Integer num) {
        boolean A00;
        11T.A0F(fbUserSession, 1);
        ThreadSummary threadSummary = anonymousClass622.A05;
        if (threadSummary == null || !A00(threadSummary)) {
            return false;
        }
        Message message = anonymousClass622.A03;
        11T.A09(message);
        if (!message.A18.booleanValue() || 5Q0.A06(message) || C1q7.A0Q(message) || C1q7.A0j(message) || 11T.A0O(C1q7.A06(message), "ADMIN") || !(!((60P) 1Lm.A05(this.A00, fbUserSession, 49926)).A00(message)) || ((C60h) this.A02.A00.get()).A00(anonymousClass622) == 63V.A03) {
            return false;
        }
        7Xj A01 = anonymousClass622.A04.A01(7Xj.class);
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
        return true;
    }

    public final boolean A02(ThreadSummary threadSummary) {
        boolean z = false;
        if (threadSummary != null && A00(threadSummary)) {
            6oD r0 = (6oD) this.A01.A00.get();
            if (6oD.A00(r0, false) && ((2yD) r0.A00.A00.get()).AZk(36320498313477618L)) {
                z = true;
            }
        }
        return z;
    }
}
