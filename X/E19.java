package X;

import android.content.res.Resources;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessengerCallToActionProperties;
import com.facebook.widget.text.BetterTextView;

/* loaded from: E19.class */
public final class E19 extends EBk implements C7yi {
    public C00i A00;
    public BetterTextView A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7yi
    public void ACK(AnonymousClass622 anonymousClass622) {
        CallToAction callToAction;
        Message message = anonymousClass622.A03;
        GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
        if (genericAdminMessageInfo != null) {
            MessengerCallToActionProperties messengerCallToActionProperties = genericAdminMessageInfo.A0E;
            if (messengerCallToActionProperties == null) {
                messengerCallToActionProperties = null;
            }
            MessengerCallToActionProperties messengerCallToActionProperties2 = messengerCallToActionProperties;
            if (messengerCallToActionProperties2 != null && (callToAction = messengerCallToActionProperties2.A00) != null) {
                Resources resources = getResources();
                5zD r0 = ((EBk) this).A00.A00;
                CharSequence A00 = R3Y.A00(resources, r0, (RJj) null, Integer.valueOf(r0 != null ? r0.BKZ() : resources.getColor(2132214411)), message.A0F().A00, callToAction.A00(), false);
                this.A01.setVisibility(0);
                this.A01.setText(A00);
                FXt.A01(this.A01, callToAction, this, anonymousClass622, 25);
                return;
            }
        }
        this.A01.setVisibility(8);
    }

    @Override // X.C7yi
    public void Cqe(6Fu r302) {
    }
}
