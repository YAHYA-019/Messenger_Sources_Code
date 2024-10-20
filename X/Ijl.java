package X;

import com.facebook.ffmpeg.FFMpegBufferInfo;

/* loaded from: Ijl.class */
public final class Ijl implements JLT {
    public final 5Hg A00;
    public final boolean A01;

    public Ijl(5Hg r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A01 = false;
    }

    public Ijl(5Hg r302, boolean z) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A01 = z;
    }

    public boolean ADp() {
        return true;
    }

    public boolean ADq() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.Ijg, X.JMz] */
    public JMz AKR(Hgr hgr) {
        5Hg r0 = this.A00;
        int i = hgr.A00;
        boolean z = hgr.A03;
        String str = hgr.A01;
        boolean z2 = this.A01;
        java.util.Map map = hgr.A02;
        ?? obj = new Object();
        obj.A01 = -1;
        obj.A00 = -1;
        obj.A06 = false;
        obj.A04 = null;
        obj.A03 = r0;
        obj.A02 = new FFMpegBufferInfo();
        obj.A01 = i;
        obj.A00 = 20;
        obj.A06 = z;
        obj.A04 = str;
        obj.A07 = z2;
        obj.A05 = map;
        return obj;
    }

    public boolean Cx5() {
        return true;
    }
}
