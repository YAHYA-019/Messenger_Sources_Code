package X;

import com.facebook.particles.ParticleSystemView;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.functions.Function2;

/* loaded from: Kos.class */
public final class Kos {
    public final 1Br A00 = 1Bu.A00(131274);

    public final void A00(ParticleSystemView particleSystemView, Function2 function2) {
        boolean A1W = 1BL.A1W(particleSystemView, function2);
        function2.invoke(2131886163, Float.valueOf(0.3f));
        Random random = new Random();
        KmO kmO = (KmO) 1Br.A0B(this.A00);
        ImmutableList immutableList = kmO.A05;
        if (immutableList == null) {
            C00i c00i = kmO.A08;
            LXe lXe = new LXe(1BL.A0B(c00i).getDimension(2132279621), 1BL.A0B(c00i).getDimension(2132279437));
            LXe lXe2 = new LXe(1BL.A0B(c00i).getDimension(R.dimen.mapbox_minimum_scale_velocity), 1BL.A0B(c00i).getDimension(2132279412));
            LXe lXe3 = new LXe(1BL.A0B(c00i).getDimension(2132279315), 1BL.A0B(c00i).getDimension(2132279339));
            LXd lXd = new LXd(-120.0f, 120.0f);
            LXe lXe4 = new LXe(0.23f, 1.0f);
            LXe lXe5 = LXe.A03;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            Iterator it = ((L2y) kmO.A0A.get()).A02(2130903098).iterator();
            while (it.hasNext()) {
                LXb A0f = JR0.A0f(it.next());
                A0f.A05 = lXe;
                A0f.A06 = lXe2;
                A0f.A0A = A1W;
                A0f.A00 = lXe3;
                A0f.A04 = lXe5;
                A0f.A03 = lXd;
                A0f.A00(lXe4);
                builder.m11011add((Object) A0f);
            }
            immutableList = builder.build();
            kmO.A05 = immutableList;
        }
        11T.A0A(immutableList);
        int size = immutableList.size();
        int i = 0;
        do {
            particleSystemView.A02((LXb) immutableList.get(random.nextInt(size)));
            i++;
        } while (i < 50);
    }
}
