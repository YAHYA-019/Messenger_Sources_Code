package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6zu, reason: invalid class name */
/* loaded from: 6zu.class */
public final class C6zu implements C6zq {
    public static final C77t A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C6zu[] A02;
    public static final C6zu A03;
    public final String traceName = "ActivateEmoji";

    /* JADX WARN: Type inference failed for: r0v10, types: [X.77t, java.lang.Object] */
    static {
        C6zu c6zu = new C6zu("INSTANCE_ROW_SELECTOR", 0);
        A03 = c6zu;
        C6zu[] c6zuArr = {c6zu, new C6zu("INSTANCE_MORE_DRAWER", 1)};
        A02 = c6zuArr;
        A01 = C00t.A00(c6zuArr);
        A00 = new Object();
    }

    public C6zu(String str, int i) {
    }

    public static C6zu valueOf(String str) {
        return (C6zu) Enum.valueOf(C6zu.class, str);
    }

    public static C6zu[] values() {
        return (C6zu[]) A02.clone();
    }

    public /* synthetic */ boolean B6s() {
        return false;
    }

    public boolean B7e() {
        return true;
    }

    public String BGe() {
        return this.traceName;
    }

    @Override // X.C6zq
    public boolean Bf4() {
        return true;
    }

    @Override // X.C6zq
    public boolean Bf8() {
        return false;
    }
}
