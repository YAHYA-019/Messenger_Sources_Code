package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.214, reason: invalid class name */
/* loaded from: 214.class */
public final class AnonymousClass214 {
    public static final AnonymousClass214[] A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ AnonymousClass214[] A02;
    public static final AnonymousClass214 A03;
    public static final AnonymousClass214 A04;
    public static final AnonymousClass214 A05;
    public final int dbValue;

    static {
        AnonymousClass214 anonymousClass214 = new AnonymousClass214("PENDING", 0, 0);
        A04 = anonymousClass214;
        AnonymousClass214 anonymousClass2142 = new AnonymousClass214("PENDING_RETRY", 1, 1);
        A05 = anonymousClass2142;
        AnonymousClass214 anonymousClass2143 = new AnonymousClass214("FAILED", 2, 2);
        A03 = anonymousClass2143;
        AnonymousClass214[] anonymousClass214Arr = {anonymousClass214, anonymousClass2142, anonymousClass2143, new AnonymousClass214("DRAFT", 3, 3)};
        A02 = anonymousClass214Arr;
        C00u A002 = C00t.A00(anonymousClass214Arr);
        A01 = A002;
        A00 = (AnonymousClass214[]) A002.toArray(new AnonymousClass214[0]);
    }

    public AnonymousClass214(String str, int i, int i2) {
        this.dbValue = i2;
    }

    public static AnonymousClass214 valueOf(String str) {
        return (AnonymousClass214) Enum.valueOf(AnonymousClass214.class, str);
    }

    public static AnonymousClass214[] values() {
        return (AnonymousClass214[]) A02.clone();
    }
}
