package X;

/* renamed from: X.0du, reason: invalid class name */
/* loaded from: 0du.class */
public final class C0du extends C00v {
    public final /* synthetic */ 0PH A00;

    public C0du(0PH r302) {
        this.A00 = r302;
    }

    @Override // X.C00w
    public int A08() {
        return this.A00.A01.groupCount() + 1;
    }

    @Override // X.C00w, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains(obj);
        }
        return false;
    }

    @Override // X.C00v, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        String group = this.A00.A01.group(i);
        if (group == null) {
            group = "";
        }
        return group;
    }

    @Override // X.C00v, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf(obj);
        }
        return -1;
    }

    @Override // X.C00v, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }
}
