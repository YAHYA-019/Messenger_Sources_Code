package org.tukaani.xz;

import X.12P;
import X.AnonymousClass002;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import java.io.IOException;

/* loaded from: LZMA2Options.class */
public final class LZMA2Options implements Cloneable {
    public static final int[] A07;
    public static final int[] A08;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;

    static {
        try {
            Class.forName("org.tukaani.xz.LZMA2Options");
            A08 = new int[]{Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 1048576, 2097152, 4194304, 4194304, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE, DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, 33554432, 67108864};
            A07 = new int[]{4, 8, 24, 48};
        } catch (ClassNotFoundException unused) {
            throw AnonymousClass002.A0N("org.tukaani.xz.LZMA2Options");
        }
    }

    public LZMA2Options() {
        try {
            A00(this, 6);
        } catch (12P unused) {
            throw new RuntimeException();
        }
    }

    public LZMA2Options(int i, int i2) {
    }

    public static void A00(LZMA2Options lZMA2Options, int i) {
        int i2;
        if (i < 0 || i > 9) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unsupported preset: ");
            stringBuffer.append(i);
            throw new IOException(stringBuffer.toString());
        }
        lZMA2Options.A02 = 3;
        lZMA2Options.A06 = 2;
        lZMA2Options.A01 = A08[i];
        if (i <= 3) {
            lZMA2Options.A04 = 1;
            lZMA2Options.A03 = 4;
            int i3 = 273;
            if (i <= 1) {
                i3 = 128;
            }
            lZMA2Options.A05 = i3;
            lZMA2Options.A00 = A07[i];
            return;
        }
        lZMA2Options.A04 = 2;
        lZMA2Options.A03 = 20;
        if (i == 4) {
            i2 = 16;
        } else {
            i2 = 64;
            if (i == 5) {
                i2 = 32;
            }
        }
        lZMA2Options.A05 = i2;
        lZMA2Options.A00 = 0;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
