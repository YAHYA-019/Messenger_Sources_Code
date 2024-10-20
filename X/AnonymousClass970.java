package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.970, reason: invalid class name */
/* loaded from: 970.class */
public final class AnonymousClass970 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass970[] A01;
    public static final AnonymousClass970 A02;
    public static final AnonymousClass970 A03;
    public final int contentDescriptionResId;
    public final C1u3 iconName;
    public final C1u4 iconSize;
    public final int iconSizeDp = 32;

    static {
        C1u3 c1u3 = C1u3.A0U;
        C1u4 c1u4 = C1u4.SIZE_32;
        AnonymousClass970 anonymousClass970 = new AnonymousClass970(c1u3, c1u4, "BACK", 0, 2131953159);
        A02 = anonymousClass970;
        AnonymousClass970 anonymousClass9702 = new AnonymousClass970(C1u3.A1w, c1u4, "CLOSE", 1, 2131954235);
        A03 = anonymousClass9702;
        AnonymousClass970[] anonymousClass970Arr = {anonymousClass970, anonymousClass9702};
        A01 = anonymousClass970Arr;
        A00 = C00t.A00(anonymousClass970Arr);
    }

    public AnonymousClass970(C1u3 c1u3, C1u4 c1u4, String str, int i, int i2) {
        this.contentDescriptionResId = i2;
        this.iconName = c1u3;
        this.iconSize = c1u4;
    }

    public static AnonymousClass970 valueOf(String str) {
        return (AnonymousClass970) Enum.valueOf(AnonymousClass970.class, str);
    }

    public static AnonymousClass970[] values() {
        return (AnonymousClass970[]) A01.clone();
    }
}
