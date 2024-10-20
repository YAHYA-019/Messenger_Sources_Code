package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.04S;
import X.0Q8;
import X.11T;
import X.C00q;
import X.KQl;
import X.MI4;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: CredentialProviderCreatePublicKeyCredentialController$handleResponse$2.class */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$2 extends C00q implements Function1 {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(1);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, KQl kQl) {
        11T.A0H(credentialProviderCreatePublicKeyCredentialController, kQl);
        MI4 mi4 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (mi4 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        mi4.BwR(kQl);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KQl) obj);
        return 04S.A00;
    }

    public final void invoke(final KQl kQl) {
        11T.A0F(kQl, 0);
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            11T.A0L("executor");
            throw 0Q8.createAndThrow();
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$2.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, kQl);
            }
        });
    }
}
