package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.150, reason: invalid class name */
/* loaded from: 150.class */
public final class AnonymousClass150 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass150[] A01;
    public static final AnonymousClass150 A02;
    public static final AnonymousClass150 A03;
    public static final AnonymousClass150 A04;

    static {
        AnonymousClass150 anonymousClass150 = new AnonymousClass150("WARNING", 0);
        A04 = anonymousClass150;
        AnonymousClass150 anonymousClass1502 = new AnonymousClass150("ERROR", 1);
        A02 = anonymousClass1502;
        AnonymousClass150 anonymousClass1503 = new AnonymousClass150("HIDDEN", 2);
        A03 = anonymousClass1503;
        AnonymousClass150[] anonymousClass150Arr = {anonymousClass150, anonymousClass1502, anonymousClass1503};
        A01 = anonymousClass150Arr;
        A00 = C00t.A00(anonymousClass150Arr);
    }

    public AnonymousClass150(String str, int i) {
    }

    public static AnonymousClass150 valueOf(String str) {
        return (AnonymousClass150) Enum.valueOf(AnonymousClass150.class, str);
    }

    public static AnonymousClass150[] values() {
        return (AnonymousClass150[]) A01.clone();
    }
}
