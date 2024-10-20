package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.86k, reason: invalid class name */
/* loaded from: 86k.class */
public final class C86k implements C6zq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C86k[] A01;
    public static final C86k A02;
    public final String traceName = "ActivateAiBotImagineEvent";

    static {
        C86k c86k = new C86k();
        A02 = c86k;
        C86k[] c86kArr = {c86k};
        A01 = c86kArr;
        A00 = C00t.A00(c86kArr);
    }

    public static C86k valueOf(String str) {
        return (C86k) Enum.valueOf(C86k.class, str);
    }

    public static C86k[] values() {
        return (C86k[]) A01.clone();
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
    public /* synthetic */ boolean Bf4() {
        return false;
    }

    @Override // X.C6zq
    public boolean Bf8() {
        return false;
    }
}
