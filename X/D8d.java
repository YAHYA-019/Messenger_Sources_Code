package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: D8d.class */
public final class D8d implements Runnable {
    public static final String __redex_internal_original_name = "BannerPluginDataSource$onThreadDataChanged$1";
    public final /* synthetic */ 5Sc A00;
    public final /* synthetic */ BJO A01;

    public D8d(5Sc r302, BJO bjo) {
        this.A01 = bjo;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BJO bjo = this.A01;
        List list = bjo.A04;
        5Sc r0 = this.A00;
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            7Nq r02 = ((7Nn) it.next()).A00.A00;
            for (String str : r02.Ayr()) {
                Object obj = ((java.util.Map) bjo.A06.getValue()).get(str);
                if (obj == null) {
                    throw 1BK.A0h();
                }
                r02.CDs((7OX) obj, r0, str);
            }
            A0z.add(04S.A00);
        }
    }
}
