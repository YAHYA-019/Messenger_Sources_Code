package X;

import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.payments.picker.model.PickerRunTimeData;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;
import com.facebook.payments.picker.model.SimplePickerScreenFetcherParams;
import com.facebook.payments.shipping.model.MailingAddress;
import com.facebook.payments.shipping.model.SimpleMailingAddress;

/* loaded from: Fnz.class */
public final class Fnz implements GII {
    public 1BY A00;
    public final C15h A01 = G7K.A01(this, ActionId.NEW_START_FOUND);

    public Fnz(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void AC1(Exy exy, ETu eTu) {
    }

    public /* bridge */ /* synthetic */ void Bhp(Intent intent, PickerRunTimeData pickerRunTimeData, int i, int i2) {
        SimplePickerRunTimeData simplePickerRunTimeData = (SimplePickerRunTimeData) pickerRunTimeData;
        if (i != 101) {
            if (i != 102 || i2 != -1) {
                return;
            }
        } else if (i2 != -1 || intent == null) {
            return;
        }
        ETf eTf = (ETf) this.A01.get();
        if (intent != null) {
            eTf.A01(new SimplePickerScreenFetcherParams(true), Quy.A01, simplePickerRunTimeData, ((SimpleMailingAddress) ((MailingAddress) intent.getParcelableExtra("shipping_address"))).mId);
            return;
        }
        SimplePickerScreenFetcherParams simplePickerScreenFetcherParams = new SimplePickerScreenFetcherParams(true);
        EfV efV = eTf.A00;
        PickerRunTimeData A00 = eTf.A00(simplePickerRunTimeData.A00, simplePickerRunTimeData.A01, simplePickerScreenFetcherParams, simplePickerRunTimeData.A03);
        C2048Da9 c2048Da9 = efV.A00;
        c2048Da9.A0A = A00;
        c2048Da9.A04.D1f(c2048Da9.A0J, A00);
    }
}
