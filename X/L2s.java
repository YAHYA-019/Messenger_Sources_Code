package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Arrays;

/* loaded from: L2s.class */
public abstract class L2s {
    public final boolean A00;

    public L2s() {
        this.A00 = false;
    }

    public L2s(L2s l2s) {
        this.A00 = l2s.A00;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        if (r306.A01 == r302) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c7, code lost:
    
        if (r306.A01 == r302) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
    
        if (r306.A01 == r302) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        if (r306.A01 == r302) goto L22;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0075. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer A00(java.lang.Class r302) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L2s.A00(java.lang.Class):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public L2s A01(JsonSerializer jsonSerializer, Class cls) {
        if (this instanceof JzK) {
            JzK jzK = (JzK) this;
            return new JzL(jzK.A00, jsonSerializer, jzK, jzK.A01, cls);
        }
        if (!(this instanceof JzJ)) {
            if (this instanceof JzI) {
                return new JzK(jsonSerializer, this, cls);
            }
            JzL jzL = (JzL) this;
            return new JzJ(jzL, new Khu[]{new Khu(jzL.A00, jzL.A02), new Khu(jzL.A01, jzL.A03), new Khu(jsonSerializer, cls)});
        }
        JzJ jzJ = (JzJ) this;
        Khu[] khuArr = jzJ.A00;
        int length = khuArr.length;
        if (length == 8) {
            return ((L2s) jzJ).A00 ? new JzK(jsonSerializer, jzJ, cls) : jzJ;
        }
        Khu[] khuArr2 = (Khu[]) Arrays.copyOf(khuArr, length + 1);
        khuArr2[length] = new Khu(jsonSerializer, cls);
        return new JzJ(jzJ, khuArr2);
    }
}
