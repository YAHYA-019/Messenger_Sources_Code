package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.815, reason: invalid class name */
/* loaded from: 815.class */
public final class AnonymousClass815 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass815[] A01;
    public static final AnonymousClass815 A02;
    public static final AnonymousClass815 A03;
    public static final AnonymousClass815 A04;
    public static final AnonymousClass815 A05;
    public static final AnonymousClass815 A06;
    public static final AnonymousClass815 A07;
    public static final AnonymousClass815 A08;

    static {
        AnonymousClass815 anonymousClass815 = new AnonymousClass815("VISIBLE", 0);
        A08 = anonymousClass815;
        AnonymousClass815 anonymousClass8152 = new AnonymousClass815("INVISIBLE", 1);
        A04 = anonymousClass8152;
        AnonymousClass815 anonymousClass8153 = new AnonymousClass815("MANAGED", 2);
        A05 = anonymousClass8153;
        AnonymousClass815 anonymousClass8154 = new AnonymousClass815("VIPER", 3);
        A07 = anonymousClass8154;
        AnonymousClass815 anonymousClass8155 = new AnonymousClass815("COMMON", 4);
        A02 = anonymousClass8155;
        AnonymousClass815 anonymousClass8156 = new AnonymousClass815("MESSENGER_THREAD_VIEW_MESSAGES_VPVD", 5);
        A06 = anonymousClass8156;
        AnonymousClass815 anonymousClass8157 = new AnonymousClass815("IG_EXTRA_DATA", 6);
        A03 = anonymousClass8157;
        AnonymousClass815[] anonymousClass815Arr = {anonymousClass815, anonymousClass8152, anonymousClass8153, anonymousClass8154, anonymousClass8155, anonymousClass8156, anonymousClass8157, new AnonymousClass815("MWA_EXTRA_DATA", 7)};
        A01 = anonymousClass815Arr;
        A00 = C00t.A00(anonymousClass815Arr);
    }

    public AnonymousClass815(String str, int i) {
    }

    public static AnonymousClass815 valueOf(String str) {
        return (AnonymousClass815) Enum.valueOf(AnonymousClass815.class, str);
    }

    public static AnonymousClass815[] values() {
        return (AnonymousClass815[]) A01.clone();
    }
}
