package X;

import com.facebook.memory.fbmemorymanager.FBMemoryManager;

/* renamed from: X.1ix, reason: invalid class name */
/* loaded from: 1ix.class */
public final class C1ix implements 1Z9 {
    public final C00i A01 = new 1BV(32988);
    public final C00i A00 = new 1BV(17144);

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.7jy] */
    public static void A00(C1ix c1ix, String str, String str2) {
        0fH.A0d(str, str2, "FBMemoryManagerNavigationLoggerListener", "report navigation: %s %s");
        ((FBMemoryManager) c1ix.A01.get()).A01();
        5E5 A06 = FBMemoryManager.A0K.A06();
        if (A06 != null) {
            ?? obj = new Object();
            obj.A00 = str;
            A06.A00(4, (Object) obj);
        }
    }

    public void A7q(2jL r302) {
        String str;
        if (!((C2wh) this.A00.get()).A00() || (str = r302.A03) == null) {
            return;
        }
        A00(this, str, r302.A02);
    }
}
