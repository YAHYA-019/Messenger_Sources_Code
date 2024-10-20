package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4Mm, reason: invalid class name */
/* loaded from: 4Mm.class */
public final class C4Mm extends 2QB {
    public 1PA A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final FbUserSession A07;

    public C4Mm(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        this.A07 = fbUserSession;
        this.A05 = 1Bq.A00(16432);
        this.A03 = 1Bq.A00(83207);
        this.A06 = 1Bu.A03(r303.A00, 83654);
        this.A04 = 1Bq.A00(16511);
        this.A02 = 1Bq.A00(66227);
    }

    public static final void A00(FbUserSession fbUserSession, C4Mm c4Mm) {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        1P9 r0 = new 1P9((1I7) 1Hv.A02(A00, 65728));
        r0.A05(new C4Om(fbUserSession, c4Mm, 1), "com.facebook.orca.ACTION_FOLDER_COUNTS_UPDATED");
        1PA A02 = r0.A02();
        c4Mm.A00 = A02;
        A02.A00();
        A01(fbUserSession, c4Mm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
    
        if (r310 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(com.facebook.auth.usersession.FbUserSession r301, final X.C4Mm r302) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Mm.A01(com.facebook.auth.usersession.FbUserSession, X.4Mm):void");
    }

    public void A06() {
        2FT A02;
        final FbUserSession fbUserSession = this.A07;
        if (((C1uz) this.A02.A00.get()).A02(1)) {
            final C5d7 c5d7 = (C5d7) 1Lm.A07(fbUserSession, this.A01.A00, 67241);
            synchronized (c5d7) {
                5dA r0 = 5dA.A00;
                2eS r02 = c5d7.A00;
                if (r02 != null) {
                    ListenableFuture listenableFuture = r02.A01;
                    if (listenableFuture != null) {
                        A02 = 2FP.A02(r0, listenableFuture, (ExecutorService) c5d7.A03.A00.get());
                        11T.A0D(A02);
                    }
                }
                A02 = 2FP.A02(r0, C5d7.A00(c5d7), (ExecutorService) c5d7.A03.A00.get());
                11T.A0D(A02);
            }
            1Kd.A0F(new 1K9() { // from class: X.5dB
                public void onFailure(Throwable th) {
                    C4Mm c4Mm = this;
                    ((C01s) c4Mm.A04.A00.get()).D0v("message_requests_snippet_id_result", "Message requests Id result is null");
                    C4Mm.A00(FbUserSession.this, c4Mm);
                }

                public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    1G1 r03 = FbUserSession.this;
                    1G1 r04 = r03;
                    if (!r04.A07 && !11T.A0O(r04.A02, obj)) {
                        c5d7.A02();
                    }
                    C4Mm.A00(r03, this);
                }
            }, A02, (Executor) this.A05.A00.get());
        }
    }

    public void A07() {
        1PA r0;
        1PA r02 = this.A00;
        if (r02 == null || !r02.A03() || (r0 = this.A00) == null) {
            return;
        }
        r0.A01();
    }
}
