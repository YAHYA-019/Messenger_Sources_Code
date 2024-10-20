package androidx.credentials.playservices.controllers.BeginSignIn;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.JfP;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderBeginSignInController$handleResponse$6.class */
public final class CredentialProviderBeginSignInController$handleResponse$6 extends C00q implements C00m {
    public final /* synthetic */ JfP $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$6(CredentialProviderBeginSignInController credentialProviderBeginSignInController, JfP jfP) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = jfP;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, JfP jfP) {
        11T.A0H(credentialProviderBeginSignInController, jfP);
        credentialProviderBeginSignInController.getCallback().BwR(jfP);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5369invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5369invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final JfP jfP = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$6.invoke$lambda$0(CredentialProviderBeginSignInController.this, jfP);
            }
        });
    }
}
