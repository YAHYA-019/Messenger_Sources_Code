package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.97w, reason: invalid class name */
/* loaded from: 97w.class */
public final class C97w implements C07n {
    public static final /* synthetic */ C97w[] A00 = {new C97w()};
    public final long mValue = 0;

    /* JADX INFO: Fake field, exist only in values array */
    C97w EF5;

    public static C97w valueOf(String str) {
        return (C97w) Enum.valueOf(C97w.class, str);
    }

    public static C97w[] values() {
        return (C97w[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
