package androidx.credentials.playservices.controllers;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.MI4;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderController$maybeReportErrorFromResultReceiver$1.class */
public final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends C00q implements C00m {
    public final /* synthetic */ MI4 $callback;
    public final /* synthetic */ Object $exception;
    public final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, MI4 mi4, Object obj) {
        super(0);
        this.$executor = executor;
        this.$callback = mi4;
        this.$exception = obj;
    }

    public static final void invoke$lambda$0(MI4 mi4, Object obj) {
        11T.A0H(mi4, obj);
        mi4.BwR(obj);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5396invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5396invoke() {
        Executor executor = this.$executor;
        final MI4 mi4 = this.$callback;
        final Object obj = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderController$maybeReportErrorFromResultReceiver$1.invoke$lambda$0(MI4.this, obj);
            }
        });
    }
}
