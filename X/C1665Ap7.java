package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.messaging.groups.threadactions.AdminActionDialogFragment;
import com.facebook.messaging.service.model.RemoveMemberParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ap7, reason: case insensitive filesystem */
/* loaded from: Ap7.class */
public final class C1665Ap7 extends ETZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1665Ap7(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void A01(OperationResult operationResult) {
        RemoveMemberParams removeMemberParams;
        switch (this.A00) {
            case 0:
                AdminActionDialogFragment adminActionDialogFragment = (AdminActionDialogFragment) this.A01;
                DI4 di4 = adminActionDialogFragment.A03;
                if (di4 != null) {
                    di4.onSuccess();
                }
                adminActionDialogFragment.A0p();
                Bundle bundle = (Bundle) this.A02;
                if (1BK.A0K().AZk(36320837615238888L) && adminActionDialogFragment.A08.equals("remove_member")) {
                    String A00 = 1BJ.A00(220);
                    if (bundle.containsKey(A00) && (removeMemberParams = (RemoveMemberParams) bundle.getParcelable(A00)) != null && removeMemberParams.A02) {
                        1Uv A0a = AbF.A0a(adminActionDialogFragment.A0F);
                        FbUserSession fbUserSession = adminActionDialogFragment.A01;
                        fbUserSession.getClass();
                        A0a.A0C(fbUserSession, ImmutableList.of((Object) adminActionDialogFragment.A04), "AdminActionDialogFragment");
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Bxc bxc = (Bxc) this.A02;
                ((1Uv) 1Br.A0B(bxc.A03)).A0C(bxc.A00, ImmutableList.of(this.A01), "ChannelsDirectJoinToast");
                return;
            default:
                FEK.A00(((FEK) this.A01).A00, new DKc(11T.A03(AnonymousClass001.A0K())), (GJj) this.A02);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, com.facebook.messaging.groups.threadactions.AdminActionDialogFragment, java.lang.Object] */
    public void A02(ServiceException serviceException) {
        6HM r311;
        Context context;
        C8S c8s;
        int i;
        switch (this.A00) {
            case 0:
                ?? r0 = (AdminActionDialogFragment) this.A01;
                DI4 di4 = r0.A03;
                if (di4 != null) {
                    di4.BxM();
                }
                if (serviceException.getCause() instanceof 2L0) {
                    if (1BL.A1Z(r0.A0H, serviceException.getCause().result.mErrorSubCode)) {
                        ApiErrorResult apiErrorResult = serviceException.getCause().result;
                        String str = apiErrorResult.mErrorUserTitle;
                        String A04 = apiErrorResult.A04();
                        if (str != null && A04 != null) {
                            r311 = (6HM) r0.A0D.get();
                            context = r0.getContext();
                            c8s = new C8S(7zO.A0D((Fragment) r0));
                            c8s.A05 = str;
                            c8s.A04 = A04;
                            i = 82;
                            c8s.A02 = CSG.A00((Object) r0, i);
                            r311.A01(context, new COW(c8s));
                            return;
                        }
                    }
                }
                r311 = (6HM) r0.A0D.get();
                context = r0.getContext();
                c8s = new C8S(7zO.A0D((Fragment) r0));
                c8s.A05 = AbK.A12(r0.requireContext());
                c8s.A03 = serviceException;
                i = 81;
                c8s.A02 = CSG.A00((Object) r0, i);
                r311.A01(context, new COW(c8s));
                return;
            case 1:
                return;
            default:
                FEK.A00(((FEK) this.A01).A00, new DKc(11T.A03(1BK.A0d())), (GJj) this.A02);
                return;
        }
    }
}
