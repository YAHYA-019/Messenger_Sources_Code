package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.959, reason: invalid class name */
/* loaded from: 959.class */
public final class AnonymousClass959 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass959[] A01;
    public static final AnonymousClass959 A02;
    public static final AnonymousClass959 A03;

    static {
        AnonymousClass959 anonymousClass959 = new AnonymousClass959("THREAD_VIEW", 0);
        A03 = anonymousClass959;
        AnonymousClass959 anonymousClass9592 = new AnonymousClass959("HIGHLIGHTS_TAB", 1);
        A02 = anonymousClass9592;
        AnonymousClass959[] anonymousClass959Arr = {anonymousClass959, anonymousClass9592};
        A01 = anonymousClass959Arr;
        A00 = C00t.A00(anonymousClass959Arr);
    }

    public AnonymousClass959(String str, int i) {
    }

    public static AnonymousClass959 valueOf(String str) {
        return (AnonymousClass959) Enum.valueOf(AnonymousClass959.class, str);
    }

    public static AnonymousClass959[] values() {
        return (AnonymousClass959[]) A01.clone();
    }
}
