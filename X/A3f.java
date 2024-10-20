package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: A3f.class */
public final class A3f implements 6cX {
    public final C00i A00;
    public final C00i A01 = 1BV.A00(115851);
    public final C00i A02 = 1BV.A00(115854);
    public final C00i A03;

    public A3f(Context context) {
        this.A00 = new 1HH(context, 115868);
        this.A03 = new 1HH(context, 67956);
    }

    public List B3i() {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(this.A00.get());
        A0s.add(this.A03.get());
        A0s.add(this.A01.get());
        A0s.add(this.A02.get());
        return A0s;
    }

    public boolean BUS() {
        return true;
    }
}
