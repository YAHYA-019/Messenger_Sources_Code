package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.89y, reason: invalid class name */
/* loaded from: 89y.class */
public final class C89y extends C1rj {
    public 5zD A00;
    public 6Fc A01;
    public C89p A02;
    public Capabilities A03;

    public C89y() {
        super("ExpandableAdminMessageItemComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A02, this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i;
        C89p c89p = this.A02;
        Capabilities capabilities = this.A03;
        5zD r0 = this.A00;
        11T.A0F(r302, 0);
        7zS.A16(1, c89p, capabilities, r0);
        Context context = r302.A0D;
        Resources A0C = 4YU.A0C(context);
        0Dc r02 = new 0Dc(A0C, new SpannableStringBuilder());
        r02.A04(new ForegroundColorSpan(r0.BKZ()), 18);
        boolean z = c89p.A02;
        boolean z2 = c89p.A01;
        if (z) {
            i = 2131958548;
            if (z2) {
                i = 2131958547;
            }
        } else {
            i = 2131957528;
            if (z2) {
                i = 2131957527;
            }
        }
        String string = A0C.getString(i);
        11T.A0D(string);
        SpannableString A0A = 7zS.A0A(r02, string);
        2cM A0j = 7zM.A0j(r302, 0);
        2KD A01 = 2K3.A01(r302, 0);
        7zN.A1V(r0, A01);
        A01.A0P();
        A01.A2i();
        A01.A1D(4.0f);
        A01.A2z(A0A);
        A01.A2b();
        7zN.A1C(A01, r302, C89y.class, "ExpandableAdminMessageItemComponent");
        2cL A0U = 7zL.A0U(A0j, A01);
        11T.A0F(A0U, 1);
        8A8 r03 = ((8A6) C1Y6.A00(context, "com_facebook_messaging_threadview_plugins_interfaces_message_decorations_expandableadminmessage_ExpandableAdminMessageWrapperDecorationInterfaceSpec", "All", new Object[]{c89p, capabilities, r0})).A00;
        int[] iArr = r03.A01;
        if (iArr == null) {
            int i2 = r03.A00;
            float f = 0.0f / 0.0f;
            if (i2 == -1) {
                i2 = 0;
                r03.A00 = 0;
            }
            iArr = new int[i2];
            r03.A01 = iArr;
        }
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int andIncrement = C1Y6.A04.getAndIncrement();
            1YC r04 = r03.A02;
            r04.A08("com.facebook.messaging.threadview.plugins.interfaces.message.decorations.expandableadminmessage.ExpandableAdminMessageWrapperDecorationInterfaceSpec", "messaging.threadview.message.decorations.expandableadminmessage.ExpandableAdminMessageWrapperDecorationInterfaceSpec", "wrapComponent", andIncrement);
            r04.A02((Exception) null, "messaging.threadview.message.decorations.expandableadminmessage.ExpandableAdminMessageWrapperDecorationInterfaceSpec", "wrapComponent", andIncrement);
        }
        return A0U;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        C89y c89y = (C89y) r302.A00.A01;
        6Fc r0 = c89y.A01;
        C89p c89p = c89y.A02;
        11T.A0F(c89p, 2);
        if (r0 == null) {
            return null;
        }
        boolean z = !c89p.A01;
        C7aB c7aB = c89p.A00;
        11T.A0A(c7aB);
        r0.D4d(c7aB, z);
        return null;
    }
}
