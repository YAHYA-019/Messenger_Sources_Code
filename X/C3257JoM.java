package X;

import android.database.Cursor;
import java.io.Closeable;

/* renamed from: X.JoM, reason: case insensitive filesystem */
/* loaded from: JoM.class */
public final class C3257JoM extends AbstractC3258JoN implements Closeable {
    public final int A00;
    public final int A01;
    public final Cursor A02;

    public C3257JoM(Cursor cursor) {
        this.A02 = cursor;
        this.A01 = cursor.getColumnIndex("local_contact_id");
        this.A00 = cursor.getColumnIndex("contact_hash");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A02.close();
    }
}
