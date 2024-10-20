package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import fxcache.model.FxCalAccountLinkageInfo;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import java.util.concurrent.Executor;

/* renamed from: X.21k, reason: invalid class name */
/* loaded from: 21k.class */
public final class C21k extends C21l implements 1UN {
    public FxCalAccountLinkageInfo A00;
    public FxCalAccountLinkageInfoForSwitcher A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C1qM A06;
    public final MailboxCallback A07;

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C21k() {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = 66348(0x1032c, float:9.2973E-41)
            r302 = r0
            r0 = r302
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> La3
            X.1UP r0 = (X.1UP) r0     // Catch: java.lang.Throwable -> La3
            r1 = r301
            r0.A00(r1)
            X.0ty r0 = X.C0ty.A00
            r303 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r304 = r0
            java.lang.Integer r0 = X.0S2.A00
            r306 = r0
            fxcache.model.FxCalAccountLinkageInfo r0 = new fxcache.model.FxCalAccountLinkageInfo
            r307 = r0
            r0 = r307
            r1 = r306
            r2 = r303
            r3 = r304
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r307
            r0.A00 = r1
            fxcache.model.FxCalAccountLinkageInfoForSwitcher r0 = new fxcache.model.FxCalAccountLinkageInfoForSwitcher
            r307 = r0
            r0 = r307
            r1 = r306
            r2 = r303
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r307
            r0.A01 = r1
            r0 = 82769(0x14351, float:1.15984E-40)
            X.1Br r0 = X.1Bu.A00(r0)
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A02 = r1
            r0 = 16386(0x4002, float:2.2962E-41)
            X.1Br r0 = X.1Bq.A00(r0)
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A04 = r1
            r0 = 16385(0x4001, float:2.296E-41)
            X.1Br r0 = X.1Bq.A00(r0)
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A05 = r1
            r0 = 16477(0x405d, float:2.3089E-41)
            X.1Br r0 = X.1Bq.A00(r0)
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A03 = r1
            X.3aj r0 = new X.3aj
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = 1
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r307
            r0.A06 = r1
            X.LXA r0 = new X.LXA
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = 2
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r307
            r0.A07 = r1
            return
        La3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21k.<init>():void");
    }

    public static final void A00(C21k c21k) {
        MailboxFeature mailboxFeature = (MailboxFeature) 1Bn.A0A(33194);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new C3b5(mailboxFutureImpl, mailboxFeature, 20))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback((Executor) c21k.A03.A00.get(), c21k.A07);
    }

    public void AFz() {
        synchronized (this) {
            this.A00 = new FxCalAccountLinkageInfo(0S2.A0N, C0ty.A00, System.currentTimeMillis());
        }
    }
}
