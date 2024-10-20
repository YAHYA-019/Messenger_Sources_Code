package androidx.credentials.playservices.controllers.BeginSignIn;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.KQm;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderBeginSignInController$handleResponse$5.class */
public final class CredentialProviderBeginSignInController$handleResponse$5 extends C00q implements C00m {
    public final /* synthetic */ KQm $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, KQm kQm) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = kQm;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, KQm kQm) {
        11T.A0H(credentialProviderBeginSignInController, kQm);
        credentialProviderBeginSignInController.getCallback().BwR(kQm);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5368invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5368invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final KQm kQm = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(CredentialProviderBeginSignInController.this, kQm);
            }
        });
    }
}
