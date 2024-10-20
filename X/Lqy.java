package X;

import android.os.SystemClock;
import java.util.List;

/* loaded from: Lqy.class */
public final /* synthetic */ class Lqy implements Runnable {
    public static final String __redex_internal_original_name = "zzi";
    public final /* synthetic */ long A00;
    public final /* synthetic */ Lep A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public /* synthetic */ Lqy(Lep lep, List list, List list2, List list3, long j) {
        this.A01 = lep;
        this.A00 = j;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Lep lep = this.A01;
        final long j = this.A00;
        final List list = this.A02;
        final List list2 = this.A03;
        final List list3 = this.A04;
        int i = 0;
        long j2 = 0;
        do {
            j2 = Math.min(j, j2 + (j / 3));
            Lep.A02(lep, null, Long.valueOf(j2), Long.valueOf(j), null, null, 2, 0);
            SystemClock.sleep(Lep.A0F);
            int i2 = ((K8r) ((3NT) lep.A09.get())).A01;
            if (i2 == 9 || i2 == 7 || i2 == 6) {
                return;
            } else {
                i++;
            }
        } while (i < 3);
        lep.A07.execute(new Runnable() { // from class: X.Lqx
            public static final String __redex_internal_original_name = "zzd";

            @Override // java.lang.Runnable
            public final void run() {
                Lep lep2 = Lep.this;
                List list4 = list2;
                List list5 = list3;
                long j3 = j;
                if (lep2.A08.get()) {
                    Lep.A02(lep2, null, null, null, null, null, 6, -6);
                    return;
                }
                lep2.A05.addAll(list4);
                lep2.A06.addAll(list5);
                Long valueOf = Long.valueOf(j3);
                Lep.A02(lep2, null, valueOf, valueOf, null, null, 5, 0);
            }
        });
    }
}
