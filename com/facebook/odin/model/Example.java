package com.facebook.odin.model;

import X.11T;
import X.1BK;
import X.4YV;
import X.5Yu;
import X.5ZL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.M9o;
import java.util.HashMap;

/* loaded from: Example.class */
public final class Example extends C04v {
    public final ExampleContext A00;
    public final String A01;
    public final HashMap A02;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A03 = {null, null, new M9o(5ZL.A01, FeatureData$$serializer.INSTANCE)};
    public static final Example A04 = new Example(ExampleContext.A05, AnonymousClass001.A0u());

    /* loaded from: Example$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Example$$serializer.INSTANCE;
        }
    }

    public Example() {
        this(ExampleContext.A05, AnonymousClass001.A0u());
    }

    public /* synthetic */ Example(ExampleContext exampleContext, String str, HashMap hashMap, int i) {
        this.A01 = (i & 1) == 0 ? "identity" : str;
        if ((i & 2) == 0) {
            this.A00 = ExampleContext.A05;
        } else {
            this.A00 = exampleContext;
        }
        if ((i & 4) == 0) {
            this.A02 = AnonymousClass001.A0u();
        } else {
            this.A02 = hashMap;
        }
    }

    public Example(ExampleContext exampleContext, HashMap hashMap) {
        11T.A0F(exampleContext, 2);
        this.A01 = "identity";
        this.A00 = exampleContext;
        this.A02 = hashMap;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Example)) {
                return false;
            }
            Example example = (Example) obj;
            if (!11T.A0O(this.A01, example.A01) || !11T.A0O(this.A00, example.A00) || !11T.A0O(this.A02, example.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A05(this.A00, 4YV.A02(this.A01)));
    }
}
