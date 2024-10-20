package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.plugins.mute.activitybanner.ThreadMutedActivityBanner;
import com.google.common.collect.ImmutableSet;

/* loaded from: AHe.class */
public final class AHe implements C15h {
    public final int A00;
    public final Object A01;

    public AHe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                return 1Bn.A0A(66174);
            case 1:
            case 63:
                return 1Fw.A00();
            case 2:
                return 1Bn.A0A(16635);
            case 3:
                Context context = (Context) this.A01;
                11T.A0D(context);
                return 7zR.A0o(context, 16611);
            case 4:
                return 1Bn.A0A(83272);
            case 5:
                return 1Bn.A0E((Context) this.A01, (1BY) null, 49977);
            case 6:
                return 1Bn.A0E((Context) this.A01, (1BY) null, 49981);
            case 7:
                return 1Bn.A0A(67949);
            case 8:
                return new DKU(this.A01, 43);
            case 9:
                return new DKU(this.A01, 44);
            case 10:
                String A01 = C3Om.A01(((1Iw) this.A01).A0D, (1yM) 1Bi.A03(16885));
                11T.A0A(A01);
                return A01;
            case 11:
                return 1Bn.A0A(83599);
            case 12:
                return 1De.A00(((7Hv) this.A01).A01, 16979);
            case 13:
                return 7zR.A0o((Context) this.A01, 49761);
            case 14:
                return 1Bn.A0E((Context) this.A01, (1BY) null, 83433);
            case 15:
            case 16:
            case 17:
                return 1Bn.A0E((Context) this.A01, (1BY) null, 33058);
            case 18:
                return 1Bn.A0E((Context) null, ((6EA) this.A01).A00, 83431);
            case 19:
                1BY r0 = ((56B) this.A01).A00;
                return 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 83126);
            case 20:
                1BY r02 = ((56B) this.A01).A00;
                return 1Lo.A04((Context) null, 1Fw.A05(r02), r02, 83622);
            case 21:
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return 1Fw.A00().A02;
            case 22:
                return 1Hv.A02(((6JE) this.A01).A00, 98755);
            case 23:
                C12147zf c12147zf = (C12147zf) this.A01;
                CallerContext callerContext = C12147zf.A06;
                return 1Bn.A0E((Context) null, c12147zf.A00, 83430);
            case 24:
                6rL r03 = (6rL) this.A01;
                ImmutableSet immutableSet = 6rJ.A1N;
                C6zc c6zc = (C6zc) 1Bn.A0A(66601);
                Context context2 = r03.A01;
                Fragment fragment = r03.A02;
                C6x0 c6x0 = r03.A0R;
                ThreadKey threadKey = r03.A0L;
                return C6zd.A00(context2, c6x0.A01(context2, threadKey, r03.A0Y() ? null : 6rJ.A1N), fragment, threadKey, c6zc);
            case 25:
                return 1De.A00(((C6u2) this.A01).A02, 68548);
            case 26:
                return 1De.A00(((C6tw) this.A01).A00, 50189);
            case 27:
                return 1Bu.A06(((ThreadMutedActivityBanner) this.A01).A03, 99943);
            case 28:
                return 1Bu.A06(((ThreadMutedActivityBanner) this.A01).A03, 16879);
            case 29:
                return 1Bn.A0E((Context) this.A01, (1BY) null, 68219);
            case 30:
                return 1Bn.A0E((Context) this.A01, (1BY) null, 66286);
            case 31:
                return 1Bn.A0E((Context) this.A01, (1BY) null, 82521);
            case 32:
                return 1Bn.A0E((Context) this.A01, (1BY) null, 66287);
            case 33:
                C12104yr c12104yr = (C12104yr) this.A01;
                String str = C12104yr.A0H;
                return 1Bn.A0E((Context) null, c12104yr.A00, 83431);
            case 34:
                C12104yr c12104yr2 = (C12104yr) this.A01;
                String str2 = C12104yr.A0H;
                1BY r04 = c12104yr2.A00;
                return 1Lo.A04((Context) null, 1Fw.A05(r04), r04, 33102);
            case 35:
                return 1Bi.A03(16909);
            case 36:
                C12104yr c12104yr3 = (C12104yr) this.A01;
                String str3 = C12104yr.A0H;
                return 1Bn.A0E((Context) null, c12104yr3.A00, 83599);
            case 37:
            case ActionId.COUNTER /* 61 */:
                return 1Bi.A03(67703);
            case 38:
                C12104yr c12104yr4 = (C12104yr) this.A01;
                String str4 = C12104yr.A0H;
                return 1Bn.A0E((Context) null, c12104yr4.A00, 83440);
            case 39:
                return 7zR.A0o((Context) this.A01, 84929);
            case 40:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return 7zR.A0o((Context) this.A01, 50020);
            case 41:
                return 7zR.A0o((Context) this.A01, 50148);
            case 42:
                return 7zR.A0o((Context) this.A01, 116025);
            case 43:
                return 7zR.A0o((Context) this.A01, 68747);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return 7zR.A0o((Context) this.A01, 99848);
            case 46:
                return 1Bi.A04(C28o.class);
            case ActionId.ON_START_END /* 47 */:
            case ActionId.UNKNOWN /* 51 */:
            case 64:
            default:
                return 1Bn.A0A(83429);
            case ActionId.QUEUED /* 48 */:
                return 1Hv.A02(FbInjector.A00(), 49959);
            case ActionId.IN_PROGRESS /* 49 */:
                return 7zR.A0o((Context) 1De.A00(((66N) this.A01).A00, 83719), 68006);
            case 50:
                return 1BK.A0X(((FbUserSession) this.A01).A02);
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return 1Bi.A03(131252);
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return 1Bi.A03(100133);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return 1Bn.A0A(82029);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return 1Bn.A0A(99943);
            case ActionId.QUEUEING_FAIL /* 56 */:
                return 1Bn.A0A(33059);
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return 1Bn.A0A(83432);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return 1Hv.A02((Context) 1Bn.A0E((Context) null, ((6Rc) this.A01).A01, 83719), 84929);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                return 1Hv.A02(((6Rc) this.A01).A00, 83530);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                6F2 r05 = (6F2) this.A01;
                r05.A1Y();
                6QS r06 = r05.A0b;
                r06.getClass();
                return r06;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                return ((5KK) 1Br.A0B(((6Cf) this.A01).A01)).A00.AZk(36310675734594461L) ? 1Bu.A00(33096).get() : 1Bn.A0A(33097);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                return 1De.A00(((C5ts) this.A01).A00, 83430);
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return 1De.A00(((C5ts) this.A01).A00, 83433);
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                return 1De.A00((1De) this.A01, 49855);
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                return 1Bn.A0A(16965);
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return 1Bn.A0A(98831);
        }
    }
}
