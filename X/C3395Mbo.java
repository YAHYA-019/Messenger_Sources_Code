package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.Mbo, reason: case insensitive filesystem */
/* loaded from: Mbo.class */
public final class C3395Mbo extends C23s implements MQF {
    public C3395Mbo() {
        super(-1586700566);
    }

    public C3395Mbo(int i) {
        super(i);
    }

    public MPn AA5() {
        return (MPn) A06(C3398Mbr.class, "PAYOneTimeEmail", 4);
    }

    public boolean As1() {
        return A0D(1, "is_default");
    }

    public String AzS() {
        return A0B(3, "normalized_email_address");
    }

    public String BIZ() {
        return A0B(2, DKB.A00(ActionId.ACTIVITY_START));
    }

    public String getId() {
        return A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{MRr.A02(mRt), MRr.A02(Rtc.A00), MRr.A02(mRt), MRr.A02(mRt), N8E.A00(845490753)});
    }
}
