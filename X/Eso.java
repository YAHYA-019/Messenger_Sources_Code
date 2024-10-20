package X;

/* loaded from: Eso.class */
public final class Eso {
    public final java.util.Map A00 = AnonymousClass001.A0u();
    public final java.util.Map A01 = AnonymousClass001.A0u();

    public EZm A00(String str) {
        EZm eZm;
        synchronized (this) {
            F4m f4m = (F4m) this.A00.get(str);
            eZm = f4m == null ? null : f4m.A00;
        }
        return eZm;
    }
}
