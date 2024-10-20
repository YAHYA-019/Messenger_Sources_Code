package X;

import android.database.DataSetObserver;

/* loaded from: JV4.class */
public final class JV4 extends DataSetObserver {
    public final /* synthetic */ JYX A00;

    public JV4(JYX jyx) {
        this.A00 = jyx;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        JYX jyx = this.A00;
        jyx.A06 = true;
        0V5.A00(jyx, -1597326437);
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        JYX jyx = this.A00;
        jyx.A06 = false;
        0V5.A01(jyx, -1287184389);
    }
}
