package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Iterator;
import java.util.List;

/* loaded from: Kod.class */
public final class Kod {
    public final MK4 A00;

    public Kod(MK4 mk4) {
        this.A00 = mk4;
    }

    public void A00(List list) {
        if (list.isEmpty()) {
            return;
        }
        MK4 mk4 = this.A00;
        SQLiteDatabase AUF = mk4.AUF();
        C01m.A01(AUF, 1401505260);
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Kit kit = (Kit) it.next();
                int intValue = kit.A00.intValue();
                if (intValue == 0 || intValue == 1) {
                    mk4.D80(kit);
                } else {
                    if (intValue != 2) {
                        throw 0Pz.A05(4YT.A00(799), 3 - intValue != 0 ? "ADD" : OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
                    }
                    mk4.CfA(kit);
                }
            }
            AUF.setTransactionSuccessful();
            C01m.A03(AUF, -1464550526);
        } catch (Throwable th) {
            C01m.A03(AUF, 1639582680);
            throw th;
        }
    }
}
