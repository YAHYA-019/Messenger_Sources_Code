package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.465, reason: invalid class name */
/* loaded from: 465.class */
public final class AnonymousClass465 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass465[] A01;
    public static final AnonymousClass465 A02;
    public static final AnonymousClass465 A03;

    static {
        AnonymousClass465 anonymousClass465 = new AnonymousClass465("DEFAULT_LIGHT", 0);
        A02 = anonymousClass465;
        AnonymousClass465 anonymousClass4652 = new AnonymousClass465("INVALID_LIGHT", 1);
        A03 = anonymousClass4652;
        AnonymousClass465[] anonymousClass465Arr = {anonymousClass465, anonymousClass4652};
        A01 = anonymousClass465Arr;
        A00 = C00t.A00(anonymousClass465Arr);
    }

    public AnonymousClass465(String str, int i) {
    }

    public static AnonymousClass465 valueOf(String str) {
        return (AnonymousClass465) Enum.valueOf(AnonymousClass465.class, str);
    }

    public static AnonymousClass465[] values() {
        return (AnonymousClass465[]) A01.clone();
    }
}
