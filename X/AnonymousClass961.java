package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.961, reason: invalid class name */
/* loaded from: 961.class */
public final class AnonymousClass961 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass961[] A01;
    public static final AnonymousClass961 A02;
    public static final AnonymousClass961 A03;
    public static final AnonymousClass961 A04;
    public static final AnonymousClass961 A05;

    static {
        AnonymousClass961 anonymousClass961 = new AnonymousClass961("NONE", 0);
        A04 = anonymousClass961;
        AnonymousClass961 anonymousClass9612 = new AnonymousClass961("CLEAR_TEXT", 1);
        A02 = anonymousClass9612;
        AnonymousClass961 anonymousClass9613 = new AnonymousClass961("PASSWORD_TOGGLE", 2);
        A05 = anonymousClass9613;
        AnonymousClass961 anonymousClass9614 = new AnonymousClass961("CUSTOM", 3);
        A03 = anonymousClass9614;
        AnonymousClass961[] anonymousClass961Arr = {anonymousClass961, anonymousClass9612, anonymousClass9613, anonymousClass9614};
        A01 = anonymousClass961Arr;
        A00 = C00t.A00(anonymousClass961Arr);
    }

    public AnonymousClass961(String str, int i) {
    }

    public static AnonymousClass961 valueOf(String str) {
        return (AnonymousClass961) Enum.valueOf(AnonymousClass961.class, str);
    }

    public static AnonymousClass961[] values() {
        return (AnonymousClass961[]) A01.clone();
    }
}
