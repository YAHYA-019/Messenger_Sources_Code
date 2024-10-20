package X;

import android.content.Intent;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.messaging.zombification.MessengerOnlyPhoneReconfirmationActivity;

/* loaded from: Fat.class */
public final class Fat implements GE7 {
    public final /* synthetic */ MessengerOnlyPhoneReconfirmationActivity A00;

    public Fat(MessengerOnlyPhoneReconfirmationActivity messengerOnlyPhoneReconfirmationActivity) {
        this.A00 = messengerOnlyPhoneReconfirmationActivity;
    }

    @Override // X.GE7
    public void Byj(Intent intent, NavigableFragment navigableFragment) {
        MessengerOnlyPhoneReconfirmationActivity messengerOnlyPhoneReconfirmationActivity = this.A00;
        if (!"phone_reconfirmation_complete".equals(intent.getAction())) {
            DZD.A06(intent, messengerOnlyPhoneReconfirmationActivity.A01, (NavigableFragment) null);
            return;
        }
        messengerOnlyPhoneReconfirmationActivity.A03.A02();
        String stringExtra = intent.getStringExtra("complete_method");
        boolean booleanExtra = intent.getBooleanExtra("should_redirect_to_login", false);
        FAE fae = messengerOnlyPhoneReconfirmationActivity.A02;
        2Jy A0H = 4YU.A0H("phone_reconfirmation_completed");
        A0H.A0D(AbE.A00(688), stringExtra);
        FAE.A00(A0H, fae, (String) null, (java.util.Map) null);
        if (booleanExtra) {
            AbK.A1O(messengerOnlyPhoneReconfirmationActivity.A04.edit(), CCT.A02);
            messengerOnlyPhoneReconfirmationActivity.A00.A00(messengerOnlyPhoneReconfirmationActivity);
        }
        messengerOnlyPhoneReconfirmationActivity.finish();
    }
}
