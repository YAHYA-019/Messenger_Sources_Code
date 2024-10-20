package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.Kdw;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderGetSignInIntentController$handleResponse$3.class */
public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends C00q implements C00m {
    public final /* synthetic */ Kdw $response;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Kdw kdw) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = kdw;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Kdw kdw) {
        11T.A0H(credentialProviderGetSignInIntentController, kdw);
        credentialProviderGetSignInIntentController.getCallback().onResult(kdw);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5401invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5401invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final Kdw kdw = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, kdw);
            }
        });
    }
}
