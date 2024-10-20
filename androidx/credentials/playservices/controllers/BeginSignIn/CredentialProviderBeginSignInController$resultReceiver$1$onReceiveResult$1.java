package androidx.credentials.playservices.controllers.BeginSignIn;

import X.01I;
import X.01K;
import X.KQm;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.functions.Function2;

/* loaded from: CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1.class */
public final /* synthetic */ class CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 extends 01I implements Function2 {
    public CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final KQm invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) ((01K) this).receiver).getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
