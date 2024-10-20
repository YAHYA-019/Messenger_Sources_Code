package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.2wp, reason: invalid class name */
/* loaded from: 2wp.class */
public final class C2wp {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A03 = new 1BV((1BY) null, 65708);
    public final C00i A04 = new 1BV((1BY) null, 32920);
    public final C00i A02 = new 1BQ(16467);

    public C2wp(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1hn A00(final C2wp c2wp, final C48a c48a) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < ((1qX) c48a).mResultSet.getCount(); i++) {
            linkedHashMap.put(Long.valueOf(((1qX) c48a).mResultSet.getLong(i, 4)), ((C48b) c2wp.A04.get()).A06(c48a, i));
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(linkedHashMap.keySet());
        ImmutableList build = builder.build();
        C00i c00i = c2wp.A03;
        MailboxFeature mailboxFeature = (MailboxFeature) c00i.get();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new Ian(4, mailboxFeature, mailboxFutureImpl, build))) {
            mailboxFutureImpl.cancel(false);
        }
        final 1FV A01 = A01(c2wp, mailboxFutureImpl);
        MailboxFeature mailboxFeature2 = (MailboxFeature) c00i.get();
        1Um AQV2 = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV2);
        if (!AQV2.Cj2(new Ian(2, mailboxFeature2, mailboxFutureImpl2, build))) {
            mailboxFutureImpl2.cancel(false);
        }
        final 1FV A012 = A01(c2wp, mailboxFutureImpl2);
        MailboxFeature mailboxFeature3 = (MailboxFeature) c00i.get();
        1Um AQV3 = mailboxFeature3.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl3 = new MailboxFutureImpl(AQV3);
        if (!AQV3.Cj2(new Ian(3, mailboxFeature3, mailboxFutureImpl3, build))) {
            mailboxFutureImpl3.cancel(false);
        }
        final 1FV A013 = A01(c2wp, mailboxFutureImpl3);
        MailboxFeature mailboxFeature4 = (MailboxFeature) c00i.get();
        1Um AQV4 = mailboxFeature4.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl4 = new MailboxFutureImpl(AQV4);
        if (!AQV4.Cj2(new Ian(1, mailboxFeature4, mailboxFutureImpl4, build))) {
            mailboxFutureImpl4.cancel(false);
        }
        final 1FV A014 = A01(c2wp, mailboxFutureImpl4);
        return 1Kd.A05(new ListenableFuture[]{A01, A012, A013, A014}).A01(new Callable() { // from class: X.5ar
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v8 ??, still in use, count: 2, list:
                  (r311v8 ??) from 0x04a5: PHI (r311v5 ??) = (r311v3 ??), (r311v8 ??) binds: [B:538:0x048d, B:65:0x0291] A[DONT_GENERATE, DONT_INLINE]
                  (r311v8 ?? I:X.7kC) from 0x0293: IPUT (r0v959 ?? I:com.google.common.collect.ImmutableMap), (r311v8 ?? I:X.7kC) A[Catch: Exception -> 0x03bb] X.7kC.A00 com.google.common.collect.ImmutableMap
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
                	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
                */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 4881
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5ar.call():java.lang.Object");
            }
        }, (Executor) c2wp.A02.get());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static SettableFuture A01(C2wp c2wp, 1X9 r302) {
        ?? obj = new Object();
        r302.addResultCallback((Executor) c2wp.A02.get(), new C3b7((SettableFuture) obj, 26));
        return obj;
    }

    public void A02(final C2wr c2wr, final ImmutableList immutableList, Executor executor) {
        final 2eH A00 = 2FP.A00(new D3a(this, 2), A01(this, ((1yC) this.A03.get()).A00((MailboxCallback) null, ImmutableList.of(), ImmutableList.of(), immutableList, -1, false)), (Executor) this.A02.get());
        A00.addListener(new Runnable() { // from class: X.5al
            public static final String __redex_internal_original_name = "MsysMontageViewerLoader$$ExternalSyntheticLambda5";

            @Override // java.lang.Runnable
            public final void run() {
                C2wp c2wp = this;
                ListenableFuture listenableFuture = A00;
                C2wr c2wr2 = c2wr;
                ImmutableList immutableList2 = immutableList;
                try {
                    c2wr2.C3k(((C48b) c2wp.A04.get()).A07((ImmutableList) listenableFuture.get()));
                } catch (InterruptedException | ExecutionException e) {
                    0fH.A12("MsysMontageViewerLoader", "Failed to load stories for buckets %s!", e, new Object[]{immutableList2});
                }
            }
        }, executor);
    }

    public void A03(C2wr c2wr, ImmutableList immutableList, Executor executor) {
        ((1yC) this.A03.get()).A00((MailboxCallback) null, ImmutableList.of(), immutableList, ImmutableList.of(), -1, false).addResultCallback(executor, new Cxe(this, c2wr, 9));
    }
}
