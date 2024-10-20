package X;

/* loaded from: M2q.class */
public final class M2q extends C00q implements C00m {
    public static final M2q A00 = new M2q();

    public M2q() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        try {
            C01i c01i = L7z.A01;
            return Class.forName("android.os.SystemProperties");
        } catch (ClassNotFoundException e) {
            4gE.A02.A06("SystemPropertiesService", "Unable to access System Properties class", e);
            return null;
        }
    }
}
