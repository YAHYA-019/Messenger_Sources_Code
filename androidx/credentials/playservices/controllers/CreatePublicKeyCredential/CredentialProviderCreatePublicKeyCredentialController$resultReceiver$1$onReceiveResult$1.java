package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.01I;
import X.01K;
import X.KQl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.functions.Function2;

/* loaded from: CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1.class */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 extends 01I implements Function2 {
    public CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final KQl invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) ((01K) this).receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
