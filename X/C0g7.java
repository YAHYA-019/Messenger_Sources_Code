package X;

import com.mapbox.mapboxsdk.BuildConfig;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v13 X.0g7, still in use, count: 1, list:
  (r0v13 X.0g7) from 0x00a2: INVOKE 
  (wrap:java.util.Map:0x009b: SGET  A[WRAPPED] X.0g7.A00 java.util.Map)
  (wrap:java.lang.String:SGET  A[WRAPPED] com.mapbox.mapboxsdk.BuildConfig.NATIVE_LIB_COMPRESSION_TYPE java.lang.String)
  (r0v13 X.0g7)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.0g7, reason: invalid class name */
/* loaded from: 0g7.class */
public final class C0g7 {
    SUPERPACK_XZ(".spk.xz", 0),
    SUPERPACK_ZSTD(".spk.zst", 1),
    SUPERPACK_BR(".spk.br", 2),
    /* JADX INFO: Fake field, exist only in values array */
    SUPERPACK_OB(BuildConfig.NATIVE_LIB_COMPRESSION_TYPE, 3);

    public static java.util.Map A00;
    public final String mAssetPath;
    public final String mExtension;

    static {
        C0g7 c0g7 = SUPERPACK_XZ;
        C0g7 c0g72 = SUPERPACK_ZSTD;
        C0g7 c0g73 = SUPERPACK_BR;
        HashMap A0u = AnonymousClass001.A0u();
        A00 = A0u;
        A0u.put(".spk.xz", c0g7);
        A00.put(".spk.zst", c0g72);
        A00.put(".spk.br", c0g73);
        A00.put(BuildConfig.NATIVE_LIB_COMPRESSION_TYPE, r0);
    }

    public C0g7(String str, int i) {
        this.mAssetPath = r303;
        this.mExtension = str;
    }

    public static C0g7 valueOf(String str) {
        return (C0g7) Enum.valueOf(C0g7.class, str);
    }

    public static C0g7[] values() {
        return (C0g7[]) A01.clone();
    }
}
