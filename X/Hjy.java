package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Hjy.class */
public final class Hjy {
    public final int A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final 1Br A04;
    public final 1Br A05;
    public final java.util.Map A06;
    public final AtomicInteger A07;
    public final C01413r2 A08;
    public final C4YM mqttListener;

    public Hjy() {
        1Bq r0 = 1Bq.A00;
        C01413r2 c01413r2 = (C01413r2) 1Bq.A01(115859);
        this.A08 = c01413r2;
        1Bq r02 = 1Bq.A00;
        this.A05 = 1Bq.A00(68335);
        this.A06 = new HashMap();
        this.A07 = new AtomicInteger(1);
        this.A00 = 5;
        1Bq r03 = 1Bq.A00;
        this.A04 = 1Bq.A00(84488);
        1Bu r04 = 1Bu.A00;
        this.A02 = 1Bu.A00(68337);
        Context A00 = FbInjector.A00();
        1HG r05 = 1HG.A00;
        11T.A0D(A00);
        this.A03 = 1HG.A00(A00, 66156);
        1Bu r06 = 1Bu.A00;
        this.A01 = 1Bu.A00(16452);
        TreeSet treeSet = new TreeSet();
        treeSet.add("/video_rt_pipe_res");
        Ihg ihg = new Ihg(this, treeSet);
        this.mqttListener = ihg;
        c01413r2.A00(ihg);
    }
}
