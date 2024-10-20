package X;

/* renamed from: X.2hm, reason: invalid class name */
/* loaded from: 2hm.class */
public abstract class C2hm implements C2hn {
    public java.util.Map A00;

    @Override // X.C2hn
    public 1LI AdB() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C2hn
    public 1JB AdK() {
        return null;
    }

    @Override // X.C2hn
    public Object AgD(String str) {
        java.util.Map map = this.A00;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // X.C2hn
    public String AuZ() {
        return null;
    }

    @Override // X.C2hn
    public float B1M() {
        java.util.Map map = this.A00;
        if (map == null || !map.containsKey("parent_height_percent")) {
            return -1.0f;
        }
        return 1BK.A0o("parent_height_percent", map).floatValue();
    }

    @Override // X.C2hn
    public float B1R() {
        java.util.Map map = this.A00;
        if (map == null || !map.containsKey("parent_width_percent")) {
            return -1.0f;
        }
        return 1BK.A0o("parent_width_percent", map).floatValue();
    }

    @Override // X.C2hn
    public 1Im B6u() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C2hn
    public int BBq() {
        java.util.Map map = this.A00;
        if (map == null || !map.containsKey("span_size")) {
            return 1;
        }
        return ((Number) map.get("span_size")).intValue();
    }

    @Override // X.C2hn
    public 3Fn BK4() {
        if (this instanceof 37E) {
            return ((37E) this).A01;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C2hn
    public 2lL BK5() {
        if (this instanceof 37E) {
            return ((37E) this).A02;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C2hn
    public int BKA() {
        if (this instanceof 37E) {
            return ((37E) this).A00;
        }
        throw AnonymousClass001.A0p();
    }

    @Override // X.C2hn
    public boolean BMv() {
        return false;
    }

    @Override // X.C2hn
    public boolean BT1() {
        java.util.Map map = this.A00;
        if (map == null || !map.containsKey("is_full_span")) {
            return false;
        }
        return ((Boolean) map.get("is_full_span")).booleanValue();
    }

    @Override // X.C2hn
    public boolean BWO() {
        java.util.Map map = this.A00;
        if (map == null || !map.containsKey("is_sticky")) {
            return false;
        }
        return ((Boolean) map.get("is_sticky")).booleanValue();
    }

    @Override // X.C2hn
    public boolean Cfi() {
        return false;
    }

    @Override // X.C2hn
    public boolean Cfl() {
        return false;
    }

    @Override // X.C2hn
    public void CwV(int i) {
        if (!(this instanceof 37E)) {
            throw AnonymousClass001.A0p();
        }
        ((37E) this).A00 = i;
    }
}
