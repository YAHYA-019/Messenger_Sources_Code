package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Mbj, reason: case insensitive filesystem */
/* loaded from: Mbj.class */
public final class C3390Mbj extends C23s implements MQ9 {
    public C3390Mbj() {
        super(-74729298);
    }

    public C3390Mbj(int i) {
        super(i);
    }

    @Override // X.MQ9
    public String Ape() {
        return A0B(2, "icon_name");
    }

    @Override // X.MQ9
    public String Atw() {
        return A0B(3, "link_uri");
    }

    @Override // X.MQ9
    public String BG6() {
        return A0B(1, "title");
    }

    @Override // X.MQ9
    public QtE BHW() {
        return A0A(QtE.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRr.A0A(mRt, MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt));
    }
}
