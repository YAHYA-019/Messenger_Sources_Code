package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.963, reason: invalid class name */
/* loaded from: 963.class */
public final class AnonymousClass963 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass963[] A01;
    public static final AnonymousClass963 A02;
    public static final AnonymousClass963 A03;
    public static final AnonymousClass963 A04;
    public static final AnonymousClass963 A05;
    public static final AnonymousClass963 A06;

    static {
        AnonymousClass963 anonymousClass963 = new AnonymousClass963("FAILED_FETCH_AVATAR_DETAIL", 0);
        A03 = anonymousClass963;
        AnonymousClass963 anonymousClass9632 = new AnonymousClass963("FAILED_FETCH_ENVIRONMENTS", 1);
        A05 = anonymousClass9632;
        AnonymousClass963 anonymousClass9633 = new AnonymousClass963("FAILED_FETCH_POSES", 2);
        A06 = anonymousClass9633;
        AnonymousClass963 anonymousClass9634 = new AnonymousClass963("FAILED_FETCH_CURRENT_USER", 3);
        A04 = anonymousClass9634;
        AnonymousClass963 anonymousClass9635 = new AnonymousClass963("AVATAR_DELETED", 4);
        A02 = anonymousClass9635;
        AnonymousClass963[] anonymousClass963Arr = {anonymousClass963, anonymousClass9632, anonymousClass9633, anonymousClass9634, anonymousClass9635};
        A01 = anonymousClass963Arr;
        A00 = C00t.A00(anonymousClass963Arr);
    }

    public AnonymousClass963(String str, int i) {
    }

    public static AnonymousClass963 valueOf(String str) {
        return (AnonymousClass963) Enum.valueOf(AnonymousClass963.class, str);
    }

    public static AnonymousClass963[] values() {
        return (AnonymousClass963[]) A01.clone();
    }
}
