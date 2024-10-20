package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.LocationSharingPresenterState;
import com.facebook.locationsharing.core.models.Place;
import com.facebook.locationsharing.core.models.PointOfInterest;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: X.GbC, reason: case insensitive filesystem */
/* loaded from: GbC.class */
public final class C2375GbC extends AbstractC2376GbD {
    public static final C2371Gb8 A0M = new Object();
    public final Handler A00;
    public final JEh A01;
    public final JJr A02;
    public final 5fQ A03;
    public final Hos A04;
    public final HG6 A05;
    public final JIE A06;
    public final JJs A07;
    public final Runnable A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final Runnable A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final 7VY A0G;
    public final 5fT A0H;
    public final 5fT A0I;
    public final 7VW A0J;
    public final 7VA A0K;
    public final boolean A0L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2375GbC(X.JN0 r302, X.JOf r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, boolean r309) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2375GbC.<init>(X.JN0, X.JOf, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static LocationSharingPresenterState A00(C2375GbC c2375GbC) {
        Htm htm = ((AbstractC2376GbD) c2375GbC).A00;
        if (htm != null) {
            return (LocationSharingPresenterState) htm.A01.A00(htm.A02);
        }
        throw AnonymousClass001.A0N("Presenter is not attached.");
    }

    public static void A01(C2375GbC c2375GbC) {
        7VW r0 = c2375GbC.A0J;
        7VY[] r02 = {c2375GbC.A0G};
        HashSet A1E = AbF.A1E(r0.A00);
        A1E.removeAll(Arrays.asList(r02));
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            r0.A01((5fS) it.next());
        }
    }

    public static void A02(C2375GbC c2375GbC, LiveLocationSession liveLocationSession, boolean z) {
        c2375GbC.A0B("Calling stopLiveLocation(). session=%s userInitiatedStop=%b", liveLocationSession, Boolean.valueOf(z));
        AbstractC2376GbD.A06(c2375GbC, null, "LOADING");
        new RlX(c2375GbC.A02, c2375GbC.A03, liveLocationSession).A00(new RlS(c2375GbC, liveLocationSession, z));
    }

    public static void A03(C2375GbC c2375GbC, Throwable th) {
        AbstractC2376GbD.A06(c2375GbC, th, "ERROR");
        AbstractC2376GbD.A05(HAO.A03, c2375GbC, "screen error", th, AnonymousClass001.A1Z());
        ((AbstractC2376GbD) c2375GbC).A02.A03(th);
    }

    @Override // X.AbstractC2376GbD
    public void A07() {
        GmE gmE;
        L4Y l4y;
        Handler handler = this.A00;
        handler.removeCallbacks(this.A09);
        handler.removeCallbacks(this.A08);
        this.A0K.A02(this.A0H);
        this.A0J.A02(this.A0G);
        GmE gmE2 = this.A05;
        if ((gmE2 instanceof GmE) && (l4y = (gmE = gmE2).A02) != null) {
            l4y.A00();
            gmE.A02 = null;
        }
        super.A07();
    }

    @Override // X.AbstractC2376GbD
    public void A08() {
        super.A08();
        if (this.A0L) {
            this.A06.Azo(new IM8(this, this, 0));
            Hos hos = this.A04;
            hos.A02.add(this.A0I);
            if (!hos.A01) {
                if (hos instanceof C2721Gm9) {
                    C2721Gm9 c2721Gm9 = (C2721Gm9) hos;
                    0fH.A0j("MessengerLocationFacade", "startForegroundLocationUpdates");
                    IPg iPg = (IPg) c2721Gm9.A01.get();
                    ITL itl = new ITL(c2721Gm9);
                    C00i c00i = iPg.A02;
                    ((LDH) c00i.get()).A0E((ExecutorService) iPg.A01.get());
                    Hy6 hy6 = (Hy6) 1Bn.A0E((Context) null, iPg.A00, 85096);
                    LDH ldh = (LDH) c00i.get();
                    Integer num = 0S2.A0C;
                    1Br r0 = hy6.A00;
                    long Auy = 1Br.A06(r0).Auy(36594852234791192L);
                    LBf.A03(itl, new KmL(null, num, null, Long.valueOf(1Br.A06(r0).Auy(36594852234856729L)), (float) 1Br.A06(r0).Auy(36594852234725655L), 0.6666667f, 0, Auy, true, false, true, false), ldh, IPg.A03.A03, -524194864);
                }
                hos.A01 = true;
            }
            Handler handler = this.A00;
            Runnable runnable = this.A0B;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            Runnable runnable2 = this.A0A;
            handler.removeCallbacks(runnable2);
            handler.postDelayed(runnable2, 10000L);
        }
    }

