package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.messaging.rtc.meetups.speakeasy.model.SpeakeasyShareSheetModel;
import com.facebook.messaging.rtc.meetups.speakeasy.model.SpeakeasyTopicModel;

/* loaded from: C1q.class */
public final class C1q {
    public final C00i A00 = AbI.A0L();

    public boolean A00(Context context, BzA bzA, final CtF ctF) {
        DFr dFr = bzA.A09;
        if (!(dFr instanceof Csz)) {
            return false;
        }
        SpeakeasyShareSheetModel speakeasyShareSheetModel = ((Csz) dFr).A00;
        speakeasyShareSheetModel.getClass();
        Long l = speakeasyShareSheetModel.A09;
        if (l == null || l.longValue() == 0) {
            return false;
        }
        SpeakeasyTopicModel speakeasyTopicModel = speakeasyShareSheetModel.A03;
        final int i = 0;
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener(this, ctF, i) { // from class: X.9oH
            public final int A00;
            public final Object A01;
            public final Object A02;

            {
                this.A00 = i;
                this.A02 = ctF;
                this.A01 = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (this.A00 == 0) {
                    ((CtF) this.A02).AGI();
                    return;
                }
                6wB r0 = ((C6wd) this.A02).A00;
                if (r0 != null) {
                    r0.AQW();
                }
                ((View) this.A01).getRootView().getOverlay().clear();
            }
        };
        DR6 A0e = AbK.A0e(context, this.A00);
        11T.A0F(speakeasyTopicModel, 0);
        A0e.A03(0Pz.A0Y(speakeasyTopicModel.A01, speakeasyTopicModel.A02, ' '));
        A0e.A06(2131966137);
        A0e.A0C((DialogInterface.OnClickListener) null, 2131966168);
        JZj A04 = A0e.A04();
        A04.show();
        A04.setOnDismissListener(onDismissListener);
        return true;
    }
}
