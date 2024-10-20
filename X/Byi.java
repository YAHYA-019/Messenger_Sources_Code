package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: Byi.class */
public final class Byi {
    public int A00;
    public final Context A01;
    public final DialogInterface.OnClickListener A02;
    public final JZj A03;
    public final 1Br A04 = 1Bq.A00(17012);
    public final 1Br A05;
    public final 1F9 A06;
    public final ThreadKey A07;
    public final DFU A08;
    public final MigColorScheme A09;
    public final BvJ A0A;
    public final ImmutableList A0B;

    /* JADX WARN: Type inference failed for: r0v80, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public Byi(Context context, 1F9 r303, ThreadKey threadKey, DFU dfu, MigColorScheme migColorScheme, BvJ bvJ, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        this.A01 = context;
        this.A07 = threadKey;
        this.A0B = immutableList;
        this.A00 = i2;
        this.A09 = migColorScheme;
        this.A06 = r303;
        this.A0A = bvJ;
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            Cu9 cu9 = (Cu9) it.next();
            if (!ThreadKey.A0b(this.A07) || cu9.A01 != 0S2.A0Y) {
                11T.A0D(cu9);
                A0s.add(cu9);
            }
        }
        int size = A0s.size();
        String[] strArr = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = ((Cu9) A0s.get(i3)).A02;
        }
        Context context2 = this.A01;
        1Bu.A06(context2, 67527);
        MigColorScheme migColorScheme2 = this.A09;
        migColorScheme2 = migColorScheme2 == null ? (MigColorScheme) 1Bu.A06(context2, 16979) : migColorScheme2;
        DR6 A00 = C5ic.A00(context2, new Cx5(this, A0s), migColorScheme2, 02L.A05(strArr), this.A00);
        if (str != null) {
            LithoView A0V = 7zO.A0V(context2);
            1Iw r0 = A0V.A09;
            2cM A002 = 2cK.A00(r0);
            2KD A0X = 7zN.A0X(r0, migColorScheme2, 0);
            A0X.A2r(i);
            A0X.A2b();
            A0X.A2g();
            2RH r02 = 2RH.A06;
            7zO.A1G(A0X, r02);
            C26z c26z = C26z.LEFT;
            int A003 = r02.A00();
            2RH r03 = 2RH.A07;
            A0X.A25(c26z, A003 + r03.A00());
            C26z c26z2 = C26z.RIGHT;
            A0X.A25(c26z2, r02.A00() + r03.A00());
            A002.A2d(A0X);
            2KD A0n = 7zQ.A0n(r0, migColorScheme2, str, 0);
            A0n.A2d();
            A0n.A2l();
            7zO.A1G(A0n, 2RH.A03);
            A0n.A25(c26z, r02.A00() + r03.A00());
            A0n.A25(c26z2, r02.A00() + r03.A00());
            A0V.A0y(7zL.A0U(A002, A0n));
            ((JSp) A00).A00.A0C = A0V;
        } else {
            A00.A00(i);
        }
        A00.A0G(new CRJ(this, str2, str3, str4, str5, A0s), context2.getString(2131955719));
        A00.A0E(this.A02, context2.getString(2131955696));
        JZj A04 = A00.A04();
        A04.setOnShowListener(new CSM(A0s, this, 4));
        this.A03 = A04;
        this.A08 = dfu;
        this.A02 = new Object();
        this.A05 = 1Bu.A01(context, 83220);
    }
}
