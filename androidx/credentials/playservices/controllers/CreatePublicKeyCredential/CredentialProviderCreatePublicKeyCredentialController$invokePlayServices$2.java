package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.04S;
import X.0Q8;
import X.11T;
import X.C00m;
import X.C00q;
import X.KQl;
import X.MI4;
import java.util.concurrent.Executor;

/* loaded from: CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2.class */
public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 extends C00q implements C00m {
    public final /* synthetic */ Throwable $t;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$t = th;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        11T.A0H(credentialProviderCreatePublicKeyCredentialController, th);
        MI4 mi4 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (mi4 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        mi4.BwR(new KQl("android.credentials.CreateCredentialException.TYPE_UNKNOWN", th.getMessage()));
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5388invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5388invoke() {
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            11T.A0L("executor");
            throw 0Q8.createAndThrow();
        }
        final Throwable th = this.$t;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, th);
            }
        });
    }
}
