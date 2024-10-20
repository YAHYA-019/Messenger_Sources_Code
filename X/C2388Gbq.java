package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.Gbq, reason: case insensitive filesystem */
/* loaded from: Gbq.class */
public final class C2388Gbq extends 1pK implements AaW, DF3, JOf {
    public static final String __redex_internal_original_name = "LocationSharingMapFragment";
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public FbUserSession A04;
    public C00i A05;
    public C2375GbC A06;
    public 6Je A07;
    public ITW A08;
    public ITn A09;
    public RpQ A0A;
    public WeakReference A0B;
    public C15h A0C;
    public boolean A0D;
    public boolean A0E;
    public C00i A0F;
    public final C00i A0G = 1BQ.A00();

    public 1iF A1R() {
        return AbF.A0C(1645341882290020L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f5, code lost:
    
        if (X.1BK.A0N(r301.A0G).AZk(36326081770312979L) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2388Gbq.A1S(android.os.Bundle):void");
    }

    public void BiL() {
    }

    public void BiM() {
    }

    public boolean Bkd() {
        return false;
    }

    public void BlA() {
    }

    public void CSS() {
        GmE gmE;
        6Je r0;
        GmE gmE2 = this.A06.A05;
        if (!(gmE2 instanceof GmE) || (r0 = (gmE = gmE2).A04) == null) {
            return;
        }
        Fragment fragment = gmE.A03;
        r0.CvW(fragment.getString(2131958678));
        r0.CpY(2132346813);
        r0.Cvu(false);
        if (gmE.A00 != null) {
            C06c A09 = AbJ.A09(fragment);
            A09.A0I(gmE.A00);
            A09.A04();
            gmE.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0170, code lost:
    
        if (X.1BK.A0N(r301.A0G).AZk(36326081770312979L) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (r0 == (-1)) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    @Override // X.JDy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfT(X.Hth r302) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2388Gbq.CfT(X.Hth):void");
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A07 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentActivity activity = getActivity();
        11T.A0F(activity, 1);
        KyJ.A00(activity, intent, i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(33542695);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542431);
        0FI.A08(-2136693962, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-1199885532);
        this.A06.A07();
        ITn iTn = this.A09;
        java.util.Map map = iTn.A0P;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            RaC raC = (RaC) A1A.next();
            raC.A02.remove();
            raC.A03.A07();
            raC.A01.close();
        }
        map.clear();
        ViewPager2 viewPager2 = iTn.A0G;
        viewPager2.A05.A00.remove(iTn.A0N);
        iTn.A0J.A01();
        RpQ rpQ = this.A0A;
        ViewPager2 viewPager22 = rpQ.A03;
        viewPager22.A05.A00.remove(rpQ.A04);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(722545090, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1596238329);
        ReqContext A04 = AnonymousClass018.A04(__redex_internal_original_name, ReqContextTypeResolver.resolveName("ui_components"));
        try {
            this.A06.A09();
            this.A09.A0J.A02();
            super/*androidx.fragment.app.Fragment*/.onPause();
            if (A04 != null) {
                A04.close();
            }
            0FI.A08(180964993, A02);
        } catch (Throwable th) {
            if (A04 != null) {
                try {
                    A04.close();
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                }
            }
            0FI.A08(1846519440, A02);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1330646411);
        long A09 = GOo.A09();
        try {
            ReqContext A0V = GOq.A0V(__redex_internal_original_name);
            try {
                super/*androidx.fragment.app.Fragment*/.onResume();
                this.A06.A08();
                this.A09.A0J.A03();
                if (A0V != null) {
                    A0V.close();
                }
                1EK.A04(A09);
                0FI.A08(1514652935, A02);
            } finally {
            }
        } catch (Throwable th) {
            1EK.A04(A09);
            0FI.A08(988697679, A02);
            throw th;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C2375GbC c2375GbC = this.A06;
        c2375GbC.A0B("onSaveInstanceState", AnonymousClass001.A1Z());
        bundle.putParcelable("location_sharing_presenter_state", C2375GbC.A00(c2375GbC));
        this.A09.A0J.A06(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00db, code lost:
    
        if (X.1BK.A0N(r301.A0G).AZk(36326081770312979L) != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2388Gbq.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
