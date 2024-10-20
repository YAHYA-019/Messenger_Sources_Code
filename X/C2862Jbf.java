package X;

/* renamed from: X.Jbf, reason: case insensitive filesystem */
/* loaded from: Jbf.class */
public final class C2862Jbf extends LzC implements java.util.Map, 0C2 {
    public C2856JbY A00;

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof KoR) {
            return super.containsKey(obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof MEF) {
            return super/*java.util.AbstractMap*/.containsValue(obj);
        }
        return false;
    }

    @Override // java.util.Map
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

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof KoR) {
            return super.remove(obj);
        }
        return null;
    }
}
