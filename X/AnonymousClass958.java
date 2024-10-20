package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.958, reason: invalid class name */
/* loaded from: 958.class */
public final class AnonymousClass958 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass958[] A01;
    public static final AnonymousClass958 A02;
    public static final AnonymousClass958 A03;

    static {
        AnonymousClass958 anonymousClass958 = new AnonymousClass958("THUMBNAIL", 0);
        A03 = anonymousClass958;
        AnonymousClass958 anonymousClass9582 = new AnonymousClass958("IMAGE", 1);
        A02 = anonymousClass9582;
        AnonymousClass958[] anonymousClass958Arr = {anonymousClass958, anonymousClass9582};
        A01 = anonymousClass958Arr;
        A00 = C00t.A00(anonymousClass958Arr);
    }

    public AnonymousClass958(String str, int i) {
    }

    public static AnonymousClass958 valueOf(String str) {
        return (AnonymousClass958) Enum.valueOf(AnonymousClass958.class, str);
    }

    public static AnonymousClass958[] values() {
        return (AnonymousClass958[]) A01.clone();
    }
}
