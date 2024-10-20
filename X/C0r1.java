package X;

import com.facebook.common.dextricks.DexFileAccessListener;
import dalvik.system.DexFile;

/* renamed from: X.0r1, reason: invalid class name */
/* loaded from: 0r1.class */
public final class C0r1 implements DexFileAccessListener {
    public static final C0r1 A00 = new C0r1();

    @Override // com.facebook.common.dextricks.DexFileAccessListener
    public final void onClassLoadedFromDexFile(Class cls, DexFile dexFile) {
        11T.A0F(cls, 0);
        0Lw.A02.add(cls);
        0Lx r0 = 0Lw.A01;
        String name = cls.getName();
        11T.A0A(name);
        r0.A02 = name;
        if (r0.A01.length() == 0) {
            r0.A01 = name;
        }
        r0.A00++;
    }
}
