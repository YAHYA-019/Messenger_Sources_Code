package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hq3.class */
public final class Hq3 {
    public final 1Br A00;
    public final 1Br A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Context A06;

    public Hq3(Context context, Integer num, Integer num2, Integer num3, Integer num4) {
        11T.A0F(context, 1);
        this.A06 = context;
        this.A04 = num;
        this.A05 = num2;
        this.A02 = num3;
        this.A03 = num4;
        this.A00 = 1Bq.A00(66227);
        this.A01 = 1Bu.A01(context, 67527);
    }

    public final JZj A00(JEo jEo, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 0);
        GmX gmX = ((C1uz) 1Br.A0B(this.A00)).A02(37) ? new GmX(jEo, this, this.A06.getResources().getString(2131954603)) : null;
        Context context = this.A06;
        List A15 = C0s8.A15(gmX, new GmY(jEo, this, context.getResources().getString(2131954602)));
        ArrayList A0z = 1BL.A0z(A15);
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            A0z.add(((HQv) it.next()).A00);
        }
        String[] A0n = C3o5.A0n(A0z);
        1Br.A0C(this.A01);
        DR6 dr6 = new DR6(context, migColorScheme);
        dr6.A00(2131954604);
        dr6.A01(IGS.A00(A15, 1), A0n);
        dr6.A07(RiZ.A00);
        return dr6.A04();
    }
}
