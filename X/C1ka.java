package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1ka, reason: invalid class name */
/* loaded from: 1ka.class */
public final class C1ka implements C1kb {
    public static final /* synthetic */ C1ka[] A00;
    public static final C1ka A01;

    static {
        C1ka c1ka = new C1ka();
        A01 = c1ka;
        A00 = new C1ka[]{c1ka};
    }

    public static C1ka valueOf(String str) {
        return (C1ka) Enum.valueOf(C1ka.class, str);
    }

    public static C1ka[] values() {
        return (C1ka[]) A00.clone();
    }
}
