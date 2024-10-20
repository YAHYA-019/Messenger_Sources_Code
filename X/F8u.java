package X;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* loaded from: F8u.class */
public final class F8u {
    public final C01s A00;
    public final Jvl A01;
    public final Ew1 A02;

    public F8u() {
        Jvl A0Y = DKD.A0Y();
        C01s A0I = 1BL.A0I();
        Ew1 ew1 = (Ew1) 1Bi.A03(99273);
        this.A01 = A0Y;
        this.A00 = A0I;
        this.A02 = ew1;
    }

    public static void A00(F8u f8u, String str) {
        int i;
        int i2;
        C00j.A05("addPaymentCardId", -708041438);
        try {
            if (f8u.A02.A00().contains(str)) {
                i = 2131698919;
            } else {
                SQLiteDatabase AUF = f8u.A01.AUF();
                C01m.A01(AUF, -743267402);
                try {
                    try {
                        ContentValues contentValues = new ContentValues();
                        ImmutableList immutableList = C2095Ddh.A02;
                        contentValues.put("credential_id", str);
                        C01m.A00(-114597538);
                        AUF.insertOrThrow("payment_card_ids", null, contentValues);
                        C01m.A00(-2128081575);
                        AUF.setTransactionSuccessful();
                        i2 = -1654500;
                    } catch (SQLException e) {
                        f8u.A00.D12("DbInsertPaymentCardIdsHandler", "A SQLException occurred when trying to insert into the database", e);
                        i2 = -1535574704;
                    }
                    C01m.A03(AUF, i2);
                    i = -306171531;
                } catch (Throwable th) {
                    C01m.A03(AUF, 334582438);
                    throw th;
                }
            }
            C00j.A01(i);
        } catch (Throwable th2) {
            C00j.A01(1295471971);
            throw th2;
        }
    }

    public void A01() {
        C00j.A05("clearPrimaryCardIdStatus", 1886953533);
        try {
            SQLiteDatabase AUF = this.A01.AUF();
            C01m.A01(AUF, -673122656);
            try {
                AUF.delete("primary_payment_card_id", null, null);
                AUF.setTransactionSuccessful();
                C01m.A03(AUF, 1128913044);
                C00j.A01(2105240592);
            } catch (Throwable th) {
                C01m.A03(AUF, 1103095563);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-472428179);
            throw th2;
        }
    }

    public void A02(String str) {
        int i;
        C00j.A05("insertOrReplacePrimaryPaymentCardId", -1695207038);
        try {
            SQLiteDatabase AUF = this.A01.AUF();
            C01m.A01(AUF, -1590157631);
            try {
                try {
                    A00(this, str);
                    AUF.delete("primary_payment_card_id", null, null);
                    ContentValues contentValues = new ContentValues();
                    ImmutableList immutableList = C2096Ddi.A02;
                    contentValues.put("credential_id", str);
                    C01m.A00(-443541166);
                    AUF.insertOrThrow("primary_payment_card_id", null, contentValues);
                    C01m.A00(1447931378);
                    AUF.setTransactionSuccessful();
                    i = -1579472968;
                } catch (SQLException e) {
                    this.A00.D12("DbInsertPaymentCardIdsHandler", "A SQLException occurred when trying to insert into the database", e);
                    i = -945227823;
                }
                C01m.A03(AUF, i);
                C00j.A01(-729223923);
            } catch (Throwable th) {
                C01m.A03(AUF, -1935284887);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(1960568449);
            throw th2;
        }
    }
}
