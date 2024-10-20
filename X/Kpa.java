package X;

/* loaded from: Kpa.class */
public final class Kpa {
    public final java.util.Map A00;
    public final java.util.Map A01;

    public Kpa(java.util.Map map, java.util.Map map2) {
        this.A01 = map;
        this.A00 = map2;
    }

    public Object A00(Enum r302) {
        Object obj = this.A01.get(r302);
        if (obj != null) {
            return obj;
        }
        throw JQy.A0y(r302, "Unable to convert proto enum: ", AnonymousClass001.A0k());
    }
}
