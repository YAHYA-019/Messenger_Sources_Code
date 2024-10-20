package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.AbstractC01033pi;
import X.AnonymousClass000;
import X.C26O;
import X.C27T;
import X.C42h;

/* loaded from: StackTraceElementDeserializer.class */
public class StackTraceElementDeserializer extends StdScalarDeserializer {
    public static final long serialVersionUID = 1;

    public StackTraceElementDeserializer() {
        super(StackTraceElement.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public StackTraceElement A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        StackTraceElement A0M;
        C42h A1I = abstractC01033pi.A1I();
        if (A1I != C42h.A06) {
            if (A1I == C42h.A05 && c27t.A0p(C26O.A0L)) {
                abstractC01033pi.A1K();
                A0M = A0M(abstractC01033pi, c27t);
                if (abstractC01033pi.A1K() != C42h.A01) {
                    A0x(c27t);
                }
            } else {
                c27t.A0Y(abstractC01033pi, this._valueClass);
            }
            throw 0Q8.createAndThrow();
        }
        String str = "";
        String str2 = str;
        String str3 = str;
        int i = -1;
        while (true) {
            C42h A1L = abstractC01033pi.A1L();
            if (A1L == C42h.A02) {
                break;
            }
            String A1X = abstractC01033pi.A1X();
            if ("className".equals(A1X)) {
                str = abstractC01033pi.A1Z();
            } else {
                if (!"classLoaderName".equals(A1X)) {
                    if ("fileName".equals(A1X)) {
                        str3 = abstractC01033pi.A1Z();
                    } else if ("lineNumber".equals(A1X)) {
                        i = A1L._isNumber ? abstractC01033pi.A15() : A0a(abstractC01033pi, c27t);
                    } else if ("methodName".equals(A1X)) {
                        str2 = abstractC01033pi.A1Z();
                    } else if (!"nativeMethod".equals(A1X)) {
                        if (!"moduleName".equals(A1X) && !"moduleVersion".equals(A1X)) {
                            if (!AnonymousClass000.A00(189).equals(A1X) && !"format".equals(A1X)) {
                                A0w(abstractC01033pi, c27t, this._valueClass, A1X);
                            }
                        }
                    }
                }
                abstractC01033pi.A1Z();
            }
            abstractC01033pi.A20();
        }
        A0M = new StackTraceElement(str, str2, str3, i);
        return A0M;
    }
}
