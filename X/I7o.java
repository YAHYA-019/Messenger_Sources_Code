package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler;
import com.facebook.realtime.requeststream.streamref.NativeStream;

/* loaded from: I7o.class */
public final class I7o {
    public long A00;
    public 1BY A01;
    public StreamEventHandler A02;
    public NativeStream A03;
    public Integer A04;
    public final I3v A05;
    public final I3y A06;
    public final boolean A09;
    public final C00i A0A;
    public final boolean A0C;
    public final C00i A0B = 1BQ.A01();
    public final C00i A07 = 1BV.A01((1BY) null, 16452);
    public final C00i A08 = 1BQ.A00();

    public I7o(HPm hPm, I3v i3v, 1BO r304) {
        1BV A01 = 1BV.A01((1BY) null, 1021);
        this.A0A = A01;
        this.A01 = 7zL.A0Q(r304);
        C00i c00i = hPm.A00;
        this.A09 = AbG.A1b(1BK.A0N(c00i), 36310873291163045L);
        this.A0C = 1BK.A0N(c00i).AZk(36310873291949481L);
        Integer num = 0S2.A00;
        this.A04 = num;
        this.A05 = i3v;
        C1F6 c1f6 = (C1F6) A01.get();
        Context A012 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            I3y i3y = new I3y(i3v);
            1Bn.A0K();
            FbInjector.A04(A012);
            this.A06 = i3y;
            this.A00 = 0L;
            i3v.A01 = num;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A012);
            throw th;
        }
    }

    private String A00(String str) {
        String str2;
        I3v i3v = this.A05;
        String str3 = i3v.A08;
        String str4 = i3v.A07;
        switch (this.A04.intValue()) {
            case 0:
                str2 = "STARTING";
                break;
            case 1:
                str2 = "ENTERED";
                break;
            case 2:
                str2 = "DEAD";
                break;
            default:
                str2 = "LEFT";
                break;
        }
        return 0Pz.A13("For entityType=", str3, "; entityId=", str4, "; sessionState=", str2, " ", str);
    }

    public static void A01(I7o i7o, Exception exc, String str) {
        if (i7o.A0C) {
            C01s A09 = 1BK.A09(i7o.A0B);
            String A00 = i7o.A00(str);
            if (exc != null) {
                A09.softReport("EntityPresenceSession", A00, exc);
            } else {
                A09.D0v("EntityPresenceSession", A00);
            }
        }
    }
}
