package X;

import java.util.Iterator;

/* loaded from: Iyw.class */
public final class Iyw implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$39";
    public final /* synthetic */ 6Ue A00;
    public final /* synthetic */ byte[] A01;

    public Iyw(6Ue r302, byte[] bArr) {
        this.A00 = r302;
        this.A01 = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A00);
        while (A1F.hasNext()) {
            GOn.A12(A1F).C8z(this.A01);
        }
    }
}
