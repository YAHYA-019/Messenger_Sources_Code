package androidx.credentials.playservices;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.MI4;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: CredentialProviderPlayServicesImpl$onClearCredential$1.class */
public final class CredentialProviderPlayServicesImpl$onClearCredential$1 extends C00q implements Function1 {
    public final /* synthetic */ MI4 $callback;
    public final /* synthetic */ CancellationSignal $cancellationSignal;
    public final /* synthetic */ Executor $executor;

    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1, reason: invalid class name */
    /* loaded from: CredentialProviderPlayServicesImpl$onClearCredential$1$1.class */
    public final class AnonymousClass1 extends C00q implements C00m {
        public final /* synthetic */ MI4 $callback;
        public final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, MI4 mi4) {
            super(0);
            this.$executor = executor;
            this.$callback = mi4;
        }

        public static final void invoke$lambda$0(MI4 mi4) {
            11T.A0F(mi4, 0);
            mi4.onResult(null);
        }

        @Override // X.C00m
        public /* bridge */ /* synthetic */ Object invoke() {
            m5355invoke();
            return 04S.A00;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5355invoke() {
            Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
            Executor executor = this.$executor;
            final MI4 mi4 = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl$onClearCredential$1.AnonymousClass1.invoke$lambda$0(MI4.this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$1(CancellationSignal cancellationSignal, Executor executor, MI4 mi4) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = mi4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Void) null);
        return 04S.A00;
    }

    public final void invoke(Void r302) {
        CredentialProviderPlayServicesImpl.Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
    }
}
