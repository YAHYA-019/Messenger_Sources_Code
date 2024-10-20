package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.966, reason: invalid class name */
/* loaded from: 966.class */
public final class AnonymousClass966 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass966[] A01;
    public static final AnonymousClass966 A02;
    public static final AnonymousClass966 A03;
    public static final AnonymousClass966 A04;
    public static final AnonymousClass966 A05;
    public static final AnonymousClass966 A06;

    static {
        AnonymousClass966 anonymousClass966 = new AnonymousClass966("LOADING", 0);
        A05 = anonymousClass966;
        AnonymousClass966 anonymousClass9662 = new AnonymousClass966("EMPTY", 1);
        A02 = anonymousClass9662;
        AnonymousClass966 anonymousClass9663 = new AnonymousClass966("ERROR", 2);
        A03 = anonymousClass9663;
        AnonymousClass966 anonymousClass9664 = new AnonymousClass966("LOADED", 3);
        A04 = anonymousClass9664;
        AnonymousClass966 anonymousClass9665 = new AnonymousClass966("SELECTING", 4);
        A06 = anonymousClass9665;
        AnonymousClass966[] anonymousClass966Arr = {anonymousClass966, anonymousClass9662, anonymousClass9663, anonymousClass9664, anonymousClass9665};
        A01 = anonymousClass966Arr;
        A00 = C00t.A00(anonymousClass966Arr);
    }

    public AnonymousClass966(String str, int i) {
    }

    public static AnonymousClass966 valueOf(String str) {
        return (AnonymousClass966) Enum.valueOf(AnonymousClass966.class, str);
    }

    public static AnonymousClass966[] values() {
        return (AnonymousClass966[]) A01.clone();
    }
}
