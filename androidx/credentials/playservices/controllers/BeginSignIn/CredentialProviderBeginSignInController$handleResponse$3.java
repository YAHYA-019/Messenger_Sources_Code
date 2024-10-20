package androidx.credentials.playservices.controllers.BeginSignIn;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.Kdw;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderBeginSignInController$handleResponse$3.class */
public final class CredentialProviderBeginSignInController$handleResponse$3 extends C00q implements C00m {
    public final /* synthetic */ Kdw $response;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Kdw kdw) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = kdw;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Kdw kdw) {
        11T.A0H(credentialProviderBeginSignInController, kdw);
        credentialProviderBeginSignInController.getCallback().onResult(kdw);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5365invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5365invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final Kdw kdw = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$3.invoke$lambda$0(CredentialProviderBeginSignInController.this, kdw);
            }
        });
    }
}
