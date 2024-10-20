package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9y.class */
public final class H9y {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9y[] A01;
    public static final H9y A02;
    public static final H9y A03;
    public static final H9y A04;

    static {
        H9y h9y = new H9y("GALLERY_OPEN", 0);
        A03 = h9y;
        H9y h9y2 = new H9y("HD_BUTTON_CLICK", 1);
        A04 = h9y2;
        H9y h9y3 = new H9y("CAMERA", 2);
        A02 = h9y3;
        H9y[] h9yArr = {h9y, h9y2, h9y3};
        A01 = h9yArr;
        A00 = C00t.A00(h9yArr);
    }

    public H9y(String str, int i) {
    }

    public static H9y valueOf(String str) {
        return (H9y) Enum.valueOf(H9y.class, str);
    }

    public static H9y[] values() {
        return (H9y[]) A01.clone();
    }
}
