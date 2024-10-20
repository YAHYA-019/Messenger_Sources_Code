package com.google.common.base;

import X.AnonymousClass001;
import X.DKB;
import java.util.Arrays;

/* loaded from: MoreObjects.class */
public abstract class MoreObjects {

    /* loaded from: MoreObjects$ToStringHelper.class */
    public final class ToStringHelper {
        public final String className;
        public final ValueHolder holderHead;
        public ValueHolder holderTail;
        public boolean omitNullValues;

        /* loaded from: MoreObjects$ToStringHelper$UnconditionalValueHolder.class */
        public final class UnconditionalValueHolder extends ValueHolder {
        }

        /* loaded from: MoreObjects$ToStringHelper$ValueHolder.class */
        public class ValueHolder {
            public String name;
            public ValueHolder next;
            public Object value;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.MoreObjects$ToStringHelper$ValueHolder, java.lang.Object] */
        public ToStringHelper(String str) {
            ?? obj = new Object();
            this.holderHead = obj;
            this.holderTail = obj;
            this.omitNullValues = false;
            str.getClass();
            this.className = str;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.base.MoreObjects$ToStringHelper$ValueHolder, java.lang.Object] */
        private ToStringHelper addUnconditionalHolder(String str, Object obj) {
            ?? obj2 = new Object();
            this.holderTail.next = obj2;
            this.holderTail = obj2;
            obj2.value = obj;
            obj2.name = str;
            return this;
        }

        public ToStringHelper add(String str, double d) {
            addUnconditionalHolder("psnr", String.valueOf(d));
            return this;
        }

        public ToStringHelper add(String str, float f) {
            addUnconditionalHolder(DKB.A00(444), String.valueOf(f));
            return this;
        }

        public ToStringHelper add(String str, int i) {
            addUnconditionalHolder(str, String.valueOf(i));
            return this;
        }

        public ToStringHelper add(String str, long j) {
            addUnconditionalHolder(str, String.valueOf(j));
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.base.MoreObjects$ToStringHelper$ValueHolder, java.lang.Object] */
        public ToStringHelper add(String str, Object obj) {
            ?? obj2 = new Object();
            this.holderTail.next = obj2;
            this.holderTail = obj2;
            obj2.value = obj;
            obj2.name = str;
            return this;
        }

        public ToStringHelper add(String str, boolean z) {
            addUnconditionalHolder(str, String.valueOf(z));
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.base.MoreObjects$ToStringHelper$ValueHolder, java.lang.Object] */
        public ToStringHelper addValue(Object obj) {
            ?? obj2 = new Object();
            this.holderTail.next = obj2;
            this.holderTail = obj2;
            obj2.value = obj;
            return this;
        }

        public String toString() {
            boolean z = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                Object obj = valueHolder.value;
                if ((valueHolder instanceof UnconditionalValueHolder) || obj != null || !z) {
                    sb.append(str);
                    String str2 = valueHolder.name;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static Object firstNonNull(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw AnonymousClass001.A0Q("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Class cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }
}
