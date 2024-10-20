package com.google.android.play.core.integrity;

import X.0FI;
import X.4FE;
import X.Kjj;
import X.Kox;
import android.os.IInterface;
import com.google.android.play.integrity.internal.b;

/* loaded from: s.class */
public final class s extends b implements IInterface {
    public final 4FE A00;
    public final Kox A01;
    public final /* synthetic */ Kjj A02;

    public s() {
        int A03 = 0FI.A03(354494532);
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        0FI.A09(2004969641, A03);
        0FI.A09(-507884623, 0FI.A03(-1133778173));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(4FE r302, Kjj kjj) {
        this();
        this.A02 = kjj;
        int A03 = 0FI.A03(-1886292617);
        this.A01 = new Kox("OnRequestIntegrityTokenCallback");
        this.A00 = r302;
        0FI.A09(-659758952, A03);
    }
}
