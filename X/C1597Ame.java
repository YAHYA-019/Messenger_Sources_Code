package X;

import android.database.Cursor;
import java.util.Iterator;

/* renamed from: X.Ame, reason: case insensitive filesystem */
/* loaded from: Ame.class */
public final class C1597Ame extends DAu implements Iterable {
    public final 4yJ A00;
    public final C12074yn A01;

    public C1597Ame(Cursor cursor, 4yJ r303, C12074yn c12074yn) {
        super(cursor);
        this.A00 = r303;
        this.A01 = c12074yn;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }
}
