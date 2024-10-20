package X;

import java.io.File;

/* loaded from: I1h.class */
public final class I1h {
    public final File A00;
    public static final HXC A02 = new HXC(0);
    public static final HXC A03 = new HXC(1);
    public static final HXC A04 = new HXC(2);
    public static final HXC A06 = new HXC(3);
    public static final HXC A01 = new HXC(4);
    public static final HXC A07 = new HXC(5);
    public static final HXC A05 = new HXC(6);

    public I1h(File file) {
        this.A00 = file;
    }

    public Object A00(HXC hxc) {
        switch (hxc.A00) {
            case 0:
                return this.A00;
            case 1:
            case 2:
            case 4:
                return null;
            case 3:
            default:
                return 1BK.A0d();
            case 5:
                return 4YU.A0k();
        }
    }
}
