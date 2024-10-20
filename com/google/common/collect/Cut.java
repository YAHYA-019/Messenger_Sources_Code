package com.google.common.collect;

import X.AnonymousClass001;
import X.DKD;
import X.GOp;
import X.JQx;
import java.io.Serializable;

/* loaded from: Cut.class */
public abstract class Cut implements Comparable, Serializable {
    public static final long serialVersionUID = 0;
    public final Comparable endpoint;

    /* loaded from: Cut$AboveAll.class */
    public final class AboveAll extends Cut {
        public static final AboveAll A00 = new AboveAll();
        public static final long serialVersionUID = 0;

        public AboveAll() {
            super("");
        }

        private Object readResolve() {
            return A00;
        }

        @Override // com.google.common.collect.Cut
        public int A00(Cut cut) {
            int i = 1;
            if (cut == this) {
                i = 0;
            }
            return i;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        public String toString() {
            return "+∞";
        }
    }

    /* loaded from: Cut$AboveValue.class */
    public final class AboveValue extends Cut {
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.A00((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.endpoint.hashCode() ^ (-1);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("/");
            A0k.append(this.endpoint);
            return AnonymousClass001.A0d("\\", A0k);
        }
    }

    /* loaded from: Cut$BelowAll.class */
    public final class BelowAll extends Cut {
        public static final BelowAll A00 = new BelowAll();
        public static final long serialVersionUID = 0;

        public BelowAll() {
            super("");
        }

        private Object readResolve() {
            return A00;
        }

        @Override // com.google.common.collect.Cut
        public int A00(Cut cut) {
            int i = -1;
            if (cut == this) {
                i = 0;
            }
            return i;
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        public String toString() {
            return "-∞";
        }
    }

    /* loaded from: Cut$BelowValue.class */
    public final class BelowValue extends Cut {
        public static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.A00((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.endpoint.hashCode();
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("\\");
            A0k.append(this.endpoint);
            return AnonymousClass001.A0d("/", A0k);
        }
    }

    public Cut(Comparable comparable) {
        this.endpoint = comparable;
    }

    public int A00(Cut cut) {
        int compareTo;
        if (cut == BelowAll.A00) {
            return 1;
        }
        if (cut == AboveAll.A00) {
            compareTo = -1;
        } else {
            Comparable comparable = this.endpoint;
            Comparable comparable2 = cut.endpoint;
            Range range = Range.A00;
            compareTo = comparable.compareTo(comparable2);
            if (compareTo == 0) {
                boolean z = this instanceof AboveValue;
                if (z == (cut instanceof AboveValue)) {
                    return 0;
                }
                compareTo = -1;
                if (z) {
                    return 1;
                }
            }
        }
        return compareTo;
    }

    public Comparable A01() {
        if (this instanceof BelowAll) {
            throw AnonymousClass001.A0N("range unbounded on this side");
        }
        if (this instanceof AboveAll) {
            throw AnonymousClass001.A0N("range unbounded on this side");
        }
        return this.endpoint;
    }

    public Comparable A02() {
        int i;
        if (this instanceof BelowValue) {
            int A03 = AnonymousClass001.A03(this.endpoint);
            if (A03 == ((-1) << (-1))) {
                return null;
            }
            i = A03 - 1;
        } else {
            if (this instanceof BelowAll) {
                throw JQx.A0m();
            }
            if (this instanceof AboveValue) {
                return this.endpoint;
            }
            i = (-1) >>> 1;
        }
        return Integer.valueOf(i);
    }

    public Comparable A03() {
        int i;
        if (this instanceof BelowValue) {
            return this.endpoint;
        }
        if (this instanceof BelowAll) {
            i = (-1) << (-1);
        } else {
            if (!(this instanceof AboveValue)) {
                throw JQx.A0m();
            }
            int A03 = AnonymousClass001.A03(this.endpoint);
            if (A03 == ((-1) >>> 1)) {
                return null;
            }
            i = A03 + 1;
        }
        return Integer.valueOf(i);
    }

    public void A04(StringBuilder sb) {
        char c;
        if (this instanceof BelowValue) {
            c = '[';
        } else if (this instanceof BelowAll) {
            sb.append("(-∞");
            return;
        } else {
            if (!(this instanceof AboveValue)) {
                throw JQx.A0m();
            }
            c = '(';
        }
        sb.append(c);
        sb.append(this.endpoint);
    }

    public void A05(StringBuilder sb) {
        char c;
        if (this instanceof BelowValue) {
            sb.append(this.endpoint);
            c = ')';
        } else {
            if (this instanceof BelowAll) {
                throw JQx.A0m();
            }
            if (!(this instanceof AboveValue)) {
                sb.append("+∞)");
                return;
            } else {
                sb.append(this.endpoint);
                c = ']';
            }
        }
        sb.append(c);
    }

    public boolean A06(Comparable comparable) {
        if (this instanceof BelowValue) {
            Comparable comparable2 = this.endpoint;
            Range range = Range.A00;
            return GOp.A1U(comparable2.compareTo(comparable));
        }
        if (this instanceof BelowAll) {
            return true;
        }
        if (!(this instanceof AboveValue)) {
            return false;
        }
        Comparable comparable3 = this.endpoint;
        Range range2 = Range.A00;
        return DKD.A1U(comparable3.compareTo(comparable));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this instanceof BelowAll ? -1 : 1;
        if (obj == this) {
            i = 0;
        }
        return i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Cut) {
            try {
                if (A00((Cut) obj) == 0) {
                    z = true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return z;
    }

    public abstract int hashCode();
}
