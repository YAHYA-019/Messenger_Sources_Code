package com.google.common.base;

import X.0Pz;
import X.1BJ;
import X.AnonymousClass001;
import java.util.Arrays;

/* loaded from: CharMatcher.class */
public abstract class CharMatcher implements Predicate {

    /* loaded from: CharMatcher$And.class */
    public final class And extends CharMatcher {
        public final CharMatcher first;
        public final CharMatcher second;

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.first = charMatcher;
            charMatcher2.getClass();
            this.second = charMatcher2;
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return matches(((Character) obj).charValue());
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
        
            if (r301.second.matches(r302) == false) goto L6;
         */
        @Override // com.google.common.base.CharMatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean matches(char r302) {
            /*
                r301 = this;
                r0 = r301
                com.google.common.base.CharMatcher r0 = r0.first
                r303 = r0
                r0 = r303
                r1 = r302
                boolean r0 = r0.matches(r1)
                r304 = r0
                r0 = r304
                if (r0 == 0) goto L22
                r0 = r301
                com.google.common.base.CharMatcher r0 = r0.second
                r303 = r0
                r0 = r303
                r1 = r302
                boolean r0 = r0.matches(r1)
                r305 = r0
                r0 = 1
                r304 = r0
                r0 = r305
                if (r0 != 0) goto L26
            L22:
                r0 = 0
                r304 = r0
                r0 = 0
                r303 = r0
            L26:
                r0 = r304
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.CharMatcher.And.matches(char):boolean");
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("CharMatcher.and(");
            A0k.append(this.first);
            AnonymousClass001.A1H(A0k);
            A0k.append(this.second);
            return AnonymousClass001.A0d(")", A0k);
        }
    }

    /* loaded from: CharMatcher$Any.class */
    public final class Any extends NamedFastMatcher {
        public static final CharMatcher INSTANCE = new Any();

