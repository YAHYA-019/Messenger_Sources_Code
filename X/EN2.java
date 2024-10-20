package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: EN2.class */
public final class EN2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EN2[] A01;
    public static final EN2 A02;
    public static final EN2 A03;
    public static final EN2 A04;
    public static final EN2 A05;
    public static final EN2 A06;
    public final String value;

    static {
        EN2 en2 = new EN2("IMAGINE", 0, "imagine");
        A02 = en2;
        EN2 en22 = new EN2("IMAGINE_IG_PERSONALIZATION", 1, "imagine_ig_personalization");
        A03 = en22;
        EN2 en23 = new EN2("MEMU_IG_PERSONALIZATION", 2, "memu_ig_personalization");
        A05 = en23;
        EN2 en24 = new EN2("MEMU", 3, "memu");
        A04 = en24;
        EN2 en25 = new EN2("MEMU_IN_FEED", 4, "memu_in_feed");
        A06 = en25;
        EN2[] en2Arr = {en2, en22, en23, en24, en25};
        A01 = en2Arr;
        A00 = C00t.A00(en2Arr);
    }

    public EN2(String str, int i, String str2) {
        this.value = str2;
    }

    public static EN2 valueOf(String str) {
        return (EN2) Enum.valueOf(EN2.class, str);
    }

    public static EN2[] values() {
        return (EN2[]) A01.clone();
    }
}
