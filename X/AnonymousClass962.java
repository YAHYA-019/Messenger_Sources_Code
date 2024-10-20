package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.962, reason: invalid class name */
/* loaded from: 962.class */
public final class AnonymousClass962 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass962[] A01;
    public static final AnonymousClass962 A02;
    public static final AnonymousClass962 A03;
    public static final AnonymousClass962 A04;
    public static final AnonymousClass962 A05;

    static {
        AnonymousClass962 anonymousClass962 = new AnonymousClass962("SAVE_MEDIA", 0);
        A04 = anonymousClass962;
        AnonymousClass962 anonymousClass9622 = new AnonymousClass962("FORWARD", 1);
        A02 = anonymousClass9622;
        AnonymousClass962 anonymousClass9623 = new AnonymousClass962("SHARE", 2);
        A05 = anonymousClass9623;
        AnonymousClass962 anonymousClass9624 = new AnonymousClass962("MAKE_PROFILE_PICTURE", 3);
        A03 = anonymousClass9624;
        AnonymousClass962[] anonymousClass962Arr = {anonymousClass962, anonymousClass9622, anonymousClass9623, anonymousClass9624};
        A01 = anonymousClass962Arr;
        A00 = C00t.A00(anonymousClass962Arr);
    }

    public AnonymousClass962(String str, int i) {
    }

    public static AnonymousClass962 valueOf(String str) {
        return (AnonymousClass962) Enum.valueOf(AnonymousClass962.class, str);
    }

    public static AnonymousClass962[] values() {
        return (AnonymousClass962[]) A01.clone();
    }
}
