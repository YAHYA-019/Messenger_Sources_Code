package X;

import android.content.Intent;

/* renamed from: X.08w, reason: invalid class name */
/* loaded from: 08w.class */
public final class C08w extends C08x {
    @Override // X.C08x
    public /* bridge */ /* synthetic */ 09F A00() {
        this.A01.getClass();
        this.A00.getClass();
        final 05S r0 = this.A01;
        final Intent intent = this.A00;
        return new 09F(intent, r0) { // from class: X.09E
            public 09G A00 = null;
            public final Intent A01;
            public final 05S A02;

            {
                this.A02 = r0;
                this.A01 = intent;
            }

            public boolean BXE() {
                09G A01 = this.A02.A01(this.A01.getPackage());
                this.A00 = A01;
                return 09G.A0D.equals(A01);
            }

            public boolean BXF() {
                09G A01 = this.A02.A01(05S.A00(this.A01));
                this.A00 = A01;
                return 09G.A0D.equals(A01);
            }

            public void D8y() {
                if (BXE()) {
                    return;
                }
                09G r303 = this.A00;
                if (r303 == null) {
                    r303 = 09G.A0F;
                }
                throw new 0Mc(r303, 0Pz.A0W("Invalid package ", this.A01.getPackage()));
            }
        };
    }
}
