package X;

import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.BitSet;

/* loaded from: E29.class */
public final class E29 extends C63h {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;

    public E29(1BO r302) {
        super(AbF.A04((1BY) null));
        this.A01 = 1BV.A01((1BY) null, 65553);
        this.A02 = 1BQ.A02(98533);
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.facebook.mig.scheme.interfaces.MigColorScheme] */
    @Override // X.C63h
    public 1LI A05(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        Integer num;
        RUW A01 = ((80C) this.A01.get()).A01(r302.A0D, r304.BEO());
        if (A01 == null) {
            return 2cK.A01(r302, (String) null, 0).A00;
        }
        if (A01.A03 == ER6.A0L && !A01.A0G && (num = A01.A08) != null) {
            C00i c00i = this.A02;
            FG0 fg0 = (FG0) c00i.get();
            EN1 en1 = EN1.A03;
            String str = A01.A0C;
            C00i c00i2 = fg0.A01;
            long generateFlowId = AbG.A0r(c00i2).generateFlowId(en1.id, num.intValue());
            Long valueOf = Long.valueOf(generateFlowId);
            UserFlowLogger A0r = AbG.A0r(c00i2);
            UserFlowConfig userFlowConfig = new UserFlowConfig("XMA_RENDER", false);
            userFlowConfig.mTtlMs = LocationComponentOptions.STALE_STATE_DELAY_MS;
            A0r.flowStartIfNotOngoing(generateFlowId, userFlowConfig);
            if (str != null) {
                AbG.A0r(c00i2).flowAnnotate(generateFlowId, "payment_status", str);
            }
            fg0.A00 = valueOf;
            fg0.A02.put(num, valueOf);
            PointEditor A02 = ((FG0) c00i.get()).A02(num, "xma_render");
            if (A02 != null) {
                A02.addPointData("num_photos", AnonymousClass001.A1T(A01.A0D) ? 1 : 0).addPointData("show_payment_method_icons", 7zM.A1b(A01.A06)).markerEditingCompleted();
            }
        }
        Dts dts = new Dts(r302, new C8nt());
        LightColorScheme Axg = r303 != null ? r303.Axg() : LightColorScheme.A00();
        C8nt c8nt = dts.A01;
        c8nt.A00 = Axg;
        BitSet bitSet = dts.A02;
        bitSet.set(0);
        c8nt.A01 = A01;
        C1rs.A01(bitSet, dts.A03);
        dts.A0J();
        return c8nt;
    }
}
