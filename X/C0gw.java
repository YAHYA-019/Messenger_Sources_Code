package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.0gw, reason: invalid class name */
/* loaded from: 0gw.class */
public final class C0gw {
    public final File A00;

    public C0gw(File file) {
        this.A00 = file;
    }

    public C0gw(File file, boolean z) {
        this.A00 = file;
    }

    public static 0FK A00(C0gw c0gw, String str, long j) {
        0FK r308;
        RandomAccessFile A0H;
        synchronized (c0gw) {
            if (j < 0) {
                throw new IllegalArgumentException();
            }
            File file = c0gw.A00;
            if (!file.exists() || file.length() <= j) {
                0fH.A0g(str, "lacrima", "Could not read %s due to the values not existing");
                return null;
            }
            try {
                A0H = AnonymousClass001.A0H(file);
            } catch (IOException e) {
                C0iy.A00().Bwu("AppStateParserRelAbs", e, null);
                0fH.A11("lacrima", "Could not read %s due to IO issue", e, new Object[]{str});
                new 0FK(-536L);
            } catch (NumberFormatException e2) {
                C0iy.A00().Bwu("AppStateParserRelAbs", e2, null);
                0fH.A11("lacrima", "Could not read %s", e2, new Object[]{str});
                new 0FK(-647L);
            }
            try {
                if (AnonymousClass001.A00(A0H, j) == 1) {
                    0fH.A0g(str, "lacrima", "Could not read %s due to the values being updated");
                    new 0FK(-425L);
                } else {
                    long readLong = A0H.readLong();
                    if (readLong < 0) {
                        r308 = A01(str, "Could not read rel time for %s due to the the timestamp being invalid(%d)", readLong);
                    } else {
                        long readLong2 = A0H.readLong();
                        if (readLong2 < 0) {
                            r308 = A01(str, "Could not read abs time for %s due to the the timestamp being invalid(%d)", readLong2);
                        } else {
                            if (readLong == 0 || readLong2 == 0) {
                                0fH.A0d(str, Long.valueOf(readLong2), "lacrima", "Rel and abs value look not to be set or enabled since default value was returned");
                            }
                            new 0FK(readLong, readLong2);
                        }
                    }
                }
                A0H.close();
                return r308;
            } catch (Throwable th) {
                try {
                    A0H.close();
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                }
                throw th;
            }
        }
    }

    public static 0FK A01(Object obj, String str, long j) {
        0fH.A0d(obj, Long.valueOf(j), "lacrima", str);
        return new 0FK(-869L);
    }

