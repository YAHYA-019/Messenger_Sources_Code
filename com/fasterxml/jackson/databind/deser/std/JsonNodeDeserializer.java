package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24X;
import X.2DM;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.C03353xs;
import X.C26T;
import X.C27T;
import X.C42h;

/* loaded from: JsonNodeDeserializer.class */
public class JsonNodeDeserializer extends BaseNodeDeserializer {
    public static final JsonNodeDeserializer A00 = new JsonNodeDeserializer();

    /* loaded from: JsonNodeDeserializer$ArrayDeserializer.class */
    public final class ArrayDeserializer extends BaseNodeDeserializer {
        public static final ArrayDeserializer A00 = new ArrayDeserializer();
        public static final long serialVersionUID = 1;

        public ArrayDeserializer() {
            super(AnonymousClass001.A0K(), C03353xs.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.438] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public C03353xs A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            if (!abstractC01033pi.A1p()) {
                c27t.A0Y(abstractC01033pi, C03353xs.class);
                throw 0Q8.createAndThrow();
            }
            C26T c26t = c27t._config._nodeFactory;
            C03353xs c03353xs = new C03353xs(c26t);
            A15(abstractC01033pi, c27t, new Object(), c03353xs, c26t);
            return c03353xs;
        }
    }

    /* loaded from: JsonNodeDeserializer$ObjectDeserializer.class */
    public final class ObjectDeserializer extends BaseNodeDeserializer {
        public static final ObjectDeserializer A00 = new ObjectDeserializer();
        public static final long serialVersionUID = 1;

        public ObjectDeserializer() {
            super(AnonymousClass001.A0K(), 2DM.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.438] */
        /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.438] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public 2DM A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            C26T c26t = c27t._config._nodeFactory;
            if (abstractC01033pi.A1q()) {
                2DM r0 = new 2DM(c26t);
                A15(abstractC01033pi, c27t, new Object(), r0, c26t);
                return r0;
            }
            if (abstractC01033pi.A1u(C42h.A03)) {
                return A14(abstractC01033pi, c27t, new Object(), c26t);
            }
            if (abstractC01033pi.A1u(C42h.A02)) {
                return new 2DM(c26t);
            }
            c27t.A0Y(abstractC01033pi, 2DM.class);
            throw 0Q8.createAndThrow();
        }
    }

    public JsonNodeDeserializer() {
        super(null, 24X.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.438] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public 24X A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        C03353xs c03353xs;
        ?? obj = new Object();
        C26T c26t = c27t._config._nodeFactory;
        int A14 = abstractC01033pi.A14();
        if (A14 == 1) {
            c03353xs = new 2DM(c26t);
        } else {
            if (A14 == 2) {
                return new 2DM(c26t);
            }
            if (A14 != 3) {
                return A14 != 5 ? A12(abstractC01033pi, c27t) : A14(abstractC01033pi, c27t, obj, c26t);
            }
            c03353xs = new C03353xs(c26t);
        }
        A15(abstractC01033pi, c27t, obj, c03353xs, c26t);
        return c03353xs;
    }
}
