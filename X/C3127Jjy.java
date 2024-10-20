package X;

import com.facebook.acra.constants.ActionId;
import java.io.EOFException;

/* renamed from: X.Jjy, reason: case insensitive filesystem */
/* loaded from: Jjy.class */
public final class C3127Jjy extends Li5 {
    public int A00 = 0;
    public int A01;
    public long A02;
    public String A03;
    public final LwX A04;
    public final MRZ A05;
    public static final Lix A07 = Lix.A03("'\\");
    public static final Lix A06 = Lix.A03("\"\\");
    public static final Lix A08 = Lix.A03("{}[]:, \n\t\r\f/\\;#=");
    public static final Lix A0A = Lix.A03("\n\r");
    public static final Lix A09 = Lix.A03("*/");

    public C3127Jjy(MRZ mrz) {
        this.A05 = mrz;
        this.A04 = mrz.ACc();
        A0O(6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v83, types: [int] */
    /* JADX WARN: Type inference failed for: r0v98, types: [int] */
    private char A00() {
        String str;
        StringBuilder A0k;
        int i;
        char c;
        MRZ mrz = this.A05;
        if (mrz.Cgi(1L)) {
            LwX lwX = this.A04;
            byte readByte = lwX.readByte();
            char c2 = '\n';
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte != 110) {
                if (readByte == 114) {
                    return '\r';
                }
                if (readByte != 116) {
                    if (readByte == 117) {
                        long j = 4;
                        if (!mrz.Cgi(j)) {
                            throw new EOFException(0Pz.A0W("Unterminated escape sequence at path ", A0H()));
                        }
                        int i2 = 0;
                        char c3 = 0;
                        do {
                            byte A01 = lwX.A01(i2);
                            char c4 = (char) (c3 << 4);
                            if (A01 >= 48) {
                                if (A01 <= 57) {
                                    c = A01 - 48;
                                } else if (A01 >= 97) {
                                    if (A01 <= 102) {
                                        i = A01 - 97;
                                        c = i + 10;
                                    }
                                } else if (A01 >= 65 && A01 <= 70) {
                                    i = A01 - 65;
                                    c = i + 10;
                                }
                                c3 = (char) (c4 + c);
                                i2++;
                            }
                            A0k = AnonymousClass001.A0k();
                            A0k.append("\\u");
                            A0k.append(LwX.A00(Ky2.A00, lwX, j));
                        } while (i2 < 4);
                        lwX.D0k(j);
                        return c3;
                    }
                    A0k = AnonymousClass001.A0k();
                    A0k.append("Invalid escape sequence: \\");
                    A0k.append((char) readByte);
                    str = A0k.toString();
                } else {
                    c2 = '\t';
                }
            }
            return c2;
        }
        str = "Unterminated escape sequence";
        A0P(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0353, code lost:
    
        if (r326 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x037c, code lost:
    
        if (r326 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0391, code lost:
    
        if (r306 != 7) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03b4, code lost:
    
        if (r301.A06(r0.A01(0)) != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03b7, code lost:
    
        r337 = "Expected value";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0320, code lost:
    
        if (r301.A06(r0) != false) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(X.C3127Jjy r301) {
        /*
            Method dump skipped, instructions count: 1474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3127Jjy.A01(X.Jjy):int");
    }

    private int A02(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i;
            MRZ mrz = this.A05;
            int i3 = i2 + 1;
            if (!mrz.Cgi(i3)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            LwX lwX = this.A04;
            byte A01 = lwX.A01(i2);
            if (A01 != 10 && A01 != 32 && A01 != 13 && A01 != 9) {
                lwX.D0k(i3 - 1);
                if (A01 != 47 ? A01 != 35 : !mrz.Cgi(2)) {
                    return A01;
                }
                A0P("Use JsonReader.setLenient(true) to accept malformed JSON");
                throw 0Q8.createAndThrow();
            }
            i = i3;
        }
    }

    public static String A03(C3127Jjy c3127Jjy) {
        long BOc = c3127Jjy.A05.BOc(A08);
        if (BOc == -1) {
            return c3127Jjy.A04.A06();
        }
        return LwX.A00(Ky2.A00, c3127Jjy.A04, BOc);
    }

    public static String A04(C3127Jjy c3127Jjy, Lix lix) {
        StringBuilder sb = null;
        while (true) {
            long BOc = c3127Jjy.A05.BOc(lix);
            if (BOc == -1) {
                c3127Jjy.A0P("Unterminated string");
                throw 0Q8.createAndThrow();
            }
            LwX lwX = c3127Jjy.A04;
            if (lwX.A01(BOc) != 92) {
                String A00 = LwX.A00(Ky2.A00, lwX, BOc);
                if (sb == null) {
                    lwX.readByte();
                    return A00;
                }
                sb.append(A00);
                lwX.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = AnonymousClass001.A0k();
            }
            sb.append(LwX.A00(Ky2.A00, lwX, BOc));
            lwX.readByte();
            sb.append(c3127Jjy.A00());
        }
    }

    public static void A05(C3127Jjy c3127Jjy, Lix lix) {
        while (true) {
            long BOc = c3127Jjy.A05.BOc(lix);
            if (BOc == -1) {
                c3127Jjy.A0P("Unterminated string");
                throw 0Q8.createAndThrow();
            }
            LwX lwX = c3127Jjy.A04;
            byte A01 = lwX.A01(BOc);
            long j = BOc + 1;
            if (A01 != 92) {
                lwX.D0k(j);
                return;
            } else {
                lwX.D0k(j);
                c3127Jjy.A00();
            }
        }
    }

    private boolean A06(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                        case ActionId.ANIMATION_END /* 93 */:
                            return false;
                        case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A0P("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw 0Q8.createAndThrow();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00 = 0;
        super.A02[0] = 8;
        super.A00 = 1;
        this.A04.A0A();
        this.A05.close();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("JsonReader(");
        return JQy.A0r(this.A05, A0k);
    }
}
