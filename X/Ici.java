package X;

import android.graphics.RectF;
import java.util.List;

/* loaded from: Ici.class */
public final class Ici implements JLE {
    public RectF A00;
    public I9U A01;
    public Ich A02;
    public Icu A03;
    public final I1d A04;
    public final I4V A05 = I4V.A00();

    static {
        new Object();
    }

    public Ici(I1d i1d) {
        this.A04 = i1d;
    }

    public static JMv A00(Ici ici, JMv jMv) {
        if (ici.A00 != null) {
            if (ici.A03 == null) {
                ici.A03 = new Icu();
            }
            HsT texture = jMv.getTexture();
            if (texture != null) {
                Hfk hfk = texture.A02;
                int i = hfk.A01;
                int i2 = hfk.A00;
                Icu icu = ici.A03;
                icu.A00 = jMv;
                RectF rectF = ici.A00;
                float f = rectF.left;
                float f2 = i;
                int A03 = GOn.A03(f, f2);
                float f3 = rectF.top;
                float f4 = i2;
                icu.A01(A03, GOn.A03(f3, f4), GOn.A03(rectF.width(), f2), GOn.A03(ici.A00.height(), f4));
                jMv = ici.A03;
            }
        }
        return jMv;
    }

    public void A01(I9U i9u, JNP jnp) {
        Object AuT = jnp.AuT();
        I4V i4v = this.A05;
        List list = i4v.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                i4v.A02(jnp);
                if (jnp instanceof JLE) {
                    i9u.A03((JLE) jnp);
                    return;
                }
                return;
            }
            JNP jnp2 = (JNP) list.get(i2);
            if (jnp2.contains(AuT) || jnp2.equals(AuT)) {
                return;
            } else {
                i = i2 + 1;
            }
        }
    }

    public void A02(JMv jMv) {
        JMv A00 = A00(this, jMv);
        JMu A01 = this.A01.A01();
        if (this.A02 == null) {
            Ich ich = new Ich(this.A04);
            this.A02 = ich;
            ich.AAv(A01);
        }
        Ich ich2 = this.A02;
        List list = this.A05.A00;
        int size = list.size();
        if (size == 0) {
            ich2.A03.A00(HBq.A0C);
            return;
        }
        for (int i = 0; i < size; i++) {
            ich2.A01(A01, A00, (JNP) list.get(i), null, null, true, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        r0.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if ((r0 instanceof X.JLE) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        r0 = r0;
        r301.A01.A04(r0);
        r0.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            X.I4V r0 = r0.A05
            r303 = r0
            r0 = r303
            java.util.List r0 = r0.A00
            r304 = r0
            r0 = r304
            int r0 = r0.size()
            r305 = r0
            r0 = 0
            r306 = r0
        L15:
            r0 = r306
            r1 = r305
            if (r0 >= r1) goto L7c
            r0 = r304
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            X.JNP r0 = (X.JNP) r0
            r307 = r0
            r0 = r307
            r1 = r302
            boolean r0 = r0.contains(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L4e
            r0 = r307
            r1 = r302
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L4e
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L15
        L4e:
            r0 = r303
            r1 = r307
            boolean r0 = r0.A03(r1)
            r0 = r307
            boolean r0 = r0 instanceof X.JLE
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L7c
            r0 = r307
            X.JLE r0 = (X.JLE) r0
            r307 = r0
            r0 = r301
            X.I9U r0 = r0.A01
            r309 = r0
            r0 = r309
            r1 = r307
            r0.A04(r1)
            r0 = r307
            r0.release()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ici.A03(java.lang.Object):void");
    }

    public void AAv(JMu jMu) {
        Ich ich = this.A02;
        if (ich != null) {
            ich.AAv(jMu);
        }
    }

    public void AN3() {
        Ich ich = this.A02;
        if (ich != null) {
            ich.AN3();
        }
    }

    public void BOo(I9U i9u) {
        this.A01 = i9u;
    }

    public void release() {
        I4V i4v = this.A05;
        List list = i4v.A00;
        i4v.A01();
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            JLE jle = (JNP) list.get(i2);
            if (jle instanceof JLE) {
                jle.release();
            }
            i = i2 + 1;
        }
    }
}
