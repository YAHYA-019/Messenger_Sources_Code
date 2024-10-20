package X;

import android.database.Cursor;

/* renamed from: X.Amd, reason: case insensitive filesystem */
/* loaded from: Amd.class */
public final class C1596Amd extends DAu implements AutoCloseable {
    public static final String[] A01 = {"thread_key"};
    public final int A00;

    public C1596Amd(Cursor cursor) {
        super(cursor);
        this.A00 = this.A02.getColumnIndexOrThrow("thread_key");
    }
}
