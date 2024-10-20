package X;

/* loaded from: Csu.class */
public final class Csu implements DHV {
    public final boolean A00;

    public Csu() {
        this(true);
    }

    public Csu(boolean z) {
        this.A00 = z;
    }

    public String BHk() {
        return "group_creation";
    }

    public String getId() {
        return 0Pz.A1C("GROUP_CREATION:enable_", this.A00);
    }
}
