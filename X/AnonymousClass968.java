package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.968, reason: invalid class name */
/* loaded from: 968.class */
public final class AnonymousClass968 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass968[] A01;
    public static final AnonymousClass968 A02;
    public static final AnonymousClass968 A03;
    public static final AnonymousClass968 A04;
    public static final AnonymousClass968 A05;
    public static final AnonymousClass968 A06;

    static {
        AnonymousClass968 anonymousClass968 = new AnonymousClass968("NONE", 0);
        A05 = anonymousClass968;
        AnonymousClass968 anonymousClass9682 = new AnonymousClass968("READY_TO_DOWNLOAD", 1);
        A06 = anonymousClass9682;
        AnonymousClass968 anonymousClass9683 = new AnonymousClass968("DOWNLOADING", 2);
        A02 = anonymousClass9683;
        AnonymousClass968 anonymousClass9684 = new AnonymousClass968("DOWNLOAD_FAILED", 3);
        A03 = anonymousClass9684;
        AnonymousClass968 anonymousClass9685 = new AnonymousClass968("DOWNLOAD_SUCCESS", 4);
        A04 = anonymousClass9685;
        AnonymousClass968[] anonymousClass968Arr = {anonymousClass968, anonymousClass9682, anonymousClass9683, anonymousClass9684, anonymousClass9685};
        A01 = anonymousClass968Arr;
        A00 = C00t.A00(anonymousClass968Arr);
    }

    public AnonymousClass968(String str, int i) {
    }

    public static AnonymousClass968 valueOf(String str) {
        return (AnonymousClass968) Enum.valueOf(AnonymousClass968.class, str);
    }

    public static AnonymousClass968[] values() {
        return (AnonymousClass968[]) A01.clone();
    }
}
