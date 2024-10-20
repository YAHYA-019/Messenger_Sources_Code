package androidx.credentials.playservices.controllers.CreatePassword;

import X.04S;
import X.0Q8;
import X.11T;
import X.C00m;
import X.C00q;
import X.Kdu;
import X.MI4;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderCreatePasswordController$handleResponse$3.class */
public final class CredentialProviderCreatePasswordController$handleResponse$3 extends C00q implements C00m {
    public final /* synthetic */ Kdu $response;
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Kdu kdu) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = kdu;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Kdu kdu) {
        11T.A0H(credentialProviderCreatePasswordController, kdu);
        MI4 mi4 = credentialProviderCreatePasswordController.callback;
        if (mi4 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        mi4.onResult(kdu);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5375invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5375invoke() {
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            11T.A0L("executor");
            throw 0Q8.createAndThrow();
        }
        final Kdu kdu = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(CredentialProviderCreatePasswordController.this, kdu);
            }
        });
    }
}
