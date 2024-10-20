package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Ai, reason: invalid class name */
/* loaded from: 7Ai.class */
public final class C7Ai implements 6Sh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7Ai[] A01;
    public static final C7Ai A02;
    public final String traceName = "TextFieldShowing";

    static {
        C7Ai c7Ai = new C7Ai();
        A02 = c7Ai;
        C7Ai[] c7AiArr = {c7Ai};
        A01 = c7AiArr;
        A00 = C00t.A00(c7AiArr);
    }

    public static C7Ai valueOf(String str) {
        return (C7Ai) Enum.valueOf(C7Ai.class, str);
    }

    public static C7Ai[] values() {
        return (C7Ai[]) A01.clone();
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
}
