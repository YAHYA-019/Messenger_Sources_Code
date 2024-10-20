package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: X.0ds, reason: invalid class name */
/* loaded from: 0ds.class */
public final class C0ds extends C00w implements Collection, AnonymousClass116 {
    public final /* synthetic */ 0PH A00;

    public C0ds(0PH r302) {
        this.A00 = r302;
    }

    @Override // X.C00w
    public int A08() {
        return this.A00.A01.groupCount() + 1;
    }

    public C0zq A09(int i) {
        Matcher matcher = this.A00.A01;
        07E A07 = 07C.A07(matcher.start(i), matcher.end(i));
        if (((07F) A07).A00 < 0) {
            return null;
        }
        String group = matcher.group(i);
        11T.A0A(group);
        return new C0zq(group, A07);
    }

    @Override // X.C00w, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C0zq)) {
            return super.contains(obj);
        }
        return false;
    }

    @Override // X.C00w, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // X.C00w, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new 0AQ(new 0AN(new C0dt(this), 0QD.A03(C0s8.A16(this))));
    }
}
