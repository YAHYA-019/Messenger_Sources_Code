package X;

import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Hqg.class */
public final class Hqg {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public 0Ls A04;
    public Integer A05;
    public final float A06;
    public final float A07;
    public final long A08;
    public final 0Ls A09;
    public final 1Br A0A;
    public final 1Br A0B = 1Bq.A00(32928);
    public final EffectItem A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final String A0G;

    public Hqg(EffectItem effectItem, Integer num, Integer num2, String str) {
        0Ls r307;
        this.A0C = effectItem;
        this.A0D = num;
        this.A0G = str;
        this.A0E = num2;
        1Br A0Q = GOn.A0Q();
        this.A0A = A0Q;
        this.A08 = 1Br.A01(A0Q);
        long j = -1;
        this.A02 = j;
        this.A03 = j;
        float A01 = ((C4A7) 1Br.A0B(this.A0B)).A01();
        this.A00 = A01;
        this.A06 = A01;
        try {
            r307 = 0Lr.A01(0Lr.A02("/proc/self/stat"));
        } catch (IllegalArgumentException e) {
            0fH.A0u("EffectMetricCollector", "Error retrieving cpu usage data from stat fields", e);
            r307 = null;
        }
        this.A09 = r307;
        float intExtra = C4A7.A00((C4A7) 1Br.A0B(this.A0B)) == null ? -1.0f : r0.getIntExtra(DKB.A00(59), -1);
        this.A01 = intExtra;
        this.A07 = intExtra;
        Integer A02 = ((C4A7) 1Br.A0B(this.A0B)).A02();
        11T.A0A(A02);
        this.A0F = A02;
    }

    public final void A00() {
        0Ls r306;
        this.A02 = 1Br.A01(this.A0A);
        C00i c00i = this.A0B.A00;
        this.A00 = ((C4A7) c00i.get()).A01();
        try {
            r306 = 0Lr.A01(0Lr.A02("/proc/self/stat"));
        } catch (IllegalArgumentException e) {
            0fH.A0u("EffectMetricCollector", "Error retrieving cpu usage data from stat fields", e);
            r306 = null;
        }
        this.A04 = r306;
        this.A01 = C4A7.A00((C4A7) c00i.get()) == null ? -1.0f : r0.getIntExtra(DKB.A00(59), -1);
        this.A05 = ((C4A7) c00i.get()).A02();
    }
}
