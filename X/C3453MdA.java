package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* renamed from: X.MdA, reason: case insensitive filesystem */
/* loaded from: MdA.class */
public final class C3453MdA extends C23s implements Sz9 {
    public C3453MdA() {
        super(-1220180966);
    }

    public C3453MdA(int i) {
        super(i);
    }

    public ImmutableList BIy() {
        return A08("values", 1);
    }

    public String getName() {
        return A0C(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRr.A06(MRt.A00(), MRr.A00());
    }
}
