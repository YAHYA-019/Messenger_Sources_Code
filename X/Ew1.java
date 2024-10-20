package X;

import android.database.Cursor;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: Ew1.class */
public final class Ew1 {
    public final Jvl A00 = DKD.A0Y();

    public ImmutableList A00() {
        C00j.A05("getPaymentCardIds", -1942386628);
        try {
            Cursor query = this.A00.AUF().query("payment_card_ids", null, null, null, null, null, null);
            try {
                ImmutableList.Builder A0h = 4YU.A0h();
                while (query.moveToNext()) {
                    A0h.m11011add((Object) C2095Ddh.A00.A00(query));
                }
                ImmutableList build = A0h.build();
                query.close();
                C00j.A01(1132114478);
                return build;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-249377268);
            throw th2;
        }
    }

    public String A01() {
        String A00;
        int i;
        C00j.A05("getPrimaryPaymentCardId", 1229347475);
        try {
            Cursor query = this.A00.AUF().query("primary_payment_card_id", null, null, null, null, null, null);
            try {
                boolean z = true;
                if (query.getCount() > 1) {
                    z = false;
                }
                Preconditions.checkArgument(z);
                if (query.getCount() == 0) {
                    A00 = null;
                    query.close();
                    i = -1791850583;
                } else {
                    query.moveToFirst();
                    A00 = C2096Ddi.A00.A00(query);
                    query.close();
                    i = -2028039740;
                }
                C00j.A01(i);
                return A00;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-1085637830);
            throw th2;
        }
    }
}
