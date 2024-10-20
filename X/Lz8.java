package X;

import java.util.Collection;
import java.util.Set;

/* loaded from: Lz8.class */
public class Lz8 extends C0rt implements java.util.Map, AnonymousClass116 {
    public static final Lz8 A02 = new Lz8(LES.A04, 0);
    public final LES A00;
    public final int A01;

    public Lz8(LES les, int i) {
        this.A00 = les;
        this.A01 = i;
    }

    @Override // X.C0rt
    public int A00() {
        return this.A01;
    }

    @Override // X.C0rt
    public /* bridge */ /* synthetic */ Collection A01() {
        return new Lz3(this);
    }

    @Override // X.C0rt
    public final Set A02() {
        return new LzF(this);
    }

    @Override // X.C0rt
    public /* bridge */ /* synthetic */ Set A03() {
        return new LzG(this);
    }

    public Lz8 A04(Object obj, Object obj2) {
        KgM A0G = this.A00.A0G(obj, obj2, AnonymousClass002.A04(obj), 0);
        return A0G == null ? this : new Lz8(A0G.A00, size() + A0G.A01);
    }

    @Override // X.C0rt, java.util.Map
    public boolean containsKey(Object obj) {
        return this.A00.A0O(obj, AnonymousClass002.A04(obj), 0);
    }

    @Override // X.C0rt, java.util.Map
    public Object get(Object obj) {
        return this.A00.A0N(AnonymousClass002.A04(obj), 0, obj);
    }
}
