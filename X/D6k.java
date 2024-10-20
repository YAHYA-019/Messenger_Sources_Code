package X;

import android.content.Intent;
import android.database.Cursor;
import com.facebook.messaging.sms.defaultapp.SmsReceiver;

/* loaded from: D6k.class */
public final class D6k implements Runnable {
    public static final String __redex_internal_original_name = "SmsThreadManager$1";
    public final /* synthetic */ CbK A00;

    public D6k(CbK cbK) {
        this.A00 = cbK;
    }

    @Override // java.lang.Runnable
    public void run() {
        CbK cbK = this.A00;
        String[] strArr = CbK.A06;
        ((1vU) cbK.A01.get()).A02(cbK.A03);
        if (!((Hza) cbK.A02.get()).A01) {
            C00i c00i = cbK.A00;
            Intent A0D = C3o5.A0D(1BK.A04(c00i), SmsReceiver.class);
            A0D.setAction("com.facebook.messaging.sms.MARK_PENDING_MMS");
            1BK.A0W().A0H(1BK.A04(c00i), A0D);
        }
        C00i c00i2 = cbK.A00;
        Cursor A01 = 0L0.A01(1BK.A04(c00i2).getContentResolver(), CbK.A05, "message_count=0", "date DESC LIMIT 1", CbK.A06, (String[]) null, -719100753);
        if (A01 != null) {
            try {
                if (A01.moveToNext()) {
                    0fH.A0j("SmsThreadManager", "Detected empty threads, deleting.");
                    1BK.A04(c00i2).getContentResolver().delete(IJ3.A01, null, null);
                }
            } finally {
                A01.close();
            }
        }
    }
}
