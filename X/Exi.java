package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.p2p.model.PaymentCard;
import com.google.common.base.Absent;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableList;

/* loaded from: Exi.class */
public final class Exi {
    public final F8u A00 = (F8u) 1Bi.A03(99271);

    public void A00(FbUserSession fbUserSession) {
        this.A00.A01();
        Eu8 eu8 = (Eu8) 1Lo.A06(fbUserSession, 99275);
        synchronized (eu8) {
            eu8.A01 = Absent.INSTANCE;
        }
    }

    public void A01(FbUserSession fbUserSession, PaymentCard paymentCard) {
        this.A00.A02(paymentCard.A05);
        Eu8 eu8 = (Eu8) 1Lo.A06(fbUserSession, 99275);
        synchronized (eu8) {
            eu8.A01 = new Present(paymentCard);
        }
    }

    public void A02(FbUserSession fbUserSession, ImmutableList immutableList) {
        int i;
        int i2;
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) ((PaymentCard) it.next()).A05);
        }
        F8u f8u = this.A00;
        C00j.A05("deleteAllCardIds", 1626873742);
        try {
            Jvl jvl = f8u.A01;
            SQLiteDatabase AUF = jvl.AUF();
            C01m.A01(AUF, -100765163);
            try {
                f8u.A01();
                AUF.delete("payment_card_ids", null, null);
                AUF.setTransactionSuccessful();
                C01m.A03(AUF, -1273778508);
                C00j.A01(1885348731);
                ImmutableList build = builder.build();
                build.getClass();
                C00j.A07("insertPaymentCardIds (%d paymentCardIds)", 1BK.A0k(build), -1365426852);
                try {
                    SQLiteDatabase AUF2 = jvl.AUF();
                    try {
                        C01m.A01(AUF2, 366994175);
                        try {
                            1Du it2 = build.iterator();
                            while (it2.hasNext()) {
                                F8u.A00(f8u, AnonymousClass001.A0i(it2));
                            }
                            AUF2.setTransactionSuccessful();
                            i2 = -601485020;
                        } catch (SQLException e) {
                            f8u.A00.D12("DbInsertPaymentCardIdsHandler", "A SQLException occurred when trying to insert into the database", e);
                            i2 = 247899008;
                        }
                        C01m.A03(AUF2, i2);
                        C00j.A01(-923193155);
                        Eu8 eu8 = (Eu8) 1Lo.A06(fbUserSession, 99275);
                        synchronized (eu8) {
                            eu8.A00 = new Present(immutableList);
                        }
                    } catch (Throwable th) {
                        C01m.A03(AUF2, 495587835);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = -1729970547;
                    C00j.A01(i);
                    throw th;
                }
            } catch (Throwable th3) {
                C01m.A03(AUF, 1286467244);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i = -1556345688;
        }
    }
}
