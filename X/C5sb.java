package X;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.5sb, reason: invalid class name */
/* loaded from: 5sb.class */
public final class C5sb {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1De A06;

    public C5sb(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        this.A05 = 1Bu.A03(r0, 16428);
        this.A00 = 1Bq.A00(83818);
        this.A02 = 1Bq.A00(49797);
        this.A01 = 1Bu.A03(r0, 83815);
        this.A04 = 1Bu.A03(r0, 83816);
        this.A03 = 1Bq.A00(83817);
    }

    public static final boolean A00(C7x c7x, String str, String str2) {
        String str3;
        11T.A0F(str, 1);
        ShortcutInfo shortcutInfo = c7x.A02;
        11T.A0A(shortcutInfo);
        boolean z = false;
        if (shortcutInfo.getLongLabel() != null && 0CV.A0Y(str, shortcutInfo.getLongLabel()) && (str3 = c7x.A04) != null && 0CV.A0Y(str2, str3)) {
            z = true;
        }
        return z;
    }

    public final C7x A01(Context context, Bitmap bitmap, C7x c7x, ThreadSummary threadSummary) {
        11T.A0F(context, 0);
        11T.A0F(threadSummary, 1);
        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0E(context, (1BY) null, 16428));
        COl cOl = (COl) this.A00.A00.get();
        11T.A0F(A04, 0);
        String id = c7x.A02.getId();
        11T.A0A(id);
        C7x A02 = COl.A02(context, bitmap, A04, cOl, threadSummary, id);
        ((ShortcutManager) this.A03.A00.get()).pushDynamicShortcut(A02.A02);
        return A02;
    }

    public final C7x A02(Context context, Bitmap bitmap, ThreadKey threadKey, String str, String str2) {
        11T.A0F(str, 2);
        C7x A03 = ((COl) 1Br.A0B(this.A00)).A03(context, bitmap, threadKey, str, str2);
        ((ShortcutManager) 1Br.A0B(this.A03)).pushDynamicShortcut(A03.A02);
        return A03;
    }

    public final void A03(Context context, C7x c7x, ThreadSummary threadSummary) {
        11T.A0F(context, 0);
        5bF r0 = (5bF) 1Br.A0B(this.A02);
        5bF.A03((ParticipantInfo) null, threadSummary.A0n, threadSummary, new Cnl(context, c7x, this, threadSummary), r0, false);
    }

    public final boolean A04(FbUserSession fbUserSession, C7x c7x, ThreadSummary threadSummary) {
        11T.A0F(fbUserSession, 0);
        11T.A0F(threadSummary, 2);
        String A00 = ((C5sc) this.A01.A00.get()).A00(fbUserSession, threadSummary);
        ShortcutInfo shortcutInfo = c7x.A02;
        11T.A0A(shortcutInfo);
        boolean z = false;
        if (shortcutInfo.getLongLabel() != null && 0CV.A0Y(A00, shortcutInfo.getLongLabel())) {
            if (c7x.A00 == ((C08) this.A04.A00.get()).A00(fbUserSession, threadSummary)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A05
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1EZ r0 = (X.1EZ) r0
            com.facebook.auth.usersession.FbUserSession r0 = X.1Fw.A04(r0)
            r303 = r0
            r0 = r301
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.5sc r0 = (X.C5sc) r0
            r1 = r303
            r2 = r302
            java.lang.String r0 = r0.A00(r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3c
            r0 = r304
            int r0 = r0.length()
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L3f
        L3c:
            r0 = 1
            r306 = r0
        L3f:
            r0 = r306
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5sb.A05(com.facebook.messaging.model.threads.ThreadSummary):boolean");
    }
}
