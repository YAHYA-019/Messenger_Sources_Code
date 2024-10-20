package com.google.common.base;

import java.io.Serializable;

/* loaded from: Equivalence.class */
public abstract class Equivalence {

    /* loaded from: Equivalence$Equals.class */
    public final class Equals extends Equivalence implements Serializable {
        public static final Equals INSTANCE = new Object();
        public static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    /* loaded from: Equivalence$Identity.class */
    public final class Identity extends Equivalence implements Serializable {
        public static final Identity INSTANCE = new Object();
        public static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public abstract boolean doEquivalent(Object obj, Object obj2);

    public abstract int doHash(Object obj);

    public final boolean equivalent(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return doEquivalent(obj, obj2);
    }
}
