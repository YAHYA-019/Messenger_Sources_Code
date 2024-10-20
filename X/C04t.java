package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* renamed from: X.04t, reason: invalid class name */
/* loaded from: 04t.class */
public final class C04t implements Serializable {
    public Set _options;
    public final Pattern nativePattern;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C04t(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r302
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
            r0 = r301
            r1 = r303
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04t.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C04t(java.lang.String r302, X.C10a r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 1
            X.11T.A0F(r0, r1)
            r0 = r303
            int r0 = r0.value
            r304 = r0
            r0 = r304
            r1 = 2
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L19
            r0 = r304
            r1 = 64
            r0 = r0 | r1
            r304 = r0
        L19:
            r0 = r302
            r1 = r304
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = r301
            r1 = r306
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04t.<init>(java.lang.String, X.10a):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C04t(java.lang.String r302, java.util.Set r303) {
        /*
            r301 = this;
            r0 = 2
            r304 = r0
            r0 = r303
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r303
            java.util.Iterator r0 = r0.iterator()
            r305 = r0
            r0 = 0
            r306 = r0
        L12:
            r0 = r305
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3c
            r0 = r305
            java.lang.Object r0 = r0.next()
            X.100 r0 = (X.AnonymousClass100) r0
            X.10a r0 = (X.C10a) r0
            r307 = r0
            r0 = r307
            int r0 = r0.value
            r304 = r0
            r0 = r306
            r1 = r304
            r0 = r0 | r1
            r306 = r0
            goto L12
        L3c:
            r0 = r306
            r1 = 2
            r0 = r0 & r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L4c
            r0 = r306
            r1 = 64
            r0 = r0 | r1
            r306 = r0
        L4c:
            r0 = r302
            r1 = r306
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r307 = r0
            r0 = r307
            X.11T.A0A(r0)
            r0 = r301
            r1 = r307
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04t.<init>(java.lang.String, java.util.Set):void");
    }

    public C04t(Pattern pattern) {
        this.nativePattern = pattern;
    }

    private final Object writeReplace() {
        final String pattern = this.nativePattern.pattern();
        11T.A0A(pattern);
        final int flags = this.nativePattern.flags();
        return new Serializable(pattern, flags) { // from class: X.0zo
            public static final long serialVersionUID = 0;
            public final int flags;
            public final String pattern;

            {
                this.pattern = pattern;
                this.flags = flags;
            }

            private final Object readResolve() {
                Pattern compile = Pattern.compile(this.pattern, this.flags);
                11T.A0A(compile);
                return new C04t(compile);
            }
        };
    }

    public final String A00(CharSequence charSequence, String str) {
        11T.A0F(charSequence, 0);
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        11T.A0A(replaceAll);
        return replaceAll;
    }

    public final String A01(CharSequence charSequence, String str) {
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        11T.A0A(replaceFirst);
        return replaceFirst;
    }

    public final String A02(CharSequence charSequence, Function1 function1) {
        11T.A0F(charSequence, 0);
        int i = 0;
        0PH A06 = A06(charSequence, 0);
        if (A06 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder A0l = AnonymousClass001.A0l(length);
        do {
            A0l.append(charSequence, i, ((07F) A06.A01()).A00);
            A0l.append((CharSequence) function1.invoke(A06));
            i = ((07F) A06.A01()).A01 + 1;
            A06 = A06.A02();
            if (i >= length) {
                break;
            }
        } while (A06 != null);
        if (i < length) {
            A0l.append(charSequence, i, length);
        }
        return 11T.A02(A0l);
    }

    public final List A03(CharSequence charSequence, int i) {
        11T.A0F(charSequence, 0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            List singletonList = Collections.singletonList(charSequence.toString());
            11T.A0A(singletonList);
            return singletonList;
        }
        int i2 = 10;
        if (i > 0) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if (i4 >= 0 && arrayList.size() == i4) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public final C07u A04(CharSequence charSequence, int i) {
        11T.A0F(charSequence, 0);
        if (i < 0 || i > charSequence.length()) {
            int length = charSequence.length();
            StringBuilder A1D = 0Pz.A1D("Start index out of bounds: ", ", input length: ", i);
            A1D.append(length);
            throw new IndexOutOfBoundsException(A1D.toString());
        }
        0PF r0 = new 0PF(charSequence, this, i);
        0PG r02 = 0PG.A00;
        11T.A0F(r02, 1);
        return new C07u(r0, r02);
    }

    public final 0PH A05(CharSequence charSequence) {
        Matcher matcher = this.nativePattern.matcher(charSequence);
        11T.A0A(matcher);
        if (matcher.matches()) {
            return new 0PH(charSequence, matcher);
        }
        return null;
    }

    public final 0PH A06(CharSequence charSequence, int i) {
        11T.A0F(charSequence, 0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        11T.A0A(matcher);
        if (matcher.find(i)) {
            return new 0PH(charSequence, matcher);
        }
        return null;
    }

    public final boolean A07(CharSequence charSequence) {
        11T.A0F(charSequence, 0);
        return this.nativePattern.matcher(charSequence).find();
    }

    public final boolean A08(CharSequence charSequence) {
        11T.A0F(charSequence, 0);
        return this.nativePattern.matcher(charSequence).matches();
    }

    public String toString() {
        return 11T.A02(this.nativePattern);
    }
}
