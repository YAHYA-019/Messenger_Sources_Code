package X;

import android.database.Cursor;
import android.net.Uri;
import com.facebook.messaging.media.loader.LocalMediaLoaderParams;
import java.io.Closeable;
import java.io.File;
import java.util.Iterator;

/* loaded from: DAt.class */
public abstract class DAt implements Iterator, Closeable {
    public final Cursor A00;
    public final LocalMediaLoaderParams A01;
    public final 5HV A02;
    public final C5en A03 = C5en.A00();

    public DAt(Cursor cursor, LocalMediaLoaderParams localMediaLoaderParams, 5HV r304) {
        this.A00 = cursor;
        this.A01 = localMediaLoaderParams;
        this.A02 = r304;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r0.isAfterLast() != false) goto L8;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasNext() {
        /*
            r301 = this;
            r0 = r301
            android.database.Cursor r0 = r0.A00
            r302 = r0
            r0 = r302
            boolean r0 = r0.isClosed()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            r0 = r302
            boolean r0 = r0.isLast()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            r0 = r302
            boolean r0 = r0.isAfterLast()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L2a
        L28:
            r0 = 0
            r303 = r0
        L2a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAt.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        int i;
        Cursor cursor = this.A00;
        cursor.moveToNext();
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(5);
        if (j2 <= 0) {
            j2 = cursor.getLong(4) * 1000;
        }
        long j3 = cursor.getLong(4) * 1000;
        String string = cursor.getString(1);
        if (string == null) {
            return null;
        }
        try {
            Uri A03 = C0A2.A03(string);
            if (A03 == null || cursor.getString(2) == null) {
                return null;
            }
            String string2 = cursor.getString(3);
            if (string2 == null || string2.startsWith("*/")) {
                string2 = this.A02.A09(A03);
            }
            long j4 = cursor.getLong(9);
            C5en c5en = this.A03;
            c5en.A0V = this.A01.A02;
            c5en.A06 = j2;
            c5en.A05 = j3;
            c5en.A09 = j;
            c5en.A0q = string2;
            c5en.A07 = j4;
            c5en.A0E = Uri.fromFile(new File(string));
            if (this instanceof B5a) {
                c5en.A0P = 5HP.A0F;
                int i2 = cursor.getInt(6);
                0OO r0 = 0OO.A03;
                0OO A01 = 0OP.A01(r0, i2);
                i = cursor.getInt(7);
                int i3 = cursor.getInt(8);
                if (A01 == 0OO.A09) {
                    A01 = r0;
                }
                c5en.A0F = A01;
                if (A01 == r0 || A01 == 0OO.A04) {
                    c5en.A04 = i;
                    c5en.A00 = i3;
                    return 4YU.A0Y(c5en);
                }
                c5en.A04 = i3;
            } else {
                c5en.A0P = 5HP.A0H;
                c5en.A08 = cursor.getLong(6);
                c5en.A04 = cursor.getInt(7);
                i = cursor.getInt(8);
            }
            c5en.A00 = i;
            return 4YU.A0Y(c5en);
        } catch (SecurityException unused) {
            return null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass001.A0q("Cannot remove local media with this iterator.");
    }
}
