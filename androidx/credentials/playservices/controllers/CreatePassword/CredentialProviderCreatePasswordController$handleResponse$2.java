package androidx.credentials.playservices.controllers.CreatePassword;

import X.04S;
import X.0Q8;
import X.11T;
import X.C00q;
import X.KQl;
import X.MI4;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: CredentialProviderCreatePasswordController$handleResponse$2.class */
public final class CredentialProviderCreatePasswordController$handleResponse$2 extends C00q implements Function1 {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, KQl kQl) {
        11T.A0H(credentialProviderCreatePasswordController, kQl);
        MI4 mi4 = credentialProviderCreatePasswordController.callback;
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
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            11T.A0L("executor");
            throw 0Q8.createAndThrow();
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(CredentialProviderCreatePasswordController.this, kQl);
            }
        });
    }
}
