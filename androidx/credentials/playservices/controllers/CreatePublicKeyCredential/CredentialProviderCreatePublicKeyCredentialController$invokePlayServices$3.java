package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.04S;
import X.0Q8;
import X.11T;
import X.C00m;
import X.C00q;
import X.KQl;
import X.MI4;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3.class */
public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3 extends C00q implements C00m {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        11T.A0F(credentialProviderCreatePublicKeyCredentialController, 0);
        MI4 mi4 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (mi4 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        mi4.BwR(new KQl("android.credentials.CreateCredentialException.TYPE_UNKNOWN", CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5390invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5390invoke() {
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            11T.A0L("executor");
            throw 0Q8.createAndThrow();
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this);
            }
        });
    }
}
