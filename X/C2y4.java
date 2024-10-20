package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.pando.TreeJNI;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.2y4, reason: invalid class name */
/* loaded from: 2y4.class */
public final class C2y4 extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y4(Object obj, Object obj2, String str, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            TreeJNI treeValue = ((TreeJNI) this.A02).getTreeValue(this.A03, (Class) this.A01);
            if (treeValue != null) {
                return treeValue;
            }
            return null;
        }
        String str = this.A03;
        ViewerContext viewerContext = (ViewerContext) this.A02;
        ViewerContext viewerContext2 = (ViewerContext) this.A01;
        String BHt = ((1Ex) 3HT.A00.get()).BHt();
        C00s.A00();
        if (str.length() == 0 || str.equals(ConstantsKt.CAMERA_ID_FRONT) || viewerContext2 == null || 11T.A0O(viewerContext2.mUserId, ConstantsKt.CAMERA_ID_FRONT)) {
            return FbUserSession.A01;
        }
        if (viewerContext == null) {
            if (!str.equals(viewerContext2.mUserId)) {
                throw AnonymousClass001.A0L("Cannot handle a custom session UserId without its ViewerContext.");
            }
        } else if (!str.equals(viewerContext.mUserId)) {
            throw AnonymousClass001.A0N("Custom session UserId not matching the custom session ViewerContext UserId");
        }
        String str2 = viewerContext2.mUserId;
        11T.A0A(str2);
        if (BHt == null) {
            BHt = viewerContext2.mUserId;
        }
        11T.A0D(BHt);
        return new 1G1(str, str2, BHt);
    }
}
