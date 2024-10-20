package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.818, reason: invalid class name */
/* loaded from: 818.class */
public final class AnonymousClass818 implements C07n {
    public static final /* synthetic */ AnonymousClass818[] A00;
    public static final AnonymousClass818 A01;
    public final String mValue = "vpv_message_impression";

    static {
        AnonymousClass818 anonymousClass818 = new AnonymousClass818();
        A01 = anonymousClass818;
        A00 = new AnonymousClass818[]{anonymousClass818};
    }

    public static AnonymousClass818 valueOf(String str) {
        return (AnonymousClass818) Enum.valueOf(AnonymousClass818.class, str);
    }

    public static AnonymousClass818[] values() {
        return (AnonymousClass818[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
