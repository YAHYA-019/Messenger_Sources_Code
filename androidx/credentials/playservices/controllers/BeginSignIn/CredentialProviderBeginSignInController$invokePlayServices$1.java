package androidx.credentials.playservices.controllers.BeginSignIn;

import X.04S;
import X.11T;
import X.C00m;
import X.C00q;
import X.JfP;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderBeginSignInController$invokePlayServices$1.class */
public final class CredentialProviderBeginSignInController$invokePlayServices$1 extends C00q implements C00m {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$invokePlayServices$1(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        11T.A0F(credentialProviderBeginSignInController, 0);
        credentialProviderBeginSignInController.getCallback().BwR(JfP.A00(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5370invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5370invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$invokePlayServices$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$invokePlayServices$1.invoke$lambda$0(CredentialProviderBeginSignInController.this);
            }
        });
    }
}
