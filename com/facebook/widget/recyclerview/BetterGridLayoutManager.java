package com.facebook.widget.recyclerview;

import X.1BK;
import X.2NB;
import X.2NQ;
import X.2XJ;
import X.2Z5;
import X.6M4;
import X.AnonymousClass001;
import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: BetterGridLayoutManager.class */
public class BetterGridLayoutManager extends GridLayoutManager implements 2Z5 {
    public 6M4 A00;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int A16(2NB r302, 2NQ r303, int i) {
        try {
            return super.A16(r302, r303, i);
        } catch (IndexOutOfBoundsException e) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Adapter count: ");
            A0k.append(A0V());
            A0k.append(" Scroll amount: ");
            A0k.append(i);
            throw 1BK.A0s(AnonymousClass001.A0Z(r303, " ", A0k), e);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1g() {
        return super.A1g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1h() {
        return super.A1h();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1i() {
        return super.A1i();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int A1j() {
        return super.A1j();
    }

    /* JADX WARN: Type inference failed for: r303v2, types: [java.lang.Object, X.6M4] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1p(int i) {
        super.A1p(i);
        6M4 r303 = this.A00;
        6M4 r3032 = r303;
        if (r303 == null) {
            ?? obj = new Object();
            ((6M4) obj).A01 = this;
            this.A00 = obj;
            r3032 = obj;
        }
        r3032.A00 = 2XJ.A00(r3032.A01, i);
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [java.lang.Object, X.6M4] */
    public int ASj() {
        6M4 r302 = this.A00;
        6M4 r3022 = r302;
        if (r302 == null) {
            ?? obj = new Object();
            ((6M4) obj).A01 = this;
            this.A00 = obj;
            r3022 = obj;
        }
        return r3022.A00();
    }
}
