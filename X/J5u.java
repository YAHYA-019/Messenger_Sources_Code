package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.annotations.ViewerContextUserId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.livequery.auxiliary.LiveQueryClientInfo;
import com.facebook.messaging.threadview.plugins.timestamp.messagerowfootersupplier.TrailingTimestampRowSupplier;
import com.facebook.rtc.expression.activities.effect.RtcEffectActivityBuilder;
import com.facebook.rtc.views.scrollablegrid.RtcScrollableGridView;
import java.util.HashSet;
import java.util.Set;

/* loaded from: J5u.class */
public final class J5u implements C15h {
    public final int A00;
    public final Object A01;

    public J5u(Context context, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 14:
            case 27:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
            case ActionId.MAIN_COMPLETE /* 95 */:
                this.A01 = context;
                return;
            default:
                this.A01 = context;
                return;
        }
    }

    public J5u(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0QO A00() {
        0QO r0 = new 0QO(0);
        r0.put(5E9.class, new Object());
        r0.put(5ED.class, new Object());
        r0.put(5EF.class, new Object());
        r0.put(5EH.class, new Object());
        return r0;
    }

    public static 0QO A01() {
        0QO r0 = new 0QO(0);
        r0.put(5E9.class, new Object());
        r0.put(5ED.class, new Object());
        r0.put(5EF.class, new Object());
        r0.put(5EH.class, new Object());
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.5Ee, java.lang.Object] */
    public static 5Ee A02(0QO r301) {
        r301.put(5EJ.class, new Object());
        r301.put(5EL.class, new Object());
        r301.put(5EN.class, new Object());
        r301.put(5EQ.class, new Object());
        return new Object();
    }

    public static J5u A03(Object obj, int i) {
        return new J5u(obj, i);
    }

    public static Object A04(J5u j5u, int i) {
        View view = (View) j5u.A01;
        DqJ dqJ = RtcScrollableGridView.A0X;
        FbUserSession A01 = IDw.A01(view, "RtcScrollableGridView");
        Context context = view.getContext();
        11T.A0A(context);
        return 1Lm.A05(context, A01, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v557, types: [java.lang.Object, X.5Ei, X.5Eh] */
    /* JADX WARN: Type inference failed for: r0v566, types: [java.lang.Object, X.5Em] */
    /* JADX WARN: Type inference failed for: r0v615, types: [java.lang.Object, X.5Ei, X.5Eh] */
    /* JADX WARN: Type inference failed for: r0v624, types: [java.lang.Object, X.5Em] */
    /* JADX WARN: Type inference failed for: r0v649, types: [java.lang.Object, X.5Ei, X.5Eh] */
    /* JADX WARN: Type inference failed for: r0v658, types: [java.lang.Object, X.5Em] */
    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        int i;
        1BY r310;
        1De r307;
        HashSet hashSet;
        switch (this.A00) {
            case 0:
                return C03653yo.A00((Context) this.A01);
            case 1:
                return 1Bn.A0F(((IRJ) this.A01).A05, String.class, ViewerContextUserId.class);
            case 2:
                return 1Bn.A0F(((IRI) this.A01).A03, String.class, ViewerContextUserId.class);
            case 3:
                i = 83433;
                r310 = ((Hi4) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 4:
                i = 83433;
                r307 = ((Hon) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 5:
                i = 83433;
                r307 = ((Gyw) this.A01).A01;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 6:
                i = 83433;
                r307 = ((IRn) this.A01).A0G;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 7:
                i = 49695;
                r307 = ((I0B) this.A01).A05;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 8:
                return 7zR.A0o(AbI.A04(((IRw) this.A01).A06), 115537);
            case 9:
                return 7zR.A0o(AbI.A04(((Hi9) this.A01).A02), 68747);
            case 10:
                i = 83593;
                r307 = ((LiveQueryClientInfo) this.A01).kinjector;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 11:
                return new 5E6(this);
            case 12:
                hashSet = AnonymousClass001.A0v();
                5E4 r0 = (5E4) this.A01;
                0QO r02 = new 0QO(0);
                r02.put(5E9.class, new Object());
                r02.put(5ED.class, new Object());
                r02.put(5EF.class, new Object());
                r02.put(5EH.class, new Object());
                r02.put(5EJ.class, new Object());
                r02.put(5EL.class, new Object());
                r02.put(5EN.class, new Object());
                C00i c00i = r0.A05;
                r02.put(5EQ.class, new 5ER((2Cb) c00i.get()));
                C00i c00i2 = r0.A01;
                r02.put(5ES.class, new 5EU((ActivityManager) c00i2.get()));
                0QO A00 = A00();
                A00.put(5ES.class, A02(A00));
                C00i c00i3 = r0.A04;
                if (1BK.A0N(((C2wh) c00i3.get()).A00).AZk(36312947761026335L)) {
                    r02.put(C2467GeO.class, new Object());
                    A00.put(C2467GeO.class, new Object());
                }
                5Ef r03 = new 5Ef(r02);
                5Eg r04 = new 5Eg(A00);
                C00i c00i4 = r0.A02;
                1RX r05 = (1RX) c00i4.get();
                ?? obj = new Object();
                ((5Eh) obj).A00 = r05;
                5Ej r06 = new 5Ej(r0);
                5En A002 = 5E4.A00(r0);
                5Ek r07 = new 5Ek(r0);
                ?? obj2 = new Object();
                ((5Em) obj2).A00 = r03;
                ((5Em) obj2).A02 = r04;
                ((5Em) obj2).A01 = obj;
                ((5Em) obj2).A05 = r06;
                ((5Em) obj2).A03 = r07;
                ((5Em) obj2).A04 = A002;
                hashSet.add(obj2);
                0QO A01 = A01();
                A01.put(5EJ.class, new Object());
                A01.put(5EL.class, new Object());
                A01.put(5EN.class, new Object());
                A01.put(5EQ.class, new 5ER((2Cb) c00i.get()));
                A01.put(5ES.class, new 5EU((ActivityManager) c00i2.get()));
                5Ef r08 = new 5Ef(A01);
                0QO A003 = A00();
                A003.put(5ES.class, A02(A003));
                5Eg r09 = new 5Eg(A003);
                1RX r010 = (1RX) c00i4.get();
                ?? obj3 = new Object();
                ((5Eh) obj3).A00 = r010;
                5Ej r011 = new 5Ej(r0);
                5En A004 = 5E4.A00(r0);
                5Eo r012 = new 5Eo(r0);
                ?? obj4 = new Object();
                ((5Em) obj4).A00 = r08;
                ((5Em) obj4).A02 = r09;
                ((5Em) obj4).A01 = obj3;
                ((5Em) obj4).A05 = r011;
                ((5Em) obj4).A03 = r012;
                ((5Em) obj4).A04 = A004;
                hashSet.add(obj4);
                if (((C2wh) c00i3.get()).A00()) {
                    5Ef r013 = new 5Ef(A01());
                    5Eg r014 = new 5Eg(A00());
                    1RX r015 = (1RX) c00i4.get();
                    ?? obj5 = new Object();
                    ((5Eh) obj5).A00 = r015;
                    5Ej r016 = new 5Ej(r0);
                    5En A005 = 5E4.A00(r0);
                    IQC iqc = new IQC(r0);
                    ?? obj6 = new Object();
                    ((5Em) obj6).A00 = r013;
                    ((5Em) obj6).A02 = r014;
                    ((5Em) obj6).A01 = obj5;
                    ((5Em) obj6).A05 = r016;
                    ((5Em) obj6).A03 = iqc;
                    ((5Em) obj6).A04 = A005;
                    hashSet.add(obj6);
                    return hashSet;
                }
                return hashSet;
            case 13:
                return ((5E4) this.A01).A06.get();
            case 14:
                return 1Bu.A06((Context) this.A01, 99943);
            case 15:
                i = 16979;
                r307 = ((HhF) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 16:
                IUS ius = (IUS) this.A01;
                CallerContext callerContext = IUS.A08;
                return 1Hv.A02(ius.A04, 99741);
            case 17:
                i = 115728;
                r307 = ((HpK) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 18:
                i = 83433;
                r307 = ((C3N1) this.A01).A02;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 19:
            case 20:
            case 22:
            case 23:
            default:
                hashSet = AbG.A14();
                return hashSet;
            case 21:
                i = 83436;
                r310 = ((ITV) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 24:
                i = 131088;
                IPo iPo = (IPo) this.A01;
                CallerContext callerContext2 = IPo.A06;
                r310 = iPo.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 25:
                i = 83431;
                I0Z i0z = (I0Z) this.A01;
                RectF rectF = I0Z.A0K;
                r310 = i0z.A01;
                return 1Bn.A0E((Context) null, r310, i);
            case 26:
                return 1Hv.A02(7zL.A09(), 115932);
            case 27:
                return 7zR.A0o((Context) this.A01, 115994);
            case 28:
                return 7zR.A0o(((ICU) this.A01).A01, 115994);
            case 29:
            case 37:
                return 1Bn.A0A(83430);
            case 30:
                return 1Bn.A0A(116034);
            case 31:
                i = 33059;
                r310 = ((C4Tv) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 32:
                i = 33058;
                r310 = ((C4Tv) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 33:
                return 1Fw.A05(((C4Tv) this.A01).A00);
            case 34:
                i = 33058;
                r307 = ((HzM) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 35:
                i = 33059;
                r307 = ((HzM) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 36:
                i = 33058;
                r310 = ((3NJ) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 38:
            case 39:
                return 1Bn.A0A(33058);
            case 40:
                return 1Lo.A06(1Fw.A04(((C3Mu) this.A01).A00), 115385);
            case 41:
                return 1Bn.A0B(83430);
            case 42:
                return 1Bn.A0E(((View) this.A01).getContext(), (1BY) null, 83438);
            case 43:
                i = 83436;
                r310 = ((I09) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return 7zR.A0o((Context) this.A01, 84949);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                i = 115728;
                r307 = ((HoT) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 46:
                return 1Bu.A06(((Hjt) this.A01).A00, 83433);
            case ActionId.ON_START_END /* 47 */:
                View view = (View) this.A01;
                return GOq.A0y(view, IDw.A01(view, "ChicletParticipantsView"), 82190);
            case ActionId.QUEUED /* 48 */:
                View view2 = (View) this.A01;
                return GOq.A0y(view2, IDw.A01(view2, "ChicletParticipantsView"), 99500);
            case ActionId.IN_PROGRESS /* 49 */:
                return 7zR.A0o(((Gr3) this.A01).A01, 115350);
            case 50:
                return 1Bu.A06(((Gqz) this.A01).A00, 115728);
            case ActionId.UNKNOWN /* 51 */:
                return 1Bu.A06(((Gr5) this.A01).A01, 115728);
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return 1Bu.A06(((GrG) this.A01).A07, 115728);
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return 1Bu.A06(((GrO) this.A01).A02, 115728);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                i = 115728;
                r307 = ((HgN) this.A01).A01;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                i = 83433;
                r307 = ((IZ0) this.A01).A04;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.QUEUEING_FAIL /* 56 */:
                Context context = ((Hp0) this.A01).A00;
                return 1Lm.A05(context, 4YV.A0F(context), 33088);
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return 7zR.A0o(AbI.A04(((IZG) this.A01).A05), 115614);
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return 7zR.A0o(AbI.A04(((IZF) this.A01).A01), 115614);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return 1Bu.A06(((Gql) this.A01).A01, 115733);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                return AbK.A0D(((I3V) this.A01).A00.A00);
            case ActionId.COUNTER /* 61 */:
                i = 83436;
                r307 = ((I05) this.A01).A01;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                i = 83436;
                r307 = ((IZQ) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 63:
                i = 115734;
                r307 = ((C2474GeV) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case 64:
                return 1Hv.A02(((IAX) this.A01).A00, 49477);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                i = 68219;
                r310 = ((Grk) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                return 7zR.A0o(AbI.A04(((TrailingTimestampRowSupplier) this.A01).A00), 66682);
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return FbInjector.A00();
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                return 1Bn.A0A(99932);
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                return ((FbUserSession) this.A01).A02;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                i = 67667;
                r310 = ((C3VG) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                i = 99943;
                r310 = ((C3VG) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                i = 83441;
                r310 = ((C3VG) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.INTENT_MAPPED /* 73 */:
                i = 83445;
                r310 = ((C3VG) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                i = 85125;
                r310 = ((C3VG) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                return 1Bi.A03(115434);
            case ActionId.ACTIVITY_STARTED /* 76 */:
                i = 83433;
                r307 = ((RtcEffectActivityBuilder) this.A01).kinjector;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                hashSet = ((IRF) this.A01).A06;
                if (hashSet == null) {
                    throw 1BK.A0h();
                }
                return hashSet;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                hashSet = ((IRF) this.A01).A06;
                if (hashSet == null) {
                    throw 1BK.A0h();
                }
                return hashSet;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                hashSet = ((IRF) this.A01).A06;
                if (hashSet == null) {
                    throw 1BK.A0h();
                }
                return hashSet;
            case 80:
                i = 83431;
                r307 = ((Hei) this.A01).A00;
                r310 = r307.A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                return 2yD.A01(1Br.A07(((HUo) this.A01).A00), 36313828228734007L);
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                return 2yD.A01(1Br.A07(((HcB) this.A01).A00), 36313686496779159L);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
            case ActionId.MARKER_SWAPPED /* 84 */:
                return 2yD.A01(1Br.A07(((HcB) this.A01).A00), 36318415253746251L);
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                return A04(this, 114999);
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                return A04(this, 114790);
            case ActionId.ERROR /* 87 */:
                return A04(this, 99979);
            case ActionId.METHOD_INVOKE /* 88 */:
                return A04(this, 114863);
            case ActionId.FINALLY /* 89 */:
                return 1Hv.A02(4YU.A08((View) this.A01), 115775);
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                return A04(this, 114856);
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                return A04(this, 33089);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                return A04(this, 17016);
            case ActionId.ANIMATION_END /* 93 */:
                i = 82989;
                r310 = ((Heq) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                Context context2 = (Context) this.A01;
                CallerContext callerContext3 = GWm.A0W;
                return 1Hv.A03(context2, Hey.class, (Class) null);
            case ActionId.MAIN_COMPLETE /* 95 */:
                return AnonymousClass001.A0D(((Context) this.A01).getCacheDir(), "video-performance-tracking.data");
            case ActionId.INTERRUPTED /* 96 */:
                return ((2Jh) 1Br.A0B(((6Dh) this.A01).A07)).A03(1135097519);
            case ActionId.NETWORK_FAILED /* 97 */:
                i = 83429;
                r310 = ((GPs) this.A01).A03;
                return 1Bn.A0E((Context) null, r310, i);
            case ActionId.NETWORK_RESPONSE /* 98 */:
                IiX iiX = (IiX) this.A01;
                Set set = IiX.A02;
                return AbstractC2327GOs.A0O(iiX.A00);
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                IiY iiY = (IiY) this.A01;
                Set set2 = IiY.A02;
                return AbstractC2327GOs.A0O(iiY.A00);
            case 100:
                Iib iib = (Iib) this.A01;
                Set set3 = Iib.A03;
                return AbstractC2327GOs.A0O(iib.A00);
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                IiZ iiZ = (IiZ) this.A01;
                Set set4 = IiZ.A02;
                return AbstractC2327GOs.A0O(iiZ.A00);
            case ActionId.DATA_LOAD_START /* 102 */:
                Iia iia = (Iia) this.A01;
                Set set5 = Iia.A02;
                return AbstractC2327GOs.A0O(iia.A00);
            case ActionId.LEGACY_MARKER /* 103 */:
                i = 17095;
                r310 = ((HfK) this.A01).A00;
                return 1Bn.A0E((Context) null, r310, i);
        }
    }
}
