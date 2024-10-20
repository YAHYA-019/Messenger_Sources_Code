package X;

import android.content.Context;
import com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.productsrow.MessengerThreadSettingsProductsRow;
import com.facebook.messaging.sharedimage.SharedMedia;

/* loaded from: Ci8.class */
public final class Ci8 implements AXc {
    public final /* synthetic */ MessengerThreadSettingsProductsRow A00;

    public Ci8(MessengerThreadSettingsProductsRow messengerThreadSettingsProductsRow) {
        this.A00 = messengerThreadSettingsProductsRow;
    }

    @Override // X.AXc
    public void Bos(SharedMedia sharedMedia) {
        MessengerThreadSettingsProductsRow messengerThreadSettingsProductsRow = this.A00;
        82O r0 = (82O) 1Br.A0B(messengerThreadSettingsProductsRow.A03);
        Context context = messengerThreadSettingsProductsRow.A00;
        r0.A0L(context, messengerThreadSettingsProductsRow.A04).A02(BNV.A1k, "thread_settings_row");
        C5xy.A01((C5xy) 1Br.A0B(messengerThreadSettingsProductsRow.A01), DCW.A00);
        String str = sharedMedia.A05;
        if (str == null) {
            str = "";
        }
        1Br.A0C(messengerThreadSettingsProductsRow.A02);
        CBC.A00(context, 0S2.A0C, str);
    }
}
