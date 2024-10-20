package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.04S;
import X.11T;
import X.C00q;
import X.KQm;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: CredentialProviderGetSignInIntentController$handleResponse$2.class */
public final class CredentialProviderGetSignInIntentController$handleResponse$2 extends C00q implements Function1 {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(1);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, KQm kQm) {
        11T.A0H(credentialProviderGetSignInIntentController, kQm);
        credentialProviderGetSignInIntentController.getCallback().BwR(kQm);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KQm) obj);
        return 04S.A00;
    }

    public final void invoke(final KQm kQm) {
        11T.A0F(kQm, 0);
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$2.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, kQm);
            }
        });
    }
}
