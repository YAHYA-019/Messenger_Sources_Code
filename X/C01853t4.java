package X;

/* renamed from: X.3t4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3t4.class */
public final class C01853t4 implements InterfaceC01863t5 {
    public static final C01853t4 A00 = new Object();

    @Override // X.InterfaceC01863t5
    public void Cis(3oH r302, Runnable runnable) {
        FtD ftD;
        if (r302 == null || (ftD = (FtD) r302.BAA(FtD.class)) == null) {
            runnable.run();
        } else {
            synchronized (ftD.A00) {
                runnable.run();
            }
        }
    }
}
