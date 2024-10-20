package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.4u9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4u9.class */
public final class C10664u9 extends AbstractC04734bt implements 4uA, 1UN {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public volatile boolean A04;
    public volatile boolean A05;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10664u9() {
        /*
            r301 = this;
            android.content.Context r0 = com.facebook.inject.FbInjector.A00()
            r302 = r0
            r0 = 33108(0x8154, float:4.6394E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.1E1 r0 = (X.1E1) r0
            r303 = r0
            r0 = 82996(0x14434, float:1.16302E-40)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.4bv r0 = (X.C04754bv) r0
            r304 = r0
            r0 = 49348(0xc0c4, float:6.9151E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            r305 = r0
            r0 = 33225(0x81c9, float:4.6558E-41)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            java.lang.String r5 = "threads_db2"
            r0.<init>(r1, r2, r3, r4, r5)
            X.1BQ r0 = new X.1BQ
            r306 = r0
            r0 = r306
            r1 = 49349(0xc0c5, float:6.9153E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A00 = r1
            X.1BQ r0 = new X.1BQ
            r306 = r0
            r0 = r306
            r1 = 49315(0xc0a3, float:6.9105E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A02 = r1
            X.1BQ r0 = new X.1BQ
            r306 = r0
            r0 = r306
            r1 = 66265(0x102d9, float:9.2857E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A01 = r1
            X.1BV r0 = new X.1BV
            r306 = r0
            r0 = r306
            r1 = 16669(0x411d, float:2.3358E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A03 = r1
            r0 = 66348(0x1032c, float:9.2973E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.1UP r0 = (X.1UP) r0
            r1 = r301
            r0.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10664u9.<init>():void");
    }

    public void A04(SQLiteException sQLiteException) {
        super.A04(sQLiteException);
        if (this.A04) {
            return;
        }
        this.A04 = true;
        this.A00.get();
        4uE.A00((ThreadKey) null, "open-db-fail", (String) null, (String) null);
    }

    @Override // X.AbstractC04734bt
    public void AFH() {
        super.AMe();
        if (this.A05) {
            return;
        }
        this.A05 = true;
        this.A00.get();
        4uE.A00((ThreadKey) null, "supplier-clearAllData", (String) null, 0G8.A01(new Exception("supplier-clearAllData")));
    }

    public void AFz() {
        if (((C09794rj) this.A02.get()).A03) {
            return;
        }
        AFH();
    }

    @Override // X.AbstractC04734bt
    public SQLiteDatabase AUF() {
        SQLiteDatabase AUF;
        synchronized (this) {
            if (((1PG) this.A01.get()).A07()) {
                RuntimeException runtimeException = new RuntimeException();
                AnonymousClass047 ACu = ((AnonymousClass046) this.A03.get()).ACu("Threads_db2 is recreated after delete.", 817896838);
                ACu.Cmr(runtimeException);
                ACu.report();
            }
            AUF = super.AUF();
        }
        return AUF;
    }
}
