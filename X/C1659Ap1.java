package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Ap1, reason: case insensitive filesystem */
/* loaded from: Ap1.class */
public final class C1659Ap1 extends 1Da {
    public C1659Ap1() {
        super(ImmutableList.of((Object) new C1641Aoj()), "call_logs_schema", 6);
    }

    public void A06(SQLiteDatabase sQLiteDatabase) {
    }

    public void A09(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        int i4 = i;
        11T.A0F(sQLiteDatabase, 0);
        0fH.A0V(Integer.valueOf(i), C1659Ap1.class, 4YT.A00(1354), Integer.valueOf(i2));
        while (i4 < i2) {
            int i5 = i4 + 1;
            if (i4 != 1) {
                if (i4 == 2) {
                    C01m.A00(-587325896);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS call_log.sqlite");
                    C01m.A00(1848849907);
                    C01m.A00(521964716);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS voicemail.sqlite");
                    i3 = -992427215;
                } else if (i4 == 3) {
                    C7d4 A01 = 4cM.A01(new 2V0[]{AbF.A0G("call_type", "5"), AbF.A0G("call_type", "6")});
                    sQLiteDatabase.delete("user_table", A01.A02(), A01.A03());
                } else if (i4 == 4) {
                    C01m.A00(-762661485);
                    sQLiteDatabase.execSQL("DELETE FROM  user_table");
                    i3 = -2126727441;
                } else if (i4 == 5) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("UPDATE user_table SET ");
                    A0k.append(Ba9.A08);
                    String A0d = AnonymousClass001.A0d(" = 1", A0k);
                    C01m.A00(-1050542436);
                    sQLiteDatabase.execSQL(A0d);
                    i3 = 1883921165;
                }
                C01m.A00(i3);
            } else {
                1Dj r0 = Ba9.A08;
                String format = String.format(Locale.US, "PRAGMA table_info(%s)", Arrays.copyOf(new Object[]{"user_table"}, 1));
                11T.A0A(format);
                Cursor rawQuery = sQLiteDatabase.rawQuery(format, null);
                11T.A0A(rawQuery);
                try {
                    int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    while (true) {
                        if (!rawQuery.moveToNext()) {
                            rawQuery.close();
                            String A012 = 1Dd.A01(r0, "user_table", 1);
                            C01m.A00(-786937090);
                            sQLiteDatabase.execSQL(A012);
                            C01m.A00(-279601048);
                            1Dd.A06(sQLiteDatabase, ImmutableList.of((Object) Ba9.A06, (Object) Ba9.A09, (Object) Ba9.A07, (Object) Ba9.A03, (Object) Ba9.A00, (Object) Ba9.A02, (Object) Ba9.A05, (Object) Ba9.A01, (Object) Ba9.A04, (Object) r0), ImmutableList.of(), "user_table");
                            break;
                        }
                        if ("seen_or_played".equals(rawQuery.getString(columnIndexOrThrow))) {
                            break;
                        }
                    }
                } finally {
                    rawQuery.close();
                }
            }
            i4 = i5;
        }
    }
}
