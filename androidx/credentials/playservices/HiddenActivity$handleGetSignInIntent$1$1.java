package androidx.credentials.playservices;

import X.04S;
import X.0Pz;
import X.11T;
import X.C00q;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.functions.Function1;

/* loaded from: HiddenActivity$handleGetSignInIntent$1$1.class */
public final class HiddenActivity$handleGetSignInIntent$1$1 extends C00q implements Function1 {
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ HiddenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleGetSignInIntent$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PendingIntent) obj);
        return 04S.A00;
    }

    public final void invoke(PendingIntent pendingIntent) {
        try {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            11T.A0D(resultReceiver);
            hiddenActivity2.setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, 0Pz.A1B("During get sign-in intent, one tap ui intent sender failure: ", e));
        }
    }
}
