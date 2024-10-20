package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9zp, reason: invalid class name */
/* loaded from: 9zp.class */
public final class C9zp implements 7La {
    public final /* synthetic */ com.facebook.xapp.messaging.threadview.model.doc.Doc A00;
    public final /* synthetic */ AAT A01;
    public final /* synthetic */ boolean A02;

    public C9zp(com.facebook.xapp.messaging.threadview.model.doc.Doc doc, AAT aat, boolean z) {
        this.A02 = z;
        this.A00 = doc;
        this.A01 = aat;
    }

    public final void BoZ(View view, 1Iw r303, 7Lj r304, 7LX r305) {
        11T.A0F(r303, 0);
        boolean z = this.A02;
        if (z || this.A00.A00 != 3) {
            CM2 cm2 = new CM2(7zL.A0A(r303));
            com.facebook.xapp.messaging.threadview.model.doc.Doc doc = this.A00;
            11T.A0F(doc, 0);
            1ED r0 = (1ED) 1Bi.A03(16469);
            1Kd.A0F(new ABi(3), r0.D3C(new DB2(1, doc, cm2, z)), r0);
            return;
        }
        AAT aat = this.A01;
        Context A0A = 7zL.A0A(r303);
        MigColorScheme migColorScheme = aat.A00;
        1Bn.A0A(67527);
        1Br A00 = 1Bu.A00(68729);
        DR6 A01 = C5ic.A01(A0A, migColorScheme);
        A01.A03(A0A.getString(2131958999));
        A01.A0J(A0A.getString(2131958998));
        A01.A0G(new DialogInterface.OnClickListener() { // from class: X.9oF
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, A0A.getString(2131955719));
        A01.A0E(new C9ni(A0A, A00, 11), A0A.getString(2131958579));
        A01.A05();
    }
}
