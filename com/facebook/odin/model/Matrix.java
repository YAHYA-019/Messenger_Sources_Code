package com.facebook.odin.model;

import X.0Q8;
import X.5Yu;
import X.7mU;
import X.7zL;
import X.M9h;
import X.MA8;

/* loaded from: Matrix.class */
public final class Matrix {
    public final float[][] A00;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A01 = {new M9h(7zL.A18(float[].class), MA8.A00)};

    /* loaded from: Matrix$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Matrix$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Matrix(float[][] fArr, int i) {
        if (1 != (i & 1)) {
            7mU.A00(Matrix$$serializer.descriptor, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = fArr;
    }
}
