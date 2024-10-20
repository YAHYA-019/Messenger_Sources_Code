package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6zs, reason: invalid class name */
/* loaded from: 6zs.class */
public final class C6zs implements C6zq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6zs[] A01;
    public static final C6zs A02;
    public final String traceName = "ActivateAvatarSticker";

    static {
        C6zs c6zs = new C6zs();
        A02 = c6zs;
        C6zs[] c6zsArr = {c6zs};
        A01 = c6zsArr;
        A00 = C00t.A00(c6zsArr);
    }

    public static C6zs valueOf(String str) {
        return (C6zs) Enum.valueOf(C6zs.class, str);
    }

    public static C6zs[] values() {
        return (C6zs[]) A01.clone();
    }

    public /* synthetic */ boolean B6s() {
        return false;
    }

    public /* synthetic */ boolean B7e() {
        return false;
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