    public static 0FJ A02(C0gw c0gw, String str, int i, int i2) {
        String str2;
        boolean z;
        RandomAccessFile A0H;
        synchronized (c0gw) {
            File file = c0gw.A00;
            if (file.exists()) {
                long length = file.length();
                long j = i;
                if (length > j) {
                    long length2 = file.length();
                    long j2 = i2;
                    if (length2 > j2) {
                        boolean z2 = false;
                        try {
                            A0H = AnonymousClass001.A0H(file);
                            try {
                                z = AnonymousClass001.A1N(AnonymousClass001.A00(A0H, j));
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (IOException e) {
                            e = e;
                            str2 = null;
                        }
                        try {
                            int A00 = AnonymousClass001.A00(A0H, j2);
                            if (A00 != 0) {
                                byte[] bArr = new byte[A00];
                                A0H.readFully(bArr, 0, A00);
                                new String(bArr);
                            } else {
                                str2 = null;
                            }
                            try {
                                A0H.close();
                            } catch (IOException e2) {
                                e = e2;
                                z2 = z;
                                C0iy.A00().Bwu("AppStateParserSuccessState", e, null);
                                0fH.A0d(e.getClass(), e.getMessage(), "Could not read success state for %s. Err %s: %s", str);
                                z = z2;
                                0FJ r0 = new 0FJ(z, str2);
                                0fH.A0g(r0, "Read Success state for %s with %s", str);
                                return r0;
                            }
                            0FJ r02 = new 0FJ(z, str2);
                            0fH.A0g(r02, "Read Success state for %s with %s", str);
                            return r02;
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = z;
                            try {
                                A0H.close();
                            } catch (Throwable th3) {
                                0Ug.A00(th, th3);
                            }
                            throw th;
                        }
                    }
                }
            }
            0fH.A0g(str, "lacrima", "Could not read success state %s due to the values not existing.");
            return null;
        }
    }

    public static String A03(RandomAccessFile randomAccessFile, int i) {
        byte[] bArr = new byte[i];
        randomAccessFile.readFully(bArr, 0, i);
        return new String(bArr);
    }

    public static void A04(C0qh c0qh, C0gw c0gw) {
        c0qh.A05(C0g6.A9k, String.valueOf(c0gw.A0a()));
        0FJ A02 = A02(c0gw, "On Pause Received Hook Setup", 364, 365);
        if (A02 != null) {
            c0qh.A02(C0g6.A0Z, A02.A01);
            String str = A02.A00;
            if (str == null || str.length() <= 0) {
                return;
            }
            c0qh.A05(C0g6.A8W, str);
        }
    }

    public static void A05(C0qh c0qh, C0gw c0gw) {
        0FJ A02 = A02(c0gw, "On Pause Executed Hook Setup", 493, 494);
        if (A02 != null) {
            c0qh.A02(C0g6.A0Y, A02.A01);
            String str = A02.A00;
            if (str == null || str.length() <= 0) {
                return;
            }
            c0qh.A05(C0g6.A8V, str);
        }
    }

    public static void A06(C0qh c0qh, C0gw c0gw) {
        boolean A0V = c0gw.A0V();
        c0qh.A05(C0g6.A5C, String.valueOf(A0V));
        if (A0V) {
            c0qh.A05(C0g6.A5E, String.valueOf(c0gw.A0I()));
            c0qh.A05(C0g6.A5D, String.valueOf(c0gw.A0P()));
        }
    }

    public static boolean A07(C0qh c0qh, C0gw c0gw) {
        c0qh.A05(C0g6.A4N, String.valueOf(c0gw.A08()));
        c0qh.A02(C0g6.A02, c0gw.A0U());
        c0qh.A03(C0g6.A1E, c0gw.A0D());
        c0qh.A03(C0g6.A1H, c0gw.A0F(false));
        c0qh.A03(C0g6.A1G, c0gw.A0F(true));
        c0qh.A02(C0g6.A04, c0gw.A0X());
        c0qh.A02(C0g6.A0X, c0gw.A0Y());
        c0qh.A02(C0g6.A0b, c0gw.A0Z());
        c0qh.A05(C0g6.A6W, c0gw.A0R());
        return true;
    }

    private char A08() {
        char c;
        RandomAccessFile A0H;
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 196) {
                try {
                    A0H = AnonymousClass001.A0H(file);
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserActivityCallbackStageSymbol", e, null);
                    0fH.A0u("lacrima", "Could not read activity callback stage", e);
                }
                try {
                    c = (char) AnonymousClass001.A00(A0H, 196L);
                    A0H.close();
                } catch (Throwable th) {
                    try {
                        A0H.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            }
            c = '0';
        }
        return c;
    }

    private int A0D() {
        int i;
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 200) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        i = AnonymousClass001.A00(A0H, 200L) - 48;
                        A0H.close();
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserActivityCallbackState", e, null);
                    0fH.A0u("lacrima", "Could not read activity callback state byte", e);
                }
            }
            i = 0;
        }
        return i;
    }

    private int A0F(boolean z) {
        byte b;
        synchronized (this) {
            int i = 204;
            if (z) {
                i = 203;
            }
            File file = this.A00;
            if (file.exists()) {
                long length = file.length();
                long j = i;
                if (length > j) {
                    try {
                        RandomAccessFile A0H = AnonymousClass001.A0H(file);
                        try {
                            b = AnonymousClass001.A00(A0H, j);
                            A0H.close();
                        } catch (Throwable th) {
                            try {
                                A0H.close();
                            } catch (Throwable th2) {
                                0Ug.A00(th, th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        C0iy.A00().Bwu("AppStateParserNumActivities", e, null);
                        0fH.A0u("lacrima", "Could not read number of activities byte", e);
                    }
                }
            }
            b = 0;
        }
        return b;
    }

    private long A0I() {
        long j;
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 275) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        A0H.seek(276L);
                        j = A0H.readLong();
                        A0H.close();
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserContentProviderDiedTime", e, null);
                    0fH.A0u("lacrima", "Could not read content provider died time", e);
                }
            }
            j = 0;
        }
        return j;
    }

    private String A0P() {
        String str;
        RandomAccessFile A0H;
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 275) {
                try {
                    A0H = AnonymousClass001.A0H(file);
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserContentProviderDiedName", e, null);
                    0fH.A0u("lacrima", "Could not read content provider died name", e);
                }
                try {
                    int A00 = AnonymousClass001.A00(A0H, 284L);
                    if (A00 == 0) {
                        str = "unknown";
                    } else {
                        byte[] bArr = new byte[A00];
                        A0H.readFully(bArr, 0, A00);
                        new String(bArr);
                    }
                    A0H.close();
                } catch (Throwable th) {
                    try {
                        A0H.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            }
            str = "";
        }
        return str;
    }

    private String A0R() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1987) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        int A00 = AnonymousClass001.A00(A0H, 1987L) & 255;
                        if (A00 == 0) {
                            A0H.close();
                            return null;
                        }
                        String A03 = A03(A0H, A00);
                        A0H.close();
                        return A03;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserIntent", e, null);
                    0fH.A0u("lacrima", "Could not read intent", e);
                }
            }
            return null;
        }
    }

    private boolean A0U() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 198) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        boolean A1Q = AnonymousClass001.A1Q((char) AnonymousClass001.A00(A0H, 198L), 49);
                        A0H.close();
                        return A1Q;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserActivityFinishing", e, null);
                    0fH.A0u("lacrima", "Could not read activity finishing byte", e);
                }
            }
            return false;
        }
    }

    private boolean A0V() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 275) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        boolean A1Q = AnonymousClass001.A1Q((char) AnonymousClass001.A00(A0H, 275L), 49);
                        A0H.close();
                        return A1Q;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserContentProviderDied", e, null);
                    0fH.A0u("lacrima", "Could not read content provider died byte", e);
                }
            }
            return false;
        }
    }

    private boolean A0X() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 202) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        boolean A1Q = AnonymousClass001.A1Q((char) AnonymousClass001.A00(A0H, 202L), 49);
                        A0H.close();
                        return A1Q;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserHomeTaskSwitcher", e, null);
                    0fH.A0u("lacrima", "Could not read home task switcher pressed byte", e);
                }
            }
            return false;
        }
    }

    private boolean A0Y() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1985) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        boolean A1Q = AnonymousClass001.A1Q((char) AnonymousClass001.A00(A0H, 1985L), 49);
                        A0H.close();
                        return A1Q;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserMultiWindow", e, null);
                    0fH.A0u("lacrima", "Could not read multi window mode byte", e);
                }
            }
            return false;
        }
    }

    private boolean A0Z() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1986) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        boolean A1Q = AnonymousClass001.A1Q((char) AnonymousClass001.A00(A0H, 1986L), 49);
                        A0H.close();
                        return A1Q;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserPipMode", e, null);
                    0fH.A0u("lacrima", "Could not read PIP mode byte", e);
                }
            }
            return false;
        }
    }

    private boolean A0a() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 206) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        boolean A1Q = AnonymousClass001.A1Q((char) AnonymousClass001.A00(A0H, 206L), 49);
                        A0H.close();
                        return A1Q;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserSysBinderDied", e, null);
                    0fH.A0u("lacrima", "Could not read system binder died byte", e);
                }
            }
            return false;
        }
    }

    public char A09() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1777) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        char A00 = (char) AnonymousClass001.A00(A0H, 1777L);
                        if (A00 == 0) {
                            A00 = ' ';
                        }
                        A0H.close();
                        return A00;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserAppInitState", e, null);
                    0fH.A0u("lacrima", "Could not read appInitState", e);
                }
            }
            return ' ';
        }
    }

    public char A0A() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 166) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        char A00 = (char) AnonymousClass001.A00(A0H, 166L);
                        A0H.close();
                        return A00;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserColdstartMode", e, null);
                    0fH.A0u("lacrima", "Could not read cold start mode", e);
                }
            }
            return ' ';
        }
    }

    public char A0B() {
        char c;
        RandomAccessFile A0H;
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1) {
                try {
                    A0H = AnonymousClass001.A0H(file);
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserForegroundState", e, null);
                    0fH.A0u("lacrima", "Could not read activity state", e);
                }
                try {
                    c = (char) AnonymousClass001.A00(A0H, 1L);
                    A0H.close();
                } catch (Throwable th) {
                    try {
                        A0H.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            }
            c = '?';
        }
        return c;
    }

    public char A0C() {
        char c;
        RandomAccessFile A0H;
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 0) {
                try {
                    A0H = AnonymousClass001.A0H(file);
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserStatus", e, null);
                    0fH.A0u("lacrima", "Could not read status", e);
                }
                try {
                    c = (char) AnonymousClass001.A00(A0H, 0L);
                    A0H.close();
                } catch (Throwable th) {
                    try {
                        A0H.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            }
            c = C0h0.A0Z.mSymbol;
        }
        return c;
    }

    public int A0E() {
        int i;
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 749) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        A0H.seek(749L);
                        i = A0H.readInt();
                        A0H.close();
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserAppThreadProcessState", e, null);
                    0fH.A0u("lacrima", "Could not read application thread process state", e);
                }
            }
            i = -1;
        }
        return i;
    }

    public long A0G() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1753) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        A0H.seek(1753L);
                        long readLong = A0H.readLong();
                        A0H.close();
                        return readLong;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserAppThreadProcessStateUpdateTime", e, null);
                    0fH.A0u("lacrima", "Could not read application thread process state update unixtime", e);
                }
            }
            return 0L;
        }
    }

    public long A0H() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1761) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        A0H.seek(1761L);
                        long readLong = A0H.readLong();
                        A0H.close();
                        return readLong;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserAppThreadProcessStateUptime", e, null);
                    0fH.A0u("lacrima", "Could not read application thread process state update device uptime", e);
                }
            }
            return 0L;
        }
    }

    public long A0J() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1769) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        A0H.seek(1769L);
                        long readLong = A0H.readLong();
                        A0H.close();
                        return readLong;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserLastNavigationTime", e, null);
                    0fH.A0u("lacrima", "Could not read LastNavigationTimeMs", e);
                }
            }
            return 0L;
        }
    }

    public long A0K() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 180) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        byte A00 = AnonymousClass001.A00(A0H, 180L);
                        if (A00 != 0) {
                            long parseLong = Long.parseLong(A03(A0H, A00));
                            A0H.close();
                            return parseLong;
                        }
                        A0H.close();
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException | NumberFormatException e) {
                    C0iy.A00().Bwu("AppStateParserLastUpdate", e, null);
                    0fH.A0u("lacrima", "Could not read end point", e);
                }
            }
            return 0L;
        }
    }

    public long A0L() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 167) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        byte A00 = AnonymousClass001.A00(A0H, 167L);
                        if (A00 != 0) {
                            long parseLong = Long.parseLong(A03(A0H, A00));
                            A0H.close();
                            return parseLong;
                        }
                        A0H.close();
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException | NumberFormatException e) {
                    C0iy.A00().Bwu("AppStateParserTTFirstActivityTransition", e, null);
                    0fH.A0u("lacrima", "Could not read time to first activity transition", e);
                }
            }
            return 0L;
        }
    }

    public Boolean A0M() {
        Boolean bool;
        RandomAccessFile A0H;
        synchronized (this) {
            boolean z = true;
            File file = this.A00;
            if (file.exists() && file.length() > 205) {
                try {
                    A0H = AnonymousClass001.A0H(file);
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserScreenLocked", e, null);
                    0fH.A0u("lacrima", "Could not read lock screen byte", e);
                }
                try {
                    char A00 = (char) AnonymousClass001.A00(A0H, 205L);
                    if (A00 == ' ') {
                        A0H.close();
                        return null;
                    }
                    if (A00 != '1') {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                    A0H.close();
                    return bool;
                } catch (Throwable th) {
                    try {
                        A0H.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            }
            bool = false;
            return bool;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A0N() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0gw.A0N():java.lang.String");
    }

    public String A0O() {
        String str;
        RandomAccessFile A0H;
        synchronized (this) {
            short s = 1000;
            File file = this.A00;
            if (file.exists() && file.length() > 753) {
                try {
                    A0H = AnonymousClass001.A0H(file);
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserAttributionID", e, null);
                    0fH.A0u("lacrima", "Could not read attribution ID", e);
                }
                try {
                    A0H.seek(753L);
                    short readShort = A0H.readShort();
                    if (readShort == 0) {
                        str = "unknown";
                    } else {
                        if (readShort <= 1000) {
                            s = readShort;
                        }
                        byte[] bArr = new byte[s];
                        A0H.readFully(bArr, 0, s);
                        new String(bArr);
                    }
                    A0H.close();
                } catch (Throwable th) {
                    try {
                        A0H.close();
                    } catch (Throwable th2) {
                        0Ug.A00(th, th2);
                    }
                    throw th;
                }
            }
            str = "unknown";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A0Q() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0gw.A0Q():java.lang.String");
    }

    public String A0S() {
        String str;
        synchronized (this) {
            File file = this.A00;
            if (file.exists()) {
                long length = file.length();
                long j = 3;
                if (length > j) {
                    try {
                        RandomAccessFile A0H = AnonymousClass001.A0H(file);
                        try {
                            byte A00 = AnonymousClass001.A00(A0H, j);
                            str = A00 == 0 ? "unknown" : A03(A0H, A00);
                            A0H.close();
                        } catch (Throwable th) {
                            try {
                                A0H.close();
                            } catch (Throwable th2) {
                                0Ug.A00(th, th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        C0iy.A00().Bwu("AppStateParserNavMod", e, null);
                        0fH.A0u("lacrima", "Could not read nav module", e);
                    }
                }
            }
            str = "unknown";
        }
        return str;
    }

    public String A0T() {
        String str;
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 1778) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        byte A00 = AnonymousClass001.A00(A0H, 1778L);
                        str = A00 == 0 ? "unknown" : A03(A0H, A00 & 255);
                        A0H.close();
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserEndpoint", e, null);
                    0fH.A0u("lacrima", "Could not read previous endpoint", e);
                }
            }
            str = "unknown";
        }
        return str;
    }

    public boolean A0W() {
        synchronized (this) {
            File file = this.A00;
            if (file.exists() && file.length() > 178) {
                try {
                    RandomAccessFile A0H = AnonymousClass001.A0H(file);
                    try {
                        boolean A1Q = AnonymousClass001.A1Q((char) AnonymousClass001.A00(A0H, 178L), 49);
                        A0H.close();
                        return A1Q;
                    } catch (Throwable th) {
                        try {
                            A0H.close();
                        } catch (Throwable th2) {
                            0Ug.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("AppStateParserForeroundUntilFirstActTrans", e, null);
                    0fH.A0u("lacrima", "Could not read foreground until first activity transition", e);
                }
            }
            return false;
        }
    }
}