        public Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            charMatcher.getClass();
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            int i = 0;
            if (charSequence.length() == 0) {
                i = -1;
            }
            return i;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                i = -1;
            }
            return i;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            charSequence.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return AnonymousClass001.A1O(charSequence.length());
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return None.INSTANCE;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, '.');
            return new String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            charSequence.getClass();
            return "";
        }
    }

    /* loaded from: CharMatcher$AnyOf.class */
    public final class AnyOf extends CharMatcher {
        public final char[] chars;

        public AnyOf(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.chars = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return matches(((Character) obj).charValue());
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            boolean z = false;
            if (Arrays.binarySearch(this.chars, c) >= 0) {
                z = true;
            }
            return z;
        }

        public String toString() {
            StringBuilder A0o = AnonymousClass001.A0o(1BJ.A00(667));
            char[] cArr = this.chars;
            int length = cArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return AnonymousClass001.A0d("\")", A0o);
                }
                A0o.append(CharMatcher.showCharacter(cArr[i2]));
                i = i2 + 1;
            }
        }
    }

    /* loaded from: CharMatcher$Ascii.class */
    public final class Ascii extends NamedFastMatcher {
        public static final CharMatcher INSTANCE = new Ascii();

        public Ascii() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            boolean z = false;
            if (c <= 127) {
                z = true;
            }
            return z;
        }
    }

    /* loaded from: CharMatcher$FastMatcher.class */
    public abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return matches(((Character) obj).charValue());
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new Negated(this);
        }
    }

    /* loaded from: CharMatcher$InRange.class */
    public final class InRange extends FastMatcher {
        public final char endInclusive;
        public final char startInclusive;

        public InRange(char c, char c2) {
            Preconditions.checkArgument(c2 >= c);
            this.startInclusive = c;
            this.endInclusive = c2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
        
            if (r302 > r301.endInclusive) goto L6;
         */
        @Override // com.google.common.base.CharMatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean matches(char r302) {
            /*
                r301 = this;
                r0 = r301
                char r0 = r0.startInclusive
                r303 = r0
                r0 = r303
                r1 = r302
                if (r0 > r1) goto L16
                r0 = r301
                char r0 = r0.endInclusive
                r304 = r0
                r0 = 1
                r303 = r0
                r0 = r302
                r1 = r304
                if (r0 <= r1) goto L18
            L16:
                r0 = 0
                r303 = r0
            L18:
                r0 = r303
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.CharMatcher.InRange.matches(char):boolean");
        }

        public String toString() {
            return 0Pz.A0z("CharMatcher.inRange('", CharMatcher.showCharacter(this.startInclusive), "', '", CharMatcher.showCharacter(this.endInclusive), "')");
        }
    }

    /* loaded from: CharMatcher$Is.class */
    public final class Is extends FastMatcher {
        public final char match;

        public Is(char c) {
            this.match = c;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? this : None.INSTANCE;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            boolean z = false;
            if (c == this.match) {
                z = true;
            }
            return z;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new IsNot(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return !charMatcher.matches(this.match) ? new Or(this, charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.match, '.');
        }

        public String toString() {
            return 0Pz.A0j("CharMatcher.is('", CharMatcher.showCharacter(this.match), "')");
        }
    }

    /* loaded from: CharMatcher$IsEither.class */
    public final class IsEither extends FastMatcher {
        public final char match1;
        public final char match2;

        public IsEither(char c, char c2) {
            this.match1 = c;
            this.match2 = c2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
        
            if (r302 == r301.match2) goto L6;
         */
        @Override // com.google.common.base.CharMatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean matches(char r302) {
            /*
                r301 = this;
                r0 = r301
                char r0 = r0.match1
                r303 = r0
                r0 = r302
                r1 = r303
                if (r0 == r1) goto L16
                r0 = r301
                char r0 = r0.match2
                r304 = r0
                r0 = 0
                r303 = r0
                r0 = r302
                r1 = r304
                if (r0 != r1) goto L18
            L16:
                r0 = 1
                r303 = r0
            L18:
                r0 = r303
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.CharMatcher.IsEither.matches(char):boolean");
        }

        public String toString() {
            return 0Pz.A0v("CharMatcher.anyOf(\"", CharMatcher.showCharacter(this.match1), CharMatcher.showCharacter(this.match2), "\")");
        }
    }

    /* loaded from: CharMatcher$IsNot.class */
    public final class IsNot extends FastMatcher {
        public final char match;

        public IsNot(char c) {
            this.match = c;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? new And(this, charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            boolean z = false;
            if (c != this.match) {
                z = true;
            }
            return z;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new Is(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? Any.INSTANCE : this;
        }

        public String toString() {
            return 0Pz.A0j("CharMatcher.isNot('", CharMatcher.showCharacter(this.match), "')");
        }
    }

    /* loaded from: CharMatcher$JavaIsoControl.class */
    public final class JavaIsoControl extends NamedFastMatcher {
        public static final CharMatcher INSTANCE = new JavaIsoControl();

        public JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c > 31) {
                return c >= 127 && c <= 159;
            }
            return true;
        }
    }

    /* loaded from: CharMatcher$NamedFastMatcher.class */
    public abstract class NamedFastMatcher extends FastMatcher {
        public final String description;

        public NamedFastMatcher(String str) {
            this.description = str;
        }

        public final String toString() {
            return this.description;
        }
    }

    /* loaded from: CharMatcher$Negated.class */
    public class Negated extends CharMatcher {
        public final CharMatcher original;

        public Negated(CharMatcher charMatcher) {
            this.original = charMatcher;
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return matches(((Character) obj).charValue());
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.original.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.original.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.original.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return this.original;
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(this.original);
            return AnonymousClass001.A0d(".negate()", A0k);
        }
    }

    /* loaded from: CharMatcher$NegatedFastMatcher.class */
    public class NegatedFastMatcher extends Negated {
    }

    /* loaded from: CharMatcher$None.class */
    public final class None extends NamedFastMatcher {
        public static final CharMatcher INSTANCE = new None();

        public None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            charMatcher.getClass();
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            charSequence.getClass();
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return AnonymousClass001.A1O(charSequence.length());
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            charSequence.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return Any.INSTANCE;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    /* loaded from: CharMatcher$Or.class */
    public final class Or extends CharMatcher {
        public final CharMatcher first;
        public final CharMatcher second;

        public Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.first = charMatcher;
            this.second = charMatcher2;
        }

        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return matches(((Character) obj).charValue());
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
        
            if (r301.second.matches(r302) != false) goto L6;
         */
        @Override // com.google.common.base.CharMatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean matches(char r302) {
            /*
                r301 = this;
                r0 = r301
                com.google.common.base.CharMatcher r0 = r0.first
                r303 = r0
                r0 = r303
                r1 = r302
                boolean r0 = r0.matches(r1)
                r304 = r0
                r0 = r304
                if (r0 != 0) goto L22
                r0 = r301
                com.google.common.base.CharMatcher r0 = r0.second
                r1 = r302
                boolean r0 = r0.matches(r1)
                r305 = r0
                r0 = 0
                r304 = r0
                r0 = 0
                r303 = r0
                r0 = r305
                if (r0 == 0) goto L24
            L22:
                r0 = 1
                r304 = r0
            L24:
                r0 = r304
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.CharMatcher.Or.matches(char):boolean");
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("CharMatcher.or(");
            A0k.append(this.first);
            AnonymousClass001.A1H(A0k);
            A0k.append(this.second);
            return AnonymousClass001.A0d(")", A0k);
        }
    }

    /* loaded from: CharMatcher$Whitespace.class */
    public final class Whitespace extends NamedFastMatcher {
        public static final int SHIFT = Integer.numberOfLeadingZeros(31);
        public static final CharMatcher INSTANCE = new Whitespace();

        public Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return AnonymousClass001.A1Q("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> SHIFT), c);
        }
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new AnyOf(charSequence) : new IsEither(charSequence.charAt(0), charSequence.charAt(1)) : new Is(charSequence.charAt(0)) : None.INSTANCE;
    }

    public static String showCharacter(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 4) {
                return String.copyValueOf(cArr);
            }
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
            i = i2 + 1;
        }
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int indexIn(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i, length);
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (matches(charSequence.charAt(i))) {
                break;
            }
            i++;
        }
        return i;
    }

    public abstract boolean matches(char c);

    public boolean matchesAllOf(CharSequence charSequence) {
        boolean z = true;
        int length = charSequence.length() - 1;
        while (true) {
            int i = length;
            if (i < 0) {
                break;
            }
            if (!matches(charSequence.charAt(i))) {
                z = false;
                break;
            }
            length = i - 1;
        }
        return z;
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return AnonymousClass001.A1Q(indexIn(charSequence), -1);
    }

    public CharMatcher negate() {
        return new Negated(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new Or(this, charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            indexIn++;
            if (indexIn == charArray.length) {
                return new String(charArray, 0, indexIn - i);
            }
            if (matches(charArray[indexIn])) {
                i++;
            } else {
                charArray[indexIn - i] = charArray[indexIn];
            }
        }
    }

    public String replaceFrom(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        while (true) {
            charArray[indexIn] = '.';
            do {
                indexIn++;
                if (indexIn >= charArray.length) {
                    return new String(charArray);
                }
            } while (!matches(charArray[indexIn]));
        }
    }

    public String trimFrom(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= length || !matches(charSequence.charAt(i))) {
                break;
            }
            i2 = i + 1;
        }
        do {
            length--;
            if (length <= i) {
                break;
            }
        } while (matches(charSequence.charAt(length)));
        return charSequence.subSequence(i, length + 1).toString();
    }
}
