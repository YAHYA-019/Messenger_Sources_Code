package androidx.credentials.playservices.controllers.BeginSignIn;

import X.04S;
import X.0CL;
import X.11T;
import X.C00m;
import X.C00q;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderBeginSignInController$handleResponse$4.class */
public final class CredentialProviderBeginSignInController$handleResponse$4 extends C00q implements C00m {
    public final /* synthetic */ 0CL $exception;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, 0CL r303) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$exception = r303;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, 0CL r302) {
        11T.A0H(credentialProviderBeginSignInController, r302);
        credentialProviderBeginSignInController.getCallback().BwR(r302.element);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5367invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5367invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final 0CL r0 = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$4.invoke$lambda$0(CredentialProviderBeginSignInController.this, r0);
            }
        });
    }
}
