package X;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4ze, reason: invalid class name */
/* loaded from: 4ze.class */
public final class C4ze extends 1Da {
    public C4ze() {
        super(ImmutableList.of((Object) new C4zf(), (Object) new C4zg(), (Object) new C4zh(), (Object) new C4zi(), (Object) new C4zj()), "smstakeover_schema", 22);
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        while (i < i2) {
            int i4 = i + 1;
            if (i == 2) {
                C01m.A00(840712558);
                sQLiteDatabase.execSQL("ALTER TABLE thread_read_stat RENAME TO threads_table");
                i3 = -1290684877;
            } else if (i == 3) {
                String A00 = 1Dd.A00(C4zg.A05, "threads_table");
                C01m.A00(1816706754);
                sQLiteDatabase.execSQL(A00);
                i3 = 395547941;
            } else {
                if (i != 4) {
                    if (i == 5) {
                        String A02 = 1Dd.A02(C4zh.A04, ImmutableList.of((Object) C4zh.A03), "block_table", "CREATE TABLE");
                        C01m.A00(-1949433001);
                        sQLiteDatabase.execSQL(A02);
                        i3 = -1326626551;
                    } else if (i != 6) {
                        if (i == 7) {
                            String A0W = 0Pz.A0W("DROP TABLE IF EXISTS ", "threads_table");
                            C01m.A00(-161874334);
                            sQLiteDatabase.execSQL(A0W);
                            C01m.A00(-1547127976);
                            String A022 = 1Dd.A02(C4zf.A0C, ImmutableList.of((Object) C4zf.A0B), "threads_table", "CREATE TABLE");
                            C01m.A00(-769610897);
                            sQLiteDatabase.execSQL(A022);
                            C01m.A00(522495649);
                            String A023 = 1Dd.A02(C4zg.A08, ImmutableList.of((Object) C4zg.A07), "address_table", "CREATE TABLE");
                            C01m.A00(2016083048);
                            sQLiteDatabase.execSQL(A023);
                            i3 = -940878544;
                        } else if (i == 8) {
                            String A002 = 1Dd.A00(C4zf.A02, "threads_table");
                            C01m.A00(782651480);
                            sQLiteDatabase.execSQL(A002);
                            i3 = 1385198448;
                        } else if (i == 9) {
                            String A003 = 1Dd.A00(C4zf.A06, "threads_table");
                            C01m.A00(450463750);
                            sQLiteDatabase.execSQL(A003);
                            i3 = -146909358;
                        } else if (i == 10) {
                            String A0W2 = 0Pz.A0W("DROP TABLE IF EXISTS ", "spam_stats");
                            C01m.A00(1857475894);
                            sQLiteDatabase.execSQL(A0W2);
                            C01m.A00(-2049044593);
                            String A004 = 1Dd.A00(C4zg.A01, "address_table");
                            C01m.A00(739198607);
                            sQLiteDatabase.execSQL(A004);
                            C01m.A00(1336874621);
                            String A005 = 1Dd.A00(C4zg.A02, "address_table");
                            C01m.A00(828183026);
                            sQLiteDatabase.execSQL(A005);
                            C01m.A00(1505743820);
                            String A006 = 1Dd.A00(C4zg.A06, "address_table");
                            C01m.A00(1081232023);
                            sQLiteDatabase.execSQL(A006);
                            C01m.A00(-1902006576);
                            String A007 = 1Dd.A00(C4zg.A03, "address_table");
                            C01m.A00(-1012392065);
                            sQLiteDatabase.execSQL(A007);
                            C01m.A00(-1390848546);
                            String A008 = 1Dd.A00(C4zg.A04, "address_table");
                            C01m.A00(-1128557850);
                            sQLiteDatabase.execSQL(A008);
                            i3 = -1990884957;
                        } else if (i == 11) {
                            String A009 = 1Dd.A00(C4zf.A03, "threads_table");
                            C01m.A00(787943145);
                            sQLiteDatabase.execSQL(A009);
                            C01m.A00(1802074729);
                            String A0010 = 1Dd.A00(C4zf.A04, "threads_table");
                            C01m.A00(2092872911);
                            sQLiteDatabase.execSQL(A0010);
                            C01m.A00(858378068);
                            String A0011 = 1Dd.A00(C4zf.A0A, "threads_table");
                            C01m.A00(49654129);
                            sQLiteDatabase.execSQL(A0011);
                            i3 = -394410335;
                        } else if (i == 12) {
                            String A0012 = 1Dd.A00(C4zf.A00, "threads_table");
                            C01m.A00(1346248817);
                            sQLiteDatabase.execSQL(A0012);
                            i3 = -1117238271;
                        } else if (i == 13) {
                            String A024 = 1Dd.A02(C4zi.A03, ImmutableList.of((Object) C4zi.A02), "sms_business_address_list", "CREATE TABLE");
                            C01m.A00(-1707350239);
                            sQLiteDatabase.execSQL(A024);
                            i3 = -1467791229;
                        } else if (i == 14) {
                            String A025 = 1Dd.A02(C4zi.A03, ImmutableList.of((Object) C4zi.A02), "sms_business_address_list", "CREATE TABLE IF NOT EXISTS");
                            C01m.A00(551860343);
                            sQLiteDatabase.execSQL(A025);
                            i3 = 2084653528;
                        } else if (i == 15) {
                            String A0013 = 1Dd.A00(C4zi.A01, "sms_business_address_list");
                            C01m.A00(-2001446358);
                            sQLiteDatabase.execSQL(A0013);
                            i3 = -1574334631;
                        } else if (i == 16) {
                            String A0W3 = 0Pz.A0W("DROP TABLE IF EXISTS ", "server_spam_list");
                            C01m.A00(1055171064);
                            sQLiteDatabase.execSQL(A0W3);
                            i3 = 183121677;
                        } else if (i == 17) {
                            1Dj r0 = C4zh.A01;
                            String A0014 = 1Dd.A00(r0, "block_table");
                            C01m.A00(288850355);
                            sQLiteDatabase.execSQL(A0014);
                            C01m.A00(-316036120);
                            1Dj r02 = C4zh.A00;
                            StringBuilder A0o = AnonymousClass001.A0o("UPDATE ");
                            A0o.append("block_table");
                            A0o.append(" SET ");
                            A0o.append(r0);
                            String A0Z = AnonymousClass001.A0Z(r02, " = ", A0o);
                            C01m.A00(-144794524);
                            sQLiteDatabase.execSQL(A0Z);
                            i3 = 959205944;
                        } else if (i == 18) {
                            String A0015 = 1Dd.A00(C4zf.A09, "threads_table");
                            C01m.A00(1476143346);
                            sQLiteDatabase.execSQL(A0015);
                            i3 = 716322438;
                        } else if (i == 19) {
                            String A0016 = 1Dd.A00(C4zf.A01, "threads_table");
                            C01m.A00(1501043743);
                            sQLiteDatabase.execSQL(A0016);
                            i3 = -1846607264;
                        } else if (i == 20) {
                            String A026 = 1Dd.A02(C4zj.A03, ImmutableList.of((Object) C4zj.A02), "normalized_address_table", "CREATE TABLE");
                            C01m.A00(1207945348);
                            sQLiteDatabase.execSQL(A026);
                            i3 = 1562307750;
                        } else if (i == 21) {
                            String A027 = 1Dd.A02(C4zj.A03, ImmutableList.of((Object) C4zj.A02), "normalized_address_table", "CREATE TABLE IF NOT EXISTS");
                            C01m.A00(1048813204);
                            sQLiteDatabase.execSQL(A027);
                            i3 = 2074039276;
                        }
                    }
                }
                i = i4;
            }
            C01m.A00(i3);
            i = i4;
        }
    }
}
