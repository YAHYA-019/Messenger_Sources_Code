package com.facebook.messaging.internalprefs.burner;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Um;
import X.69I;
import X.C1xx;
import X.C6pf;
import X.HHw;
import X.N7T;
import android.net.Uri;
import com.facebook.endtoend.EndToEnd;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.stickers.model.Sticker;

/* loaded from: MessengerInternalBurnerBulkSendActivity.class */
public final class MessengerInternalBurnerBulkSendActivity extends MessengerInternalBurnerActivity {
    public final 1Br A00 = 1Bq.A00(50150);
    public final 69I A01 = (69I) 1Bn.A0A(49970);

    private final void A01(C1xx c1xx, String str, String str2) {
        MailboxFeature mailboxFeature = new MailboxFeature(c1xx);
        int i = ((MessengerInternalBurnerActivity) this).A01;
        boolean z = ((MessengerInternalBurnerActivity) this).A06;
        boolean isRunningEndToEndTest = EndToEnd.isRunningEndToEndTest();
        int A00 = HHw.A00(((MessengerInternalBurnerActivity) this).A03);
        int i2 = ((MessengerInternalBurnerActivity) this).A00;
        1Um A0R = 1BL.A0R(mailboxFeature);
        MailboxFutureImpl A0P = 1BK.A0P(A0R);
        1Um.A02(A0R, new N7T(mailboxFeature, A0P, str, str2, i, A00, i2, z, isRunningEndToEndTest), A0P, false);
    }

    @Override // com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerActivity
    public String A0C() {
        return "Bulk send messages using the Burner load testing service";
    }

    @Override // com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerActivity
    public void A0D(Mailbox mailbox) {
        11T.A0F(mailbox, 0);
        C1xx c1xx = new C1xx(mailbox);
        if (((MessengerInternalBurnerActivity) this).A03.intValue() != 5) {
            A01(c1xx, null, null);
            return;
        }
        String str = ((MessengerInternalBurnerActivity) this).A04;
        Sticker sticker = (Sticker) ((C6pf) 1Br.A0B(this.A00)).A01(str).get();
        11T.A0D(sticker);
        69I r0 = this.A01;
        Uri A03 = r0.A03(sticker);
        if (A03 == null) {
            A03 = r0.A08(sticker);
            if (A03 == null) {
                A03 = r0.A06(sticker);
                if (A03 == null) {
                    A03 = sticker.A02;
                    String str2 = sticker.A0F;
                    if (69I.A02(A03, str2) || A03 == null) {
                        A03 = sticker.A09;
                        if (69I.A02(A03, str2) || A03 == null) {
                            A03 = sticker.A07;
                            if (69I.A02(A03, str2)) {
                                A03 = null;
                            }
                        }
                    }
                }
            }
        }
        A01(c1xx, String.valueOf(A03), str);
    }

    @Override // com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerActivity
    public boolean A0E() {
        return true;
    }

    @Override // com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerActivity
    public boolean A0F() {
        return true;
    }

    @Override // com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerActivity
    public boolean A0G() {
        return true;
    }

    @Override // com.facebook.messaging.internalprefs.burner.MessengerInternalBurnerActivity
    public boolean A0H() {
        return true;
    }

    public String AWg() {
        return "burnerBulkSend";
    }

    public Long Am7() {
        return null;
    }
}
