package com.google.common.base;

import X.AnonymousClass000;
import X.AnonymousClass001;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Joiner.class */
public class Joiner {
    public final String separator;

    /* renamed from: com.google.common.base.Joiner$1, reason: invalid class name */
    /* loaded from: Joiner$1.class */
    public class AnonymousClass1 extends Joiner {
        public final /* synthetic */ String val$nullText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Joiner joiner, String str) {
            super(joiner);
            this.val$nullText = str;
        }

        @Override // com.google.common.base.Joiner
        public CharSequence toString(Object obj) {
            return obj == null ? this.val$nullText : Joiner.this.toString(obj);
        }
    }

    /* loaded from: Joiner$MapJoiner.class */
    public final class MapJoiner {
        public final Joiner joiner;
        public final String keyValueSeparator = InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR;

        public MapJoiner(Joiner joiner, String str) {
            this.joiner = joiner;
        }

        public StringBuilder appendTo(StringBuilder sb, Iterator it) {
            try {
                if (it.hasNext()) {
                    while (true) {
                        Map.Entry A0z = AnonymousClass001.A0z(it);
                        sb.append(this.joiner.toString(A0z.getKey()));
                        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                        sb.append(this.joiner.toString(A0z.getValue()));
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) this.joiner.separator);
                    }
                }
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public Joiner(Joiner joiner) {
        this.separator = joiner.separator;
    }

    public Joiner(String str) {
        this.separator = str;
    }

    public static Joiner on(char c) {
        return new Joiner(String.valueOf(c));
    }

    public static Joiner on(String str) {
        return new Joiner(AnonymousClass000.A00(125));
    }

    public Appendable appendTo(Appendable appendable, Iterator it) {
        if (it.hasNext()) {
            while (true) {
                appendable.append(toString(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                appendable.append(this.separator);
            }
        }
        return appendable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.base.Joiner] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Appendable] */
    public final StringBuilder appendTo(StringBuilder sb, Iterable iterable) {
        Object obj = this;
        try {
            obj = obj.appendTo(sb, iterable.iterator());
            return sb;
        } catch (IOException unused) {
            throw AnonymousClass001.A0J(obj);
        }
    }

    public final String join(Iterable iterable) {
        return join(iterable.iterator());
    }

    public final String join(final Object obj, final Object obj2, final Object... objArr) {
        return join(new AbstractList() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i) {
                return i != 0 ? i != 1 ? objArr[i - 2] : obj2 : obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }
        }.iterator());
    }

    public final String join(Iterator it) {
        StringBuilder sb = new StringBuilder();
        try {
            appendTo(sb, it);
            return sb.toString();
        } catch (IOException unused) {
            throw AnonymousClass001.A0J(this);
        }
    }

    public CharSequence toString(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
