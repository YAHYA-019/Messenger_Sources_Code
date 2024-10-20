package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderGetSignInIntentController$invokePlayServices$1.class */
public final class CredentialProviderGetSignInIntentController$invokePlayServices$1 extends C00q implements C00m {
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$1(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = exc;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        11T.A0H(credentialProviderGetSignInIntentController, exc);
        credentialProviderGetSignInIntentController.getCallback().BwR(exc);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5405invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5405invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final Exception exc = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$invokePlayServices$1.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, exc);
            }
        });
    }
}
