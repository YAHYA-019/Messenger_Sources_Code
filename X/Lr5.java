package X;

import java.io.IOException;

/* loaded from: Lr5.class */
public final /* synthetic */ class Lr5 implements Runnable {
    public static final String __redex_internal_original_name = "MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda6";
    public final /* synthetic */ 6aC A00;
    public final /* synthetic */ 6aF A01;
    public final /* synthetic */ 6ZL A02;
    public final /* synthetic */ 6Vs A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ Lr5(6aC r302, 6aF r303, 6ZL r304, 6Vs r305, IOException iOException, boolean z) {
        this.A02 = r304;
        this.A03 = r305;
        this.A00 = r302;
        this.A01 = r303;
        this.A04 = iOException;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6ZL r0 = this.A02;
        6Vs r02 = this.A03;
        6aC r03 = this.A00;
        6aF r04 = this.A01;
        IOException iOException = this.A04;
        boolean z = this.A05;
        r02.C42(r03, r04, r0.A01, iOException, r0.A00, z);
    }
}
