package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.facebook.inject.FbInjector;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.Emoji;

/* renamed from: X.2d5, reason: invalid class name */
/* loaded from: 2d5.class */
public final class C2d5 {
    public Boolean A00;
    public Boolean A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;

    public C2d5() {
        this.A02 = FbInjector.A00;
        this.A03 = new 1BQ(33050);
        this.A04 = new 1BQ(33143);
    }

    public C2d5(int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v88, types: [android.text.Spannable] */
    public static Spannable A00(C2d5 c2d5, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        int charCount;
        int charCount2;
        int i4;
        SpannableString spannableString = null;
        while (true) {
            boolean z2 = true;
            while (i < i2) {
                int codePointAt = Character.codePointAt(charSequence, i);
                if (Character.isWhitespace(codePointAt)) {
                    i += Character.charCount(codePointAt);
                } else if (z2) {
                    int A01 = C2d6.A00.A01(charSequence, i, i2);
                    if (A01 <= i) {
                        int charCount3 = Character.charCount(codePointAt);
                        charCount2 = i;
                        i4 = charCount3;
                    } else {
                        int codePointAt2 = A01 < i2 ? Character.codePointAt(charSequence, A01) : 32;
                        if (Character.isWhitespace(codePointAt2)) {
                            C03v c03v = Emoji.A00;
                            char[] cArr = (char[]) c03v.A3p();
                            if (cArr == null) {
                                cArr = new char[19];
                            }
                            TextUtils.getChars(charSequence, i, A01, cArr, 0);
                            String str = new String(cArr, 0, A01 - i);
                            c03v.Ccj(cArr);
                            String A00 = ((2KX) c2d5.A03.get()).A00(str);
                            if (A00 == null) {
                                charCount = Character.charCount(codePointAt2);
                            } else {
                                BasicEmoji basicEmoji = new BasicEmoji(A00);
                                C2d4 A002 = 1PY.A00(((2qB) c2d5.A04.get()).A00);
                                4EU r0 = new 4EU(A002 != null ? A002.A00 : null, basicEmoji, i3);
                                if (spannableString == null) {
                                    if (z || !(charSequence instanceof Spannable)) {
                                        spannableString = new SpannableString(charSequence);
                                        if (spannableString.length() < i2) {
                                            0fH.A0U(C2d5.class, "Background modification: %d -> %d (%d)", 1BK.A1a(Integer.valueOf(i2), Integer.valueOf(spannableString.length()), charSequence.length()));
                                            return null;
                                        }
                                    } else {
                                        spannableString = (Spannable) charSequence;
                                    }
                                }
                                spannableString.setSpan(r0, i, A01, 33);
                                charCount = Character.charCount(codePointAt2);
                            }
                            i = charCount + A01;
                        } else {
                            charCount2 = Character.charCount(codePointAt2);
                            i4 = A01;
                        }
                    }
                    i = charCount2 + i4;
                    z2 = false;
                } else {
                    i += Character.charCount(codePointAt);
                }
            }
            return spannableString;
        }
    }

    private boolean A01(Spannable spannable, int i, int i2, int i3, int i4) {
        boolean z = false;
        while (i2 < i3) {
            C2d8 c2d8 = C2q6.A00;
            int i5 = -1;
            int i6 = i2;
            while (true) {
                i6 = c2d8.A02(spannable, c2d8.A01, 0, 1098, i6, i3);
                if (i6 < 0) {
                    break;
                }
                i5 = i6;
            }
            if (i5 == -1) {
                i2++;
            } else {
                C2d4 A00 = 1PY.A00(((2qB) this.A04.get()).A00);
                2qV r0 = new 2qV(A00 != null ? A00.A00 : null, i4);
                if (i5 <= i) {
                    spannable.setSpan(r0, i2, i5, 33);
                    z = true;
                }
                i2 = i5;
            }
        }
        return z;
    }

    public static boolean A02(CharSequence charSequence, int i, int i2) {
        int i3;
        int length = charSequence.length();
        if (i2 > length) {
            0fH.A18("TypefaceEmojiUtilBase", "Invalid start: %d and stop value: %d passed for text: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), charSequence});
        }
        if (i2 > length) {
            i2 = length;
        }
        while (i < i2) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (codePointAt >= 169) {
                if (codePointAt >= 8252) {
                    if (codePointAt < 126980) {
                        i3 = 12953;
                    } else {
                        i3 = 983042;
                        if (codePointAt < 983040) {
                            i3 = 129791;
                        }
                    }
                    if (codePointAt <= i3) {
                        return true;
                    }
                } else if (codePointAt == 169 || codePointAt == 174) {
                    return true;
                }
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r0.booleanValue() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence A03(int r302, java.lang.CharSequence r303) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2d5.A03(int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (r0.booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ec, code lost:
    
        if (r0 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        r0 = r0[r316];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f6, code lost:
    
        r0 = r0.A00;
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010b, code lost:
    
        if (r0 >= 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        if (r0.compareAndSet(r0, r0 + 1) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0124, code lost:
    
        r316 = r316 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012e, code lost:
    
        if (r316 >= r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0177, code lost:
    
        if (A01(r302, r0, r304, r312, r303) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r0.booleanValue() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(android.text.Spannable r302, int r303, int r304, int r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2d5.A04(android.text.Spannable, int, int, int, boolean):boolean");
    }
}
