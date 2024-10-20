package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* renamed from: X.MdB, reason: case insensitive filesystem */
/* loaded from: MdB.class */
public final class C3454MdB extends C23s implements SzA {
    public C3454MdB() {
        super(1438146845);
    }

    public C3454MdB(int i) {
        super(i);
    }

    public ImmutableList BAI() {
        return A09(1BJ.A00(552), C3453MdA.class, 2);
    }

    public String getName() {
        return A0C(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{MRr.A02(mRt), MRr.A02(mRt), MRw.A01()});
    }
}
