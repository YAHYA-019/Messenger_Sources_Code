package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.0gu, reason: invalid class name */
/* loaded from: 0gu.class */
public abstract class C0gu {
    public static char A00(File file) {
        C0h0 c0h0;
        try {
        } catch (IOException e) {
            C0iy.A00().Bwu("AppStateNativeParser", e, null);
            0fH.A0u("lacrima", "Reading AppStateNativeParser failed", e);
        }
        if (!file.exists()) {
            c0h0 = C0h0.A0Z;
            return c0h0.mSymbol;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            if (randomAccessFile.length() != 0) {
                char readByte = (char) randomAccessFile.readByte();
                randomAccessFile.close();
                return readByte;
            }
            randomAccessFile.close();
            c0h0 = C0h0.A0A;
            return c0h0.mSymbol;
        } finally {
        }
    }

    public static void A01(C0qh c0qh, C0gw c0gw, File file) {
        c0qh.A05(C0g6.A4C, String.valueOf(c0gw.A09()));
        c0qh.A05(C0g6.A4Z, c0gw.A0O());
        char A00 = A00(new File(file, "native_state.txt"));
        char A002 = A00(new File(file, "anr_state.txt"));
        char A0C = c0gw.A0C();
        c0qh.A05(C0g6.A4S, String.valueOf(A0C));
        c0qh.A05(C0g6.A4T, String.valueOf(A00));
        c0qh.A05(C0g6.A4P, String.valueOf(A002));
        0jV r0 = C0g6.A4Q;
        char c = C0h0.A0Z.mSymbol;
        if (A00 == c || A00 == C0h0.A0A.mSymbol) {
            if (A002 != c && A002 != C0h0.A0A.mSymbol) {
                A0C = A002;
            }
        } else if ((A00 != C0h0.A0a.mSymbol || A0C != C0h0.A0B.mSymbol) && ((A0C != C0h0.A02.mSymbol && A0C != C0h0.A03.mSymbol && A0C != C0h0.A01.mSymbol && A0C != C0h0.A06.mSymbol && A0C != C0h0.A05.mSymbol && A0C != C0h0.A07.mSymbol && A0C != C0h0.A04.mSymbol && A0C != C0h0.A0B.mSymbol) || A00 != C0h0.A08.mSymbol)) {
            A0C = A00;
        }
        c0qh.A05(r0, String.valueOf(A0C));
        c0qh.A05(C0g6.A5N, String.valueOf(new File(file, "shut_down").exists()));
        c0qh.A05(C0g6.A54, String.valueOf(c0gw.A0A()));
    }
}
