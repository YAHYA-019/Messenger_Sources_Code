package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ER8.class */
public final class ER8 implements 2KM {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ER8[] A01;
    public static final ER8 A02;
    public static final ER8 A03;
    public static final ER8 A04;
    public static final ER8 A05;
    public static final ER8 A06;
    public static final ER8 A07;
    public final String value;

    static {
        ER8 er8 = new ER8("ROBOTO", 0, "sans-serif");
        A07 = er8;
        ER8 er82 = new ER8("FB_SANS", 1, "Facebook Sans Variable");
        A02 = er82;
        ER8 er83 = new ER8("OPTIMISTIC_DISPLAY_APP", 2, "Optimistic Display App");
        A03 = er83;
        ER8 er84 = new ER8("OPTIMISTIC_DISPLAY_APP_MEDIUM", 3, "Optimistic Display App Medium");
        A04 = er84;
        ER8 er85 = new ER8("OPTIMISTIC_TEXT_APP_REGULAR", 4, "Optimistic Text App Regular");
        A06 = er85;
        ER8 er86 = new ER8("OPTIMISTIC_TEXT_APP_MEDIUM", 5, "Optimistic Text App Medium");
        A05 = er86;
        ER8[] er8Arr = {er8, er82, er83, er84, er85, er86, new ER8("OPTIMISTIC_TEXT_APP_BOLD", 6, "Optimistic Text App Bold")};
        A01 = er8Arr;
        A00 = C00t.A00(er8Arr);
    }

    public ER8(String str, int i, String str2) {
        this.value = str2;
    }

    public static ER8 valueOf(String str) {
        return (ER8) Enum.valueOf(ER8.class, str);
    }

    public static ER8[] values() {
        return (ER8[]) A01.clone();
    }

    public String getValue() {
        return this.value;
    }
}
