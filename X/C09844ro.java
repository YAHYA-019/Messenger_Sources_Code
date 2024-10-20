package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ro.class */
public final class C09844ro {
    public final C00i A01 = new 1BQ(16458);
    public final C00i A03 = new 1BQ(33013);
    public final C00i A00 = new 1BQ(16831);
    public final C00i A02 = new 1BV(49276);

    public void A00() {
        1GU.A00(this.A01);
        1Ql A0V = 1BL.A0V(this.A03);
        A0V.Cdj(((C09384py) this.A02.get()).A00());
        A0V.commit();
        ((1rD) this.A00.get()).AUF().delete("phone_address_book_snapshot", null, null);
    }

    public void A01(List list) {
        if (list.isEmpty()) {
            return;
        }
        C00j.A07("UpdatePhoneAddressBookSnapshot(%d)", Integer.valueOf(list.size()), -754905604);
        try {
            C00i c00i = this.A00;
            SQLiteDatabase AUF = ((1rC) c00i.get()).AUF();
            C01m.A01(AUF, 1969370378);
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    RSm rSm = (RSm) it.next();
                    KMf kMf = rSm.A02;
                    int ordinal = kMf.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        ContentValues A07 = 4YU.A07();
                        RSQ rsq = rSm.A01;
                        A07.put(DKB.A00(438), Long.valueOf(rsq.A00));
                        A07.put(DKB.A00(353), rsq.A01);
                        SQLiteDatabase AUF2 = ((1rD) c00i.get()).AUF();
                        C01m.A00(788997373);
                        AUF2.replaceOrThrow("phone_address_book_snapshot", null, A07);
                        C01m.A00(1801424542);
                    } else {
                        if (ordinal != 2) {
                            throw AnonymousClass002.A0C(kMf, "Unknown change type ", AnonymousClass001.A0k());
                        }
                        ((1rD) c00i.get()).AUF().delete("phone_address_book_snapshot", "local_contact_id=?", new String[]{String.valueOf(rSm.A00)});
                    }
                }
                AUF.setTransactionSuccessful();
                C01m.A03(AUF, 1181219985);
                C00j.A01(1325547489);
            } catch (Throwable th) {
                C01m.A03(AUF, 946274813);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(2125191484);
            throw th2;
        }
    }
}
