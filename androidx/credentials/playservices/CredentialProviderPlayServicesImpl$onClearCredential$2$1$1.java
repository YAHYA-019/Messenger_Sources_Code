package androidx.credentials.playservices;

import X.04S;
import X.11T;
import X.AnonymousClass001;
import X.C00m;
import X.C00q;
import X.KQg;
import X.MI4;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.class */
public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends C00q implements C00m {
    public final /* synthetic */ MI4 $callback;
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, MI4 mi4) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = mi4;
    }

    public static final void invoke$lambda$0(MI4 mi4, Exception exc) {
        11T.A0H(mi4, exc);
        mi4.BwR(new KQg("android.credentials.ClearCredentialStateException.TYPE_UNKNOWN", exc.getMessage()));
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5356invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5356invoke() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("During clear credential sign out failed with ");
        Log.w(CredentialProviderPlayServicesImpl.TAG, AnonymousClass001.A0a(this.$e, A0k));
        Executor executor = this.$executor;
        final MI4 mi4 = this.$callback;
        final Exception exc = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(MI4.this, exc);
            }
        });
    }
}
