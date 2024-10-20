package com.facebook.litho;

import X.0QE;
import X.1JX;
import X.1kF;
import X.1kJ;
import X.31V;
import com.facebook.systrace.Systrace;

/* loaded from: FbComponentsSystrace.class */
public final class FbComponentsSystrace implements 1JX {
    public final boolean A00;
    public final boolean A01;

    public FbComponentsSystrace() {
        this(false, false);
    }

    public FbComponentsSystrace(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public void ABh(String str, int i) {
        Systrace.A03(4194304L, str, i);
    }

    public void ABk(String str) {
        if (!this.A00 || BWo()) {
            0QE.A01(4194304L, str, -1890615981);
        }
    }

    public 1kJ ABl(String str) {
        return !Systrace.A0E(4194304L) ? 1kF.A00 : new 31V(str);
    }

    public void AQ7(String str, int i) {
        Systrace.A05(4194304L, str, i);
    }

    public void AQF() {
        if (!this.A00 || BWo()) {
            0QE.A00(4194304L, 999028204);
        }
    }

    public boolean BWo() {
        if (this.A01) {
            return false;
        }
        return Systrace.A0E(4194304L);
    }
}
