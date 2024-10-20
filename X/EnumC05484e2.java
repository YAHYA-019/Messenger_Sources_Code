package X;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4e2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4e2.class */
public final class EnumC05484e2 implements InterfaceC05494e3 {
    public static final Set A00;
    public static final /* synthetic */ EnumC05484e2[] A01;
    public static final EnumC05484e2 A02;

    static {
        EnumC05484e2 enumC05484e2 = new EnumC05484e2();
        A02 = enumC05484e2;
        A01 = new EnumC05484e2[]{enumC05484e2};
        A00 = new CopyOnWriteArraySet();
    }

    public static EnumC05484e2 valueOf(String str) {
        return (EnumC05484e2) Enum.valueOf(EnumC05484e2.class, str);
    }

    public static EnumC05484e2[] values() {
        return (EnumC05484e2[]) A01.clone();
    }
}
