package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.490, reason: invalid class name */
/* loaded from: 490.class */
public final class AnonymousClass490 extends 2UY {
    public final /* synthetic */ C48z A00;
    public final /* synthetic */ SettableFuture A01;

    public AnonymousClass490(C48z c48z, SettableFuture settableFuture) {
        this.A00 = c48z;
        this.A01 = settableFuture;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        this.A01.setException((Throwable) obj2);
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
        SettableFuture settableFuture;
        ImmutableList immutableList;
        2TS r0 = (2TS) obj2;
        C48z c48z = this.A00;
        C00i c00i = c48z.A02;
        if (!((1fF) c00i.get()).A06() || !1fF.A00((1fF) c00i.get()).AZk(36324204870127105L)) {
            if (((1fF) c00i.get()).A06()) {
                1fF r02 = (1fF) c00i.get();
                if (1fF.A01(r02, 1fF.A00(r02).AZk(36324204869733886L))) {
                    settableFuture = this.A01;
                    immutableList = r0.A05;
                    settableFuture.set(immutableList);
                    return;
                }
            }
            if (((1fF) c00i.get()).A06()) {
                1fF.A00((1fF) c00i.get()).AZk(36324204869668349L);
            }
            settableFuture = this.A01;
            immutableList = r0.A02;
            settableFuture.set(immutableList);
            return;
        }
        CbM cbM = (CbM) 1Bn.A0D(c48z.A00, 83053);
        FbUserSession fbUserSession = c48z.A01;
        11T.A0F(fbUserSession, 0);
        ?? obj3 = new Object();
        Long valueOf = 1fF.A00(CbM.A00(cbM)).AZk(36325222776852951L) ? Long.valueOf(CbM.A00(cbM).A02()) : null;
        Cxk cxk = new Cxk(1, fbUserSession, cbM, obj3);
        BDU bdu = (BDU) 1Lo.A09(fbUserSession, cbM.A00.A00, 84161);
        Boolean valueOf2 = Boolean.valueOf(((2eR) cbM.A06.A00.get()).A01());
        Boolean valueOf3 = Boolean.valueOf(CbM.A00(cbM).A08());
        ImmutableList of = ImmutableList.of();
        Boolean valueOf4 = Boolean.valueOf(1fF.A00(CbM.A00(cbM)).AZk(36323560624704246L));
        C00i c00i2 = cbM.A03.A00;
        Boolean valueOf5 = Boolean.valueOf(((2yD) c00i2.get()).AZk(36321194103816240L));
        Boolean valueOf6 = Boolean.valueOf(((2yD) c00i2.get()).AZk(36324505517313750L));
        Boolean valueOf7 = Boolean.valueOf(((2yD) c00i2.get()).AZk(36325141172474217L));
        Boolean valueOf8 = Boolean.valueOf(1fF.A00(CbM.A00(cbM)).AZk(36326232094168421L));
        PrivacyContext A00 = ((AnonymousClass224) cbM.A05.A00.get()).A00(AbE.A00(227));
        1Um AQV = bdu.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(cxk);
        if (!AQV.Cj2(new N7w(bdu, mailboxFutureImpl, A00, true, true, true, valueOf2, false, valueOf3, false, false, valueOf4, valueOf5, false, valueOf6, valueOf7, false, valueOf8, false, false, false, false, 30, valueOf, 0, of))) {
            mailboxFutureImpl.cancel(false);
        }
        this.A01.setFuture((ListenableFuture) obj3);
    }
}