    @Override // X.AbstractC2376GbD
    public void A09() {
        if (this.A0L) {
            Hos hos = this.A04;
            5fT r0 = this.A0I;
            Set set = hos.A02;
            set.remove(r0);
            if (hos.A01 && set.isEmpty()) {
                if (hos instanceof C2721Gm9) {
                    0fH.A0j("MessengerLocationFacade", "stopForegroundLocationUpdates");
                    ((LDH) ((IPg) ((C2721Gm9) hos).A01.get()).A02.get()).A09();
                }
                hos.A01 = false;
            }
            Handler handler = this.A00;
            handler.removeCallbacks(this.A0B);
            handler.removeCallbacks(this.A0A);
        }
        super.A09();
    }

    @Override // X.AbstractC2376GbD
    public void A0A(Bundle bundle) {
        super.A0A(bundle);
        AbstractC2376GbD.A06(this, null, "LOADING");
        this.A00.postDelayed(this.A09, 10000L);
        this.A0K.A04(this.A0H);
        this.A0J.A04(this.A0G);
        HuU huU = super.A02;
        if (huU.A02) {
            return;
        }
        huU.A02("onScreenLoaded", AnonymousClass001.A1Z());
        huU.A02 = true;
    }

    public void A0C() {
        int i = A00(this).A00;
        ImmutableList immutableList = A00(this).A07;
        if (i < 0 || i >= immutableList.size()) {
            return;
        }
        A0H((PointOfInterest) immutableList.get(i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public void A0D() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2375GbC.A0D():void");
    }

    public void A0E(double d, double d2) {
        if (((HZX) this).A00) {
            Handler handler = this.A00;
            Runnable runnable = this.A08;
            handler.removeCallbacks(runnable);
            if (A00(this).A0D) {
                handler.postDelayed(runnable, 200L);
            }
            AbstractC2376GbD.A06(this, new Location(AnonymousClass001.A0v(), d, d2, -1, -1), "MAP_MOVED");
        }
    }

    public void A0F(int i) {
        if (!((HZX) this).A00 || i < 0 || i >= A00(this).A07.size()) {
            return;
        }
        AbstractC2376GbD.A06(this, Integer.valueOf(i), "POINTS_OF_INTEREST_SELECTED");
    }

    public void A0G(Address address) {
        AbstractC2376GbD.A06(this, null, "LOADING");
        ITZ itz = this.A07;
        String str = this.A0C;
        String str2 = this.A0D;
        String str3 = this.A0E;
        JOe im4 = new IM4(this, 4);
        if (itz instanceof ITZ) {
            itz.A02(im4, address, str, (String) null);
        } else {
            itz.Cx0(im4, address, str, str2, str3);
        }
    }

    public void A0H(PointOfInterest pointOfInterest) {
        String str = pointOfInterest.A02;
        if (!TextUtils.isEmpty(str)) {
            String str2 = pointOfInterest.A04;
            if (!TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    throw AnonymousClass001.A0L("\"pointOfInterest\" must pass \"isPlace()\"");
                }
                AbF.A1T(str);
                Location location = pointOfInterest.A00;
                C1pq.A08("location", location);
                C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
                Place place = new Place(location, str, str2);
                AbstractC2376GbD.A06(this, null, "LOADING");
                this.A07.Cx2(new IM4(this, 5), place, this.A0C, this.A0D, this.A0E);
                return;
            }
        }
        A0G(R09.A00(pointOfInterest));
    }

    public void A0I(String str) {
        Location location = A00(this).A04;
        if (location == null) {
            this.A05.A01(this, 0S2.A0N, this.A0C, false);
            return;
        }
        AbstractC2376GbD.A06(this, null, "LOADING");
        ITZ itz = this.A07;
        String str2 = this.A0C;
        String str3 = this.A0D;
        String str4 = this.A0E;
        Address address = new Address(location, "", true);
        JOe im4 = new IM4(this, 3);
        if (itz instanceof ITZ) {
            itz.A02(im4, address, str2, str);
        } else {
            itz.Cx0(im4, address, str2, str3, str4);
        }
    }

    public void A0J(String str) {
        Address address = A00(this).A02;
        if (address != null) {
            AbstractC2376GbD.A06(this, null, "LOADING");
            ITZ itz = this.A07;
            String str2 = this.A0C;
            String str3 = this.A0D;
            String str4 = this.A0E;
            JOe im4 = new IM4(this, 2);
            if (itz instanceof ITZ) {
                itz.A02(im4, address, str2, str);
            } else {
                itz.Cx0(im4, address, str2, str3, str4);
            }
        }
    }
}
