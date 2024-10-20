package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.291, reason: invalid class name */
/* loaded from: 291.class */
public final class AnonymousClass291 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass291[] A01;
    public static final AnonymousClass291 A02;
    public static final AnonymousClass291 A03;
    public static final AnonymousClass291 A04;
    public final String key;

    static {
        AnonymousClass291 anonymousClass291 = new AnonymousClass291("RecoveryCode", 0, "rc");
        A04 = anonymousClass291;
        AnonymousClass291 anonymousClass2912 = new AnonymousClass291("MessageExpirationOptOutKey", 1, "me_opt_out_flag");
        A02 = anonymousClass2912;
        AnonymousClass291 anonymousClass2913 = new AnonymousClass291("MessageExpirationTriggeredKey", 2, "me_triggered_flag");
        A03 = anonymousClass2913;
        AnonymousClass291[] anonymousClass291Arr = {anonymousClass291, anonymousClass2912, anonymousClass2913, new AnonymousClass291("TestSharedKey", 3, "testSharedKey")};
        A01 = anonymousClass291Arr;
        A00 = C00t.A00(anonymousClass291Arr);
    }

    public AnonymousClass291(String str, int i, String str2) {
        this.key = str2;
    }

    public static AnonymousClass291 valueOf(String str) {
        return (AnonymousClass291) Enum.valueOf(AnonymousClass291.class, str);
    }

    public static AnonymousClass291[] values() {
        return (AnonymousClass291[]) A01.clone();
    }
}
