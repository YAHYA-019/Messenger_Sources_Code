package X;

import android.content.Context;
import android.opengl.GLES20;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: I3w.class */
public final class I3w {
    public static final int A0A = 0S2.A00(2).length;
    public int A00;
    public HhA A01;
    public HBk A02;
    public JDQ A03;
    public Integer A04;
    public final JL0 A05;
    public final IQZ A06;
    public final JQO A07;
    public final int[] A08;
    public final JDQ[] A09;

    public I3w(Context context, IQZ iqz, JQO jqo) {
        HBk hBk = HBk.A01;
        this.A09 = new JDQ[A0A];
        this.A08 = new int[1];
        this.A00 = -1;
        this.A07 = jqo;
        ImmutableList immutableList = Hxx.A02;
        this.A05 = new ISp(context.getResources());
        this.A06 = iqz;
        synchronized (iqz) {
            if (!iqz.A02) {
                iqz.A02 = true;
                int length = HBk.values().length;
                ArrayList A0t = AnonymousClass001.A0t(length);
                for (int i = 0; i < length; i++) {
                    A0t.add(new RK9(iqz));
                }
                iqz.A01 = Collections.unmodifiableList(A0t);
                iqz.A00 = new RK9(iqz);
            }
        }
        if (hBk != this.A02) {
            this.A02 = hBk;
            this.A04 = 0S2.A00;
            this.A01 = this.A06.A00(hBk);
            if (this.A03 != null) {
                this.A03 = this.A09[this.A04.intValue()];
            }
        }
        this.A01 = iqz.A00(this.A02);
    }

    public void A00() {
        JDQ[] jdqArr = this.A09;
        JQO jqo = this.A07;
        jdqArr[0] = new Rwx(jqo);
        jdqArr[1] = new QTc(jqo);
        this.A03 = jdqArr[this.A04.intValue()];
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int[] iArr = this.A08;
        GLES20.glGenTextures(1, iArr, 0);
        this.A00 = iArr[0];
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.A00);
        N34.A02("glBindTexture mTextureID", new Object[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        N34.A02("glTexParameter", new Object[0]);
        GLES20.glEnable(2884);
        GLES20.glCullFace(1028);
        N34.A02("glCullFace", new Object[0]);
    }

    public void A01() {
        int i = this.A00;
        if (i != -1) {
            int[] iArr = this.A08;
            iArr[0] = i;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.A00 = -1;
        }
        this.A03 = null;
        for (int i2 = 0; i2 < this.A09.length; i2++) {
        }
    }
}
