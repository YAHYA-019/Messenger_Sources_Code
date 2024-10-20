package X;

import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Q8, reason: invalid class name */
/* loaded from: 7Q8.class */
public final class C7Q8 {
    public static final java.util.Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7Q8[] A02;
    public static final C7Q8 A03;
    public static final C7Q8 A04;
    public static final C7Q8 A05;
    public static final C7Q8 A06;
    public final int warningStyle;

    static {
        C7Q8 c7q8 = new C7Q8("COMPOSER_BLOCK_FOLLOWED_BY_STRAP", 0, 3);
        A05 = c7q8;
        C7Q8 c7q82 = new C7Q8("COMPOSER_BLOCK", 1, 1);
        A04 = c7q82;
        C7Q8 c7q83 = new C7Q8("BANNER", 2, 0);
        A03 = c7q83;
        C7Q8 c7q84 = new C7Q8("INVALID", 3, -1);
        A06 = c7q84;
        C7Q8[] c7q8Arr = {c7q8, c7q82, c7q83, c7q84};
        A02 = c7q8Arr;
        A01 = C00t.A00(c7q8Arr);
        C7Q8[] values = values();
        int A002 = 02J.A00(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A002 < 16 ? 16 : A002);
        for (C7Q8 c7q85 : values) {
            linkedHashMap.put(Integer.valueOf(c7q85.warningStyle), c7q85);
        }
        A00 = 02K.A04(linkedHashMap, 7Q9.A00);
    }

    public C7Q8(String str, int i, int i2) {
        this.warningStyle = i2;
    }

    public static C7Q8 valueOf(String str) {
        return (C7Q8) Enum.valueOf(C7Q8.class, str);
    }

    public static C7Q8[] values() {
        return (C7Q8[]) A02.clone();
    }
}
