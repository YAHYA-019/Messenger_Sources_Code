package X;

import java.io.File;
import java.util.List;

/* loaded from: H3l.class */
public final class H3l extends IjO {
    public final JMX A00;
    public final Huc A01;
    public final /* synthetic */ I8r A02;

    public H3l(JMX jmx, Huc huc, I8r i8r) {
        this.A02 = i8r;
        this.A01 = huc;
        this.A00 = jmx;
    }

    public void Bpy(List list) {
        File file = ((IDe) 1BK.A0r(list)).A0N;
        I8r i8r = this.A02;
        i8r.A0F.put(this.A01, file);
    }

    public /* bridge */ /* synthetic */ void Bwt(I51 i51, Object obj) {
        this.A00.Bwt(i51, obj);
    }
}
