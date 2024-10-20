package X;

import com.facebook.msys.mca.MailboxNullable;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: X.3hk, reason: invalid class name */
/* loaded from: 3hk.class */
public final /* synthetic */ class C3hk implements Runnable {
    public static final String __redex_internal_original_name = "MsysAdvancedCryptoLookupService$$ExternalSyntheticLambda6";
    public final /* synthetic */ 5P7 A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ SettableFuture A02;

    public /* synthetic */ C3hk(5P7 r302, SettableFuture settableFuture, SettableFuture settableFuture2) {
        this.A00 = r302;
        this.A01 = settableFuture;
        this.A02 = settableFuture2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        5P7 r0 = this.A00;
        SettableFuture settableFuture = this.A01;
        1FV r02 = this.A02;
        try {
            try {
                MailboxNullable mailboxNullable = (MailboxNullable) settableFuture.get();
                mailboxNullable.getClass();
                1qW r03 = (1qW) mailboxNullable.value;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                if (r03 == null) {
                    0fH.A0o("MsysAdvancedCryptoLookupService", "orcaThreadList == null");
                    r02.set(builder.build());
                    return;
                }
                if (1qX.A00(r03) == 0) {
                    0fH.A0n("MsysAdvancedCryptoLookupService", "orcaThreadList.count() == 0");
                }
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= 1qX.A00(r03)) {
                        r02.set(builder.build());
                        return;
                    } else {
                        builder.m11011add((Object) ((C21Y) r0.A06.get()).A08(new C1yd(r03, i2)).A00);
                        i = i2 + 1;
                    }
                }
            } catch (ExecutionException unused) {
                e = r02.getCause();
                e.getClass();
                r02.setException(e);
            }
        } catch (InterruptedException | RuntimeException e2) {
            e = e2;
            r02.setException(e);
        }
    }
}
