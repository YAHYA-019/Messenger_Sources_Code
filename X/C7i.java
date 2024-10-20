package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.groups.create.model.GroupCreationParams;

/* loaded from: C7i.class */
public final class C7i {
    public final FbUserSession A01;
    public final C00i A03 = AbH.A0P();
    public final C1is A00 = (C1is) 1Bi.A03(16766);
    public final C00i A02 = FbInjector.A00;

    public C7i(FbUserSession fbUserSession) {
        this.A01 = fbUserSession;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.Afv, X.2J3] */
    public void A00(2Jy r302) {
        r302.A0D("pigeon_reserved_keyword_module", "CreateGroupThreadDialogFragment");
        r302.A0D("sender_id", this.A01.A02);
        0fH.A0g(2Jy.A01(r302), "CreateGroupsAnalyticsLogger", 4YT.A00(668));
        C1kw A06 = 1BK.A06(this.A03);
        if (C1388Afv.A00 == null) {
            synchronized (C1388Afv.class) {
                if (C1388Afv.A00 == null) {
                    C1388Afv.A00 = new C2J3(A06);
                }
            }
        }
        C1388Afv.A00.A03(r302);
    }

    public void A01(GroupCreationParams groupCreationParams, int i) {
        C04r A06 = AbH.A06();
        A06.put("has_photo", String.valueOf(AnonymousClass001.A1T(groupCreationParams.A06)));
        String str = groupCreationParams.A0A;
        if (str == null) {
            str = "";
        }
        A06.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        this.A00.A0G("CreateGroupThreadDialogFragment", "click", 1BL.A0B(this.A02).getResourceEntryName(i), A06);
    }
}
