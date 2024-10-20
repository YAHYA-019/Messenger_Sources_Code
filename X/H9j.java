package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9j.class */
public final class H9j {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9j[] A01;
    public static final H9j A02;
    public static final H9j A03;

    static {
        H9j h9j = new H9j("ID_FRONT_SIDE", 0);
        A03 = h9j;
        H9j h9j2 = new H9j("ID_BACK_SIDE", 1);
        A02 = h9j2;
        H9j[] h9jArr = {h9j, h9j2};
        A01 = h9jArr;
        A00 = C00t.A00(h9jArr);
    }

    public H9j(String str, int i) {
    }

    public static H9j valueOf(String str) {
        return (H9j) Enum.valueOf(H9j.class, str);
    }

    public static H9j[] values() {
        return (H9j[]) A01.clone();
    }
}
