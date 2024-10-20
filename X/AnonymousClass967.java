package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.967, reason: invalid class name */
/* loaded from: 967.class */
public final class AnonymousClass967 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass967[] A01;
    public static final AnonymousClass967 A02;
    public static final AnonymousClass967 A03;
    public static final AnonymousClass967 A04;
    public static final AnonymousClass967 A05;
    public static final AnonymousClass967 A06;

    static {
        AnonymousClass967 anonymousClass967 = new AnonymousClass967("NONE", 0);
        A03 = anonymousClass967;
        AnonymousClass967 anonymousClass9672 = new AnonymousClass967("TRANSLATING", 1);
        A04 = anonymousClass9672;
        AnonymousClass967 anonymousClass9673 = new AnonymousClass967("VIEW_ORIGINAL", 2);
        A05 = anonymousClass9673;
        AnonymousClass967 anonymousClass9674 = new AnonymousClass967("VIEW_TRANSLATION", 3);
        A06 = anonymousClass9674;
        AnonymousClass967 anonymousClass9675 = new AnonymousClass967("FAILED_TO_TRANSLATE", 4);
        A02 = anonymousClass9675;
        AnonymousClass967[] anonymousClass967Arr = {anonymousClass967, anonymousClass9672, anonymousClass9673, anonymousClass9674, anonymousClass9675};
        A01 = anonymousClass967Arr;
        A00 = C00t.A00(anonymousClass967Arr);
    }

    public AnonymousClass967(String str, int i) {
    }

    public static AnonymousClass967 valueOf(String str) {
        return (AnonymousClass967) Enum.valueOf(AnonymousClass967.class, str);
    }

    public static AnonymousClass967[] values() {
        return (AnonymousClass967[]) A01.clone();
    }
}
