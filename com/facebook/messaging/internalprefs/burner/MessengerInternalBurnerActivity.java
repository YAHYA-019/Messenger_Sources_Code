package com.facebook.messaging.internalprefs.burner;

import X.0S2;
import X.1Br;
import X.7zM;
import com.facebook.messaging.internalprefs.MessengerInternalBasePreferenceActivity;
import com.facebook.msys.mca.Mailbox;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: MessengerInternalBurnerActivity.class */
public abstract class MessengerInternalBurnerActivity extends MessengerInternalBasePreferenceActivity {
    public final 1Br A07 = 7zM.A0Y();
    public int A01 = 10;
    public int A02 = 1;
    public boolean A06 = true;
    public int A00 = 1;
    public Integer A03 = 0S2.A00;
    public String A05 = ConstantsKt.CAMERA_ID_FRONT;
    public String A04 = "114314139163194";
    public final String[] A08 = {"TEXT", "IMAGE", "VIDEO", "FILE", "STICKER", "GIF", "XMA"};

    public abstract String A0C();

    public abstract void A0D(Mailbox mailbox);

    public boolean A0E() {
        return false;
    }

    public boolean A0F() {
        return false;
    }

    public boolean A0G() {
        return false;
    }

    public boolean A0H() {
        return false;
    }

    public boolean A0I() {
        return false;
    }

    public boolean A0J() {
        return false;
    }

    public boolean A0K() {
        return true;
    }
}
