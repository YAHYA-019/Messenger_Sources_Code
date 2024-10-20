package X;

/* loaded from: K5P.class */
public final class K5P extends Lif {
    public K5Q A00;
    public final K5Q A01;

    public K5P() {
        this(K5W.zzb);
    }

    public K5P(K5Q k5q) {
        this.A01 = k5q;
        if ((k5q.zzd & ((-1) << (-1))) != 0) {
            throw AnonymousClass001.A0L("Default instance must be immutable.");
        }
        this.A00 = (K5Q) k5q.A02(4);
    }

    public static void A00(K5P k5p) {
        K5Q k5q = k5p.A00;
        if ((k5q.zzd & ((-1) << (-1))) != 0) {
            L23.A02.A00(k5q.getClass()).DCg(k5q);
            k5q.zzd &= (-1) >>> 1;
        }
    }

    @Override // X.Lif
    public final /* bridge */ /* synthetic */ Object clone() {
        K5P k5p = new K5P(K5W.zzb);
        A00(this);
        k5p.A00 = this.A00;
        return k5p;
    }
}
