package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.KQm;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderGetSignInIntentController$handleResponse$5.class */
public final class CredentialProviderGetSignInIntentController$handleResponse$5 extends C00q implements C00m {
    public final /* synthetic */ KQm $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, KQm kQm) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = kQm;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, KQm kQm) {
        11T.A0H(credentialProviderGetSignInIntentController, kQm);
        credentialProviderGetSignInIntentController.getCallback().BwR(kQm);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5403invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5403invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final KQm kQm = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$5.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, kQm);
            }
        });
    }
}
