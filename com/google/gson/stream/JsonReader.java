package com.google.gson.stream;

import X.0Pz;
import X.0Q8;
import X.0S2;
import X.AnonymousClass001;
import X.C6f2;
import X.JQx;
import X.JQy;
import X.KE2;
import X.KYk;
import com.facebook.acra.constants.ActionId;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: JsonReader.class */
public class JsonReader implements Closeable {
    public int A04;
    public long A07;
    public int[] A09;
    public String A0A;
    public int[] A0B;
    public String[] A0C;
    public final Reader A0E;
    public boolean A08 = false;
    public final char[] A0D = new char[1024];
    public int A05 = 0;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A06 = 1;

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.A0B = iArr;
        iArr[0] = 6;
        this.A0C = new String[32];
        this.A09 = new int[32];
        C6f2.A00("in == null", reader);
        this.A0E = reader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v91, types: [int] */
    /* JADX WARN: Type inference failed for: r0v95, types: [int] */
    private char A04() {
        char c;
        char c2;
        char c3;
        if (this.A05 != this.A00 || A0F(1)) {
            char[] cArr = this.A0D;
            int i = this.A05;
            int i2 = i + 1;
            this.A05 = i2;
            char c4 = cArr[i];
            if (c4 == '\n') {
                this.A01++;
                this.A02 = i2;
                return c4;
            }
            if (c4 != '\"' && c4 != '\'' && c4 != '/' && c4 != '\\') {
                if (c4 == 'b') {
                    return '\b';
                }
                if (c4 == 'f') {
                    return '\f';
                }
                if (c4 == 'n') {
                    return '\n';
                }
                if (c4 == 'r') {
                    c4 = '\r';
                } else {
                    if (c4 == 't') {
                        return '\t';
                    }
                    if (c4 != 'u') {
                        A0D("Invalid escape sequence");
                        throw 0Q8.createAndThrow();
                    }
                    if (i2 + 4 <= this.A00 || A0F(4)) {
                        char c5 = 0;
                        int i3 = this.A05;
                        int i4 = i3 + 4;
                        while (i3 < i4) {
                            char c6 = cArr[i3];
                            char c7 = (char) (c5 << 4);
                            if (c6 >= '0') {
                                if (c6 <= '9') {
                                    c2 = c6;
                                    c3 = 65488;
                                } else if (c6 >= 'a') {
                                    if (c6 <= 'f') {
                                        c = c6 - 'a';
                                        c2 = c;
                                        c3 = '\n';
                                    }
                                } else if (c6 >= 'A' && c6 <= 'F') {
                                    c = c6 - 'A';
                                    c2 = c;
                                    c3 = '\n';
                                }
                                c5 = (char) (c7 + c2 + c3);
                                i3++;
                            }
                            throw new NumberFormatException(0Pz.A0W("\\u", new String(cArr, i3, 4)));
                        }
                        this.A05 = i4;
                        return c5;
                    }
                }
            }
            return c4;
        }
        A0D("Unterminated escape sequence");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r307 != '/') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r301.A05 = r308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r308 != r305) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        r301.A05 = r308 - 1;
        r0 = A0F(2);
        r308 = r301.A05 + 1;
        r301.A05 = r308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        return r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        A09();
        r0 = r0[r308];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r0 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        r304 = r308 + 1;
        r301.A05 = r304;
        r0 = "*\/".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
    
        r305 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0123, code lost:
    
        if ((r304 + r0) <= r301.A00) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        if (A0F(r0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0133, code lost:
    
        A0D("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013c, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013d, code lost:
    
        r0 = r301.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014f, code lost:
    
        if (r0[r0] != '\n') goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0152, code lost:
    
        r301.A01++;
        r301.A02 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
    
        r304 = r301.A05 + 1;
        r301.A05 = r304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017f, code lost:
    
        r0 = r301.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0189, code lost:
    
        if (r305 >= r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a4, code lost:
    
        if (r0[r0 + r305] != "*\/".charAt(r305)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a7, code lost:
    
        r305 = r305 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        if (r0 != '/') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
    
        r301.A05 = r308 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01de, code lost:
    
        if (r301.A05 < r301.A00) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01eb, code lost:
    
        if (A0F(1) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ee, code lost:
    
        r0 = r301.A05;
        r0 = r0 + 1;
        r301.A05 = r0;
        r0 = r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020c, code lost:
    
        if (r0 != '\n') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x022d, code lost:
    
        if (r0 != '\r') goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x020f, code lost:
    
        r301.A01++;
        r301.A02 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b8, code lost:
    
        r301.A05 = r308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c6, code lost:
    
        if (r307 != '#') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c9, code lost:
    
        A09();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A05(boolean r302) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A05(boolean):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00c3. Please report as an issue. */
    private String A06() {
        char[] cArr;
        String str;
        int i = 0;
        StringBuilder sb = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.A05;
                if (i3 + i2 < this.A00) {
                    cArr = this.A0D;
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                                                case ActionId.ANIMATION_END /* 93 */:
                                                    break;
                                                case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cArr = this.A0D;
                    if (i2 >= 1024) {
                        if (sb == null) {
                            sb = AnonymousClass001.A0l(Math.max(i2, 16));
                        }
                        sb.append(cArr, i3, i2);
                        this.A05 += i2;
                    } else if (A0F(i2 + 1)) {
                    }
                }
                this.A05 += i;
                return str;
            }
            A09();
            i = i2;
            if (sb == null) {
                str = new String(cArr, this.A05, i2);
                this.A05 += i;
                return str;
            }
            sb.append(cArr, this.A05, i);
            str = sb.toString();
            this.A05 += i;
            return str;
        } while (A0F(1));
        sb.append(cArr, this.A05, i);
        str = sb.toString();
        this.A05 += i;
        return str;
    }

    private String A07(char c) {
        char[] cArr = this.A0D;
        StringBuilder sb = null;
        while (true) {
            int i = this.A05;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.A05 = i3;
                        int i4 = (i3 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i4);
                        }
                        sb.append(cArr, i, i4);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.A05 = i3;
                        int i5 = (i3 - i) - 1;
                        if (sb == null) {
                            sb = AnonymousClass001.A0l(Math.max((i5 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i5);
                        sb.append(A04());
                    } else {
                        if (c2 == '\n') {
                            this.A01++;
                            this.A02 = i3;
                        }
                        i = i3;
                    }
                } else {
                    if (sb == null) {
                        sb = AnonymousClass001.A0l(Math.max((i - i) * 2, 16));
                    }
                    sb.append(cArr, i, i - i);
                    this.A05 = i;
                    if (!A0F(1)) {
                        A0D("Unterminated string");
                        throw 0Q8.createAndThrow();
                    }
                }
            }
        }
    }

    private String A08(boolean z) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('$');
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = this.A06;
            if (i2 >= i3) {
                return A0k.toString();
            }
            int i4 = this.A0B[i2];
            if (i4 == 1 || i4 == 2) {
                int i5 = this.A09[i2];
                if (z && i5 > 0 && i2 == i3 - 1) {
                    i5--;
                }
                A0k.append('[');
                A0k.append(i5);
                A0k.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                A0k.append('.');
                String str = this.A0C[i2];
                if (str != null) {
                    A0k.append(str);
                }
            }
            i = i2 + 1;
        }
    }

    private void A09() {
        if (this.A08) {
            return;
        }
        A0D("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ab. Please report as an issue. */
    private void A0A() {
        int i;
        int i2;
        do {
            int i3 = 0;
            while (true) {
                i = i3;
                i2 = this.A05;
                int i4 = i2 + i;
                if (i4 < this.A00) {
                    char c = this.A0D[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                                                case ActionId.ANIMATION_END /* 93 */:
                                                    break;
                                                case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                                                    break;
                                                default:
                                                    i3 = i + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.A05 = i4;
                }
            }
            A09();
            this.A05 = i2 + i;
            return;
        } while (A0F(1));
    }

    private void A0B(char c) {
        char[] cArr = this.A0D;
        while (true) {
            int i = this.A05;
            int i2 = this.A00;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.A05 = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.A05 = i3;
                        A04();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.A01++;
                            this.A02 = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.A05 = i;
                    if (!A0F(1)) {
                        A0D("Unterminated string");
                        throw 0Q8.createAndThrow();
                    }
                }
            }
        }
    }

    private void A0C(int i) {
        int i2 = this.A06;
        int[] iArr = this.A0B;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.A0B = Arrays.copyOf(iArr, i3);
            this.A09 = Arrays.copyOf(this.A09, i3);
            this.A0C = (String[]) Arrays.copyOf(this.A0C, i3);
        }
        int[] iArr2 = this.A0B;
        int i4 = this.A06;
        this.A06 = i4 + 1;
        iArr2[i4] = i;
    }

    private void A0D(String str) {
        throw new IOException(0Pz.A0W(str, A0N()));
    }

    private boolean A0E(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
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
        A09();
        return false;
    }

    private boolean A0F(int i) {
        int i2;
        char[] cArr = this.A0D;
        int i3 = this.A02;
        int i4 = this.A05;
        this.A02 = i3 - i4;
        int i5 = this.A00;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.A00 = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.A00 = 0;
        }
        this.A05 = 0;
        do {
            Reader reader = this.A0E;
            int i7 = this.A00;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.A00 + read;
            this.A00 = i2;
            if (this.A01 == 0 && this.A02 == 0 && i2 > 0 && cArr[0] == 65279) {
                this.A05++;
                this.A02 = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public double A0G() {
        char c;
        String str;
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            Integer A0K = ke2.A0K();
            if (A0K != 0S2.A0u && A0K != 0S2.A0j) {
                throw JQy.A0j(ke2, "NUMBER", A0K != null ? KYk.A00(A0K) : "null");
            }
            double asDouble = ((JsonElement) JQx.A0s(ke2)).getAsDouble();
            if (ke2.A08 || !(Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
                KE2.A00(ke2);
                JQy.A1M(ke2);
                return asDouble;
            }
            StringBuilder A0n = AnonymousClass001.A0n("JSON forbids NaN and infinities: ");
            A0n.append(asDouble);
            throw new IOException(A0n.toString());
        }
        int A0D = JQy.A0D(this);
        if (A0D == 15) {
            JQy.A1N(this);
            return this.A07;
        }
        if (A0D == 16) {
            this.A0A = new String(this.A0D, this.A05, this.A04);
            this.A05 += this.A04;
        } else {
            if (A0D == 8) {
                c = '\'';
            } else if (A0D == 9) {
                c = '\"';
            } else if (A0D == 10) {
                str = A06();
                this.A0A = str;
            } else if (A0D != 11) {
                throw 0Pz.A07("Expected a double but was ", JQy.A0q(this), A0N());
            }
            str = A07(c);
            this.A0A = str;
        }
        this.A03 = 11;
        double parseDouble = Double.parseDouble(this.A0A);
        if (this.A08 || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.A0A = null;
            JQy.A1N(this);
            return parseDouble;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("JSON forbids NaN and infinities: ");
        A0k.append(parseDouble);
        throw new IOException(AnonymousClass001.A0d(A0N(), A0k));
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b8, code lost:
    
        if (A0E(r0) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x041f, code lost:
    
        if (r0 == 1) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0553, code lost:
    
        if (r0 != 5) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02bf, code lost:
    
        if (r308 != 2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02c4, code lost:
    
        if (r322 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02d3, code lost:
    
        if (r323 != Long.MIN_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02d8, code lost:
    
        if (r325 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02e5, code lost:
    
        if (r323 != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02ea, code lost:
    
        if (r325 != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02ed, code lost:
    
        r323 = -r323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02f2, code lost:
    
        r301.A07 = r323;
        r301.A05 += r306;
        r305 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x06a2, code lost:
    
        r301.A03 = r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06aa, code lost:
    
        return r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x030e, code lost:
    
        if (r325 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0322, code lost:
    
        r301.A04 = r306;
        r305 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0318, code lost:
    
        if (r308 == 4) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x031f, code lost:
    
        if (r308 != 7) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032f A[EDGE_INSN: B:143:0x032f->B:63:0x032f BREAK  A[LOOP:0: B:31:0x0143->B:103:0x022f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0H() {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A0H():int");
    }

    public int A0I() {
        char c;
        String A07;
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            Integer A0K = ke2.A0K();
            if (A0K != 0S2.A0u && A0K != 0S2.A0j) {
                throw JQy.A0j(ke2, "NUMBER", A0K != null ? KYk.A00(A0K) : "null");
            }
            int asInt = ((JsonElement) JQx.A0s(ke2)).getAsInt();
            KE2.A00(ke2);
            JQy.A1M(ke2);
            return asInt;
        }
        int A0D = JQy.A0D(this);
        if (A0D == 15) {
            long j = this.A07;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException(0Pz.A0h("Expected an int but was ", A0N(), j));
            }
            JQy.A1N(this);
            return i;
        }
        if (A0D == 16) {
            A07 = new String(this.A0D, this.A05, this.A04);
            this.A0A = A07;
            this.A05 += this.A04;
        } else {
            try {
                if (A0D == 8) {
                    c = '\'';
                } else {
                    if (A0D != 9) {
                        if (A0D != 10) {
                            throw 0Pz.A07("Expected an int but was ", JQy.A0q(this), A0N());
                        }
                        A07 = A06();
                        this.A0A = A07;
                        int parseInt = Integer.parseInt(A07);
                        JQy.A1N(this);
                        return parseInt;
                    }
                    c = '\"';
                }
                int parseInt2 = Integer.parseInt(A07);
                JQy.A1N(this);
                return parseInt2;
            } catch (NumberFormatException unused) {
            }
            A07 = A07(c);
            this.A0A = A07;
        }
        this.A03 = 11;
        double parseDouble = Double.parseDouble(A07);
        int i2 = (int) parseDouble;
        if (i2 != parseDouble) {
            throw new NumberFormatException(0Pz.A0j("Expected an int but was ", A07, A0N()));
        }
        this.A0A = null;
        JQy.A1N(this);
        return i2;
    }

    public long A0J() {
        char c;
        String A07;
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            Integer A0K = ke2.A0K();
            if (A0K != 0S2.A0u && A0K != 0S2.A0j) {
                throw JQy.A0j(ke2, "NUMBER", A0K != null ? KYk.A00(A0K) : "null");
            }
            long asLong = ((JsonElement) JQx.A0s(ke2)).getAsLong();
            KE2.A00(ke2);
            JQy.A1M(ke2);
            return asLong;
        }
        int A0D = JQy.A0D(this);
        if (A0D == 15) {
            JQy.A1N(this);
            return this.A07;
        }
        if (A0D == 16) {
            A07 = new String(this.A0D, this.A05, this.A04);
            this.A0A = A07;
            this.A05 += this.A04;
        } else {
            try {
                if (A0D == 8) {
                    c = '\'';
                } else {
                    if (A0D != 9) {
                        if (A0D != 10) {
                            throw 0Pz.A07("Expected a long but was ", JQy.A0q(this), A0N());
                        }
                        A07 = A06();
                        this.A0A = A07;
                        long parseLong = Long.parseLong(A07);
                        JQy.A1N(this);
                        return parseLong;
                    }
                    c = '\"';
                }
                long parseLong2 = Long.parseLong(A07);
                JQy.A1N(this);
                return parseLong2;
            } catch (NumberFormatException unused) {
            }
            A07 = A07(c);
            this.A0A = A07;
        }
        this.A03 = 11;
        double parseDouble = Double.parseDouble(A07);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException(0Pz.A0j("Expected a long but was ", A07, A0N()));
        }
        this.A0A = null;
        JQy.A1N(this);
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x016a, code lost:
    
        if (r0 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer A0K() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A0K():java.lang.Integer");
    }

    public String A0L() {
        return this instanceof KE2 ? KE2.A01((KE2) this, false) : A08(false);
    }

    public String A0M() {
        return this instanceof KE2 ? KE2.A01((KE2) this, true) : A08(true);
    }

    public String A0N() {
        return 0Pz.A0x(" at line ", " column ", " path ", A0L(), this.A01 + 1, (this.A05 - this.A02) + 1);
    }

    public String A0O() {
        char c;
        String A07;
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            KE2.A02(ke2, 0S2.A0Y);
            Map.Entry A0z = AnonymousClass001.A0z((Iterator) JQx.A0s(ke2));
            String A0j = AnonymousClass001.A0j(A0z);
            ke2.A03[ke2.A00 - 1] = A0j;
            KE2.A03(ke2, A0z.getValue());
            return A0j;
        }
        int A0D = JQy.A0D(this);
        if (A0D == 14) {
            A07 = A06();
        } else {
            if (A0D == 12) {
                c = '\'';
            } else {
                if (A0D != 13) {
                    throw 0Pz.A07("Expected a name but was ", JQy.A0q(this), A0N());
                }
                c = '\"';
            }
            A07 = A07(c);
        }
        this.A03 = 0;
        this.A0C[this.A06 - 1] = A07;
        return A07;
    }

    public String A0P() {
        String str;
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            Integer A0K = ke2.A0K();
            if (A0K != 0S2.A0j && A0K != 0S2.A0u) {
                throw JQy.A0j(ke2, "STRING", A0K != null ? KYk.A00(A0K) : "null");
            }
            String asString = ((JsonElement) KE2.A00(ke2)).getAsString();
            JQy.A1M(ke2);
            return asString;
        }
        int A0D = JQy.A0D(this);
        if (A0D == 10) {
            str = A06();
        } else if (A0D == 8) {
            str = A07('\'');
        } else if (A0D == 9) {
            str = A07('\"');
        } else if (A0D == 11) {
            str = this.A0A;
            this.A0A = null;
        } else if (A0D == 15) {
            str = Long.toString(this.A07);
        } else {
            if (A0D != 16) {
                throw 0Pz.A07("Expected a string but was ", JQy.A0q(this), A0N());
            }
            str = new String(this.A0D, this.A05, this.A04);
            this.A05 += this.A04;
        }
        JQy.A1N(this);
        return str;
    }

    public void A0Q() {
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            KE2.A02(ke2, 0S2.A00);
            KE2.A03(ke2, ((JsonArray) JQx.A0s(ke2)).iterator());
            ke2.A01[ke2.A00 - 1] = 0;
            return;
        }
        if (JQy.A0D(this) != 3) {
            throw 0Pz.A07("Expected BEGIN_ARRAY but was ", JQy.A0q(this), A0N());
        }
        A0C(1);
        this.A09[this.A06 - 1] = 0;
        this.A03 = 0;
    }

    public void A0R() {
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            KE2.A02(ke2, 0S2.A0C);
            KE2.A03(ke2, ((JsonObject) JQx.A0s(ke2)).entrySet().iterator());
        } else {
            if (JQy.A0D(this) != 1) {
                throw 0Pz.A07("Expected BEGIN_OBJECT but was ", JQy.A0q(this), A0N());
            }
            A0C(3);
            this.A03 = 0;
        }
    }

    public void A0S() {
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            KE2.A02(ke2, 0S2.A01);
            KE2.A00(ke2);
            KE2.A00(ke2);
            JQy.A1M(ke2);
            return;
        }
        if (JQy.A0D(this) != 4) {
            throw 0Pz.A07("Expected END_ARRAY but was ", JQy.A0q(this), A0N());
        }
        int i = this.A06 - 1;
        this.A06 = i;
        JQx.A1U(this.A09, i - 1);
        this.A03 = 0;
    }

    public void A0T() {
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            KE2.A02(ke2, 0S2.A0N);
            ke2.A03[ke2.A00 - 1] = null;
            KE2.A00(ke2);
            KE2.A00(ke2);
            JQy.A1M(ke2);
            return;
        }
        if (JQy.A0D(this) != 2) {
            throw 0Pz.A07("Expected END_OBJECT but was ", JQy.A0q(this), A0N());
        }
        int i = this.A06 - 1;
        this.A06 = i;
        this.A0C[i] = null;
        JQx.A1U(this.A09, i - 1);
        this.A03 = 0;
    }

    public void A0U() {
        if (!(this instanceof KE2)) {
            if (JQy.A0D(this) != 7) {
                throw 0Pz.A07("Expected null but was ", JQy.A0q(this), A0N());
            }
            JQy.A1N(this);
        } else {
            KE2 ke2 = (KE2) this;
            KE2.A02(ke2, 0S2.A1G);
            KE2.A00(ke2);
            JQy.A1M(ke2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x007b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A0V():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r0 == 17) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r0 == X.0S2.A1J) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0W() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.KE2
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L35
            r0 = r301
            com.google.gson.stream.JsonReader r0 = (com.google.gson.stream.JsonReader) r0
            java.lang.Integer r0 = r0.A0K()
            r303 = r0
            java.lang.Integer r0 = X.0S2.A0N
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L2f
            java.lang.Integer r0 = X.0S2.A01
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L2f
            java.lang.Integer r0 = X.0S2.A1J
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L32
        L2f:
            r0 = 0
            r305 = r0
        L32:
            r0 = r305
            return r0
        L35:
            r0 = r301
            int r0 = X.JQy.A0D(r0)
            r306 = r0
            r0 = 2
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 == r1) goto L2f
            r0 = 4
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 == r1) goto L2f
            r0 = 17
            r302 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            r1 = r302
            if (r0 != r1) goto L32
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.A0W():boolean");
    }

    public boolean A0X() {
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            KE2.A02(ke2, 0S2.A15);
            boolean asBoolean = ((JsonElement) KE2.A00(ke2)).getAsBoolean();
            JQy.A1M(ke2);
            return asBoolean;
        }
        int A0D = JQy.A0D(this);
        if (A0D == 5) {
            this.A03 = 0;
            JQx.A1U(this.A09, this.A06 - 1);
            return true;
        }
        if (A0D != 6) {
            throw 0Pz.A07("Expected a boolean but was ", JQy.A0q(this), A0N());
        }
        this.A03 = 0;
        JQx.A1U(this.A09, this.A06 - 1);
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this instanceof KE2) {
            KE2 ke2 = (KE2) this;
            ke2.A02 = new Object[]{KE2.A04};
            ke2.A00 = 1;
        } else {
            this.A03 = 0;
            this.A0B[0] = 8;
            this.A06 = 1;
            this.A0E.close();
        }
    }

    public String toString() {
        return 0Pz.A0W(AnonymousClass001.A0X(this), A0N());
    }
}
