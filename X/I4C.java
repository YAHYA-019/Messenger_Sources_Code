package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.google.common.collect.ImmutableSet;

/* loaded from: I4C.class */
public final class I4C {
    public 1BY A00;
    public final FbUserSession A01;
    public final IFl A0Y;
    public final MediaPickerEnvironment A0Z;
    public final Hrw A0a;
    public final I7W A0b;
    public final IDa A0c;
    public final IWN A0d;
    public final 53U A0e;
    public final ImmutableSet A0h;
    public final C00i A0I = 1BV.A01((1BY) null, 560);
    public final C00i A0O = 1BV.A01((1BY) null, 148094);
    public final C00i A0F = 1BV.A01((1BY) null, 148092);
    public final C00i A0U = 1BV.A01((1BY) null, 148095);
    public final C00i A0J = 1BV.A01((1BY) null, 561);
    public final C00i A0L = 1BV.A01((1BY) null, 563);
    public final C00i A0f = 1BV.A01((1BY) null, 557);
    public final C00i A03 = 1BV.A01((1BY) null, 473);
    public final C00i A0E = 1BV.A01((1BY) null, 556);
    public final C00i A0R = 1BV.A01((1BY) null, 568);
    public final C00i A04 = 1BV.A01((1BY) null, 549);
    public final C00i A0g = 1BV.A01((1BY) null, 565);
    public final C00i A0H = 1BV.A01((1BY) null, 559);
    public final C00i A05 = 1BV.A01((1BY) null, 148089);
    public final C00i A0G = 1BV.A01((1BY) null, 558);
    public final C00i A0Q = 1BV.A01((1BY) null, 567);
    public final C00i A0S = 1BV.A01((1BY) null, 569);
    public final C00i A0P = 1BV.A01((1BY) null, 566);
    public final C00i A02 = 1BV.A01((1BY) null, 548);
    public final C00i A0B = 1BV.A01((1BY) null, 553);
    public final C00i A0D = 1BV.A01((1BY) null, 555);
    public final C00i A0A = 1BV.A01((1BY) null, 552);
    public final C00i A06 = 1BV.A01((1BY) null, 550);
    public final C00i A07 = 1BV.A01((1BY) null, 148090);
    public final C00i A0M = 1BV.A01((1BY) null, 148093);
    public final C00i A09 = 1BV.A01((1BY) null, 551);
    public final C00i A08 = 1BV.A01((1BY) null, 148091);
    public final C00i A0W = 1BV.A01((1BY) null, 115800);
    public final C00i A0C = 1BV.A01((1BY) null, 554);
    public final C00i A0K = 1BV.A01((1BY) null, 562);
    public final C00i A0T = 1BV.A01((1BY) null, 570);
    public final C00i A0V = 1BV.A01((1BY) null, 571);
    public final C00i A0N = 1BV.A01((1BY) null, 564);
    public final C00i A0X = 1BQ.A02(49322);

    public I4C(FbUserSession fbUserSession, 1BO r303, IFl iFl, MediaPickerEnvironment mediaPickerEnvironment, Hrw hrw, I7W i7w, IDa iDa, IWN iwn, 53U r310, ImmutableSet immutableSet) {
        this.A00 = 7zL.A0Q(r303);
        this.A0c = iDa;
        this.A0Y = iFl;
        this.A0a = hrw;
        this.A0Z = mediaPickerEnvironment;
        this.A0b = i7w;
        this.A0e = r310;
        this.A0d = iwn;
        this.A0h = immutableSet;
        this.A01 = fbUserSession;
    }

    public static AbR A00(I4C i4c) {
        return (AbR) i4c.A03.get();
    }

    public C2764Gnh A01(HSt hSt, C6x1 c6x1, Htr htr) {
        C1F6 A0I = GOo.A0I(this.A0f);
        ViewGroup viewGroup = this.A0c.A01;
        Hrw hrw = this.A0a;
        ImmutableSet immutableSet = this.A0h;
        IWN iwn = this.A0d;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0I);
        try {
            C2764Gnh c2764Gnh = new C2764Gnh(viewGroup, hrw, hSt, iwn, c6x1, htr, immutableSet);
            1Bn.A0K();
            FbInjector.A04(A01);
            return c2764Gnh;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public GnY A02(C6x1 c6x1) {
        C1F6 A0I = GOo.A0I(this.A0g);
        ViewGroup viewGroup = this.A0c.A01;
        Hrw hrw = this.A0a;
        AbR A00 = A00(this);
        IWN iwn = this.A0d;
        IFl iFl = this.A0Y;
        iFl.getClass();
        HSh hSh = new HSh(iFl);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0I);
        try {
            GnY gnY = new GnY(viewGroup, A00, A0I, hSh, hrw, iwn, c6x1);
            1Bn.A0K();
            FbInjector.A04(A01);
            return gnY;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
