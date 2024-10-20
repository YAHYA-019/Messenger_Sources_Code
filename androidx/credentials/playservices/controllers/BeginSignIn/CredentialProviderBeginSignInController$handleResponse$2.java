package androidx.credentials.playservices.controllers.BeginSignIn;

import X.04S;
import X.11T;
import X.C00q;
import X.KQm;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: CredentialProviderBeginSignInController$handleResponse$2.class */
public final class CredentialProviderBeginSignInController$handleResponse$2 extends C00q implements Function1 {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(1);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, KQm kQm) {
        11T.A0H(credentialProviderBeginSignInController, kQm);
        credentialProviderBeginSignInController.getCallback().BwR(kQm);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KQm) obj);
        return 04S.A00;
    }

    public final void invoke(final KQm kQm) {
        11T.A0F(kQm, 0);
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$2.invoke$lambda$0(CredentialProviderBeginSignInController.this, kQm);
            }
        });
    }
}
