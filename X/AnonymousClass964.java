package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.964, reason: invalid class name */
/* loaded from: 964.class */
public final class AnonymousClass964 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass964[] A01;
    public static final AnonymousClass964 A02;
    public static final AnonymousClass964 A03;
    public static final AnonymousClass964 A04;
    public static final AnonymousClass964 A05;
    public static final AnonymousClass964 A06;

    static {
        AnonymousClass964 anonymousClass964 = new AnonymousClass964("INITIAL", 0);
        A03 = anonymousClass964;
        AnonymousClass964 anonymousClass9642 = new AnonymousClass964("IN_PROGRESS", 1);
        A04 = anonymousClass9642;
        AnonymousClass964 anonymousClass9643 = new AnonymousClass964("SUCCESS", 2);
        A06 = anonymousClass9643;
        AnonymousClass964 anonymousClass9644 = new AnonymousClass964("FAILURE", 3);
        A02 = anonymousClass9644;
        AnonymousClass964 anonymousClass9645 = new AnonymousClass964("NO_RC_IN_DEVICE", 4);
        A05 = anonymousClass9645;
        AnonymousClass964[] anonymousClass964Arr = {anonymousClass964, anonymousClass9642, anonymousClass9643, anonymousClass9644, anonymousClass9645};
        A01 = anonymousClass964Arr;
        A00 = C00t.A00(anonymousClass964Arr);
    }

    public AnonymousClass964(String str, int i) {
    }

    public static AnonymousClass964 valueOf(String str) {
        return (AnonymousClass964) Enum.valueOf(AnonymousClass964.class, str);
    }

    public static AnonymousClass964[] values() {
        return (AnonymousClass964[]) A01.clone();
    }
}
