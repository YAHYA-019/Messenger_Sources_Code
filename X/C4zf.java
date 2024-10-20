package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4zf, reason: invalid class name */
/* loaded from: 4zf.class */
public final class C4zf extends 1Dd {
    public static final 1Dj A00;
    public static final 1Dj A01;
    public static final 1Dj A02;
    public static final 1Dj A03;
    public static final 1Dj A04;
    public static final 1Dj A05;
    public static final 1Dj A06;
    public static final 1Dj A07;
    public static final 1Dj A08;
    public static final 1Dj A09;
    public static final 1Dj A0A;
    public static final 1rV A0B;
    public static final ImmutableList A0C;
    public static final ImmutableList A0D;

    static {
        1Dj r0 = new 1Dj("threadid", "INTEGER DEFAULT 0");
        A07 = r0;
        1Dj r02 = new 1Dj("state", "INTEGER DEFAULT 0");
        A05 = r02;
        1Dj r03 = new 1Dj(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, "INTEGER DEFAULT 0");
        A08 = r03;
        1Dj r04 = new 1Dj("group_name", "TEXT");
        A02 = r04;
        1Dj r05 = new 1Dj("recipient_ids", "TEXT");
        A06 = r05;
        1Dj r06 = new 1Dj("me_bubble_color", "INTEGER DEFAULT 0");
        A03 = r06;
        1Dj r07 = new 1Dj("other_bubble_color", "INTEGER DEFAULT 0");
        A04 = r07;
        1Dj r08 = new 1Dj("wallpaper_color", "INTEGER DEFAULT 0");
        A0A = r08;
        1Dj r09 = new 1Dj("custom_like_emoji", "TEXT");
        A00 = r09;
        1Dj r010 = new 1Dj("unread_message_count", "INTEGER DEFAULT 0");
        A09 = r010;
        1Dj r011 = new 1Dj("draft", "TEXT");
        A01 = r011;
        A0C = ImmutableList.of(r0, r02, r03, r04, r05, r06, r07, r08, r09, r010, r011);
        1rU r012 = new 1rU(ImmutableList.of((Object) r0));
        A0B = r012;
        A0D = ImmutableList.of((Object) r012);
    }

    public C4zf() {
        super(A0C, A0D, "threads_table");
    }

    public void A07(SQLiteDatabase sQLiteDatabase) {
        super.A07(sQLiteDatabase);
        String A032 = 1Dd.A03(ImmutableList.of((Object) A05), "threads_table", "INDEX_THREAD_ID");
        C01m.A00(-1172998289);
        sQLiteDatabase.execSQL(A032);
        C01m.A00(1840069913);
    }
}
