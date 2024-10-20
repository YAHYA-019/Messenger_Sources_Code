package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* loaded from: Bmn.class */
public final class Bmn {
    public final CCz A00;
    public final java.util.Map A01;

    public Bmn() {
        int i;
        CCz cCz = (CCz) 1Bn.A0A(84441);
        this.A00 = cCz;
        this.A01 = AnonymousClass001.A0u();
        AbG.A0B(cCz.A00).AAr("SearchContextLineStoreHelper must not be called on the main thread");
        ImmutableList.Builder builder = ImmutableList.builder();
        SQLiteDatabase AUF = cCz.A01.AUF();
        try {
            try {
                C01m.A01(AUF, -1521602707);
                Cursor query = AUF.query("search_context_lines", CCz.A02, null, null, null, null, null);
                while (query.moveToNext()) {
                    builder.m11011add((Object) new RLT(BZy.A02.A00(query), BZy.A00.A00(query), BZy.A01.A00(query)));
                }
                AUF.setTransactionSuccessful();
                i = -16104109;
            } catch (Exception e) {
                0fH.A0w("SearchContextLineStoreHelper", "#getContextLineResults Exception when getting getContextLineResults", e);
                i = 1252151465;
            }
            C01m.A03(AUF, i);
            1Du A0x = AbI.A0x(builder);
            while (A0x.hasNext()) {
                RLT rlt = (RLT) A0x.next();
                this.A01.put(rlt.A02, rlt);
            }
        } catch (Throwable th) {
            C01m.A03(AUF, 770938827);
            throw th;
        }
    }
}
