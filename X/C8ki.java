package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* renamed from: X.8ki, reason: invalid class name */
/* loaded from: 8ki.class */
public final class C8ki extends C1rj {
    public 6MO A00;
    public MigColorScheme A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public C8ki() {
        super("MessageRequestRemediationActionsComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02, this.A03, this.A04, this.A05, Boolean.valueOf(this.A07), this.A06};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010e, code lost:
    
        if (r0.length() == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0132, code lost:
    
        if (r0.length() == 0) goto L17;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8ki.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C1266Ac8 c1266Ac8;
        ThreadKey threadKey;
        1F9 r304;
        int i;
        int i2 = r302.A01;
        if (i2 == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i2 == 766065424) {
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            1Iw r03 = r0.A00;
            6MO r04 = ((C8ki) r02).A00;
            11T.A0H(r03, r04);
            Context A0A = 7zL.A0A(r03);
            6MN r05 = r04.A00;
            ThreadSummary threadSummary = r05.A00;
            if (threadSummary == null) {
                return null;
            }
            ((7EM) r05.A0A.get()).A01(A0A, r05.A05, r05.A06, threadSummary, "thread", r05.A0M);
            return null;
        }
        if (i2 != 988335545) {
            return null;
        }
        1Iv r06 = r302.A00;
        1Is r07 = r06.A01;
        1Iw r08 = r06.A00;
        6MO r09 = ((C8ki) r07).A00;
        11T.A0H(r08, r09);
        7zL.A1L(r08);
        6MN r010 = r09.A00;
        boolean A01 = 6MN.A01(r010);
        ThreadSummary threadSummary2 = r010.A00;
        if (!A01) {
            User user = r010.A01;
            if (threadSummary2 == null) {
                return null;
            }
            if (user == null) {
                0fH.A0o("MessageRequestHintCardPresenter", "user is null when clicking on actions in negative actions sheet");
                return null;
            }
            ((7EN) 1De.A00(((7EM) r010.A0A.get()).A02, 50188)).A07(r010.A05, threadSummary2, threadSummary2.A0g == 1F9.A0Q ? BNT.A0K : BNT.A0B, user);
            c1266Ac8 = (C1266Ac8) r010.A0C.get();
            threadKey = threadSummary2.A0n;
            11T.A0A(threadKey);
            r304 = threadSummary2.A0g;
            if (r304 == null) {
                r304 = 1F9.A0N;
            }
            i = 2;
        } else {
            if (threadSummary2 == null) {
                return null;
            }
            ((7EM) r010.A0A.get()).A02(r010.A05, r010.A06, threadSummary2);
            c1266Ac8 = (C1266Ac8) r010.A0C.get();
            threadKey = threadSummary2.A0n;
            11T.A0A(threadKey);
            r304 = threadSummary2.A0g;
            if (r304 == null) {
                r304 = 1F9.A0N;
            }
            i = 10;
        }
        c1266Ac8.A04(r304, threadKey, r010.A0M, i);
        return null;
    }
}
