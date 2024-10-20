package androidx.credentials.playservices.controllers.CreatePassword;

import X.04S;
import X.0Q8;
import X.11T;
import X.C00m;
import X.C00q;
import X.KQl;
import X.MI4;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderCreatePasswordController$invokePlayServices$1.class */
public final class CredentialProviderCreatePasswordController$invokePlayServices$1 extends C00q implements C00m {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$invokePlayServices$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        11T.A0F(credentialProviderCreatePasswordController, 0);
        MI4 mi4 = credentialProviderCreatePasswordController.callback;
        if (mi4 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        mi4.BwR(new KQl("android.credentials.CreateCredentialException.TYPE_UNKNOWN", CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5376invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5376invoke() {
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            11T.A0L("executor");
            throw 0Q8.createAndThrow();
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$invokePlayServices$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$invokePlayServices$1.invoke$lambda$0(CredentialProviderCreatePasswordController.this);
            }
        });
    }
}
