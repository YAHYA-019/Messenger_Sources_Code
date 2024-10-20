package X;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.graphql.enums.GraphQLPeerToPeerPaymentRequestStatus;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;

/* loaded from: F93.class */
public final class F93 {
    public final C1634Aoc A00;
    public final C01s A01;
    public final Jvl A02;
    public final EwR A03;
    public final EwS A04;

    public F93() {
        C1634Aoc c1634Aoc = (C1634Aoc) 1Bi.A03(85123);
        Jvl A0Y = DKD.A0Y();
        EwS ewS = (EwS) 1Bn.A0A(99277);
        EwR ewR = (EwR) 1Bn.A0A(99276);
        C01s A0I = 1BL.A0I();
        this.A00 = c1634Aoc;
        this.A02 = A0Y;
        this.A04 = ewS;
        this.A03 = ewR;
        this.A01 = A0I;
    }

    public static void A00(F93 f93, GNv gNv) {
        C00j.A05("insertOrUpdateIncomingPaymentRequest", 98750018);
        try {
            SQLiteDatabase AUF = f93.A02.AUF();
            C01m.A01(AUF, 1897369446);
            try {
                ContentValues contentValues = new ContentValues();
                ImmutableList immutableList = C2100Ddm.A0F;
                String A0k = ((2JY) gNv).A0k();
                contentValues.put(TraceFieldType.RequestID, A0k);
                if (AUF.update("incoming_request_ids", contentValues, 0Pz.A0W(TraceFieldType.RequestID, " = ? "), new String[]{String.valueOf(A0k)}) == 0) {
                    C01m.A00(1052722392);
                    AUF.insertOrThrow("incoming_request_ids", null, contentValues);
                    C01m.A00(2042251691);
                }
                AUF.setTransactionSuccessful();
                C01m.A03(AUF, -598690226);
                C00j.A01(1523436427);
            } catch (Throwable th) {
                C01m.A03(AUF, 288165344);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-486351935);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01(GNv gNv) {
        2JX B7U;
        2JY AWV;
        GraphQLPeerToPeerPaymentRequestStatus B7P;
        int i;
        2JX B7V = gNv.B7V();
        if (B7V == null || (B7U = gNv.B7U()) == null || (AWV = gNv.AWV()) == null || (B7P = gNv.B7P()) == null) {
            return;
        }
        C00j.A05("insertOrUpdatePaymentRequest", 539009928);
        try {
            SQLiteDatabase AUF = this.A02.AUF();
            C01m.A01(AUF, 1262002613);
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    ImmutableList immutableList = C2100Ddm.A0F;
                    2JY r0 = (2JY) gNv;
                    String A0k = r0.A0k();
                    contentValues.put(TraceFieldType.RequestID, A0k);
                    contentValues.put("requester_id", B7V.A0k());
                    contentValues.put("requestee_id", B7U.A0k());
                    contentValues.put("request_status", B7P.toString());
                    TreeJNI treeJNI = (TreeJNI) gNv;
                    contentValues.put("creation_time", Long.valueOf(treeJNI.getTimeValue(1932333101)));
                    contentValues.put("updated_time", Long.valueOf(treeJNI.getTimeValue(-472881199)));
                    4YU.A1E(contentValues, "raw_amount", AWV.getIntValue(-565489467));
                    4YU.A1E(contentValues, "amount_offset", AWV.getIntValue(-1019779949));
                    contentValues.put("currency", AWV.A0n());
                    contentValues.put("memo_text", r0.A0r(1708924178));
                    ImmutableList.Builder builder = ImmutableList.builder();
                    int i2 = 0;
                    while (true) {
                        ImmutableList A0c = r0.A0c(1290401053, 2JX.class, 1129561912);
                        if (i2 >= A0c.size()) {
                            break;
                        }
                        builder.m11011add((Object) 2JX.A05(AbG.A0E(A0c, i2)));
                        i2++;
                    }
                    contentValues.put("memo_image_list", this.A03.A01(builder.build()));
                    contentValues.put("theme", this.A04.A01(Dkv.A00(gNv.B7Q())));
                    contentValues.put("group_thread_id", r0.A0r(-1088468436));
                    2JX A0L = 1BL.A0L(r0, 1638153202, 1899957318);
                    contentValues.put("transaction_id", A0L == null ? null : A0L.A0k());
                    if (AUF.update("requests", contentValues, 0Pz.A0W(TraceFieldType.RequestID, " = ? "), new String[]{String.valueOf(A0k)}) == 0) {
                        C01m.A00(-131181820);
                        AUF.insertOrThrow("requests", null, contentValues);
                        C01m.A00(-1129937530);
                    }
                    AUF.setTransactionSuccessful();
                    i = -429980211;
                } catch (SQLException e) {
                    this.A01.D12("DbInsertPaymentRequestsHandler", "A SQLException occurred when trying to insert into the database", e);
                    i = -736468247;
                }
                C01m.A03(AUF, i);
                C00j.A01(-486237360);
            } catch (Throwable th) {
                C01m.A03(AUF, 549795905);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-964503042);
            throw th2;
        }
    }

    public void A02(ImmutableList immutableList) {
        C00j.A05("insertOrUpdateIncomingPaymentRequests", 418886481);
        try {
            SQLiteDatabase AUF = this.A02.AUF();
            C01m.A01(AUF, 563828100);
            try {
                AUF.delete("incoming_request_ids", null, null);
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    GNv gNv = (GNv) it.next();
                    A00(this, gNv);
                    A01(gNv);
                }
                this.A00.A04(BaB.A01, ConstantsKt.CAMERA_ID_BACK);
                AUF.setTransactionSuccessful();
                C01m.A03(AUF, 1919574858);
                C00j.A01(-1901926732);
            } catch (Throwable th) {
                C01m.A03(AUF, 1039706755);
                throw th;
            }
        } catch (Throwable th2) {
            C00j.A01(-749169304);
            throw th2;
        }
    }
}
