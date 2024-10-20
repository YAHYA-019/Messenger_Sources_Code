package X;

import android.R;
import android.content.Intent;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.messaging.media.picker.MediaPickerPopupVideoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Gbw, reason: case insensitive filesystem */
/* loaded from: Gbw.class */
public final class C2394Gbw extends 1pK implements JOH {
    public static final String __redex_internal_original_name = "CanvasBaseMediaPickerFragment";
    public FbUserSession A00;
    public C00i A01;
    public MediaPickerEnvironment A02;
    public IEh A03;
    public Hrw A04;
    public I9K A05;
    public C6r6 A06;
    public String A07;
    public View A08;
    public final C00i A0E = AbF.A0S(this, 537);
    public final C00i A0A = 1BV.A00(115984);
    public final C00i A0C = 1BQ.A02(68523);
    public final C00i A0F = 1BQ.A02(115983);
    public final C00i A0B = AbH.A0Q();
    public final C00i A0D = AbH.A0c(this);
    public final C00i A0G = AbF.A0S(this, 49478);
    public final C00i A09 = 1BV.A00(66558);

    /* JADX WARN: Multi-variable type inference failed */
    private void A03() {
        if (this.A03 == null) {
            this.A02.getClass();
            this.A06.getClass();
            IEh A0a = DKC.A0V(this.A0E).A0a((ViewGroup) this.A08, this.A02, this.A06);
            this.A03 = A0a;
            A0a.A06();
            this.A03.A0A(((53S) this.A0G.get()).A01(this));
            IEh iEh = this.A03;
            iEh.A09 = new IVQ(this);
            iEh.A08 = new IVP(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        if (r0.A0f.A0B == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1O(boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2394Gbw.A1O(boolean, boolean):void");
    }

    public 1iF A1R() {
        return AbF.A0C(366696498039554L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0067, code lost:
    
        if (r305 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2394Gbw.A1S(android.os.Bundle):void");
    }

    public C6x7 AbZ() {
        return C6x7.A03;
    }

    public C6x1 Aba() {
        return C6x1.A04;
    }

    public boolean Bkd() {
        IEh iEh;
        this.A04.getClass();
        if (this.A04.A02.Afb() == C6x4.A06) {
            ((C9lD) this.A0C.get()).A04(this.A07);
        }
        boolean z = false;
        if (this.A04.A00.A1Q.Aio().A00 == HAE.A02 && (iEh = this.A03) != null) {
            FbUserSession fbUserSession = this.A00;
            fbUserSession.getClass();
            if (iEh.A0D()) {
                C2121Dea A03 = ((C5ic) iEh.A0X.get()).A03(iEh.A0V.getContext());
                A03.A06(2131959283);
                A03.A05(2131959282);
                A03.A0D(IGS.A00(iEh, 4), 2131959284);
                A03.A0E(new IGR(iEh, fbUserSession, 3), 2131959281);
                z = true;
                ((DKS) A03).A01.A0I = true;
                DMV A0I = A03.A0I();
                iEh.A04 = A0I;
                HLK.A00(A0I);
            }
        }
        return z;
    }

    public void Bn9() {
        HsU hsU;
        I9K i9k = this.A05;
        if (i9k != null) {
            IQ1.A09(i9k.A00);
        }
        IEh iEh = this.A03;
        if (iEh != null) {
            FbUserSession fbUserSession = this.A00;
            fbUserSession.getClass();
            I2s i2s = iEh.A0A;
            if (i2s == null || (hsU = i2s.A01) == null) {
                return;
            }
            hsU.A01(fbUserSession);
        }
    }

    public void BqH(H9e h9e) {
    }

    public void BqI(boolean z) {
        I47 i47;
        JMd jMd;
        IEh iEh = this.A03;
        if (iEh == null || (i47 = iEh.A07) == null || z || (jMd = i47.A02) == null) {
            return;
        }
        jMd.BqE();
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.Hin, java.lang.Object] */
    public void onActivityResult(int i, int i2, Intent intent) {
        IEh iEh;
        Uri data;
        HsU hsU;
        GWb gWb;
        if (i != 1 || -1 != i2 || (iEh = this.A03) == null || (data = intent.getData()) == null) {
            return;
        }
        C6r6 c6r6 = iEh.A0g;
        String A00 = 4YT.A00(624);
        MediaResourceSendSource mediaResourceSendSource = new MediaResourceSendSource(7uO.A01(c6r6, 3, true), C5et.PICK, A00);
        C5en A002 = ((Hsr) iEh.A0W.get()).A00(data, data, intent.getType());
        A002.A0V = mediaResourceSendSource;
        MediaResource A0Y = 4YU.A0Y(A002);
        I2s i2s = iEh.A0A;
        if (i2s != null && i2s.A00.A0K && (gWb = i2s.A06) != null) {
            gWb.A0D.clear();
            gWb.A07();
        }
        ?? obj = new Object();
        obj.A04 = A00;
        Hio hio = new Hio(obj);
        if (iEh.A09 != null) {
            I2s i2s2 = iEh.A0A;
            if (i2s2 != null && (hsU = i2s2.A01) != null) {
                hsU.A00();
            }
            iEh.A09.CLe(hio, A0Y);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView A0I;
        int A02 = 0FI.A02(1662704828);
        View inflate = layoutInflater.inflate(2132542656, viewGroup, false);
        ImageView A0I2 = GOn.A0I(inflate, 2131368102);
        if (A0I2 != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            C00i c00i = this.A0B;
            stateListDrawable.addState(new int[0], GOn.A0M(c00i).A08(C1u3.A1W, -16777216));
            stateListDrawable.addState(new int[]{R.attr.state_selected}, GOn.A0M(c00i).A08(C1u3.A1V, -16777216));
            A0I2.setImageDrawable(stateListDrawable);
        }
        MediaPickerEnvironment mediaPickerEnvironment = this.A02;
        if (!mediaPickerEnvironment.A0D && mediaPickerEnvironment.A0A && (A0I = GOn.A0I(inflate, 2131368101)) != null) {
            A0I.setVisibility(0);
            GOo.A1E(A0I, C1u3.A3i, GOn.A0M(this.A0B), -1291845633);
            I9K i9k = this.A05;
            if (i9k != null) {
                IQ1 iq1 = i9k.A00;
                CallerContext callerContext = IQ1.A1m;
                iq1.A1Q.Cq8(true);
            }
        }
        if (this.A02.A0D) {
            MigColorScheme.A00(inflate.findViewById(2131365512), AbF.A0p(this.A0D));
            View findViewById = inflate.findViewById(2131365846);
            findViewById.setVisibility(0);
            TextView A06 = AbF.A06(findViewById, 2131367685);
            if (C6x9.A03(this.A06) && A06 != null) {
                A06.setText(2131960654);
                A06.setTextSize(0, 7zL.A01(7zO.A0D(this), 2132279299));
            }
            findViewById.findViewById(2131362005).setVisibility(8);
        }
        0FI.A08(-626683569, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        I2s i2s;
        MediaPickerPopupVideoView mediaPickerPopupVideoView;
        int A02 = 0FI.A02(1686495683);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        IEh iEh = this.A03;
        if (iEh != null && (i2s = iEh.A0A) != null) {
            if (i2s.A05 != null) {
                ((C6fm) i2s.A0E.get()).A00(i2s.A00.A01).CeU(i2s.A05);
            }
            HsU hsU = i2s.A01;
            if (hsU != null) {
                GridLayoutManager gridLayoutManager = hsU.A00;
                if (gridLayoutManager != null && hsU.A03 != null) {
                    int A1j = hsU.A00.A1j();
                    for (int A1h = gridLayoutManager.A1h(); A1h <= A1j; A1h++) {
                        C2lb A0i = hsU.A05.A0i(A1h);
                        if (A0i != null && (A0i instanceof GXo)) {
                            HjJ hjJ = ((GXo) A0i).A04;
                            if (hjJ.A02 == 5HP.A0H && (mediaPickerPopupVideoView = hjJ.A00) != null) {
                                MediaPickerPopupVideoView.A00(mediaPickerPopupVideoView, C52j.A1e);
                            }
                        }
                    }
                }
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = hsU.A01;
                if (onGlobalLayoutListener != null) {
                    RecyclerView recyclerView = ((IKs) onGlobalLayoutListener).A01.A05;
                    if (recyclerView.getViewTreeObserver() != null) {
                        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
            }
            GWb gWb = i2s.A06;
            if (gWb != null) {
                gWb.A03 = null;
                gWb.A0I(ImmutableList.of());
            }
            RecyclerView recyclerView2 = i2s.A08;
            if (recyclerView2 != null) {
                recyclerView2.removeAllViews();
                recyclerView2.A16(null);
            }
            i2s.A03 = null;
        }
        I9K i9k = this.A05;
        if (i9k != null) {
            i9k.A06(false);
        }
        Hrw hrw = this.A04;
        if (hrw != null && hrw.A00.A1P.A04() == C6x1.A04 && this.A07 != null) {
            ((HrY) this.A0A.get()).A01(this.A07);
        }
        0FI.A08(-1922132727, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1462436605);
        IEh iEh = this.A03;
        if (iEh != null) {
            I2s i2s = iEh.A0A;
            if (i2s != null) {
                i2s.A09.A03();
                i2s.A0A.A00();
            }
            DMV dmv = iEh.A04;
            if (dmv != null && dmv.isShowing()) {
                iEh.A04.dismiss();
            }
            DMV dmv2 = iEh.A05;
            if (dmv2 != null && dmv2.isShowing()) {
                iEh.A05.dismiss();
            }
        }
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(-345739855, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(858813318);
        IEh iEh = this.A03;
        if (iEh != null) {
            iEh.A07();
        }
        super/*androidx.fragment.app.Fragment*/.onResume();
        0FI.A08(-1071242201, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("picker_environment", this.A02);
        bundle.putString("MONTAGE_CREATION_SESSION_ID", this.A07);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        Hik hik;
        int A02 = 0FI.A02(1255314224);
        IEh iEh = this.A03;
        if (iEh != null) {
            I2s i2s = iEh.A0A;
            if (i2s != null) {
                Hzp hzp = i2s.A04;
                if (hzp != null) {
                    hzp.A02 = false;
                    IQR iqr = hzp.A05;
                    iqr.A00 = null;
                    iqr.AEC();
                }
                HsU hsU = i2s.A01;
                if (hsU != null) {
                    hsU.A00();
                }
            }
            I47 i47 = iEh.A07;
            if (i47 != null && (hik = i47.A05) != null) {
                C00i c00i = hik.A05;
                ((2UV) c00i.get()).CmR((2TV) null);
                ((2UV) c00i.get()).AEC();
                hik.A03 = false;
            }
        }
        super/*androidx.fragment.app.Fragment*/.onStop();
        0FI.A08(-841769584, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A08 = view;
        Hrw hrw = this.A04;
        if (hrw == null || hrw.A00.A1P.A04() != C6x1.A04) {
            return;
        }
        A03();
        IEh iEh = this.A03;
        if (iEh != null) {
            iEh.A07();
            IEh iEh2 = this.A03;
            Hrw hrw2 = this.A04;
            iEh2.A0C(AnonymousClass001.A1U(hrw2.A00.A1Q.B8A()), hrw2.A00());
        }
    }
}
