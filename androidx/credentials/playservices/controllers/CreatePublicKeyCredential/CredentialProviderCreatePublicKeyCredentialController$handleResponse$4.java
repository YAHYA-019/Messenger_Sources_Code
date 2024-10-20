package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.04S;
import X.0Q8;
import X.11T;
import X.C00m;
import X.C00q;
import X.KQl;
import X.MI4;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderCreatePublicKeyCredentialController$handleResponse$4.class */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$4 extends C00q implements C00m {
    public final /* synthetic */ KQl $exception;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, KQl kQl) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$exception = kQl;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, KQl kQl) {
        11T.A0F(credentialProviderCreatePublicKeyCredentialController, 0);
        MI4 mi4 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (mi4 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        mi4.BwR(kQl);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5380invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5380invoke() {
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            11T.A0L("executor");
            throw 0Q8.createAndThrow();
        }
        final KQl kQl = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$4.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, kQl);
            }
        });
    }
}
