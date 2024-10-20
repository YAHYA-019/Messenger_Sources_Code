package X;

import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98h, reason: invalid class name */
/* loaded from: 98h.class */
public final class C98h implements AXJ {
    public static final java.util.Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C98h[] A02;
    public static final C98h A03;
    public final String imageName = "exclamation_mark_warning";

    static {
        C98h c98h = new C98h();
        A03 = c98h;
        C98h[] c98hArr = {c98h};
        A02 = c98hArr;
        C00u A002 = C00t.A00(c98hArr);
        A01 = A002;
        LinkedHashMap linkedHashMap = new LinkedHashMap(4YV.A01(A002));
        for (Object obj : A002) {
            linkedHashMap.put(((C98h) obj).imageName, obj);
        }
        A00 = linkedHashMap;
    }

    public static C98h valueOf(String str) {
        return (C98h) Enum.valueOf(C98h.class, str);
    }

    public static C98h[] values() {
        return (C98h[]) A02.clone();
    }
}
