package X;

import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.orca.mca.MailboxOrca$ThreadViewDataObserverCallback;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4k0, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4k0.class */
public final class C07484k0 extends AbstractC07494k1 implements InterfaceC07554k7, InterfaceC07534k5 {
    public MailboxCallback A00;
    public MailboxOrca$ThreadViewDataObserverCallback A01;
    public C07764kq A02;
    public 4kO A03;
    public final 6Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final C07574k9 A08;
    public final 22B A09;
    public final C07594kL A0A;
    public final ExecutorService A0B;
    public final AtomicBoolean A0C;
    public final boolean A0D;

    public C07484k0(6Br r302, C07574k9 c07574k9, 22B r304, C07594kL c07594kL, ExecutorService executorService, boolean z) {
        11T.A0F(r304, 2);
        11T.A0F(executorService, 3);
        this.A0A = c07594kL;
        this.A09 = r304;
        this.A0B = executorService;
        this.A04 = r302;
        this.A08 = c07574k9;
        this.A0D = z;
        this.A03 = AbstractC07604kM.A00;
        this.A0C = new AtomicBoolean();
        this.A07 = 1Bq.A00(66584);
        this.A05 = 1Bq.A00(33036);
        this.A06 = 1Bq.A00(16385);
    }

    public static final void A00(C07484k0 c07484k0) {
        C07764kq c07764kq;
        synchronized (c07484k0) {
            c07484k0.A00 = null;
            c07484k0.A01 = null;
            c07484k0.A03 = AbstractC07604kM.A00;
            c07764kq = c07484k0.A02;
            c07484k0.A02 = null;
        }
        if (c07764kq != null) {
            c07764kq.D5r();
        }
        C07574k9 c07574k9 = c07484k0.A08;
        C07594kL c07594kL = c07484k0.A0A;
        int i = c07594kL.A00;
        ((4kI) c07574k9.A04.A00.get()).A01(c07594kL.A01, i, "stop_data_source");
        0fH.A0g(Integer.valueOf(i), "MailboxThreadSource", "onStopDataSource, %d");
        if (c07764kq != null) {
            ((1Lr) c07484k0.A05.A00.get()).A00(c07764kq, "ThreadViewDataObserver");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C07484k0 r301, int r302) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07484k0.A01(X.4k0, int):void");
    }

    public static final void A02(C07484k0 c07484k0, 4kO r302) {
        C00j.A05("MailboxThreadSourceImpl.setAndNotifyLastResponse", -210021588);
        try {
            synchronized (c07484k0) {
                c07484k0.A03 = r302;
            }
            C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, r302);
            c07484k0.A05(new 4kN(r302));
            C00j.A01(1414260542);
        } catch (Throwable th) {
            C00j.A01(-1232325579);
            throw th;
        }
    }

    public static void A03(AbstractC07504k2 abstractC07504k2, C07594kL c07594kL, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        sb.append(", thread type: ");
        sb.append(c07594kL.A03);
        sb.append(", thread key: ");
        sb.append(c07594kL.A08);
        sb.append(", observer size : ");
        sb.append(abstractC07504k2.A00.size());
        0fH.A0n("MailboxThreadSource", sb.toString());
    }

    public void A08(String str) {
        11T.A0F(str, 0);
        synchronized (this) {
            C07764kq c07764kq = this.A02;
            if (c07764kq == null) {
                0fH.A0n("MailboxThreadSource", "Anchoring was requested before the source was started.");
            } else {
                c07764kq.A04(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r0.A00 == 4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(boolean r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 != 0) goto L27
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.4kO r0 = r0.A03     // Catch: java.lang.Throwable -> L5a
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L25
            r0 = r303
            java.lang.Object r0 = r0.A03     // Catch: java.lang.Throwable -> L5a
            r303 = r0
            r0 = r303
            X.4kd r0 = (X.C07674kd) r0     // Catch: java.lang.Throwable -> L5a
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L25
            r0 = r303
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L5a
            r304 = r0
            goto L45
        L25:
            r0 = r301
            monitor-exit(r0)
        L27:
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.4kq r0 = r0.A02     // Catch: java.lang.Throwable -> L5a
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L51
            java.lang.String r0 = "MailboxThreadSource"
            r305 = r0
            java.lang.String r0 = "Clearing anchor was requested before the source was started."
            r303 = r0
            r0 = r305
            r1 = r303
            X.0fH.A0n(r0, r1)     // Catch: java.lang.Throwable -> L5a
            goto L4e
        L45:
            r0 = 4
            r306 = r0
            r0 = r304
            r1 = r306
            if (r0 != r1) goto L25
        L4e:
            r0 = r301
            monitor-exit(r0)
            return
        L51:
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            r1 = 0
            r0.A04(r1)
            return
        L5a:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07484k0.A09(boolean):void");
    }

    @Override // X.AbstractC07504k2, X.InterfaceC07514k3
    public void A6a(4kV r302) {
        11T.A0F(r302, 0);
        super.A6a(r302);
        C07594kL c07594kL = this.A0A;
        if (c07594kL.A0D) {
            A03(this, c07594kL, r302, "addObserver: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.InterfaceC07554k7
    public AnonymousClass207 Asi() {
        return AbstractC07604kM.A01;
    }

    @Override // X.AbstractC07504k2, X.InterfaceC07514k3
    public void Cei(4kV r302) {
        11T.A0F(r302, 0);
        super.Cei(r302);
        C07594kL c07594kL = this.A0A;
        if (c07594kL.A0D) {
            A03(this, c07594kL, r302, "removeObserver: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.InterfaceC07544k6
    public void Cgt(int i) {
        if (i == 2 || !11T.A0O(Looper.myLooper(), Looper.getMainLooper())) {
            A01(this, i);
        } else {
            this.A0B.execute(new 7SQ(this, i));
        }
    }
}
