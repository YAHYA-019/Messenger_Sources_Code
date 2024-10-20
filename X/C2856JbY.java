package X;

/* renamed from: X.JbY, reason: case insensitive filesystem */
/* loaded from: JbY.class */
public final class C2856JbY extends Lz8 implements MRT {
    public static final C2856JbY A00;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.JbY, X.Lz8] */
    static {
        LES les = LES.A04;
        11T.A0I(les, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        A00 = new Lz8(les, 0);
    }

    @Override // X.Lz8, X.C0rt, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof KoR) {
            return super.containsKey(obj);
        }
        return false;
    }

    @Override // X.C0rt, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof MEF) {
            return super.containsValue(obj);
        }
        return false;
    }

    @Override // X.Lz8, X.C0rt, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof KoR) {
            return super.get(obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof KoR) ? obj2 : super.getOrDefault(obj, obj2);
    }
}
