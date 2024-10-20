package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.Ael, reason: case insensitive filesystem */
/* loaded from: Ael.class */
public final class HandlerC1345Ael extends Handler {
    public final /* synthetic */ D1g A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1345Ael(D1g d1g) {
        super(Looper.getMainLooper());
        this.A00 = d1g;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Bta bta = (Bta) message.obj;
        BJC bjc = this.A00;
        CharSequence charSequence = bta.A03;
        Bo0 bo0 = bta.A02;
        BJC bjc2 = bjc;
        if (bo0 == null) {
            0fH.A14("AbstractContactPickerListFilter", "Received null results in publishResults()! Class name: %s", new Object[]{bjc2.getClass().getCanonicalName()});
        } else {
            Object obj = bo0.A01;
            if (obj != null) {
                CI9 ci9 = (CI9) obj;
                DEZ dez = bjc2.A01;
                if (dez != null) {
                    dez.CbO(ci9, charSequence);
                }
            }
        }
        DHt dHt = bta.A01;
        if (dHt != null) {
            Bo0 bo02 = bta.A02;
            dHt.ByX(bo02 != null ? bo02.A00 : -1);
        }
        if (bta.A00 == bjc.A00) {
            Qo5 qo5 = bjc.A03;
            Qo5 qo52 = Qo5.A02;
            if (qo5 != qo52) {
                bjc.A03 = qo52;
                DHt dHt2 = bta.A01;
                if (dHt2 != null) {
                    dHt2.CN6(qo52);
                }
            }
        }
    }
}
