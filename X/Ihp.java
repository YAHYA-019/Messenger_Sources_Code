package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.Arrays;

/* loaded from: Ihp.class */
public final class Ihp implements JMW, JJ7, JQS {
    public final JMW[] A00;
    public final JMW[] A01;

    public Ihp(JMW... jmwArr) {
        11T.A0F(jmwArr, 1);
        JMW[] jmwArr2 = (JMW[]) Arrays.copyOf(jmwArr, jmwArr.length);
        11T.A0F(jmwArr2, 1);
        this.A00 = jmwArr2;
        this.A01 = jmwArr;
    }

    public void C1e(SurfaceTexture surfaceTexture, Surface surface) {
        JMW[] jmwArr = this.A00;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw != null) {
                jmw.C1e(surfaceTexture, surface);
            }
            i = i2 + 1;
        }
    }

    public void CPL(Surface surface) {
        JMW[] jmwArr = this.A00;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw != null) {
                jmw.CPL(surface);
            }
            i = i2 + 1;
        }
    }

    public void CPQ(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        JMW[] jmwArr = this.A00;
        int length = jmwArr.length;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                return;
            }
            JMW jmw = jmwArr[i4];
            if (jmw != null) {
                jmw.CPQ(surfaceTexture, surface, i, i2);
            }
            i3 = i4 + 1;
        }
    }

    public void CPR(SurfaceTexture surfaceTexture, Surface surface) {
        JMW[] jmwArr = this.A00;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw != null) {
                jmw.CPR(surfaceTexture, surface);
            }
            i = i2 + 1;
        }
    }

    public void CPS(SurfaceTexture surfaceTexture) {
        JMW[] jmwArr = this.A00;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw != null) {
                jmw.CPS(surfaceTexture);
            }
            i = i2 + 1;
        }
    }

    @Override // X.JQU
    public void CPT() {
        JMW[] jmwArr = this.A01;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw instanceof JQS) {
                ((JQU) jmw).CPT();
            }
            i = i2 + 1;
        }
    }

    @Override // X.JQU
    public void CPU(IllegalArgumentException illegalArgumentException) {
        JMW[] jmwArr = this.A01;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw instanceof JQS) {
                ((JQU) jmw).CPU(illegalArgumentException);
            }
            i = i2 + 1;
        }
    }

    @Override // X.JQU
    public void CPV(Surface surface) {
        JMW[] jmwArr = this.A01;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw instanceof JQS) {
                ((JQU) jmw).CPV(surface);
            }
            i = i2 + 1;
        }
    }

    @Override // X.JJ7
    public void CUZ() {
        JJ7[] jj7Arr = this.A01;
        int length = jj7Arr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JJ7 jj7 = jj7Arr[i2];
            if (jj7 instanceof JQS) {
                jj7.CUZ();
            }
            i = i2 + 1;
        }
    }

    @Override // X.JJ7
    public void CUe() {
        JJ7[] jj7Arr = this.A01;
        int length = jj7Arr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JJ7 jj7 = jj7Arr[i2];
            if (jj7 instanceof JQS) {
                jj7.CUe();
            }
            i = i2 + 1;
        }
    }

    public void CV0(Surface surface) {
        JMW[] jmwArr = this.A00;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw != null) {
                jmw.CV0(surface);
            }
            i = i2 + 1;
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        JMW[] jmwArr = this.A00;
        int length = jmwArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            JMW jmw = jmwArr[i2];
            if (jmw != null) {
                jmw.onSurfaceTextureUpdated(surfaceTexture);
            }
            i = i2 + 1;
        }
    }
}
