package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutorService;

/* renamed from: X.5d7, reason: invalid class name */
/* loaded from: 5d7.class */
public final class C5d7 implements 1UN {
    public 2eS A00;
    public final FbUserSession A01;
    public final C00i A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final Context A08;
    public final 1PA A09;
    public final 1De A0A;
    public final 1PB A0B;

    public C5d7(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0A = r303;
        this.A01 = fbUserSession;
        this.A03 = 1Bq.A00(16457);
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A08 = A00;
        this.A04 = 1HG.A00(A00, 65728);
        1BY r0 = r303.A00;
        this.A06 = 1Bu.A03(r0, 67242);
        this.A07 = 1Bq.A00(16626);
        this.A05 = 1Bq.A00(65755);
        1P9 r02 = new 1P9((1I7) this.A04.A00.get());
        r02.A05(new A37(this, 10), AbE.A00(456));
        1PA A02 = r02.A02();
        this.A09 = A02;
        ((1UP) 1Bi.A03(66348)).A01(this);
        this.A02 = 1Lm.A03(fbUserSession, r0, 49711);
        A02.A00();
        this.A0B = ((1P8) this.A07.A00.get()).A00("notification_instance");
    }

    public static final ListenableFuture A00(C5d7 c5d7) {
        3Ct A08;
        synchronized (c5d7) {
            C00i c00i = c5d7.A05.A00;
            if (((1Ew) c00i.get()).AXy() == 0S2.A0C) {
                C9L8 c9l8 = (C9L8) 1De.A00(c5d7.A0A, 67243);
                FbUserSession fbUserSession = c5d7.A01;
                A08 = 4YU.A0j();
                ((5dG) 4YU.A0o(fbUserSession, c9l8.A00, 67342)).A00(new A1b((SettableFuture) A08, 34));
            } else if (((1Ew) c00i.get()).AXy() != 0S2.A00) {
                A08 = 1Kd.A06();
            } else {
                2eS r0 = c5d7.A00;
                ListenableFuture listenableFuture = r0 != null ? r0.A01 : null;
                if (listenableFuture != null) {
                    A08 = 1Kd.A08(listenableFuture);
                } else {
                    Context A00 = FbInjector.A00();
                    ListenableFuture D3C = MoreExecutors.listeningDecorator((ExecutorService) c5d7.A03.A00.get()).D3C(new J4w(c5d7, 4));
                    85K r02 = new 85K(A00, c5d7, 1);
                    1JU r03 = 1JU.A01;
                    2eH A002 = 2FP.A00(r02, D3C, r03);
                    C2067Das c2067Das = new C2067Das(c5d7, 3);
                    c5d7.A00 = new 2eS(c2067Das, A002);
                    c5d7.A0B.BZQ("Badging - MessageRequestsSnippetFetcher - updatingMRSnippetFromServer");
                    1Kd.A0F(c2067Das, A002, r03);
                    A08 = 1Kd.A08(A002);
                }
            }
        }
        return A08;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r304 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2FT A01() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            X.7wY r0 = X.7wY.A00     // Catch: java.lang.Throwable -> L41
            r302 = r0
            r0 = r301
            X.2eS r0 = r0.A00     // Catch: java.lang.Throwable -> L41
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L35
            r0 = r303
            com.google.common.util.concurrent.ListenableFuture r0 = r0.A01     // Catch: java.lang.Throwable -> L41
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L35
        L18:
            r0 = r301
            X.1Br r0 = r0.A03     // Catch: java.lang.Throwable -> L41
            r303 = r0
            r0 = r303
            java.lang.Object r0 = X.1Br.A0B(r0)     // Catch: java.lang.Throwable -> L41
            r303 = r0
            r0 = r303
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0     // Catch: java.lang.Throwable -> L41
            r303 = r0
            r0 = r302
            r1 = r304
            r2 = r303
            X.2FT r0 = X.2FP.A02(r0, r1, r2)     // Catch: java.lang.Throwable -> L41
            r303 = r0
            r0 = r303
            X.11T.A0D(r0)     // Catch: java.lang.Throwable -> L41
            goto L3d
        L35:
            r0 = r301
            com.google.common.util.concurrent.ListenableFuture r0 = A00(r0)     // Catch: java.lang.Throwable -> L41
            r304 = r0
            goto L18
        L3d:
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            return r0
        L41:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5d7.A01():X.2FT");
    }

    public void A02() {
        synchronized (this) {
            2eS r0 = this.A00;
            if (r0 != null) {
                r0.A00(false);
            }
            this.A00 = null;
        }
    }

    public void AFz() {
        this.A09.A01();
    }
}
