package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.957, reason: invalid class name */
/* loaded from: 957.class */
public final class AnonymousClass957 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass957[] A01;
    public static final AnonymousClass957 A02;
    public static final AnonymousClass957 A03;

    static {
        AnonymousClass957 anonymousClass957 = new AnonymousClass957("ONLY_THUMBNAIL", 0);
        A03 = anonymousClass957;
        AnonymousClass957 anonymousClass9572 = new AnonymousClass957("ONLY_IMAGE", 1);
        A02 = anonymousClass9572;
        AnonymousClass957[] anonymousClass957Arr = {anonymousClass957, anonymousClass9572, new AnonymousClass957("THUMBNAIL_AND_IMAGE", 2)};
        A01 = anonymousClass957Arr;
        A00 = C00t.A00(anonymousClass957Arr);
    }

    public AnonymousClass957(String str, int i) {
    }

    public static AnonymousClass957 valueOf(String str) {
        return (AnonymousClass957) Enum.valueOf(AnonymousClass957.class, str);
    }

    public static AnonymousClass957[] values() {
        return (AnonymousClass957[]) A01.clone();
    }
}
