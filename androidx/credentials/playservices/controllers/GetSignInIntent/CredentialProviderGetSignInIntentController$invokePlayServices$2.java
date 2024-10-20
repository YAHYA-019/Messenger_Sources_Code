package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.JfP;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderGetSignInIntentController$invokePlayServices$2.class */
public final class CredentialProviderGetSignInIntentController$invokePlayServices$2 extends C00q implements C00m {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        11T.A0F(credentialProviderGetSignInIntentController, 0);
        credentialProviderGetSignInIntentController.getCallback().BwR(JfP.A00(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5406invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5406invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$invokePlayServices$2.invoke$lambda$0(CredentialProviderGetSignInIntentController.this);
            }
        });
    }
}
