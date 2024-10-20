package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.location.model.NearbyPlace;
import com.facebook.messaging.location.picker.NearbyPlacesView;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import java.io.IOException;

/* renamed from: X.Gbm, reason: case insensitive filesystem */
/* loaded from: Gbm.class */
public abstract class AbstractC2385Gbm extends 1pK {
    public static final String __redex_internal_original_name = "PlacesSearchResultsFragment";
    public Handler A01;
    public NearbyPlace A02;
    public Hly A03;
    public JEv A04;
    public IPo A05;
    public NearbyPlacesView A06;
    public Runnable A07;
    public String A08;
    public AbR A0A;
    public final C00i A0C = AbH.A0S();
    public final C00i A0B = 1BV.A00(68334);
    public int A00 = 2;
    public boolean A09 = false;

    public static ImmutableList A03(AbstractC2385Gbm abstractC2385Gbm) {
        C00i c00i = abstractC2385Gbm.A0C;
        FbSharedPreferences A0R = 1BK.A0R(c00i);
        1G2 r0 = 1NK.A3b;
        String BD0 = A0R.BD0(r0);
        if (BD0 == null || BD0.length() == 0) {
            return ImmutableList.of();
        }
        ImmutableList of = ImmutableList.of();
        try {
            return (ImmutableList) ((AnonymousClass244) abstractC2385Gbm.A0B.get()).A0Q(new H6F(abstractC2385Gbm), BD0);
        } catch (IOException unused) {
            1Ql A0V = 1BL.A0V(c00i);
            A0V.CaL(r0, (String) null);
            A0V.commit();
            return of;
        }
    }

    public static void A06(NearbyPlace nearbyPlace, AbstractC2385Gbm abstractC2385Gbm) {
        nearbyPlace.isRecent = true;
        ImmutableList A03 = A03(abstractC2385Gbm);
        if (A03.contains(nearbyPlace)) {
            return;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) nearbyPlace);
        int size = A03.size();
        int i = abstractC2385Gbm.A00;
        if (size < i) {
            builder.addAll(A03);
        } else if (i == 0) {
            return;
        } else {
            builder.addAll(A03.subList(0, i - 1));
        }
        A07(abstractC2385Gbm, builder);
    }

    public static void A07(AbstractC2385Gbm abstractC2385Gbm, ImmutableList.Builder builder) {
        try {
            String A0W = ((AnonymousClass244) abstractC2385Gbm.A0B.get()).A0W(builder.build());
            1Ql A0V = 1BL.A0V(abstractC2385Gbm.A0C);
            A0V.CaL(1NK.A3b, A0W);
            A0V.commit();
        } catch (2LD e) {
            0fH.A0L(AbstractC2385Gbm.class, "Could not write recently picked locations as a JSON.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A0A = (AbR) 7zO.A0l(this, 470);
        this.A03 = (Hly) 1Bn.A0A(116311);
        this.A01 = new Handler();
        AbR abR = this.A0A;
        JEw A1X = A1X();
        MFU A1Y = A1Y();
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            IPo iPo = new IPo(abR, A1X, A1Y);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = iPo;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public abstract JEw A1X();

    public abstract MFU A1Y();

    public void A1Z(NearbyPlace nearbyPlace) {
        this.A02 = nearbyPlace;
        if (nearbyPlace != null) {
            NearbyPlacesView nearbyPlacesView = this.A06;
            GWN gwn = nearbyPlacesView.A04;
            gwn.A03 = ImmutableList.of((Object) nearbyPlace);
            gwn.A07();
            nearbyPlacesView.A01.setVisibility(0);
            nearbyPlacesView.A06.A02();
        }
    }

    public void A1a(String str) {
        DKF.A0h(this.A05.A02).A02();
        NearbyPlacesView nearbyPlacesView = this.A06;
        nearbyPlacesView.A00.setVisibility(0);
        nearbyPlacesView.A01.setVisibility(8);
        nearbyPlacesView.A06.A02();
        Runnable runnable = this.A07;
        if (runnable != null) {
            this.A01.removeCallbacksAndMessages(runnable);
        }
        IwA iwA = new IwA(this, str);
        this.A07 = iwA;
        this.A01.postAtTime(C0jy.A02(iwA, __redex_internal_original_name, 0), this.A07, SystemClock.uptimeMillis() + 300);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-920640081);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543123);
        0FI.A08(-306149030, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1982992292);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        Runnable runnable = this.A07;
        if (runnable != null) {
            this.A01.removeCallbacksAndMessages(runnable);
        }
        DKF.A0h(this.A05.A02).A02();
        0FI.A08(439305393, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        NearbyPlacesView nearbyPlacesView = (NearbyPlacesView) view;
        this.A06 = nearbyPlacesView;
        nearbyPlacesView.A01.A1D(new LinearLayoutManager(nearbyPlacesView.getContext(), 1, false));
        2Xd r0 = new 2Xd();
        nearbyPlacesView.A04 = r0;
        ((GWN) r0).A01 = IKE.A00(nearbyPlacesView, 48);
        ((GWN) r0).A00 = IKE.A00(nearbyPlacesView, 49);
        nearbyPlacesView.A01.A16(r0);
        NearbyPlacesView nearbyPlacesView2 = this.A06;
        nearbyPlacesView2.A03 = new IVF(this, 3);
        nearbyPlacesView2.A05 = new HRV(this);
        nearbyPlacesView2.A02 = new IVF(this, 4);
        IPo iPo = this.A05;
        iPo.A01 = new Hlz(this);
        iPo.A00((String) null, this.A08);
    }
}
