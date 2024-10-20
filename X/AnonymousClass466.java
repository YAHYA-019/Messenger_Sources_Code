package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.466, reason: invalid class name */
/* loaded from: 466.class */
public final class AnonymousClass466 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass466[] A01;
    public static final AnonymousClass466 A02;
    public static final AnonymousClass466 A03;
    public static final AnonymousClass466 A04;
    public static final AnonymousClass466 A05;
    public static final AnonymousClass466 A06;

    static {
        AnonymousClass466 anonymousClass466 = new AnonymousClass466("NOTIFY_VIBRATE_DEFAULT", 0);
        A02 = anonymousClass466;
        AnonymousClass466 anonymousClass4662 = new AnonymousClass466("NOTIFY_VIBRATE_SHORT", 1);
        A06 = anonymousClass4662;
        AnonymousClass466 anonymousClass4663 = new AnonymousClass466("NOTIFY_VIBRATE_LONG", 2);
        A05 = anonymousClass4663;
        AnonymousClass466 anonymousClass4664 = new AnonymousClass466("NOTIFY_VIBRATE_IMESSAGE", 3);
        A03 = anonymousClass4664;
        AnonymousClass466 anonymousClass4665 = new AnonymousClass466("NOTIFY_VIBRATE_INCOMING_CALL", 4);
        A04 = anonymousClass4665;
        AnonymousClass466[] anonymousClass466Arr = {anonymousClass466, anonymousClass4662, anonymousClass4663, anonymousClass4664, anonymousClass4665, new AnonymousClass466("INVALID_PATTERN", 5)};
        A01 = anonymousClass466Arr;
        A00 = C00t.A00(anonymousClass466Arr);
    }

    public AnonymousClass466(String str, int i) {
    }

    public static AnonymousClass466 valueOf(String str) {
        return (AnonymousClass466) Enum.valueOf(AnonymousClass466.class, str);
    }

    public static AnonymousClass466[] values() {
        return (AnonymousClass466[]) A01.clone();
    }
}
