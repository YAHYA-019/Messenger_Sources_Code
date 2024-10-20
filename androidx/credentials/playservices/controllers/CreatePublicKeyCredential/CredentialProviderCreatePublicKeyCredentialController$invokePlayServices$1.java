package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.04S;
import X.0Q8;
import X.11T;
import X.C00m;
import X.C00q;
import X.C3005Jft;
import X.MI4;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1.class */
public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1 extends C00q implements C00m {
    public final /* synthetic */ JSONException $e;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$e = jSONException;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        C3005Jft JSONExceptionToPKCError;
        11T.A0H(credentialProviderCreatePublicKeyCredentialController, jSONException);
        MI4 mi4 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (mi4 == null) {
            11T.A0L("callback");
            throw 0Q8.createAndThrow();
        }
        JSONExceptionToPKCError = credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException);
        mi4.BwR(JSONExceptionToPKCError);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5386invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5386invoke() {
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            11T.A0L("executor");
            throw 0Q8.createAndThrow();
        }
        final JSONException jSONException = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
            }
        });
    }
}
