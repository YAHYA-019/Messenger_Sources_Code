package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.219, reason: invalid class name */
/* loaded from: 219.class */
public final class AnonymousClass219 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass219[] A01;
    public static final AnonymousClass219 A02;
    public static final AnonymousClass219 A03;
    public final int value;

    static {
        AnonymousClass219 anonymousClass219 = new AnonymousClass219("PRIMARY", 0, 0);
        A02 = anonymousClass219;
        AnonymousClass219 anonymousClass2192 = new AnonymousClass219("SECONDARY", 1, 1);
        A03 = anonymousClass2192;
        AnonymousClass219[] anonymousClass219Arr = {anonymousClass219, anonymousClass2192};
        A01 = anonymousClass219Arr;
        A00 = C00t.A00(anonymousClass219Arr);
    }

    public AnonymousClass219(String str, int i, int i2) {
        this.value = i2;
    }

    public static AnonymousClass219 valueOf(String str) {
        return (AnonymousClass219) Enum.valueOf(AnonymousClass219.class, str);
    }

    public static AnonymousClass219[] values() {
        return (AnonymousClass219[]) A01.clone();
    }
}
