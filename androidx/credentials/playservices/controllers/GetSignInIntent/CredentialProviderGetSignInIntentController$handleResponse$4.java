package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.04S;
import X.0CL;
import X.11T;
import X.C00m;
import X.C00q;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderGetSignInIntentController$handleResponse$4.class */
public final class CredentialProviderGetSignInIntentController$handleResponse$4 extends C00q implements C00m {
    public final /* synthetic */ 0CL $exception;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$4(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, 0CL r303) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$exception = r303;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, 0CL r302) {
        11T.A0H(credentialProviderGetSignInIntentController, r302);
        credentialProviderGetSignInIntentController.getCallback().BwR(r302.element);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5402invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5402invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final 0CL r0 = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, r0);
            }
        });
    }
}
